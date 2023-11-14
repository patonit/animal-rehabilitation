package pl.paton.rafal.java.app.ar.model;

public class Address {

    private String street;
    private String flatNumber;
    private String city;
    private String postCode;
    private String country;

    public Address(String street, String flatNumber, String city, String postCode, String country) {
        this.street = street;
        this.flatNumber = flatNumber;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public boolean addressValidation(Address address) {

        String pattern = "\\d{2}-\\d{3}";

        if (address != null && address.getPostCode().matches(pattern)) {
            System.out.println("Address is valid!");
            return true;
        }
        System.out.println("Address is invalid! Please enter valid address!");
        return false;
    }

}
