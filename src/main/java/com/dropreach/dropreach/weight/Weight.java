package com.dropreach.dropreach.weight;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.cglib.core.Local;


import java.time.LocalDateTime;




// because I marked Entity here, it creates a table of Weights
@Entity
@Table(name = "WEIGHT")
public class Weight{
        @Id
        @NotNull
        private LocalDateTime dateRecorded;

        @Positive
        @NotNull
        private Float weight;


        public LocalDateTime getDateRecorded(){
                return this.dateRecorded;
        }

        public void setDateRecorded(LocalDateTime ldt){
                this.dateRecorded = ldt;
        }

        public Float getWeight(){
                return this.weight;
        }

        public void setWeight(Float weight){
                this.weight = weight;
        }


}