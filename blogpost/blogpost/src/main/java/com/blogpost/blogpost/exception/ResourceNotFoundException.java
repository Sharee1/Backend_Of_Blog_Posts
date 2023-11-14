package com.blogpost.blogpost.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException {

    String resourceName;
    String fieldName;
    long fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
        super();
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String userNotFound) {
    }
}
