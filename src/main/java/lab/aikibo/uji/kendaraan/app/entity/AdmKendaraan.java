package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
@Entity
@Table(name = "data_adm_kendaraan")
@IdClass(AdmKendaraanPK.class)
@Data
public class AdmKendaraan {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Id
    @Column(name="no_uji")
    private String noUji;
    
    @Column(name="nama_pemilik")
    private String namaPemilik;
    
}
