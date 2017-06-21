package lab.aikibo.uji.kendaraan.app.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "skrd")
@Data
public class Skrd {
    
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="no_uji")
    private String noUji;
    
    @Column(name="jns_pengujian")
    private String jnsPengujian;
    
    @Column(name="biaya_pemeriksaan")
    private BigDecimal biayaPemeriksaan;
    
    @Column(name="biaya_buku_uji")
    private BigDecimal biayaBukuUji;
    
    @Column(name="biaya_tanda_uji")
    private BigDecimal biayaTandaUji;
    
    @Column(name="biaya_tanda_samping")
    private BigDecimal biayaTandaSamping;
    
    @Column(name="denda_adm")
    private BigDecimal dendaAdm;
    
    @Column(name="tgl_pemeriksaan")
    private Date tglPemeriksaan;
    
    @Column(name="habis_uji_lalu")
    private Date tglHabisUjiLalu;
    
    @Column(name="nip_pejabat")
    private String nipPejabat;
    
}
