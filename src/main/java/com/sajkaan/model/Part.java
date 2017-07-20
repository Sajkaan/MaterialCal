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

    private int quantity;

    private double weightNetoTotal;

    private int height;

    private int length;

    private int thickness;

    private double weightBruto;

    private double weightBrutoTotal;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeightNetoTotal() {
        return weightNetoTotal;
    }

    public void setWeightNetoTotal(double weightNetoTotal) {
        this.weightNetoTotal = weightNetoTotal;
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

    public double getWeightBrutoTotal() {
        return weightBrutoTotal;
    }

    public void setWeightBrutoTotal(double weightBrutoTotal) {
        this.weightBrutoTotal = weightBrutoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        if (Double.compare(part.weightNeto, weightNeto) != 0) return false;
        if (quantity != part.quantity) return false;
        if (Double.compare(part.weightNetoTotal, weightNetoTotal) != 0) return false;
        if (height != part.height) return false;
        if (length != part.length) return false;
        if (thickness != part.thickness) return false;
        if (Double.compare(part.weightBruto, weightBruto) != 0) return false;
        if (Double.compare(part.weightBrutoTotal, weightBrutoTotal) != 0) return false;
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
        result = 31 * result + quantity;
        temp = Double.doubleToLongBits(weightNetoTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + height;
        result = 31 * result + length;
        result = 31 * result + thickness;
        temp = Double.doubleToLongBits(weightBruto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weightBrutoTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
