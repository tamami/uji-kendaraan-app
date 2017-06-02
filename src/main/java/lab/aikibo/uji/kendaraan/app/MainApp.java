package lab.aikibo.uji.kendaraan.app;

import java.util.List;
import javax.sql.DataSource;
import lab.aikibo.uji.kendaraan.app.entity.DatUser;
import lab.aikibo.uji.kendaraan.app.repo.DatUserRepo;
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
    
    public static EntrySkrdUI fEntrySkrd;
    
    public static void main(String args[]) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        List<DatUser> allData = datUserRepo.findAll();
        LoginUI login = new LoginUI(datUserRepo);
        login.setVisible(true);
        
        fEntrySkrd = new EntrySkrdUI();
    }
    
    
    
}
