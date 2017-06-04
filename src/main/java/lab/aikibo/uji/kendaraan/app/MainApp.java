package lab.aikibo.uji.kendaraan.app;

import java.util.List;
import javax.sql.DataSource;
import lab.aikibo.uji.kendaraan.app.entity.AdmKendaraan;
import lab.aikibo.uji.kendaraan.app.entity.DatUser;
import lab.aikibo.uji.kendaraan.app.entity.RefBiayaBukuUji;
import lab.aikibo.uji.kendaraan.app.repo.AdmKendaraanRepo;
import lab.aikibo.uji.kendaraan.app.repo.DatUserRepo;
import lab.aikibo.uji.kendaraan.app.repo.RefBiayaBukuUjiRepo;
import lab.aikibo.uji.kendaraan.app.repo.RefJnsKendaraanRepo;
import lab.aikibo.uji.kendaraan.app.repo.RefJnsRumahRepo;
import lab.aikibo.uji.kendaraan.app.repo.SkrdRepo;
import lab.aikibo.uji.kendaraan.app.ui.EntrySkrdUI;
import lab.aikibo.uji.kendaraan.app.ui.LoginUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
@SpringBootApplication
@ComponentScan("lab.aikibo")
public class MainApp implements CommandLineRunner {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    DatUserRepo datUserRepo;
    
    @Autowired
    AdmKendaraanRepo admKendaraanRepo;
    
    @Autowired
    RefJnsKendaraanRepo refJnsKendaraanRepo;
    
    @Autowired
    RefJnsRumahRepo refJnsRumahRepo;
    
    @Autowired
    RefBiayaBukuUjiRepo refBiayaBukuUjiRepo;
    
    @Autowired
    SkrdRepo skrdRepo;
    
    public static EntrySkrdUI fEntrySkrd;
    
    public static void main(String args[]) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LoginUI login = new LoginUI(datUserRepo);
        login.setVisible(true);
        
        fEntrySkrd = new EntrySkrdUI(this);
    }
    
    public DatUserRepo getDatUserRepo() {
        return datUserRepo;
    }
    
    public AdmKendaraanRepo getAdmKendaraanRepo() {
        return admKendaraanRepo;
    }
    
    public RefJnsKendaraanRepo getRefJnsKendaraanRepo() {
        return refJnsKendaraanRepo;
    }
    
    public RefJnsRumahRepo getRefJnsRumahRepo() {
        return refJnsRumahRepo;
    }
    
    public RefBiayaBukuUjiRepo getRefBiayaBukuUjiRepo() {
        return refBiayaBukuUjiRepo;
    }
    
    public SkrdRepo getSkrdRepo() {
        return skrdRepo;
    }
    
}
