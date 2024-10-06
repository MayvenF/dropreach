package com.dropreach.dropreach.weight;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.dropreach.dropreach.weight.Weight;
import java.time.LocalDateTime;


@Repository
public interface WeightRepository extends ListCrudRepository<Weight, LocalDateTime> {

}
