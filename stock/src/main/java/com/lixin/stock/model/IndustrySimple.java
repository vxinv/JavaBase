package com.lixin.stock.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class IndustrySimple implements Serializable {
    private Integer id;

    private String plate;

    private String firstName;

    private String secondName;

    private String level2code;

    private String titie;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLevel2code() {
        return level2code;
    }

    public void setLevel2code(String level2code) {
        this.level2code = level2code;
    }

    public String getTitie() {
        return titie;
    }

    public void setTitie(String titie) {
        this.titie = titie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", plate=").append(plate);
        sb.append(", firstName=").append(firstName);
        sb.append(", secondName=").append(secondName);
        sb.append(", level2code=").append(level2code);
        sb.append(", titie=").append(titie);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}