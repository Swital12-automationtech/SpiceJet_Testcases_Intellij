package org.example;

import org.testng.annotations.Test;

public class Search_Flight_OneWay extends Launch_Quit{
    @Test
    public void search_flight() {
        SearchPage sp = new SearchPage(driver);
        sp.searchFlightDetails();

    }
}
