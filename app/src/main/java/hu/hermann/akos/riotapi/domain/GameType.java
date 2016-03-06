package hu.hermann.akos.riotapi.domain;

import java.io.Serializable;

/**
 * Created by hofee on 2016. 03. 03..
 */
public enum GameType implements Serializable {

    CUSTOM_GAME("CUSTOM_GAME"), MATCHED_GAME("MATCHED_GAME"), TUTORIAL_GAME("TUTORIAL_GAME");

    private String name;

    GameType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
