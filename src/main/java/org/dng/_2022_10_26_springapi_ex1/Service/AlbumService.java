package org.dng._2022_10_26_springapi_ex1.Service;

import org.dng._2022_10_26_springapi_ex1.DAO.AlbumRepository;
import org.dng._2022_10_26_springapi_ex1.Model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Objects;
import java.util.Optional;

@Service
public class AlbumService {

//    можно вот так (поле не должно быть final ! - внедрение не получится так как оно происходит уже после создания)
//    @Autowired
//    private AlbumRepository albumRepository;

    //but if we want to have "final" field - we need to use constructor for initialization
    private final AlbumRepository albumRepository;
    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }



    public List<Album> getAll() {
        return (List<Album>) albumRepository.findAll();
    }

    public void add(Album item) {
        System.out.println(item);
        albumRepository.save(item);
    }


    public void update(Album item) {
        Optional<Album> optionalItem = albumRepository.findById(item.getId());
        if (optionalItem.isPresent()) {
            Album editedItem = optionalItem.get();

//            boolean needSave = false;
//            if (!editedItem.getName().equals(item.getName())){
//                editedItem.setName(item.getName());
//                needSave=true;
//            }
//            if (!editedItem.getAuthor().equals(item.getAuthor())){
//                editedItem.setAuthor(item.getAuthor());
//                needSave=true;
//            }
//            if (!Objects.equals(editedItem.getYear(), item.getYear())){
//                editedItem.setYear(item.getYear());
//                needSave=true;
//            }
//            if (needSave){
//                albumRepository.save(editedItem);
//            }

            if(!editedItem.equals(item)){
                editedItem.setName(item.getName());
                editedItem.setAuthor(item.getAuthor());
                editedItem.setYear(item.getYear());
                albumRepository.save(editedItem);
            }
        }
    }

    public void delete(Long id) {
        albumRepository.deleteById(id);
    }

}
