package org.dng._2022_10_26_springapi_ex1.Service;


//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/album")
public class AlbumController {
    @GetMapping(path = "/ping")
    public @ResponseBody String ping(){
        return "pong";
    }

}
