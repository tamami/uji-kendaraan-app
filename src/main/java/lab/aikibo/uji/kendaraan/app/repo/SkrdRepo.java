package lab.aikibo.uji.kendaraan.app.repo;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.Skrd;
import org.springframework.data.repository.CrudRepository;

public interface SkrdRepo extends CrudRepository<Skrd, Integer> {

    List<Skrd> findAll();
    List<Skrd> findByNoUji(String noUji);
    
}
