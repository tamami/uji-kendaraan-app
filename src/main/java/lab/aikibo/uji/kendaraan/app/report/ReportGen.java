package lab.aikibo.uji.kendaraan.app.report;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.pentaho.reporting.engine.classic.core.DataFactory;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceException;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;

public class ReportGen extends AbstractReportGenerator {
    
    String noUji;
    
    public ReportGen(String noUji) {
        this.noUji = noUji;
    }
    
    public MasterReport getReportDefinition() {
        try {
            final ClassLoader classLoader = this.getClass().getClassLoader();
            final URL reportDefinitionURL = classLoader.getResource("./rpt-adm-kendaraan.prpt");


            System.out.println("DISINI -> " + classLoader.getResource("./rpt-adm-kendaraan.prpt"));
            final ResourceManager resourceManager = new ResourceManager();
            final Resource directly = resourceManager.createDirectly(reportDefinitionURL, MasterReport.class);
            return (MasterReport) directly.getResource();
        } catch(ResourceException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DataFactory getDataFactory() {
        return null;
    }

    public Map<String, Object> getReportParameters() {
        final Map parameters = new HashMap<String, Object>();
        parameters.put("noUji", noUji);
        return parameters;
    }
    
}
