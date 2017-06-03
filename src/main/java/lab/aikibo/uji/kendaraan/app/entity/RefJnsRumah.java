package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ref_jns_rumah")
@IdClass(RefJnsRumahPK.class)
@Data
public class RefJnsRumah {
    
    @Id
    @Column(name="id_jns_kendaraan")
    private int idJnsKendaraan;
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="jns_rumah")
    private String jnsRumah;
    
}
