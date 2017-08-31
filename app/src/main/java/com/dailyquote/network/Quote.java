package com.dailyquote.network;

/**
 * Created by stoyan-ivanov on 30.08.17.
 */

public class Quote {
    private String quoteMsg;

    public Quote() {
    }

    public Quote(String quoteMsg) {
        this.quoteMsg = quoteMsg;
    }

    public String getQuoteMsg() {
        return quoteMsg;
    }
}
