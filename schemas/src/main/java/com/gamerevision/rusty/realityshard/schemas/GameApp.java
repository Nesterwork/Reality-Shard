//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.01 at 04:55:01 PM CEST 
//


package com.gamerevision.rusty.realityshard.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GameApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GameApp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Startup" type="{}Start" minOccurs="0"/>
 *         &lt;element name="HeartBeat" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="InitParam" type="{}InitParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{}Protocol" maxOccurs="unbounded"/>
 *         &lt;element name="Shardlet" type="{}ShardletConfig" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GameApp", propOrder = {
    "displayName",
    "description",
    "startup",
    "heartBeat",
    "initParam",
    "protocol",
    "shardlet"
})
public class GameApp {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Startup")
    protected Start startup;
    @XmlElement(name = "HeartBeat")
    @XmlSchemaType(name = "unsignedInt")
    protected Long heartBeat;
    @XmlElement(name = "InitParam")
    protected List<InitParam> initParam;
    @XmlElement(name = "Protocol", required = true)
    protected List<Protocol> protocol;
    @XmlElement(name = "Shardlet", required = true)
    protected List<ShardletConfig> shardlet;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startup property.
     * 
     * @return
     *     possible object is
     *     {@link Start }
     *     
     */
    public Start getStartup() {
        return startup;
    }

    /**
     * Sets the value of the startup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Start }
     *     
     */
    public void setStartup(Start value) {
        this.startup = value;
    }

    /**
     * Gets the value of the heartBeat property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeartBeat() {
        return heartBeat;
    }

    /**
     * Sets the value of the heartBeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeartBeat(Long value) {
        this.heartBeat = value;
    }

    /**
     * Gets the value of the initParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitParam }
     * 
     * 
     */
    public List<InitParam> getInitParam() {
        if (initParam == null) {
            initParam = new ArrayList<InitParam>();
        }
        return this.initParam;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Protocol }
     * 
     * 
     */
    public List<Protocol> getProtocol() {
        if (protocol == null) {
            protocol = new ArrayList<Protocol>();
        }
        return this.protocol;
    }

    /**
     * Gets the value of the shardlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shardlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShardlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShardletConfig }
     * 
     * 
     */
    public List<ShardletConfig> getShardlet() {
        if (shardlet == null) {
            shardlet = new ArrayList<ShardletConfig>();
        }
        return this.shardlet;
    }

}
