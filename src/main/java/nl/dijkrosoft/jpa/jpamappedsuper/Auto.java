/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.jpa.jpamappedsuper;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author dick
 */
@Entity
public class Auto extends Voertuig implements Serializable {

	int numberOfCilinders;

	public Auto(int numberOfCilinders) {
		this();
		this.numberOfCilinders = numberOfCilinders;

	}

	public Auto() {
		this.numberOfWheels = 4;
	}

	public int getNumberOfCilinders() {
		return numberOfCilinders;
	}

	public void setNumberOfCilinders(int numberOfCilinders) {
		this.numberOfCilinders = numberOfCilinders;
	}

}
