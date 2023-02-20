package com.coderocket.sportscomp.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
public class Competition {
    Integer id;
    String title;
    Integer maxCapacity;
    LocalDate registrationOpen;
    LocalDate registrationClose;
    LocalDate startDate;
    LocalDate endDate;
}
