package io.bootify.flight_api.seat;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepository extends JpaRepository<Seat, String> {
}
