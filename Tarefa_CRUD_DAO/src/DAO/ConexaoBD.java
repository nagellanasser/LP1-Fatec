/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Nagella
 */
public class ConexaoBD {

    //Método responsável pela conexão com o BD
    public static Connection Conexao() {     
        Connection conexaoBD = null; //conexaoBD = variável de conexão

        //Chamando o drive de conexão
        String driver = "com.mysql.cj.jdbc.Driver";

        //Informações do BD
        String url = "jdbc:mysql://localhost:3306/tarefa_javabd";
        String usuario = "root";
        String senha = "senha123";
        
        //Conectando com o BD
        try {
            Class.forName(driver); //Executa o driver
            conexaoBD = DriverManager.getConnection(url, usuario, senha);
            return conexaoBD;
        } catch (Exception e) {
            System.out.println("A conexão com o Banco de Dados falhou: " + e);
            return null;
        }
    }
}
