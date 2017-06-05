package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ref_bahan_karoseri")
@Data
public class RefBahanKaroseri {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="bahan")
    private String bahan;
    
}
