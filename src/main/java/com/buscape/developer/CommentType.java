//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.11 at 03:41:38 PM BRST 
//


package com.buscape.developer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="negative" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalUsefulInformation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalUselessInformation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalOutOfContext" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {
    "comment",
    "positive",
    "negative"
})
public class CommentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String positive;
    @XmlElement(required = true)
    protected String negative;
    @XmlAttribute(required = true)
    protected int totalUsefulInformation;
    @XmlAttribute(required = true)
    protected int totalUselessInformation;
    @XmlAttribute(required = true)
    protected int totalOutOfContext;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the positive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositive() {
        return positive;
    }

    /**
     * Sets the value of the positive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositive(String value) {
        this.positive = value;
    }

    /**
     * Gets the value of the negative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegative() {
        return negative;
    }

    /**
     * Sets the value of the negative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegative(String value) {
        this.negative = value;
    }

    /**
     * Gets the value of the totalUsefulInformation property.
     * 
     */
    public int getTotalUsefulInformation() {
        return totalUsefulInformation;
    }

    /**
     * Sets the value of the totalUsefulInformation property.
     * 
     */
    public void setTotalUsefulInformation(int value) {
        this.totalUsefulInformation = value;
    }

    /**
     * Gets the value of the totalUselessInformation property.
     * 
     */
    public int getTotalUselessInformation() {
        return totalUselessInformation;
    }

    /**
     * Sets the value of the totalUselessInformation property.
     * 
     */
    public void setTotalUselessInformation(int value) {
        this.totalUselessInformation = value;
    }

    /**
     * Gets the value of the totalOutOfContext property.
     * 
     */
    public int getTotalOutOfContext() {
        return totalOutOfContext;
    }

    /**
     * Sets the value of the totalOutOfContext property.
     * 
     */
    public void setTotalOutOfContext(int value) {
        this.totalOutOfContext = value;
    }

}
