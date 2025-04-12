package io.bootify.flight_api.flight;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightRepository extends JpaRepository<Flight, String> {
}
