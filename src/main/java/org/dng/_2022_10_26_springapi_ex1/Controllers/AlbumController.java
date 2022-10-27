package org.dng._2022_10_26_springapi_ex1.Controllers;



import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.dng._2022_10_26_springapi_ex1.Service.AlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="album")
public class AlbumController {
    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping(path = "ping")
    public @ResponseBody String ping(){
        return "pong";
    }

    @GetMapping(path = "all")
    public List<Album> getAllAlbums(){
        return albumService.getAll();
    }

    @PostMapping(path = "addItem")
    public void addAlbum(@RequestBody Album item){
        albumService.add(item);
    }
}
