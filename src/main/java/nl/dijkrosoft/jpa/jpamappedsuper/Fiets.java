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
public class Fiets extends Voertuig implements Serializable {

	String versnellingsGroup;

	public Fiets(String versnellingsGroup) {
		this();
		this.versnellingsGroup = versnellingsGroup;
	}

	public Fiets() {
		numberOfWheels = 2;
	}

	public String getVersnellingsGroup() {
		return versnellingsGroup;
	}

	public void setVersnellingsGroup(String versnellingsGroup) {
		this.versnellingsGroup = versnellingsGroup;
	}

}
