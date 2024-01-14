package net.protsenko.service;

import net.protsenko.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
