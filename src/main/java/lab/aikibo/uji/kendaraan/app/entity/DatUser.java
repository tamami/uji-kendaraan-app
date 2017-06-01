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
@Table(name = "dat_user")
@Data
public class DatUser {
    
    @Id
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;
    
}
