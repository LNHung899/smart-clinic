package com.clinic.controller;

import com.clinic.model.Doctor;
import com.clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/availability")
    public ResponseEntity<List<String>> getDoctorAvailability(@RequestParam Long doctorId) {
        List<String> times = doctorService.getAvailableTimes(doctorId);
        return ResponseEntity.ok(times);
    }
}
