package hu.hermann.akos.riotapi.domain.matchhistory.stats;

import java.io.Serializable;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class CsDiffPerMinDeltas implements Serializable {
    private double zeroToTen;
    private double tenToTwenty;
    private double twentyToThirty;

    public double getZeroToTen() {
        return zeroToTen;
    }

    public void setZeroToTen(double zeroToTen) {
        this.zeroToTen = zeroToTen;
    }

    public double getTenToTwenty() {
        return tenToTwenty;
    }

    public void setTenToTwenty(double tenToTwenty) {
        this.tenToTwenty = tenToTwenty;
    }

    public double getTwentyToThirty() {
        return twentyToThirty;
    }

    public void setTwentyToThirty(double twentyToThirty) {
        this.twentyToThirty = twentyToThirty;
    }
}