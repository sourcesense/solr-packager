package $package;

import static org.eclipse.jetty.util.resource.Resource.newSystemResource;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.xml.XmlConfiguration;

/**
 * 
 */
public class SolrServer {

    public static void main(String...args) throws Exception {
        Resource fileserverXmlDescriptor = newSystemResource("jetty.xml");
        XmlConfiguration configuration = new XmlConfiguration(fileserverXmlDescriptor.getInputStream());
        Server server = (Server) configuration.configure();
        server.start();
        server.join();
    }

}
