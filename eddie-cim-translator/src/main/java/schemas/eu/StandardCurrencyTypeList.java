
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StandardCurrencyTypeList.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardCurrencyTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="LEK"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardCurrencyTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardCurrencyTypeList {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Bosnian convertible marka&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Bosnia and Herzegovina.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    BAM,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Bulgarian lev&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Bulgaria.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    BGN,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Swiss Franc&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Switzerland.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    CHF,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Czech Koruna&lt;/Title&gt;
     * 							&lt;Definition&gt;The legal tender of the Czech Republic.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    CZK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Danish Kroner &lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Denmark.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DKK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;EURO&lt;/Title&gt;
     * 							&lt;Definition&gt;The European legal tender.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    EUR,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Pound Sterling&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of the United Kingdom.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GBP,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Croatian kuna&lt;/Title&gt;
     * 							&lt;Definition&gt;The legal tender of Croatia.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HRK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Hungarian Forint&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Hungary.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HUF,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Icelandic krona&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Iceland.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ISK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Albanian lek&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Albania.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    LEK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Lithuanian litas&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Lithuania&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    LTL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Macedonian denar&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of FYROM.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MKD,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Norwegian Kroner &lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Norway.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    NOK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Polish zloty&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Poland.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PLN,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Romanian Leu&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Romania.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    RON,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Serbian dinar&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Serbian Republic.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    RSD,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Saudi Arabian Riyal&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Saudi Arabia.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SAR,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Swedish kroner&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Sweden.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SEK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Slovak Koruna&lt;/Title&gt;
     * 							&lt;Definition&gt;The legal tender of Slovakia.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SKK,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;New Turkish Lira&lt;/Title&gt;
     * 							&lt;Definition&gt;The Legal tender of Turkey.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    TRY,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;Ukrainian hryvnia&lt;/Title&gt;
     * 							&lt;Definition&gt;The legal tender of Ukraine.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    UAH,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 							&lt;Title&gt;US Dollar&lt;/Title&gt;
     * 							&lt;Definition&gt;The legal tender of the USA.&lt;/Definition&gt;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    USD;

    public String value() {
        return name();
    }

    public static StandardCurrencyTypeList fromValue(String v) {
        return valueOf(v);
    }

}
