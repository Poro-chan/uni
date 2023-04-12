
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalRightsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalRightsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalRightsType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalRightsType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalRightsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalRightsType fromValue(String v) {
        for (LocalRightsType c: LocalRightsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
