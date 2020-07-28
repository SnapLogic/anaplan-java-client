package com.anaplan.client.jdbc;


public class JDBCConfig {

    private String jdbcConnectionUrl;
    private String jdbcUsername;
    private String jdbcPassword;
    private Integer jdbcFetchSize;
    private boolean isStoredProcedure;
    private String jdbcQuery;
    private Object[] jdbcParams;

    public String getJdbcConnectionUrl() {
        return jdbcConnectionUrl;
    }

    public void setJdbcConnectionUrl(String jdbcConnectionUrl) {
        this.jdbcConnectionUrl = jdbcConnectionUrl;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public Integer getJdbcFetchSize() {
        return jdbcFetchSize;
    }

    public void setJdbcFetchSize(Integer jdbcFetchSize) {
        this.jdbcFetchSize = jdbcFetchSize;
    }

    public boolean isStoredProcedure() {
        return isStoredProcedure;
    }

    public void setStoredProcedure(boolean storedProcedure) {
        isStoredProcedure = storedProcedure;
    }

    public String getJdbcQuery() {
        return jdbcQuery;
    }

    public void setJdbcQuery(String jdbcQuery) {
        this.jdbcQuery = jdbcQuery;
    }

    public Object[] getJdbcParams() {
        return jdbcParams;
    }

    public void setJdbcParams(Object[] jdbcParams) {
        this.jdbcParams = jdbcParams;
    }
}
