package schemas.region.it;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FlussoMisure")
@XmlType(name = "FlussoMisureType", propOrder = {
        "identificativiFlusso",
        "datiPod"
})
public class FlussoMisureType {

    @XmlElement(name = "IdentificativiFlusso", required = true)
    protected IdentificativiFlussoType identificativiFlusso;
    @XmlElement(name = "DatiPod", required = true)
    protected DatiPod datiPod;
    @XmlAttribute(name = "CodFlusso",required = true)
    protected String codFlusso;

    public IdentificativiFlussoType getIdentificativiFlusso() {
        return identificativiFlusso;
    }

    public void setIdentificativiFlusso(IdentificativiFlussoType identificativiFlusso) {
        this.identificativiFlusso = identificativiFlusso;
    }

    public DatiPod getDatiPod() {
        return datiPod;
    }

    public void setDatiPod(DatiPod datiPod) {
        this.datiPod = datiPod;
    }

    public String getCodFlusso() {
        return codFlusso;
    }

    public void setCodFlusso(String codFlusso) {
        this.codFlusso = codFlusso;
    }
}
