package org.dng._2022_10_26_springapi_ex1;

import org.dng._2022_10_26_springapi_ex1.DAO.AlbumRepository;

import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassStartsAfterApp {
    private final AlbumRepository albumRepository;

    public ClassStartsAfterApp(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        //System.out.println("app has just started up");
        albumRepository.saveAll(List.of(
                new Album("Waterloo","Abba", 1970),
                new Album("Game","Queen", 1980)
                )
        );
    }

}
