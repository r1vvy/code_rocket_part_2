package com.coderocket.sportscomp.database;

import lombok.Value;

import java.time.LocalDate;

@Value
public class CompetitionEntity {
    Integer id;
    String title;
    Integer capacity;
    LocalDate registrationOpen;
    LocalDate registrationClose;
    LocalDate startDate;
    LocalDate endDate;
}
