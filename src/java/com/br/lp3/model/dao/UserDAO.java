/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.dao;

import com.br.lp3.model.dao.connection.ConnectionFactory;
import com.br.lp3.model.javabeans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31400817
 */
public class UserDAO implements GenericDAO<User> {

    private PreparedStatement pstm;
    private Connection con;

    public UserDAO() {
        try {
            con = ConnectionFactory.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    @Override
    public boolean insert(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> read() {
        
        String query = "SELECT * FROM usuario";
        
        List<User> users = new ArrayList<>();
        
        try{
        pstm = con.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            users.add(new User(rs.getInt("id_user"), rs.getString("username"), rs.getString("password")));
        }
        rs.close();
        pstm.close();
        
        } catch (SQLException ex){
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    
        return users;
    }

    @Override
    public boolean update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

