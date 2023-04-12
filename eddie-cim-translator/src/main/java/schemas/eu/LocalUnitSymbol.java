
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalUnitSymbol.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalUnitSymbol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalUnitSymbol", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalUnitSymbol {

    AMP;

    public String value() {
        return name();
    }

    public static LocalUnitSymbol fromValue(String v) {
        return valueOf(v);
    }

}
