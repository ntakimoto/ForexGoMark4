package com.uppergain.mark4.mvvm.level;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "history_table")
public class History {
    //TODO:スワップ金利の項目を追加する

    @PrimaryKey(autoGenerate = true)
    private long ID;
    private String TICKET_ID;
    private String USER_SEQ;
    private String CURRENCY_PAIR;
    private String ENTRY_TYPE;
    private String ENTRY_PRICE;
    private String ENTRY_LOTS;
    private String LOSS_OF_CUT;
    private String PROFIT_TAKING;
    private String ENTRY_DATE;
    private String EXIT_PRICE;
    private String EXIT_LOTS;
    private String EXIT_DATE;
    private String PROFIT_AND_LOSS;
    private String TOTAL_ASSETS;
    private String REMARKS;


    public History(String TICKET_ID, String USER_SEQ, String CURRENCY_PAIR, String ENTRY_TYPE, String ENTRY_PRICE, String ENTRY_LOTS, String LOSS_OF_CUT, String PROFIT_TAKING, String ENTRY_DATE, String EXIT_PRICE, String EXIT_LOTS, String EXIT_DATE, String PROFIT_AND_LOSS, String TOTAL_ASSETS, String REMARKS) {
        this.TICKET_ID = TICKET_ID;
        this.USER_SEQ = USER_SEQ;
        this.CURRENCY_PAIR = CURRENCY_PAIR;
        this.ENTRY_TYPE = ENTRY_TYPE;
        this.ENTRY_PRICE = ENTRY_PRICE;
        this.ENTRY_LOTS = ENTRY_LOTS;
        this.LOSS_OF_CUT = LOSS_OF_CUT;
        this.PROFIT_TAKING = PROFIT_TAKING;
        this.ENTRY_DATE = ENTRY_DATE;
        this.EXIT_PRICE = EXIT_PRICE;
        this.EXIT_LOTS = EXIT_LOTS;
        this.EXIT_DATE = EXIT_DATE;
        this.PROFIT_AND_LOSS = PROFIT_AND_LOSS;
        this.TOTAL_ASSETS = TOTAL_ASSETS;
        this.REMARKS = REMARKS;
    }

    @Override
    public String toString() {
        return "History{" +
                "ID =" + ID +
                ", TICKET_ID ='" + TICKET_ID + '\'' +
                ", USER_SEQ ='" + USER_SEQ + '\'' +
                ", CURRENCY_PAIR ='" + CURRENCY_PAIR + '\'' +
                ", ENTRY_TYPE ='" + ENTRY_TYPE + '\'' +
                ", ENTRY_PRICE ='" + ENTRY_PRICE + '\'' +
                ", ENTRY_LOTS ='" + ENTRY_LOTS + '\'' +
                ", LOSS_OF_CUT ='" + LOSS_OF_CUT + '\'' +
                ", PROFIT_TAKING ='" + PROFIT_TAKING + '\'' +
                ", ENTRY_DATE ='" + ENTRY_DATE + '\'' +
                ", EXIT_PRICE ='" + EXIT_PRICE + '\'' +
                ", EXIT_LOTS ='" + EXIT_LOTS + '\'' +
                ", EXIT_DATE ='" + EXIT_DATE + '\'' +
                ", PROFIT_AND_LOSS ='" + PROFIT_AND_LOSS + '\'' +
                ", TOTAL_ASSETS ='" + TOTAL_ASSETS + '\'' +
                ", REMARKS ='" + REMARKS + '\'' +
                '}';
    }

    public long getID() {
        return ID;
    }

    public String getTICKET_ID() {
        return TICKET_ID;
    }

    public String getUSER_SEQ() {
        return USER_SEQ;
    }

    public String getCURRENCY_PAIR() {
        return CURRENCY_PAIR;
    }

    public String getENTRY_TYPE() {
        return ENTRY_TYPE;
    }

    public String getENTRY_PRICE() {
        return ENTRY_PRICE;
    }

    public String getENTRY_LOTS() {
        return ENTRY_LOTS;
    }

    public String getLOSS_OF_CUT() {
        return LOSS_OF_CUT;
    }

    public String getPROFIT_TAKING() {
        return PROFIT_TAKING;
    }

    public String getENTRY_DATE() {
        return ENTRY_DATE;
    }

    public String getEXIT_PRICE() {
        return EXIT_PRICE;
    }

    public String getEXIT_LOTS() {
        return EXIT_LOTS;
    }

    public String getEXIT_DATE() {
        return EXIT_DATE;
    }

    public String getPROFIT_AND_LOSS() {
        return PROFIT_AND_LOSS;
    }

    public String getTOTAL_ASSETS() {
        return TOTAL_ASSETS;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTICKET_ID(String TICKET_ID) {
        this.TICKET_ID = TICKET_ID;
    }

    public void setUSER_SEQ(String USER_SEQ) {
        this.USER_SEQ = USER_SEQ;
    }

    public void setCURRENCY_PAIR(String CURRENCY_PAIR) {
        this.CURRENCY_PAIR = CURRENCY_PAIR;
    }

    public void setENTRY_TYPE(String ENTRY_TYPE) {
        this.ENTRY_TYPE = ENTRY_TYPE;
    }

    public void setENTRY_PRICE(String ENTRY_PRICE) {
        this.ENTRY_PRICE = ENTRY_PRICE;
    }

    public void setENTRY_LOTS(String ENTRY_LOTS) {
        this.ENTRY_LOTS = ENTRY_LOTS;
    }

    public void setLOSS_OF_CUT(String LOSS_OF_CUT) {
        this.LOSS_OF_CUT = LOSS_OF_CUT;
    }

    public void setPROFIT_TAKING(String PROFIT_TAKING) {
        this.PROFIT_TAKING = PROFIT_TAKING;
    }

    public void setENTRY_DATE(String ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public void setEXIT_PRICE(String EXIT_PRICE) {
        this.EXIT_PRICE = EXIT_PRICE;
    }

    public void setEXIT_LOTS(String EXIT_LOTS) {
        this.EXIT_LOTS = EXIT_LOTS;
    }

    public void setEXIT_DATE(String EXIT_DATE) {
        this.EXIT_DATE = EXIT_DATE;
    }

    public void setPROFIT_AND_LOSS(String PROFIT_AND_LOSS) {
        this.PROFIT_AND_LOSS = PROFIT_AND_LOSS;
    }

    public void setTOTAL_ASSETS(String TOTAL_ASSETS) {
        this.TOTAL_ASSETS = TOTAL_ASSETS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }
}
