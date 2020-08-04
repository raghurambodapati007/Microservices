package com.ram.microservice.microserviceappws.Exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ram.microservice.microserviceappws.ui.model.response.ErrorMessageResponse;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler{

	
	/* This method will be called only once if we have UserServiceException */
	@ExceptionHandler(value= {UserServiceException.class})
	public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request){
		
		String errorMesssageDescription = ex.getLocalizedMessage();
		if(errorMesssageDescription == null) errorMesssageDescription = ex.toString();
		ErrorMessageResponse errorMessage =new ErrorMessageResponse(new Date(),errorMesssageDescription);
		
		return new ResponseEntity<>(errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/* This method will be called only once if we have NullPointerException */
	@ExceptionHandler(value= {NullPointerException.class})
	public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request){
		
		String errorMesssageDescription = ex.getLocalizedMessage();
		if(errorMesssageDescription == null) errorMesssageDescription = ex.toString();
		ErrorMessageResponse errorMessage =new ErrorMessageResponse(new Date(),errorMesssageDescription);
		
		return new ResponseEntity<>(errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
		
		String errorMesssageDescription = ex.getLocalizedMessage();
		if(errorMesssageDescription == null) errorMesssageDescription = ex.toString();
		ErrorMessageResponse errorMessage =new ErrorMessageResponse(new Date(),errorMesssageDescription);
		
		return new ResponseEntity<>(errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
