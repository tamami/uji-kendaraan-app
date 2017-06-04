package lab.aikibo.uji.kendaraan.app.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ref_biaya_buku_uji")
@Data
public class RefBiayaBukuUji {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="tarif")
    private BigDecimal tarif;
    
}
