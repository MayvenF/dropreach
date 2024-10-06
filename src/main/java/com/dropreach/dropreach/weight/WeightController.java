package com.dropreach.dropreach.weight;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Optional;


@RestController
@RequestMapping("/api/weight")
public class WeightController {

    public final WeightRepository weightRepository;

    @Autowired
    public WeightController(WeightRepository weightRepository){
        this.weightRepository = weightRepository;
    }

    @GetMapping("/all")
    List<Weight> findAll(){
        return weightRepository.findAll();
    }


    @GetMapping("/{id}")
    Weight findById(@PathVariable LocalDateTime id){
        // Optional means it may or may not be empty
        Optional<Weight> weight = weightRepository.findById(id);
        if(weight.isEmpty()) {
            throw new WeightNotFoundException();
        }
        return weight.get();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED) // returns a 201, which means that the thing was created
    void create(@Valid @RequestBody Weight weight){
        weightRepository.save(weight);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@Valid @RequestBody Weight weight, @PathVariable LocalDateTime id){
        weightRepository.save(weight);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable LocalDateTime id){
        weightRepository.delete(weightRepository.findById(id).get());
    }

}
