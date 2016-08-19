/**
 * Copyright (C) 2016 Mirakl. www.mirakl.com - info@mirakl.com
 * All Rights Reserved. Tous droits réservés.
 */
package bz.poc.rugby.controller.dto;

import bz.poc.rugby.model.Match;

public class MatchDto {

    private int localeScore;
    private String localeTeam;
    private String vistorScore;
    private String visitorTeam;


    public static Match to(MatchDto dto) {
        return null;
    }

    public static MatchDto from(Match m) {
        return null;
    }
}
