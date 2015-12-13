package org.levelup.labradoodle.models.web.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Class  {@Link org.levelup.labradoodle.models.web.response}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 11.12.15
 */
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BasketClientResponse implements ClientResponse {

    private ClientResponseStatus status;

    private Integer countDishes;

    public Integer getCountDishes() {
        return countDishes;
    }

    public BasketClientResponse setCountDishes(Integer countDishes) {
        this.countDishes = countDishes;
        return this;
    }

    public ClientResponseStatus getStatus() {
        return status;
    }

    public BasketClientResponse setStatus(ClientResponseStatus status) {
        this.status = status;
        return this;
    }
}
