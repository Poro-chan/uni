
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalPriceDirectionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalPriceDirectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalPriceDirectionType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalPriceDirectionType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalPriceDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalPriceDirectionType fromValue(String v) {
        for (LocalPriceDirectionType c: LocalPriceDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
