package rest.dto;

import domain.model.Country;
import domain.model.Client;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class TourDto {

    private int id;
    private Country country;
    private BigDecimal asset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public BigDecimal getAsset() {
        return asset;
    }

    public void setAsset(BigDecimal asset) {
        this.asset = asset;
    }

}
