package service;
import metier.Compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import jakarta.jws.*;
@WebService
public class BanqueService {
    List<Compte> comptes = new ArrayList<Compte>();


    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(new Date(),2.3),
                new Compte(new Date(),5.3),
                new Compte(new Date(),15.0));


    }


    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant*3.5;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "montant") double montant) {
        return new Compte(new Date(),montant);
    }
    public BanqueService getBanqueServicePort(){
        return new BanqueService();
    }
}
