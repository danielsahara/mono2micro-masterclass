package com.danielsahara.travelorder;

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

    public static TraverOrderDTO of(TravelOrder order, Flight flight, Hotel hotel) {
        if(flight == null){
            flight = new Flight();
        }
        if (hotel == null){
            hotel = new Hotel();
        }
        return new TraverOrderDTO(flight.getFromAirport(), flight.getToAirport(), hotel.getNights());
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
