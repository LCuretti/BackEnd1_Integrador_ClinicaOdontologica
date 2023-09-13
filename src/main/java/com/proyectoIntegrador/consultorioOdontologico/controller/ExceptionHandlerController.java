package com.proyectoIntegrador.consultorioOdontologico.controller;

import com.proyectoIntegrador.consultorioOdontologico.dto.ErrorDTO;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    private static final Logger logger = Logger.getLogger(ExceptionHandlerController.class);
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDTO> recursoNoEncontradoHandler(ResourceNotFoundException exception) {
        String mensaje = "Recurso no encontrado. " + exception.getResource() + ":  " + exception.getResourceId();

        logger.error("Se atajo una excepcion. " + mensaje);

        ErrorDTO response = new ErrorDTO(HttpStatus.NOT_FOUND.toString(), mensaje);

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
