/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rabo.rhd;
import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;

/**
 * Domain entity defining the version used by jpa to track changes and used to determine if a case is different from an
 * old version of the case.
 */
@MappedSuperclass
public abstract class AbstractDomainEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int DISCRIMINATOR_LENGTH = 255;

    /** TYPE_LENGTH max length for enumerations. */
    protected static final int TYPE_LENGTH = 40;

    /** UUID_LENGTH max length for UUID. */
    protected static final int UUID_LENGTH = 36;

    /** Used for optimistic locking. */
    @XmlElement(name = "version", required = false)
    @Version
    private long version;

    /**
     * jpa version number.
     *
     * @return version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Get the JPA id of the class.
     *
     * @return id
     */
    public abstract Long getId();

    @XmlID
    public String getXmlReferenceId() {
        StringBuilder builder = new StringBuilder(this.getClass().getCanonicalName());
        builder.append(this.hashCode());
        builder.append(String.valueOf(this.getId()));
        return builder.toString();
    }
}