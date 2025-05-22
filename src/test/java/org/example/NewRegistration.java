package org.example;

import org.testng.annotations.Test;

public class NewRegistration extends Launch_Quit {
    @Test
    public void newsign() throws InterruptedException {
        RegistrationPage register = new RegistrationPage(driver);
        register.registrationnew();
        register.details();
    }
}
