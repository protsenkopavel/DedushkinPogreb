package net.protsenko.service.impl;

import lombok.extern.log4j.Log4j;
import net.protsenko.dao.AppDocumentDAO;
import net.protsenko.dao.AppPhotoDAO;
import net.protsenko.entity.AppDocument;
import net.protsenko.entity.AppPhoto;
import net.protsenko.entity.BinaryContent;
import net.protsenko.service.FileService;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Log4j
@Service
public class FileServiceImpl implements FileService {
    private final AppDocumentDAO appDocumentDAO;
    private final AppPhotoDAO appPhotoDAO;

    public FileServiceImpl(AppDocumentDAO appDocumentDAO, AppPhotoDAO appPhotoDAO) {
        this.appDocumentDAO = appDocumentDAO;
        this.appPhotoDAO = appPhotoDAO;
    }

    @Override
    public AppDocument getDocument(String docId) {
        //TODO добавить дешифрование хеш-строки
        var id = Long.parseLong(docId);
        return appDocumentDAO.findById(id).orElse(null);
    }

    @Override
    public AppPhoto getPhoto(String photoId) {
        //TODO добавить дешифрование хеш-строки
        var id = Long.parseLong(photoId);
        return appPhotoDAO.findById(id).orElse(null);
    }

    @Override
    public FileSystemResource getFileSystemResource(BinaryContent binaryContent) {
        try {
            //TODO добавить генерацию имени временного файла
            File temp = File.createTempFile("tempFile", ".bin");
            temp.deleteOnExit();
            FileUtils.writeByteArrayToFile(temp, binaryContent.getFileAsArrayOfBytes());
            return new FileSystemResource(temp);
        } catch (IOException e) {
            log.error(e);
            return null;
        }
    }
}
