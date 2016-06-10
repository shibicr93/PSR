package com.saggezza.psr.dto.models;

/**
 * Created by shibi on 9/6/16.
 */
public class BaseDTO {

    protected String name;
    protected int id;

    public BaseDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
