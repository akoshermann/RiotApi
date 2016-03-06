package hu.hermann.akos.riotapi.domain;

/**
 * Created by hofee on 2016. 03. 03..
 */
public enum GameMode {

    CLASSIC("CLASSIC"), ODIN("ODIN"), ARAM("ARAM"), TUTORIAL("TUTORIAL"), ONEFORALL("ONEFORALL"), ASCENSION("ASCENSION"), FIRSTBLOOD("FIRSTBLOOD"), KINGPORO("KINGPORO");

    private String name;

    GameMode(String gameMode) {
        this.name = gameMode;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
