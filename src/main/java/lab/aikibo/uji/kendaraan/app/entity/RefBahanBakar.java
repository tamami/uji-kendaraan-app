package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ref_bahan_bakar")
@Data
public class RefBahanBakar {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="bahan_bakar")
    private String bahanBakar;
    
}
