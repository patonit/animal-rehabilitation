package pl.paton.rafal.java.app.ar.model;

import java.util.ArrayList;
import java.util.List;

public class Clinic {

//    private String street;
//    private String flatNumber;
//    private String city;
//    private String postCode;
//    private String country;

    private String name;
    private Address address;
    private List<Client> clients = new ArrayList<>();
    // doctors
    // appointments
    // patients
    // clients

    public boolean registerClient(Client client) {
        if (client != null) {
            return true;
        }
        return false;
    }

    // register/remove/modify a new patient (parameters: name, gender, year of birth)
    // register/remove/modify a new client (parameters: name, surname, gender, address, phone number, email address)
    // register/remove/modify a new doctor (parameters: name, surname, gender) [+]

    // make an appointment (parameters: Client, Patient, Date, Treatment)
    // refer for treatment/zleć zabieg (parameters: Doctor, Client, Patient, Treatment

    //  add/remove/modify address (check if address is already in a database)
    //  check if address is valid (lepiej zrobić w klasie address)  [+]

    // make surgery - doktorek  [+]



    public Clinic(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}


// TODO: 31 paź 2023
// zaprezentować przykład ConcurrentModificationException oraz sposób radzenia sobie z tym wyjątkiem przy manipulacji na kolekcjach
// zaprezentować działanie takich kolekcji jak: List, Set, Queue
// dodać metody [+] do klas oraz po dwie metody testujące dla każdej metody biznesowej