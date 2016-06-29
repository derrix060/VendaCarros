/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */

public class Conexao {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://10.241.24.2:3306/concessionariaMario";
    
    public static void main(String args[]){
        criarBanco();
    }
    
    public static Statement getStmt() throws ClassNotFoundException, SQLException{
        return getConnection().createStatement();
    }
    
    private static Connection getConnection() throws ClassNotFoundException, SQLException{ //metodo para pegar a conexao com o banco de dados        
        //DriverManager.getConnection(url); //teste para a conexao com o banco
        //Class.forName("org.postgresql.Driver"); //nome da classe(driver) de conexão
        Connection con;
        Class.forName(DRIVER);
        con = DriverManager.getConnection(DATABASE_URL, "java", "java"); //Pega(estabelece) a conexão
      
        return con;
    }
    
    public static void criarBanco(){
        Connection con;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection("jdbc:mysql://10.241.24.2:3306/", "java", "java");
            
            Statement stmt = con.createStatement();
            
            if(stmt.executeUpdate("DROP DATABASE IF EXISTS concessionariaMario")>0)
                System.out.println("DB Deletado com sucesso!");
            else
                System.err.println("ERRO PARA DELETAR DB!!");
            
            if (stmt.executeUpdate("CREATE DATABASE concessionariaMario")>0)
                System.out.println("DB criado com sucesso!");
            else{
                System.err.println("Erro na criacao do DB!");
                return;
            }
            
            stmt.executeUpdate("CREATE TABLE `concessionariaMario`.`veiculo` (\n" +
                "  `marca` VARCHAR(45) NULL,\n" +
                "  `modelo` VARCHAR(45) NULL,\n" +
                "  `ano` INT NULL,\n" +
                "  `cor` VARCHAR(45) NULL,\n" +
                "  `transmissao` VARCHAR(45) NULL,\n" +
                "  `motor` VARCHAR(45) NULL,\n" +
                "  `placa` VARCHAR(8) NOT NULL,\n" +
                "  `renavam` INT NULL,\n" +
                "  `chassi` VARCHAR(45) NULL,\n" +
                "  `valorCompra` FLOAT NULL,\n" +
                "  `odometro` INT NULL,\n" +
                "  `disponivel` BIT(1) NULL,\n" +
                "  `categoria` VARCHAR(45) NULL,\n" +
                "  `arCondicionado` BIT(1) NULL,\n" +
                "  `abs` BIT(1) NULL,\n" +
                "  `tetoSolar` BIT(1) NULL,\n" +
                "  `kitEletrico` BIT(1) NULL,\n" +
                "  `bancoCouro` BIT(1) NULL,\n" +
                "  `direcaoHidraulica` BIT(1) NULL,\n" +
                "  `farolMilha` BIT(1) NULL,\n" +
                "  `centralMultimidia` BIT(1) NULL,\n" +
                "  `pilotoAutomatico` BIT(1) NULL,\n" +
                "  `luzDiurna` BIT(1) NULL,\n" +
                "  `comandoVolante` BIT(1) NULL,\n" +
                "  `airBag` BIT(1) NULL,\n" +
                "  `nomeImagem` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`placa`))" +
                "ENGINE = InnoDB;");
            
            stmt.executeUpdate("CREATE TABLE `concessionariaMario`.`cliente` (\n" +
                "  `cpf` VARCHAR(11) NOT NULL,\n" +
                "  `nomeCompleto` VARCHAR(45) NULL,\n" +
                "  `idade` INT(2) NULL,\n" +
                "  `DDD` INT(2) NULL,\n" +
                "  `telefone` INT(9) NULL,\n" +
                "  PRIMARY KEY (`cpf`))\n" +
                "ENGINE = InnoDB;");
            
            stmt.executeUpdate("CREATE TABLE `concessionariaMario`.`proposta` (\n" +
                "  `cpf` VARCHAR(11) NOT NULL,\n" +
                "  `placa` VARCHAR(8) NOT NULL,\n" +
                "  `data` VARCHAR(10) NOT NULL,\n" +
                "  `valor` FLOAT NULL,\n" +
                "  `realizada` BIT(1) NULL,\n" +
                "  PRIMARY KEY (`cpf`, `placa`, `data`),\n" +
                "  INDEX `fkVeiculo_idx` (`placa` ASC),\n" +
                "  CONSTRAINT `fkCliente`\n" +
                "    FOREIGN KEY (`cpf`)\n" +
                "    REFERENCES `concessionariaMario`.`cliente` (`cpf`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `fkVeiculo`\n" +
                "    FOREIGN KEY (`placa`)\n" +
                "    REFERENCES `concessionariaMario`.`veiculo` (`placa`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB;");
            
        } catch (ClassNotFoundException|SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
