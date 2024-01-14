package net.protsenko.service;

import net.protsenko.entity.AppDocument;
import net.protsenko.entity.AppPhoto;
import net.protsenko.entity.BinaryContent;
import org.springframework.core.io.FileSystemResource;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
