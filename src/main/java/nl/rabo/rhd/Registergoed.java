/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rabo.rhd;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author dick
 */
@Entity
public class Registergoed implements Serializable {

	@Id
	@GeneratedValue
	int id;

	String omschrijving;

	@OneToOne(mappedBy = "registergoed", optional = true, cascade = CascadeType.ALL)
	Verbouwing verbouwing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Verbouwing getVerbouwing() {
		return verbouwing;
	}

	public void setVerbouwing(Verbouwing verbouwing) {
		this.verbouwing = verbouwing;
	}

}
