package uz.ikhtidev.second_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ikhtidev.second_app.domain.FileStorage;
import uz.ikhtidev.second_app.domain.FileStorageStatus;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);
    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus status);

}
