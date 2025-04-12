package io.bootify.flight_api.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AircraftRepository extends JpaRepository<Aircraft, String> {
}
