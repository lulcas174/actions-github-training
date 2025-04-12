package io.bootify.flight_api.passenger;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PassengerRepository extends JpaRepository<Passenger, String> {
}
