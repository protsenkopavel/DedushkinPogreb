package net.protsenko.dao;

import net.protsenko.entity.AppDocument;
import net.protsenko.entity.AppPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}
