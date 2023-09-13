package com.proyectoIntegrador.consultorioOdontologico.util;

public class ResourceNotFoundException extends RuntimeException{
    private String resourceId;
    private String resource;

    public String getResourceId() {
        return resourceId;
    }

    public String getResource() {
        return resource;
    }

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceId, String resource) {
        this.resourceId = resourceId;
        this.resource = resource;
    }
}
