package com.anaplan.client.ex;

/**
 * Created by jbackes
 * Date: 4/1/21
 * Time: 5:34 PM
 */
public class ParseCSVError extends RuntimeException {
    public ParseCSVError(String CSVSourceName) {
        super("Could not find separator in file: " + CSVSourceName);
    }
}
