package com.clinic.model;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String email;
    private String specialization;

    @ElementCollection
    private List<LocalTime> availableTimes;

    // Getters and Setters
    public Long getDoctorId() { return doctorId; }
    public void setDoctorId(Long doctorId) { this.doctorId = doctorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public List<LocalTime> getAvailableTimes() { return availableTimes; }
    public void setAvailableTimes(List<LocalTime> availableTimes) { this.availableTimes = availableTimes; }
}
