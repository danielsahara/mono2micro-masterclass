package com.danielsahara.travelorder;

import jakarta.inject.Inject;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadinessCheck implements HealthCheck {

    @RestClient
    @Inject
    FlighService flighService;

    @RestClient
    @Inject
    HotelService hotelService;

    @Override
    public HealthCheckResponse call() {
        if (flighService.findById(1) != null && hotelService.findById(1) != null) {
            return HealthCheckResponse.up("estou pronto");
        }
        else {
            return HealthCheckResponse.down(" nao estou pronto");
        }
    }
}
