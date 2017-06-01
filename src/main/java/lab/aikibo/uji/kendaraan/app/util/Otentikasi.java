package lab.aikibo.uji.kendaraan.app.util;

import java.util.List;
import lab.aikibo.uji.kendaraan.app.entity.DatUser;
import lab.aikibo.uji.kendaraan.app.repo.DatUserRepo;

/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
public class Otentikasi {
    
    public static boolean isVerified(DatUserRepo userRepo, String username, String password) {
        boolean result = false;
        
        List<DatUser> data = userRepo.findByUsername(username);
        if(!data.isEmpty()) {
            DatUser datUser = data.get(0);
            if(password.equals(datUser.getPassword())) {
                result = true;
            }
        }
        
        return result;
    }
    
}
