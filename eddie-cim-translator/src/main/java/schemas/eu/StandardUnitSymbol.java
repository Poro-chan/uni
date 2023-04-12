
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StandardUnitSymbol.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardUnitSymbol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AMP"/&gt;
 *     &lt;enumeration value="C62"/&gt;
 *     &lt;enumeration value="KVT"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MAW"/&gt;
 *     &lt;enumeration value="OHM"/&gt;
 *     &lt;enumeration value="P1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardUnitSymbol", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardUnitSymbol {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Ampere&lt;/Title&gt;
     * 							&lt;Definition&gt;The unit of electrical current in the International system of Units (SI) equivalent to one Coulomb per second.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AMP("AMP"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;One&lt;/Title&gt;
     * 							&lt;Definition&gt;A unit for dimensionless quantities, also called quantities of dimension one.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("C62")
    C_62("C62"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;kV&lt;/Title&gt;
     * 							&lt;Definition&gt;The symbol of kV&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KVT("KVT"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;MVAr&lt;/Title&gt;
     * 							&lt;Definition&gt;The symbol of MVAr&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAR("MAR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;MW&lt;/Title&gt;
     * 							&lt;Definition&gt;The symbol of MW&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAW("MAW"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Ohm&lt;/Title&gt;
     * 							&lt;Definition&gt;The symbol of Ohm Unit&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    OHM("OHM"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Percent&lt;/Title&gt;
     * 							&lt;Definition&gt;A unit of proportion equal to 0.01.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1")
    P_1("P1");
    private final String value;

    StandardUnitSymbol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardUnitSymbol fromValue(String v) {
        for (StandardUnitSymbol c: StandardUnitSymbol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
