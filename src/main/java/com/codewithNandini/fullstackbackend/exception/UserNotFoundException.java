package com.codewithNandini.fullstackbackend.exception;
/* Created by Nandini Jain */

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
