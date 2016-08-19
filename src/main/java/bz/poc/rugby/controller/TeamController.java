package bz.poc.rugby.controller;

import bz.poc.rugby.model.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeamController {

    //TODO
    @RequestMapping(name = "team/{id}")
    public Team get(@RequestParam("id") long id) {
        return null;
    }

    @RequestMapping(name = "team/{year}")
    public List<Team> getAll(@RequestParam("year") String year){
        return null;
    }
}
