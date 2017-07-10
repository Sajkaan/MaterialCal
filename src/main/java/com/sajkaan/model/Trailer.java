package com.sajkaan.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String orderTag;

    @ManyToMany
    private List<Part> partList = new ArrayList<>();

    private double netoWeight;

    private double brutoWeight;

    public Trailer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public List<Part> getPartList() {
        return partList;
    }

    public void setPartList(List<Part> partList) {
        this.partList = partList;
    }

    public double getNetoWeight() {
        return netoWeight;
    }

    public void setNetoWeight(double netoWeight) {
        this.netoWeight = netoWeight;
    }

    public double getBrutoWeight() {
        return brutoWeight;
    }

    public void setBrutoWeight(double brutoWeight) {
        this.brutoWeight = brutoWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trailer trailer = (Trailer) o;

        if (Double.compare(trailer.netoWeight, netoWeight) != 0) return false;
        if (Double.compare(trailer.brutoWeight, brutoWeight) != 0) return false;
        if (id != null ? !id.equals(trailer.id) : trailer.id != null) return false;
        if (orderTag != null ? !orderTag.equals(trailer.orderTag) : trailer.orderTag != null) return false;
        return partList != null ? partList.equals(trailer.partList) : trailer.partList == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderTag != null ? orderTag.hashCode() : 0);
        result = 31 * result + (partList != null ? partList.hashCode() : 0);
        temp = Double.doubleToLongBits(netoWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(brutoWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
