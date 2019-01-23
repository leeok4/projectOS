/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aclimacao.dal;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Leeok4
 */
public class ModuloConexao {

    //metodo de conexao com banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // call driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        // Informações DB
        String url = "jdbc:mysql://softpharma@localhost:3306/dbaclimacao";
        String user = "softpharma";
        String password = "NwSoftPs1843";

        //Estabelecendo conexao com DB
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
           // System.out.println("conexao com sucesso");
            return conexao;
            

        } catch (Exception e) {
           // System.out.println(e);
            return null;
        }
    }
}
