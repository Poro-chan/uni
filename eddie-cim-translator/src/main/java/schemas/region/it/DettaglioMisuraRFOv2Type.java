package schemas.region.it;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioMisuraRFOv2Type", propOrder = {
    "potmax",
    "ea"
})

public class DettaglioMisuraRFOv2Type {

    @XmlElement(name = "PotMax")
    protected String potmax;
    @XmlElement(name = "Ea")
    protected List<EnergiaType> ea;

    public String getPotMax() {
        return potmax;
    }
    public void setPotMax(String value) {
        this.potmax = value;
    }

    public List<EnergiaType> getEa() {
        if (ea == null) {
            ea = new ArrayList<EnergiaType>();
        }
        return this.ea;
    }
}