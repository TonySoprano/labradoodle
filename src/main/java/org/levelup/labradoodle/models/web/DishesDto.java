package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.levelup.labradoodle.models.entities.TypeDishes;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by toha on 18.08.15.
 */
public class DishesDto implements Serializable {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private TypeDishes typeDishes;

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer priceOriginal;

    @JsonProperty
    private Integer priceNew;

    @JsonProperty
    private Date deadline;

    @JsonProperty
    private String photo;

    @JsonProperty
    private String Description;

    @JsonProperty
    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DishesDto dishesDto = (DishesDto) o;

        if (Description != null ? !Description.equals(dishesDto.Description) : dishesDto.Description != null)
            return false;
        if (deadline != null ? !deadline.equals(dishesDto.deadline) : dishesDto.deadline != null) return false;
        if (id != null ? !id.equals(dishesDto.id) : dishesDto.id != null) return false;
        if (name != null ? !name.equals(dishesDto.name) : dishesDto.name != null) return false;
        if (photo != null ? !photo.equals(dishesDto.photo) : dishesDto.photo != null) return false;
        if (priceNew != null ? !priceNew.equals(dishesDto.priceNew) : dishesDto.priceNew != null) return false;
        if (priceOriginal != null ? !priceOriginal.equals(dishesDto.priceOriginal) : dishesDto.priceOriginal != null)
            return false;
        if (typeDishes != dishesDto.typeDishes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (typeDishes != null ? typeDishes.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (priceOriginal != null ? priceOriginal.hashCode() : 0);
        result = 31 * result + (priceNew != null ? priceNew.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        return result;
    }

    public DishesDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public TypeDishes getTypeDishes() {
        return typeDishes;
    }

    public DishesDto setTypeDishes(TypeDishes typeDishes) {
        this.typeDishes = typeDishes;
        return this;
    }

    public String getName() {
        return name;
    }

    public DishesDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public DishesDto setPrice_Original(Integer priceo_riginal) {
        this.priceOriginal = priceo_riginal;
        return this;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public DishesDto setPrice_new(Integer price_new) {
        this.priceNew = price_new;
        return this;
    }

    public Date getDeadline() {
        return deadline;
    }

    public DishesDto setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public DishesDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public DishesDto setDescription(String description) {
        Description = description;
        return this;
    }

}


