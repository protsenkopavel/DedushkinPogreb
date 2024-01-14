package net.protsenko.service;

import net.protsenko.entity.AppDocument;
import net.protsenko.entity.AppPhoto;
import net.protsenko.service.enums.LinkType;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}
