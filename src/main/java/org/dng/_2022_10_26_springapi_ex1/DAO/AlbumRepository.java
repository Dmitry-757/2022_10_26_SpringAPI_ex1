package org.dng._2022_10_26_springapi_ex1.DAO;

import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
