
package schemas.eu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimeSeries complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeSeries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ID_String"/&gt;
 *         &lt;element name="businessType" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}BusinessKind_String" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}EnergyProductKind_String" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curveType" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}CurveType_String" minOccurs="0"/&gt;
 *         &lt;element name="tS_Area_Domain.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}AreaID_String" minOccurs="0"/&gt;
 *         &lt;element name="marketAgreement.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ID_String" minOccurs="0"/&gt;
 *         &lt;element name="marketAgreement.type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}CapacityContractKind_String" minOccurs="0"/&gt;
 *         &lt;element name="measurement_Unit.name" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MeasurementUnitKind_String" minOccurs="0"/&gt;
 *         &lt;element name="MarketEvaluationPoint" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MarketEvaluationPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="original_MarketDocument.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ID_String" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Series_Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeries", propOrder = {
    "mrid",
    "businessType",
    "product",
    "name",
    "curveType",
    "tsAreaDomainMRID",
    "marketAgreementMRID",
    "marketAgreementType",
    "measurementUnitName",
    "marketEvaluationPoint",
    "originalMarketDocumentMRID",
    "period"
})
public class TimeSeries {

    @XmlElement(name = "mRID", required = true)
    protected String mrid;
    protected String businessType;
    protected String product;
    protected String name;
    protected String curveType;
    @XmlElement(name = "tS_Area_Domain.mRID")
    protected AreaIDString tsAreaDomainMRID;
    @XmlElement(name = "marketAgreement.mRID")
    protected String marketAgreementMRID;
    @XmlElement(name = "marketAgreement.type")
    protected String marketAgreementType;
    @XmlElement(name = "measurement_Unit.name")
    protected String measurementUnitName;
    @XmlElement(name = "MarketEvaluationPoint")
    protected List<MarketEvaluationPoint> marketEvaluationPoint;
    @XmlElement(name = "original_MarketDocument.mRID")
    protected String originalMarketDocumentMRID;
    @XmlElement(name = "Period")
    protected List<SeriesPeriod> period;

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
     * Ruft den Wert der businessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Legt den Wert der businessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der curveType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveType() {
        return curveType;
    }

    /**
     * Legt den Wert der curveType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveType(String value) {
        this.curveType = value;
    }

    /**
     * Ruft den Wert der tsAreaDomainMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaIDString }
     *     
     */
    public AreaIDString getTSAreaDomainMRID() {
        return tsAreaDomainMRID;
    }

    /**
     * Legt den Wert der tsAreaDomainMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaIDString }
     *     
     */
    public void setTSAreaDomainMRID(AreaIDString value) {
        this.tsAreaDomainMRID = value;
    }

    /**
     * Ruft den Wert der marketAgreementMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketAgreementMRID() {
        return marketAgreementMRID;
    }

    /**
     * Legt den Wert der marketAgreementMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketAgreementMRID(String value) {
        this.marketAgreementMRID = value;
    }

    /**
     * Ruft den Wert der marketAgreementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketAgreementType() {
        return marketAgreementType;
    }

    /**
     * Legt den Wert der marketAgreementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketAgreementType(String value) {
        this.marketAgreementType = value;
    }

    /**
     * Ruft den Wert der measurementUnitName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnitName() {
        return measurementUnitName;
    }

    /**
     * Legt den Wert der measurementUnitName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnitName(String value) {
        this.measurementUnitName = value;
    }

    /**
     * Gets the value of the marketEvaluationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketEvaluationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketEvaluationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketEvaluationPoint }
     * 
     * 
     */
    public List<MarketEvaluationPoint> getMarketEvaluationPoint() {
        if (marketEvaluationPoint == null) {
            marketEvaluationPoint = new ArrayList<MarketEvaluationPoint>();
        }
        return this.marketEvaluationPoint;
    }

    /**
     * Ruft den Wert der originalMarketDocumentMRID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalMarketDocumentMRID() {
        return originalMarketDocumentMRID;
    }

    /**
     * Legt den Wert der originalMarketDocumentMRID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalMarketDocumentMRID(String value) {
        this.originalMarketDocumentMRID = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesPeriod }
     * 
     * 
     */
    public List<SeriesPeriod> getPeriod() {
        if (period == null) {
            period = new ArrayList<SeriesPeriod>();
        }
        return this.period;
    }

}
