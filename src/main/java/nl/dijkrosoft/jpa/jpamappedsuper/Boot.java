package nl.dijkrosoft.jpa.jpamappedsuper;

import javax.persistence.Entity;

/**
 * Created by dick on 22-5-16.
 */
@Entity
public class Boot extends Voertuig {

    public Boot() {
        setNumberOfWheels(0);
    }


    double drijfvermogen;

    public double getDrijfvermogen() {
        return drijfvermogen;
    }

    public void setDrijfvermogen(double drijfvermogen) {
        this.drijfvermogen = drijfvermogen;
    }
}
