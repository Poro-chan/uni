
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalUnitOfMeasureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalUnitOfMeasureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A59"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalUnitOfMeasureType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalUnitOfMeasureType {

    @XmlEnumValue("A59")
    A_59("A59");
    private final String value;

    LocalUnitOfMeasureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalUnitOfMeasureType fromValue(String v) {
        for (LocalUnitOfMeasureType c: LocalUnitOfMeasureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
