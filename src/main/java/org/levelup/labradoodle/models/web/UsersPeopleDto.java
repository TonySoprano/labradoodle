package org.levelup.labradoodle.models.web;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by toha on 18.08.15.
 */
public class UsersPeopleDto implements Serializable{

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String email;

    @JsonProperty
    private String pass;

    @JsonProperty
    public Integer getId() {
        return id;
    }

    public UsersPeopleDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UsersPeopleDto setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersPeopleDto setEmail(String email) {
        this.email = email;
        return this;
    }

}
