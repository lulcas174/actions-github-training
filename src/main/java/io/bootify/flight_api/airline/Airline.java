package io.bootify.flight_api.airline;

import io.bootify.flight_api.aircraft.Aircraft;
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
public class Airline {

    @Id
    @Column(nullable = false, updatable = false, length = 10)
    private String airlineId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 2)
    private String iataCode;

    @Column(nullable = false, length = 3)
    private String icaoCode;

    @Column
    private Boolean active;

    @OneToMany(mappedBy = "airline")
    private Set<Aircraft> airlineAircrafts;

    @OneToMany(mappedBy = "airline")
    private Set<Flight> airlineFlights;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
