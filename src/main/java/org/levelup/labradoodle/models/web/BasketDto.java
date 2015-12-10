package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * Class  {@Link org.levelup.labradoodle.models.web}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 10.12.15
 */
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BasketDto {

    private DishDto dishDto;

    private Integer count;

    public DishDto getDishDto() {
        return dishDto;
    }

    public BasketDto setDishDto(DishDto dishDto) {
        this.dishDto = dishDto;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public BasketDto setCount(Integer count) {
        this.count = count;
        return this;
    }
}
