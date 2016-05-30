/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rabo.rhd;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "XZA_VERBOUWING")
@SequenceGenerator(name = "VerbouwingsGen", sequenceName = "XZA_VERBOUWING_SEQ")
public class Verbouwing extends AbstractDomainEntity {

    @XmlElement(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VerbouwingsGen")
    private Long id;

    @Column(name = "VERBOUWKOSTENOMS")
    private String verbouwKostenOmschrijving;

    @Column(name = "VERBOUWKOSTENBEDR")
    private BigInteger verbouwingsKostenBedrag;

    @Column(name = "VERBOUWMEERWAARDEBEDR")
    private BigInteger verbouwingMeerwaardeBedrag;

    @OneToOne
    @Column(name = "REGISTERGOED_ID")
    private Registergoed registergoed;

    @Override
    public Long getId() {
        return id;
    }

    public String getVerbouwKostenOmschrijving() {
        return verbouwKostenOmschrijving;
    }

    public void setVerbouwKostenOmschrijving(String verbouwKostenOmschrijving) {
        this.verbouwKostenOmschrijving = verbouwKostenOmschrijving;
    }

    public BigInteger getVerbouwingsKostenBedrag() {
        return verbouwingsKostenBedrag;
    }

    public void setVerbouwingsKostenBedrag(BigInteger verbouwingsKostenBedrag) {
        this.verbouwingsKostenBedrag = verbouwingsKostenBedrag;
    }

    public BigInteger getVerbouwingMeerwaardeBedrag() {
        return verbouwingMeerwaardeBedrag;
    }

    public void setVerbouwingMeerwaardeBedrag(BigInteger verbouwingMeerwaardeBedrag) {
        this.verbouwingMeerwaardeBedrag = verbouwingMeerwaardeBedrag;
    }

    public Registergoed getRegistergoed() {
        return registergoed;
    }

    public void setRegistergoed(Registergoed registergoed) {
        this.registergoed = registergoed;
    }


}
