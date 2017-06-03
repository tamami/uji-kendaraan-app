package lab.aikibo.uji.kendaraan.app.entity;

import java.util.Date;
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
    
    @Column(name="alamat")
    private String alamat;
    
    @Column(name="merk")
    private String merk;
    
    @Column(name="tipe")
    private String tipe;
    
    @Column(name="tahun_pembuatan")
    private String thnPembuatan;
    
    @Column(name="id_jns_kendaraan")
    private int idJnsKendaraan;
    
    @Column(name="id_jns_bahan_bakar")
    private int idJnsBahanBakar;
    
    @Column(name="id_jns_rumah")
    private int idJnsRumah;
    
    @Column(name="noken")
    private String nomorKendaraan;
    
    @Column(name="no_rangka")
    private String noRangka;
    
    @Column(name="no_mesin")
    private String noMesin;
    
    @Column(name="id_bahan_karoseri")
    private int idBahanKeroseri;
    
    @Column(name="tgl_rekam")
    private Date tglRekam;
    
}
