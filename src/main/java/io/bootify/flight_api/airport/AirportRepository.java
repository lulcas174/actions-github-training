package io.bootify.flight_api.airport;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, String> {
}
