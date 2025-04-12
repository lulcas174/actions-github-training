package io.bootify.flight_api.saga_log;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SagaLogRepository extends JpaRepository<SagaLog, String> {
}
