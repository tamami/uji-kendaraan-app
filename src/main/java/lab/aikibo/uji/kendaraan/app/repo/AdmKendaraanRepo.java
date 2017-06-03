package lab.aikibo.uji.kendaraan.app.repo;

import java.io.Serializable;
import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.AdmKendaraan;
import lab.aikibo.uji.kendaraan.app.entity.AdmKendaraanPK;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
public interface AdmKendaraanRepo extends CrudRepository<AdmKendaraan, AdmKendaraanPK> {

    List<AdmKendaraan> findByNoUji(String noUji);
    List<AdmKendaraan> findAll();

}
