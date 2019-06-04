package com.stackroute.exception;

import com.stackroute.exception.TrackAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionDemo extends RuntimeException{
    @ExceptionHandler(value= TrackAlreadyExistsException.class)
    public ResponseEntity<String> exception(TrackAlreadyExistsException exception)
    {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }
    @ExceptionHandler(value= TrackNotFoundException.class)
    public ResponseEntity<String> exception1(TrackNotFoundException exception1)
    {
        return new ResponseEntity<String>(exception1.getMessage(), HttpStatus.CONFLICT);
    }
}
