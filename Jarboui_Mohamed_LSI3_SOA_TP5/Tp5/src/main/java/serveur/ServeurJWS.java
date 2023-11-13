package serveur;
import jakarta.xml.ws.Endpoint;
import service.BanqueService;
public class ServeurJWS {
    public static void main(String[] args) {
        BanqueService bank =new BanqueService();
        String url ="http://localhost:8084/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Server url:"+ url);

    }

}
