package io.bootify.flight_api.airline;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AirlineRepository extends JpaRepository<Airline, String> {
}
