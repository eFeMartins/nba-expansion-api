package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.domain.Conference;
import com.example.demo.domain.Division;
import com.example.demo.domain.Match;
import com.example.demo.domain.MatchStatus;
import com.example.demo.domain.Team;
import com.example.demo.repositories.ConferenceRepository;
import com.example.demo.repositories.DivisionRepository;
import com.example.demo.repositories.MatchRepository;
import com.example.demo.repositories.TeamRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ConferenceRepository conferenceRepository;

	@Autowired
	private DivisionRepository divisionRepository;

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private MatchRepository matchRepository;

	@Override
	public void run(String... args) throws Exception {
		Conference con1 = new Conference("Middle-Coast", null);
		Conference con2 = new Conference("Upper-Coast", null);

		conferenceRepository.saveAll(Arrays.asList(con1, con2));

		Division div1 = new Division("Central Division", con1, null);
		Division div2 = new Division("Northern Division", con2, null);

		divisionRepository.saveAll(Arrays.asList(div1, div2));

		Team team1 = new Team("SuperSonics", "Seattle", 0, 0, div1);
		Team team2 = new Team("Royals", "Las Vegas", 0, 0, div2);

		teamRepository.saveAll(Arrays.asList(team1, team2));

		Match match1 = new Match(team1, team2, 0, 0, MatchStatus.SCHEDULED);

		Match match2 = new Match(team2, team1, 0, 0, MatchStatus.SCHEDULED);
		match2.finishMatch(105, 98);

		matchRepository.saveAll(Arrays.asList(match1, match2));
	}
}
