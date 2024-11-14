package ma.imadsprojects;

import jakarta.xml.ws.Endpoint;
import ma.imadsprojects.ws.BanqueService;

public class ServerJWS {
     public static void main(String[] args) {
         Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
         System.out.println("web service access in  http://0.0.0.0:9191/");
     }
}
