package io.bootify.flight_api.airport;

import io.bootify.flight_api.flight.Flight;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.OffsetDateTime;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Airport {

    @Id
    @Column(nullable = false, updatable = false, length = 10)
    private String airportId;

    @Column(nullable = false, length = 3)
    private String iataCode;

    @Column(nullable = false, length = 4)
    private String icaoCode;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String country;

    @Column(nullable = false, length = 50)
    private String timezone;

    @OneToMany(mappedBy = "departureAirport")
    private Set<Flight> departureAirportFlights;

    @OneToMany(mappedBy = "arrivalAirport")
    private Set<Flight> arrivalAirportFlights;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
