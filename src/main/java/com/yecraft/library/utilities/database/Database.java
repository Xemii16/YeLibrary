package com.yecraft.library.utilities.database;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class Database {

    private final HikariDataSource dataSource;

    public Database() {
        this.dataSource = new HikariDataSource();
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public void init(String jdbc, String username, String password){
        this.dataSource.setJdbcUrl(jdbc);
        this.dataSource.setUsername(username);
        this.dataSource.setPassword(password);
    }
    public abstract void create() throws SQLException;

    public void close(){
        this.dataSource.close();
    }

    public abstract void drop() throws SQLException;

}
