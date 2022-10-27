package org.dng._2022_10_26_springapi_ex1.Service;

import org.dng._2022_10_26_springapi_ex1.DAO.AlbumRepository;
import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAll() {
        return albumRepository.findAll();
    }

    public void add(Album item) {
        System.out.println(item);
        albumRepository.save(item);
    }
}
