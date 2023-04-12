
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocalObjectAggregationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalObjectAggregationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalObjectAggregationType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalObjectAggregationType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalObjectAggregationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalObjectAggregationType fromValue(String v) {
        for (LocalObjectAggregationType c: LocalObjectAggregationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
