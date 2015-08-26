package org.levelup.labradoodle.models.entities.kladr;

/**
 * Created by toha on 26.08.15.
 */
public enum Regions {
    Cherkasy_oblast("CHK"), Chernihiv_oblast("CHH"), Chernivtsi_oblast("CHC"),  Dnipropetrovsk_oblast("DNK"), Donetsk_oblast("DON"),
    IvanoFrankivsk_oblast("IVF"),    Kharkiv_oblast("KHK"), Kherson_oblast("HRS"), Khmelnytsk_oblast("HMC"), Kirovohrad_oblast("KRG"),
    Kyiv_oblast("KIV"), Luhansk_oblast("LHS"), Lviv_oblast("LVV"), Mykolaiv_oblast("MKL"),
    Odesa_oblast("ODS"), Poltava_oblast("PLT"), Rivne_oblast("RVN"), Sumy_oblast("SMM"), Ternopil_oblast("TRN"),
    Vinnytsia_oblast("VNC"), Volyn_oblast("VLN"), Zakarpattia_oblast("ZKP"),
    Zaporizhzhia_oblast("ZPR"), Zhytomyr_oblast("GTM");

    String code;

    Regions(String code){
        this.code = code;
    }
}
