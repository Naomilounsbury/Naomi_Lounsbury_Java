package com.company;

public class Address {

    private String streetOne;
    private String streetTwo;
    private String city;
    private String state;
    private String zip;

    public Address(String streetOne, String streetTwo, String city, String state, String zip) {
        this.streetOne = streetOne;
        this.streetTwo = streetTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(String streetOne, String city, String state, String zip) {
        this.streetOne = streetOne;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
    }

    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getStreetTwo() {
        return streetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        this.streetTwo = streetTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetOne='" + streetOne + '\'' +
                ", streetTwo='" + streetTwo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
