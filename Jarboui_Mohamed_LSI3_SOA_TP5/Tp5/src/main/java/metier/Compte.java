package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private static int nb=0;
    private int code;
    @XmlTransient
   private Date DateCreation;

    private double solde;
    public Compte() {
        // initialize any default values if needed
    }
    public Compte(Date DateCraetion,double solde) {
        this.code=nb;
        this.DateCreation=DateCraetion;
        this.solde=solde;
        nb++;

    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", DateCreation=" + DateCreation +
                ", solde=" + solde +
                '}';
    }

    public void setDateCreation(Date date) {
        this.DateCreation=date;

    }
    public void setSolde(double solde) {
        this.solde=solde;

    }
    public int getCode() {
        return code;
    }
    public Date getDateCreation() {
        return DateCreation;
    }
    public double getSolde() {
        return solde;
    }

}
