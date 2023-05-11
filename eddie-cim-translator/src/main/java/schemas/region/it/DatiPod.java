package schemas.region.it;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPod", propOrder = {
    "pod",
    "datamisura",
    "tiporettifica",
    "datarilevazione",
    "motivazione",
    "datipdp",
    "misura"
})

public class DatiPod {

    @XmlElement(name = "Pod")
    protected String pod;
    @XmlElement(name = "DataMisura")
    protected String datamisura;
    @XmlElement(name = "TipoRettifica")
    protected String tiporettifica;
    @XmlElement(name = "DataRilevazione")
    protected String datarilevazione;
    @XmlElement(name = "Motivazione")
    protected String motivazione;
    @XmlElement(name = "DatiPdp")
    protected List<DatiPdp2GType> datipdp;
    @XmlElement(name = "Misura")
    protected List<DettaglioMisuraRFOv2Type> misura;

    public String getPod() {
        return pod;
    }
    public void setPod(String value) {
        this.pod = value;
    }

    public String getDataMisura() {
        return datamisura;
    }
    public void setDataMisura(String value) {
        this.datamisura = value;
    }

    public String getTipoRettifica() {
        return tiporettifica;
    }
    public void setTipoRettifica(String value) {
        this.tiporettifica = value;
    }

    public String getDataRilevazione() {
        return datarilevazione;
    }
    public void setDataRilevazione(String value) {
        this.datarilevazione = value;
    }

    public String getMotivazione() {
        return motivazione;
    }
    public void setMotivazione(String value) {
        this.motivazione = value;
    }

    public List<DatiPdp2GType> getDatiPdp() {
        if (datipdp == null) {
            datipdp = new ArrayList<DatiPdp2GType>();
        }
        return this.datipdp;
    }

    public List<DettaglioMisuraRFOv2Type> getMisura() {
        if (misura == null) {
            misura = new ArrayList<DettaglioMisuraRFOv2Type>();
        }
        return this.misura;
    }
}