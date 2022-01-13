package com.cp.compiler.controllers;

import com.cp.compiler.models.Response;
import com.cp.compiler.services.ContainerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/docker")
public class ContainersInfoController {
    private ContainerService containerService;
    private static final String ERROR_SERVICE_MESSAGE = "Information Unavailable";

    public ContainersInfoController(ContainerService containerService) {
        this.containerService = containerService;
    }

    @GetMapping("/containers")
    @ApiOperation(value = "Containers Info", notes = "Display list of running containers", response = Response.class)
    public ResponseEntity<String> getRunningContainers() {
        try {
            return ResponseEntity.ok().body(containerService.getRunningContainers());
        } catch (IOException e) {
            return ResponseEntity.status(500).body(ERROR_SERVICE_MESSAGE);
        }
    }

    @GetMapping("/images")
    @ApiOperation(value = "Images Info", notes = "Display list of images", response = Response.class)
    public ResponseEntity<String> getImages() {
        try {
            return ResponseEntity.ok().body(containerService.getImages());
        } catch (IOException e) {
            return ResponseEntity.status(500).body(ERROR_SERVICE_MESSAGE);
        }
    }

    @GetMapping("/stats")
    @ApiOperation(value = "Docker Stats Memory and CPU Usage", notes = "Display Stats about running containers (Memory and CPU usage)", response = Response.class)
    public ResponseEntity<String> getRunningContainersStats() {
        try {
            return ResponseEntity.ok().body(containerService.getContainersStats());
        } catch (IOException e) {
            return ResponseEntity.status(500).body(ERROR_SERVICE_MESSAGE);
        }
    }

    @GetMapping("stats/all")
    @ApiOperation(value = "Docker Stats Memory and CPU Usage for all containers", notes = "Display Stats about all containers (Memory and CPU usage)", response = Response.class)
    public ResponseEntity<String> getAllContainersStats() {
        try {
            return ResponseEntity.ok().body(containerService.getAllContainersStats());
        } catch (IOException e) {
            return ResponseEntity.status(500).body(ERROR_SERVICE_MESSAGE);
        }
    }
}
