package com.clinic.repository;

import com.clinic.model.Patient;
import java.util.Optional;

public interface PatientRepository {

    Optional<Patient> findByEmail(String email);

    Optional<Patient> findByEmailOrPhone(String email, String phone);
}
