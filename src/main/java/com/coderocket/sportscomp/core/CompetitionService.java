package com.coderocket.sportscomp.core;

import com.coderocket.sportscomp.database.CompetitionRepository;
import com.coderocket.sportscomp.domain.Competition;
import com.coderocket.sportscomp.exceptions.NotImplementedException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CompetitionService {
    private final CompetitionRepository competitionRepository;

    // TODO
    public List<Competition> getAllCompetitions() {
        throw new NotImplementedException("Not implemented yet");
    }
}
