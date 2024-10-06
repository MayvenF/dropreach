package com.dropreach.dropreach.weight;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WeightNotFoundException extends RuntimeException{
    public WeightNotFoundException() {
        super("Weight Not Found");
    }
}
