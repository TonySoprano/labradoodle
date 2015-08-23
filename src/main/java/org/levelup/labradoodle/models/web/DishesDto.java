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
public class DishesDto implements Serializable{

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


