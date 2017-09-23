package com.dailyquote.network;

/**
 * Created by stoyan-ivanov on 30.08.17.
 */

public class Quote {
    private String quoteMsg;
    private String quoteDate;

    public Quote() {
    }

    public Quote(String quoteDate, String quoteMsg) {
        this.quoteMsg = quoteMsg;
        this.quoteDate = quoteDate;
    }

    public String getQuoteMsg() {
        return quoteMsg;
    }

    public String getQuoteDate() {
        return quoteDate;
    }
}
