package schemas.region.it;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPdp2GType", propOrder = {
    "trattamento",
    "tensione",
    "forfait",
    "ka",
    "kr",
    "kp"
})

public class DatiPdp2GType {
    @XmlElement(name = "Trattamento")
    protected String trattamento;
    @XmlElement(name = "Tensione")
    protected int tensione;
    @XmlElement(name = "Forfait")
    protected String forfait;
    @XmlElement(name = "Ka")
    protected String ka;
    @XmlElement(name = "Kr")
    protected String kr;
    @XmlElement(name = "Kp")
    protected String kp;

    public String getTrattamento() {
        return trattamento;
    }
    public void setTrattamento(String value) {
        this.trattamento = value;
    }

    public int getTensione() {
        return tensione;
    }
    public void setTensione(int value) {
        this.tensione = value;
    }

    public String getForfait() {
        return forfait;
    }
    public void setForfaito(String value) {
        this.forfait = value;
    }

    public String getKa() {
        return ka;
    }
    public void setKa(String value) {
        this.ka = value;
    }

    public String getKr() {
        return kr;
    }
    public void setKr(String value) {
        this.kr = value;
    }

    public String getKp() {
        return kp;
    }
    public void setKp(String value) {
        this.kp = value;
    }


}