package lab.aikibo.uji.kendaraan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ref_pejabat")
@Data
public class RefPejabat {
    
    @Id
    @Column(name="nip")
    private String nip;
    
    @Column(name="nama")
    private String nama;
    
    @Column(name="jabatan")
    private String jabatan;
    
}
