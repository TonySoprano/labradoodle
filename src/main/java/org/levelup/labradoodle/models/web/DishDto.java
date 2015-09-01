package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.levelup.labradoodle.models.entities.TypesOfDishes;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by toha on 18.08.15.
 */

//Dishes transfer object
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DishDto implements Serializable {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private TypesOfDishes typesOfDishes;

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

        DishDto dishDto = (DishDto) o;

        if (Description != null ? !Description.equals(dishDto.Description) : dishDto.Description != null)
            return false;
        if (deadline != null ? !deadline.equals(dishDto.deadline) : dishDto.deadline != null) return false;
        if (id != null ? !id.equals(dishDto.id) : dishDto.id != null) return false;
        if (name != null ? !name.equals(dishDto.name) : dishDto.name != null) return false;
        if (photo != null ? !photo.equals(dishDto.photo) : dishDto.photo != null) return false;
        if (priceNew != null ? !priceNew.equals(dishDto.priceNew) : dishDto.priceNew != null) return false;
        if (priceOriginal != null ? !priceOriginal.equals(dishDto.priceOriginal) : dishDto.priceOriginal != null)
            return false;
        if (typesOfDishes != dishDto.typesOfDishes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (typesOfDishes != null ? typesOfDishes.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (priceOriginal != null ? priceOriginal.hashCode() : 0);
        result = 31 * result + (priceNew != null ? priceNew.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        return result;
    }

    public DishDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public TypesOfDishes getTypesOfDishes() {
        return typesOfDishes;
    }

    public DishDto setTypesOfDishes(TypesOfDishes typesOfDishes) {
        this.typesOfDishes = typesOfDishes;
        return this;
    }

    public String getName() {
        return name;
    }

    public DishDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public DishDto setPrice_Original(Integer priceo_riginal) {
        this.priceOriginal = priceo_riginal;
        return this;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public DishDto setPrice_new(Integer price_new) {
        this.priceNew = price_new;
        return this;
    }

    public Date getDeadline() {
        return deadline;
    }

    public DishDto setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public DishDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public DishDto setDescription(String description) {
        Description = description;
        return this;
    }

    @Override
    public String toString(){
        return "DishDto {"+
                "photo='\""+'\''+"}";
    }

}


