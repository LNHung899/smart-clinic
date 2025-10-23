package com.clinic.service;

import com.clinic.model.Appointment;
import java.time.LocalDate;
import java.util.List;

public class AppointmentService {

    // Lưu lịch hẹn mới
    public String bookAppointment(Appointment appointment) {
        // logic lưu vào database (giả lập)
        return "Appointment booked successfully for " + appointment.getAppointmentTime();
    }

    // Lấy danh sách lịch hẹn của bác sĩ theo ngày
    public List<Appointment> getAppointmentsForDoctor(Long doctorId, LocalDate date) {
        // logic truy xuất database (giả lập)
        return List.of();
    }
}
