package coffeshoppp.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    private final String usuario = "sa";
    private final String pass = "uma";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;";
    private Connection cn;
    private Statement st;
    
    
    public Connection getConnection() {
        return cn;
    }

    // Constructor para pasar datos a la conexion
//    public Conexion(String usuario, String pass, String url) {
//        this.usuario = "sa";
//        this.pass = "uma";
//        this.url = "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;";
//    }

    // Metodo para establece la conexion
    public void conectar() {
        try {
            cn = DriverManager.getConnection(url, usuario, pass);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Metodo para desconectar la conexion
    public void desconectar() {
        try {
            if (st != null) {
                st.close();
            }
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Statement para que clase externas tengan acceso al objeto de la clase conexion
    public Statement getStatement() {
        return st;
    }

    public PreparedStatement prepareStatement(String query) throws SQLException {
        return cn.prepareStatement(query);
    }
}