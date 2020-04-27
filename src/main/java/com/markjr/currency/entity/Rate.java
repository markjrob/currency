package com.markjr.currency.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {

    @JsonProperty("USD")
    private double usd;

    @JsonProperty("GBP")
    private double gbp;

    @JsonProperty("THB")
    private double thb;

    @JsonProperty("JPY")
    private double jpy;

    @JsonProperty("HKD")
    private double hkd;

    @JsonProperty("MYR")
    private double myr;

    @JsonProperty("SGD")
    private double sgd;

    @JsonProperty("BND")
    private double bnd;

    @JsonProperty("PHP")
    private double php;

    @JsonProperty("IDR")
    private double idr;

    @JsonProperty("INR")
    private double inr;

    @JsonProperty("CHF")
    private double chf;

    @JsonProperty("AUD")
    private double aud;

    @JsonProperty("NZD")
    private double nzd;

    @JsonProperty("CAD")
    private double cad;

    @JsonProperty("SEK")
    private double sek;

    @JsonProperty("DKK")
    private double dkk;

    @JsonProperty("NOK")
    private double nok;

    @JsonProperty("CNY")
    private double cny;

    @Override
    public String toString() {
        return "Rate{" +
                "usd=" + usd +
                ", gbp=" + gbp +
                ", thb=" + thb +
                ", jpy=" + jpy +
                ", hkd=" + hkd +
                ", myr=" + myr +
                ", sgd=" + sgd +
                ", bnd=" + bnd +
                ", php=" + php +
                ", idr=" + idr +
                ", inr=" + inr +
                ", chf=" + chf +
                ", aud=" + aud +
                ", nzd=" + nzd +
                ", cad=" + cad +
                ", sek=" + sek +
                ", dkk=" + dkk +
                ", nok=" + nok +
                ", cny=" + cny +
                '}';
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    public double getThb() {
        return thb;
    }

    public void setThb(double thb) {
        this.thb = thb;
    }

    public double getJpy() {
        return jpy;
    }

    public void setJpy(double jpy) {
        this.jpy = jpy;
    }

    public double getHkd() {
        return hkd;
    }

    public void setHkd(double hkd) {
        this.hkd = hkd;
    }

    public double getMyr() {
        return myr;
    }

    public void setMyr(double myr) {
        this.myr = myr;
    }

    public double getSgd() {
        return sgd;
    }

    public void setSgd(double sgd) {
        this.sgd = sgd;
    }

    public double getBnd() {
        return bnd;
    }

    public void setBnd(double bnd) {
        this.bnd = bnd;
    }

    public double getPhp() {
        return php;
    }

    public void setPhp(double php) {
        this.php = php;
    }

    public double getIdr() {
        return idr;
    }

    public void setIdr(double idr) {
        this.idr = idr;
    }

    public double getInr() {
        return inr;
    }

    public void setInr(double inr) {
        this.inr = inr;
    }

    public double getChf() {
        return chf;
    }

    public void setChf(double chf) {
        this.chf = chf;
    }

    public double getAud() {
        return aud;
    }

    public void setAud(double aud) {
        this.aud = aud;
    }

    public double getNzd() {
        return nzd;
    }

    public void setNzd(double nzd) {
        this.nzd = nzd;
    }

    public double getCad() {
        return cad;
    }

    public void setCad(double cad) {
        this.cad = cad;
    }

    public double getSek() {
        return sek;
    }

    public void setSek(double sek) {
        this.sek = sek;
    }

    public double getDkk() {
        return dkk;
    }

    public void setDkk(double dkk) {
        this.dkk = dkk;
    }

    public double getNok() {
        return nok;
    }

    public void setNok(double nok) {
        this.nok = nok;
    }

    public double getCny() {
        return cny;
    }

    public void setCny(double cny) {
        this.cny = cny;
    }
}
