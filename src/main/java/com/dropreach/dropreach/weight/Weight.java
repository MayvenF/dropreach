package com.dropreach.dropreach.weight;

import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDateTime;


public record Weight(
        @NotEmpty
        Float weight,
        @NotEmpty
        @Id
        LocalDateTime dateRecorded
){}