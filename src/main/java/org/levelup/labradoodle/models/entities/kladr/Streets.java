package org.levelup.labradoodle.models.entities.kladr;

/**
 * Created by toha on 26.08.15.
 */
public enum Streets {

    Lenina("DNK","LNN"), K_Marksa("DNK","KMK"), Rogaleva("DNK","ROG"), Dzerginskogo("DNK","DZR"), Patorginskogo("DNK","PTR"), Pobeda("DNK","POB"), Komunar("DNK","KMR"),
    Komsamolskaya("DNK","KMS");

    String code;

    String cityCode;

    Streets(String cityCode, String code){
        this.code = code;
        this.cityCode = cityCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
