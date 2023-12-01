package com.example.demo.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://;serverName=ODY26;databaseName=BDSKy;trustServerCertificate=true", "sa", "1234");
        }catch(SQLException e){
            System.err.println(e);
        }catch(ClassNotFoundException cnfex){
            System.err.println(cnfex);
        }
        return null;
    }
}
