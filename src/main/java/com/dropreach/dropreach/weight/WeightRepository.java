package com.dropreach.dropreach.weight;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

public interface WeightRepository extends CrudRepository<Weight, LocalDateTime> {
}
