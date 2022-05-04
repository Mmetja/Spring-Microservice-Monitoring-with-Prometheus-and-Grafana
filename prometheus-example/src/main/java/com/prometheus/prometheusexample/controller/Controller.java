package com.prometheus.prometheusexample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/monitoring/")
public class Controller {

    @GetMapping("test")
    public ResponseEntity<String> getProvinces() {
       return ResponseEntity.ok("Successfully hit test endpoint");
    }

}
