package client;
import proxy.Compte;
import proxy.BanqueServiceService;
import proxy.BanqueService;
import java.util.Scanner;
import java.util.List;

    public class ClientWS {
        public static void main(String[] args)
        {
            BanqueService banqueService =new BanqueServiceService().getBanqueServicePort();
            System.out.println("DINAR :"+banqueService.conversion(100));
            Compte compte=banqueService.getCompte(15);
            compte.setSolde(10);
            System.out.println(compte.getCode());

            List<Compte>comptes = banqueService.getComptes();
            for(Compte comp : comptes){
                System.out.println("le code est :"+comp.getCode()+" le Solde est : "+comp.getSolde());
            }
        }

        }

