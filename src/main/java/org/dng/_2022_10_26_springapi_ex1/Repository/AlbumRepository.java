package org.dng._2022_10_26_springapi_ex1.Repository;

import org.dng._2022_10_26_springapi_ex1.DB.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
