package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
@Entity
@Table(name="ref_jns_kendaraan")
@Data
public class RefJnsKendaraan {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="jns_kendaraan")
    private String jnsKendaraan;
    
}
