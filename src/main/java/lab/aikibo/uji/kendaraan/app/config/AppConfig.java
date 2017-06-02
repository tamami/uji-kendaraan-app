package lab.aikibo.uji.kendaraan.app.config;

import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author tamami <tamami.oka@gmail.com>
 */
@Configuration
@EnableJpaRepositories("lab.aikibo.uji.kendaraan.app.repo")
public class AppConfig {
    
    @Resource
    private Environment env;
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
        ds.setUrl(env.getRequiredProperty("jdbc.url"));
        ds.setUsername(env.getRequiredProperty("jdbc.username"));
        ds.setPassword(env.getRequiredProperty("jdbc.password"));

        return ds;
    }
    
}
