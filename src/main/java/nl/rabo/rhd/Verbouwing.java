/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rabo.rhd;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author dick
 */
@Entity
public class Verbouwing implements Serializable {

	@Id
	@GeneratedValue
	int id;

	BigInteger bedrag;

	@OneToOne
	Registergoed registergoed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getBedrag() {
		return bedrag;
	}

	public void setBedrag(BigInteger bedrag) {
		this.bedrag = bedrag;
	}

	public Registergoed getRegistergoed() {
		return registergoed;
	}

	public void setRegistergoed(Registergoed registergoed) {
		this.registergoed = registergoed;
	}

}
