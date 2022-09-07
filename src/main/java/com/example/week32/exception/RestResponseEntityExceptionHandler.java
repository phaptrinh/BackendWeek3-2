package com.example.week32.exception;

import com.example.week32.dto.response.BaseResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        List<String> collect = ex.getBindingResult().getFieldErrors().stream()
                .map(e -> String.format("'%s': '%s'", e.getField(), e.getDefaultMessage()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(BaseResponse.error(String.format("Argument not valid: %s", collect)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse> handleAllException(Exception ex, WebRequest request) {
        return new ResponseEntity<>(BaseResponse.error(ex.getLocalizedMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }









}
