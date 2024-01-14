package net.protsenko.service;

import net.protsenko.entity.AppDocument;
import net.protsenko.entity.AppPhoto;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
}
