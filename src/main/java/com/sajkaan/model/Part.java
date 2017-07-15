package com.sajkaan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String partName;

    @NotNull
    private double weightNeto;

    @NotNull
    private String material;

    private int height;

    private int length;

    private int thickness;

    private double weightBruto;

    public Part(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getWeightNeto() {
        return weightNeto;
    }

    public void setWeightNeto(double weightNeto) {
        this.weightNeto = weightNeto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public double getWeightBruto() {
        return weightBruto;
    }

    public void setWeightBruto(double weightBruto) {
        this.weightBruto = weightBruto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        if (Double.compare(part.weightNeto, weightNeto) != 0) return false;
        if (Double.compare(part.height, height) != 0) return false;
        if (Double.compare(part.length, length) != 0) return false;
        if (Double.compare(part.thickness, thickness) != 0) return false;
        if (Double.compare(part.weightBruto, weightBruto) != 0) return false;
        if (id != null ? !id.equals(part.id) : part.id != null) return false;
        if (partName != null ? !partName.equals(part.partName) : part.partName != null) return false;
        return material != null ? material.equals(part.material) : part.material == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (partName != null ? partName.hashCode() : 0);
        temp = Double.doubleToLongBits(weightNeto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weightBruto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
