package org.dng._2022_10_26_springapi_ex1.DAO;

import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface AlbumRepository extends JpaRepository<Album, Long> {
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
