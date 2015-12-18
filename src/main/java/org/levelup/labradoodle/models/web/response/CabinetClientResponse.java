package org.levelup.labradoodle.models.web.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.levelup.labradoodle.models.web.DishDto;

/**
 * Class  {@Link org.levelup.labradoodle.models.web.response}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 17.12.15
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CabinetClientResponse {

    private ClientResponseStatus status;

    private DishDto dishDto;

    public ClientResponseStatus getStatus() {
        return status;
    }

    public CabinetClientResponse setStatus(ClientResponseStatus status) {
        this.status = status;
        return this;
    }

    public DishDto getDishDto() {
        return dishDto;
    }

    public CabinetClientResponse setDishDto(DishDto dishDto) {
        this.dishDto = dishDto;
        return this;
    }
}
