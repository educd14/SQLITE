/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitejdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ecollazodominguez
 */
public class Métodos {
    
    /**
     * Conectar a DB, haciendo clase interna
     */
    public static void connect() {
        
        Connection conn = null;
        try {
            // parámetro DB
            String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/ecollazodominguez/NetBeansProjects/SQLiteJDBC/db/chinook.db";
            // Creando conexión a la DB
            conn = DriverManager.getConnection(url);
            
            System.out.println("La conexión a SQLite ha sido establecida");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    

    
}
