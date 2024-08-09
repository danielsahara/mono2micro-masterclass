package com.danielsahara.travelorder;

import com.danielsahara.flight.Flight;
import com.danielsahara.hotel.Hotel;

public class TraverOrderDTO {

    private String fromAirport;
    private String toAirport;
    private Integer nights;

    public TraverOrderDTO() {
    }

    private TraverOrderDTO(String fromAirport, String toAirport, Integer nights) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.nights = nights;
    }

    public static TraverOrderDTO of(TravelOrder traverOrder, Flight flight, Hotel hotel) {
        return new TraverOrderDTO(flight.fromAirport, flight.toAirport, hotel.nights);
    }

    public static TraverOrderDTO of(String fromAirport, String toAirport, Integer nights) {
        return new TraverOrderDTO(fromAirport, toAirport, nights);
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }
}
