package org.dng._2022_10_26_springapi_ex1.Controllers;



import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.dng._2022_10_26_springapi_ex1.Service.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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
    public List<Album> getAll(){
        return albumService.getAll();
    }

    @PostMapping(path = "Item")
    public void add(@RequestBody Album item){
        albumService.add(item);
    }

    @DeleteMapping(path = "Item/{id}")
    public void delete(@PathVariable Long id){
        albumService.delete(id);
    }

    @PutMapping(path = "Item")
    public void update(@RequestBody Album item){
        albumService.update(item);
    }


}
