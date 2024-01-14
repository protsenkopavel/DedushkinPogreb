package net.protsenko.dao;

import net.protsenko.entity.AppDocument;
import net.protsenko.entity.BinaryContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
