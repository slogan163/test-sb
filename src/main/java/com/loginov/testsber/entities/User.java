package com.loginov.testsber.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private UUID id;

    @Version
    @Column(name = "VERSION")
    private int version;

    @NotBlank
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotBlank
    @Column(name = "LAST_NAME")
    private String lastName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
