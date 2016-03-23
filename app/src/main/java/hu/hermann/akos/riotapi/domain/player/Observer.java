package hu.hermann.akos.riotapi.domain.player;

import java.io.Serializable;

/**
 * Created by hofee on 2016. 03. 03..
 */
public class Observer implements Serializable {

    private String encryptionKey;

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }
}
