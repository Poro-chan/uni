package schemas.region.it;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificativiFlussoType", propOrder = {
    "PIvaUtente",
    "PIvaDistributore",
    "CodContrDisp"
})

public class IdentificativiFlusso {

    @XmlElement(name = "PIvaUtente")
    protected int pivautente;
    @XmlElement(name = "PIvaDistributore")
    protected int pivadistributore;
    @XmlElement(name = "CodContrDisp")
    protected String codcontrdisp;

    public int getPIvaUtente() {
        return pivautente;
    }
    public void setPIvaUtente(int value) {
        this.pivautente = value;
    }

    public int getPIvaDistributore() {
        return pivadistributore;
    }
    public void setPIvaDistributore(int value) {
        this.pivadistributore = value;
    }

    public String getCodContrDisp() {
        return codcontrdisp;
    }
    public void setCodContrDisp(String value) {
        this.codcontrdisp = value;
    }
}