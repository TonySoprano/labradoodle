package org.levelup.labradoodle.models.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by toha on 18.08.15.
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "getAll", query = "SELECT a FROM Users a"),
        @NamedQuery(name = "getById", query = "SELECT a FROM Users a WHERE a.id = :id")
})
public class UsersPeople implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String email;

    private String pass;

    public Integer getId() {
        return id;
    }

    public UsersPeople setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UsersPeople setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersPeople setEmail(String email) {
        this.email = email;
        return this;
    }
}
