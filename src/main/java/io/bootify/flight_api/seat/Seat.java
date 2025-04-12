package io.bootify.flight_api.seat;

import io.bootify.flight_api.booking.Booking;
import io.bootify.flight_api.flight.Flight;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
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
public class Seat {

    @Id
    @Column(nullable = false, updatable = false, length = 10)
    private String seatId;

    @Column(nullable = false, length = 5)
    private String seatNumber;

    @Column(length = 20)
    private String classs;

    @Column
    private Boolean isAvailable;

    @Column(precision = 7, scale = 2)
    private BigDecimal priceModifier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @OneToMany(mappedBy = "seat")
    private Set<Booking> seatBookings;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
