//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 11:03:01 PM CEST 
//


package com.gamerevision.rusty.realityshard.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClusterServer" type="{}ClusterServer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterInfo", propOrder = {
    "clusterServer"
})
public class ClusterInfo {

    @XmlElement(name = "ClusterServer")
    protected List<ClusterServer> clusterServer;

    /**
     * Gets the value of the clusterServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterServer }
     * 
     * 
     */
    public List<ClusterServer> getClusterServer() {
        if (clusterServer == null) {
            clusterServer = new ArrayList<ClusterServer>();
        }
        return this.clusterServer;
    }

}
