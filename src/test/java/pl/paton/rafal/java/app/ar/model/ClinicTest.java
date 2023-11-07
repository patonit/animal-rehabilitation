package pl.paton.rafal.java.app.ar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClinicTest {

    @Test
    void registerClient() {
        Clinic clinic = new Clinic(null, null);
        Client client = new Client(null, null, null, null, null, null);
        boolean registered = clinic.registerClient(client);
        Assertions.assertTrue(registered, "Client not registered in clinic");
    }

    @Test
    void notCreateClient() {
        // given - tworzymy obiekt klasy testowanej oraz parametry metody testowanej
        Clinic clinic = new Clinic(null, null);

        // when - wywołanie metody testowanej oraz przypisanie wartości zwracanej z metody
        boolean registered = clinic.registerClient(null);

        // then - weryfikacja poprawności zwracanej wartości metody testowanej
        Assertions.assertFalse(registered, "Client registered in clinic");

    }

    @Test
    void register() {
        // given

        // when

        // then

    }
}