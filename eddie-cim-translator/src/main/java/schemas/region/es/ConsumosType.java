
package schemas.region.es;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für consumosType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="consumosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Consumo_kWh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metodo_obtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumos" type="{}consumosType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumosType", propOrder = {
    "cups",
    "fecha",
    "hora",
    "consumoKWh",
    "metodoObtencion",
    "consumos"
})
public class ConsumosType {

    @XmlElement(name = "CUPS")
    protected String cups;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Hora")
    protected String hora;
    @XmlElement(name = "Consumo_kWh")
    protected String consumoKWh;
    @XmlElement(name = "metodo_obtencion")
    protected String metodoObtencion;
    protected List<ConsumosType> consumos;

    /**
     * Ruft den Wert der cups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUPS() {
        return cups;
    }

    /**
     * Legt den Wert der cups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUPS(String value) {
        this.cups = value;
    }

    /**
     * Ruft den Wert der fecha-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Legt den Wert der fecha-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Ruft den Wert der hora-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Legt den Wert der hora-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Ruft den Wert der consumoKWh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoKWh() {
        return consumoKWh;
    }

    /**
     * Legt den Wert der consumoKWh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoKWh(String value) {
        this.consumoKWh = value;
    }

    /**
     * Ruft den Wert der metodoObtencion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoObtencion() {
        return metodoObtencion;
    }

    /**
     * Legt den Wert der metodoObtencion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoObtencion(String value) {
        this.metodoObtencion = value;
    }

    /**
     * Gets the value of the consumos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumosType }
     * 
     * 
     */
    public List<ConsumosType> getConsumos() {
        if (consumos == null) {
            consumos = new ArrayList<ConsumosType>();
        }
        return this.consumos;
    }

}
