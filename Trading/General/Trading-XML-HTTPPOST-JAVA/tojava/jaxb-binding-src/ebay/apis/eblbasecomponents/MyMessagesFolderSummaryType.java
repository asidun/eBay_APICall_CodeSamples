//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Summary details for a specified My Messages folder.
 * 			
 * 
 * <p>Java class for MyMessagesFolderSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesFolderSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesFolderSummaryType", propOrder = {
    "folderID",
    "folderName",
    "newAlertCount",
    "newMessageCount",
    "totalAlertCount",
    "totalMessageCount",
    "newHighPriorityCount",
    "totalHighPriorityCount"
})
public class MyMessagesFolderSummaryType {

    @XmlElement(name = "FolderID")
    protected Long folderID;
    @XmlElement(name = "FolderName")
    protected String folderName;
    @XmlElement(name = "NewAlertCount")
    protected Integer newAlertCount;
    @XmlElement(name = "NewMessageCount")
    protected Integer newMessageCount;
    @XmlElement(name = "TotalAlertCount")
    protected Integer totalAlertCount;
    @XmlElement(name = "TotalMessageCount")
    protected Integer totalMessageCount;
    @XmlElement(name = "NewHighPriorityCount")
    protected Integer newHighPriorityCount;
    @XmlElement(name = "TotalHighPriorityCount")
    protected Integer totalHighPriorityCount;

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * Gets the value of the newAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewAlertCount() {
        return newAlertCount;
    }

    /**
     * Sets the value of the newAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewAlertCount(Integer value) {
        this.newAlertCount = value;
    }

    /**
     * Gets the value of the newMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMessageCount() {
        return newMessageCount;
    }

    /**
     * Sets the value of the newMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMessageCount(Integer value) {
        this.newMessageCount = value;
    }

    /**
     * Gets the value of the totalAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAlertCount() {
        return totalAlertCount;
    }

    /**
     * Sets the value of the totalAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAlertCount(Integer value) {
        this.totalAlertCount = value;
    }

    /**
     * Gets the value of the totalMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /**
     * Sets the value of the totalMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMessageCount(Integer value) {
        this.totalMessageCount = value;
    }

    /**
     * Gets the value of the newHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewHighPriorityCount() {
        return newHighPriorityCount;
    }

    /**
     * Sets the value of the newHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewHighPriorityCount(Integer value) {
        this.newHighPriorityCount = value;
    }

    /**
     * Gets the value of the totalHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHighPriorityCount() {
        return totalHighPriorityCount;
    }

    /**
     * Sets the value of the totalHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHighPriorityCount(Integer value) {
        this.totalHighPriorityCount = value;
    }

}
