
package schemas.eu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für AreaID_String complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AreaID_String"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:entsoe.eu:wgedi:MyEnergyData:10:1&gt;AreaID_String-base"&gt;
 *       &lt;attribute name="codingScheme" use="required" type="{urn:entsoe.eu:wgedi:codelists}CodingSchemeTypeList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaID_String", propOrder = {
    "value"
})
public class AreaIDString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codingScheme", required = true)
    protected String codingScheme;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der codingScheme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodingScheme() {
        return codingScheme;
    }

    /**
     * Legt den Wert der codingScheme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodingScheme(String value) {
        this.codingScheme = value;
    }

}
