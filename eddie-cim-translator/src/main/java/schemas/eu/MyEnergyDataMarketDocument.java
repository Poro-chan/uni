
package schemas.eu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MyEnergyData_MarketDocument complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MyEnergyData_MarketDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ID_String"/&gt;
 *         &lt;element name="revisionNumber" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMPVersion_String" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MessageKind_String" minOccurs="0"/&gt;
 *         &lt;element name="docStatus" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Action_Status" minOccurs="0"/&gt;
 *         &lt;element name="createdDateTime" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMP_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.marketRole.type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MarketRoleKind_String" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}PartyID_String" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.marketRole.type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MarketRoleKind_String" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}PartyID_String" minOccurs="0"/&gt;
 *         &lt;element name="period.timeInterval" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMP_DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="mD_Area_Domain.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}AreaID_String" minOccurs="0"/&gt;
 *         &lt;element name="TimeSeries" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}TimeSeries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyEnergyData_MarketDocument", propOrder = {
    "mrid",
    "revisionNumber",
    "type",
    "docStatus",
    "createdDateTime",
    "senderMarketParticipantName",
    "senderMarketParticipantMarketRoleType",
    "senderMarketParticipantMRID",
    "receiverMarketParticipantName",
    "receiverMarketParticipantMarketRoleType",
    "receiverMarketParticipantMRID",
    "periodTimeInterval",
    "mdAreaDomainMRID",
    "timeSeries"
})
public class MyEnergyDataMarketDocument {

    @XmlElement(name = "mRID", required = true)
    protected String mrid;
    protected String revisionNumber;
    protected String type;
    protected ActionStatus docStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(name = "sender_MarketParticipant.name")
    protected String senderMarketParticipantName;
    @XmlElement(name = "sender_MarketParticipant.marketRole.type")
    protected String senderMarketParticipantMarketRoleType;
    @XmlElement(name = "sender_MarketParticipant.mRID")
    protected PartyIDString senderMarketParticipantMRID;
    @XmlElement(name = "receiver_MarketParticipant.name")
    protected String receiverMarketParticipantName;
    @XmlElement(name = "receiver_MarketParticipant.marketRole.type")
    protected String receiverMarketParticipantMarketRoleType;
    @XmlElement(name = "receiver_MarketParticipant.mRID")
    protected PartyIDString receiverMarketParticipantMRID;
    @XmlElement(name = "period.timeInterval")
    protected ESMPDateTimeInterval periodTimeInterval;
    @XmlElement(name = "mD_Area_Domain.mRID")
    protected AreaIDString mdAreaDomainMRID;
    @XmlElement(name = "TimeSeries")
    protected List<TimeSeries> timeSeries;

    /**
     * Ruft den Wert der mrid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Legt den Wert der mrid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Ruft den Wert der revisionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Legt den Wert der revisionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der docStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getDocStatus() {
        return docStatus;
    }

    /**
     * Legt den Wert der docStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setDocStatus(ActionStatus value) {
        this.docStatus = value;
    }

    /**
     * Ruft den Wert der createdDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Legt den Wert der createdDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Ruft den Wert der senderMarketParticipantName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMarketParticipantName() {
        return senderMarketParticipantName;
    }

    /**
     * Legt den Wert der senderMarketParticipantName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMarketParticipantName(String value) {
        this.senderMarketParticipantName = value;
    }

    /**
     * Ruft den Wert der senderMarketParticipantMarketRoleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMarketParticipantMarketRoleType() {
        return senderMarketParticipantMarketRoleType;
    }

    /**
     * Legt den Wert der senderMarketParticipantMarketRoleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMarketParticipantMarketRoleType(String value) {
        this.senderMarketParticipantMarketRoleType = value;
    }

    /**
     * Ruft den Wert der senderMarketParticipantMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIDString }
     *     
     */
    public PartyIDString getSenderMarketParticipantMRID() {
        return senderMarketParticipantMRID;
    }

    /**
     * Legt den Wert der senderMarketParticipantMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIDString }
     *     
     */
    public void setSenderMarketParticipantMRID(PartyIDString value) {
        this.senderMarketParticipantMRID = value;
    }

    /**
     * Ruft den Wert der receiverMarketParticipantName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMarketParticipantName() {
        return receiverMarketParticipantName;
    }

    /**
     * Legt den Wert der receiverMarketParticipantName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMarketParticipantName(String value) {
        this.receiverMarketParticipantName = value;
    }

    /**
     * Ruft den Wert der receiverMarketParticipantMarketRoleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMarketParticipantMarketRoleType() {
        return receiverMarketParticipantMarketRoleType;
    }

    /**
     * Legt den Wert der receiverMarketParticipantMarketRoleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMarketParticipantMarketRoleType(String value) {
        this.receiverMarketParticipantMarketRoleType = value;
    }

    /**
     * Ruft den Wert der receiverMarketParticipantMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIDString }
     *     
     */
    public PartyIDString getReceiverMarketParticipantMRID() {
        return receiverMarketParticipantMRID;
    }

    /**
     * Legt den Wert der receiverMarketParticipantMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIDString }
     *     
     */
    public void setReceiverMarketParticipantMRID(PartyIDString value) {
        this.receiverMarketParticipantMRID = value;
    }

    /**
     * Ruft den Wert der periodTimeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ESMPDateTimeInterval }
     *     
     */
    public ESMPDateTimeInterval getPeriodTimeInterval() {
        return periodTimeInterval;
    }

    /**
     * Legt den Wert der periodTimeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMPDateTimeInterval }
     *     
     */
    public void setPeriodTimeInterval(ESMPDateTimeInterval value) {
        this.periodTimeInterval = value;
    }

    /**
     * Ruft den Wert der mdAreaDomainMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaIDString }
     *     
     */
    public AreaIDString getMDAreaDomainMRID() {
        return mdAreaDomainMRID;
    }

    /**
     * Legt den Wert der mdAreaDomainMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaIDString }
     *     
     */
    public void setMDAreaDomainMRID(AreaIDString value) {
        this.mdAreaDomainMRID = value;
    }

    /**
     * Gets the value of the timeSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeries }
     * 
     * 
     */
    public List<TimeSeries> getTimeSeries() {
        if (timeSeries == null) {
            timeSeries = new ArrayList<TimeSeries>();
        }
        return this.timeSeries;
    }

}
