/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 31400817
 */
public class ConnectionFactory {
    
    private static final String banco = "teste";
    private static final String user = "teste";
    private static final String pwd = "teste";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:derby://localhost/"+banco+";create=true;user="+user+";password="+pwd);
    }
    
    
}
