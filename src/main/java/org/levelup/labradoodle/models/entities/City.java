package org.levelup.labradoodle.models.entities;

/**
 * Enum {@link City}
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 29.06.2015
 */
public enum City {

    Vinnytsia("VNC" ,"VNC"), Dnipropetrovsk("DNK","DNK"), Donetsk("DON","DON"), Zhytomyr("GTM","GTM"), Zaporizhzhia("ZPR","ZPR"), IvanoFrankivsk("IVF","IVF"), Kyiv("KIV","KIV"), Kirovohrad("KRG","KRG"), Luhansk("LHS","LHS"), Lutsk("VLN","VLN"),
    Lviv("LVV","LVV"), Mykolaiv("MKL","MKL"), Odesa("ODS","ODS"), Poltava("PLT","PLT"), Rivne("RVN","RVN"), Sumy("SMM","SMM"), Ternopil("TRN","TRN"), Uzhhorod("ZKP","ZKP"), Kharkiv("KHK","KHK"), Kherson("HRS","HRS"), Khmelnytskyi("HMC","HMC"),
    Cherkasy("CHK","CHK"), Chernivtsi("CHC","CHC"), Chernihiv("CHH","CHH");

    String code;
    String region_id;

    City(String region_id, String code){
        this.code = code;
        this.region_id = region_id;
    }
   }
