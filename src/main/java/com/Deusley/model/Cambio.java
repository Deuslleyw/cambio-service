package com.Deusley.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio implements Serializable {
    private static final long serialVersionUID = 1l;

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private BigDecimal convertedValue;
    private String environment;



    public Cambio(){}

    public Cambio(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal convertedValue, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.environment = environment;
    }

    public Cambio(long id, String from, String to, BigDecimal one, BigDecimal one1) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return getId().equals(cambio.getId()) && getFrom().equals(cambio.getFrom()) && getTo().equals(cambio.getTo())
                && getConversionFactor().equals(cambio.getConversionFactor())
                && getConvertedValue().equals(cambio.getConvertedValue())
                && getEnvironment().equals(cambio.getEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFrom(), getTo(), getConversionFactor(), getConvertedValue(), getEnvironment());
    }
}
