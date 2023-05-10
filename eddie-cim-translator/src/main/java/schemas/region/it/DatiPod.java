package schemas.region.it;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(name = "DatiPod", propOrder = {
    "Pod",
    "MeseAnno",
    "DataMisura",
    "TipoRettifica",
    "DataRilevazione",
    "Motivazione",
    "DataPrest",
    "CodPrat_SII",
    "DatiPdp"
})

public class DatiPod {

    @XmlElement(name = "Pod")
    protected String pod;
    @XmlElement(name = "MeseAnno")
    protected String meseanno;
    @XmlElement(name = "DataMisura")
    protected String datamisura;
    @XmlElement(name = "TipoRettifica")
    protected String tiporettifica;
    @XmlElement(name = "DataRilevazione")
    protected String datarilevazione;
    @XmlElement(name = "Motivazione")
    protected String motivazione;
    @XmlElement(name = "DataPrest")
    protected String dataprest;
    @XmlElement(name = "CodPrat_SII")
    protected String codpratsii;
    @XmlElement(name = "DatiPdp")
    protected List<DatiPdp2GType> datipdp;

    public String getPod() {
        return pod;
    }
    public void setPod(String value) {
        this.pod = value;
    }

    public String getMeseAnno() {
        return meseanno;
    }
    public void setMeseAnno(String value) {
        this.meseanno = value;
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
    public String getDataPrest() {
        return dataprest;
    }
    public void setDataPreste(String value) {
        this.dataprest = value;
    }
    public String getCodPrat_SII() {
        return codpratsii;
    }
    public void setCodPrat_SII(String value) {
        this.codpratsii = value;
    }

    public List<DatiPdp2GType> getDatiPdp() {
        if (datipdp == null) {
            datipdp = new ArrayList<DatiPdp2GType>();
        }
        return this.datipdp;
    }
}