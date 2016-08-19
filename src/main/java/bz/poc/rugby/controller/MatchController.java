package bz.poc.rugby.controller;

import bz.poc.rugby.model.Match;
import bz.poc.rugby.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MatchController {

    @Autowired private MatchService matchService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    // TODO
    public Match getMatch() {
        return null;
    }
    @RequestMapping(name = "match/{year}")
    public List<Match> getAllMatchForYear(@RequestParam("year") String year) {
        return null;
    }

    @RequestMapping(name = "match/{id}/{year}")
    public List<Match> getAllMatchForTeamDuringYear(@RequestParam("id") long id, @RequestParam("year") String year) {
        return null;
    }
}
