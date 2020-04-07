package com.uppergain.mark4.io;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Price {

    private Timestamp TIME;
    private BigDecimal OPEN;
    private BigDecimal HIGH;
    private BigDecimal LOW;
    private BigDecimal CLOSE;
    private String TICKVOL;
    private String VOL;
    private String SPREAD;
    private String PAIR;

    public Price(
                 Timestamp TIME,
                 BigDecimal OPEN,
                 BigDecimal HIGH,
                 BigDecimal LOW,
                 BigDecimal CLOSE,
                 String TICKVOL,
                 String VOL,
                 String SPREAD,
                 String PAIR) {
        this.TIME = TIME;
        this.OPEN = OPEN;
        this.HIGH = HIGH;
        this.LOW = LOW;
        this.CLOSE = CLOSE;
        this.TICKVOL = TICKVOL;
        this.VOL = VOL;
        this.SPREAD = SPREAD;
        this.PAIR = PAIR;
    }

    public Timestamp getTIME() {
        return TIME;
    }

    public void setTIME(Timestamp TIME) {
        this.TIME = TIME;
    }

    public BigDecimal getOPEN() {
        return OPEN;
    }

    public void setOPEN(BigDecimal OPEN) {
        this.OPEN = OPEN;
    }

    public BigDecimal getHIGH() {
        return HIGH;
    }

    public void setHIGH(BigDecimal HIGH) {
        this.HIGH = HIGH;
    }

    public BigDecimal getLOW() {
        return LOW;
    }

    public void setLOW(BigDecimal LOW) {
        this.LOW = LOW;
    }

    public BigDecimal getCLOSE() {
        return CLOSE;
    }

    public void setCLOSE(BigDecimal CLOSE) {
        this.CLOSE = CLOSE;
    }

    public String getTICKVOL() {
        return TICKVOL;
    }

    public void setTICKVOL(String TICKVOL) {
        this.TICKVOL = TICKVOL;
    }

    public String getVOL() {
        return VOL;
    }

    public void setVOL(String VOL) {
        this.VOL = VOL;
    }

    public String getSPREAD() {
        return SPREAD;
    }

    public void setSPREAD(String SPREAD) {
        this.SPREAD = SPREAD;
    }

    public String getPAIR() {
        return PAIR;
    }

    public void setPAIR(String PAIR) {
        this.PAIR = PAIR;
    }

    @Override
    public String toString() {
        return "Pirce{" +
                ", TIME ='" + TIME + '\'' +
                ", OPEN =" + OPEN +
                ", HIGH =" + HIGH +
                ", LOW =" + LOW +
                ", CLOSE =" + CLOSE +
                ", TICKVOL ='" + TICKVOL + '\'' +
                ", VOL ='" + VOL + '\'' +
                ", SPREAD ='" + SPREAD + '\'' +
                ", PAIR ='" + PAIR + '\'' +
                '}';
    }
}
