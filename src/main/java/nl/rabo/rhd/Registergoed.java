/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rabo.rhd;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author dick
 */
@Entity
@Table(name = "XZA_REGISTERGOED")
@SequenceGenerator(name = "FinancieringsComponentGen", sequenceName = "XZA_FINCOMPONENT_SEQ")
public class Registergoed implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FinancieringsComponentGen")
    int id;

    @Column(name = "GEMEENTENAAM")
    String gemeente;

    @OneToOne(mappedBy = "registergoed", optional = true, cascade = CascadeType.ALL)
    Verbouwing verbouwing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    

    public Verbouwing getVerbouwing() {
        return verbouwing;
    }

    public void setVerbouwing(Verbouwing verbouwing) {
        this.verbouwing = verbouwing;
    }

}
