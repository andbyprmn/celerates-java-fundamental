package com.celerates.conn;

import com.celerates.models.Employees;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;

public class MyConn {
    
    private Connection myConn;
    private Statement myState = null;
    private ResultSet myRs = null;
    
    public MyConn() throws Exception{
        
        //get db properties
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dbUrl = props.getProperty("dburl");
        
        //connect to database
        try {
            
            myConn = DriverManager.getConnection(dbUrl, user, password);
            JOptionPane.showMessageDialog(null, "Success!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection fail!");
            e.printStackTrace();
        }
    }
    
    public List<Employees> getAllEmployees() throws Exception{
        List<Employees> listEmployee = new ArrayList<>();
        
        try {
            //example select the one of field
            myState = myConn.createStatement();
            String sql = "select * from tbl_employees";
            myRs = myState.executeQuery(sql);

            // showing the query
            while(myRs.next()){
                Employees tempEmployee = convertRowToEmployee(myRs);
                listEmployee.add(tempEmployee);
                
                //by example: printout field name
                System.out.println(tempEmployee.getTe_employee_name());
            }
            
            return listEmployee;
        } finally {
            close(myState, myRs);
        }
    }

    private Employees convertRowToEmployee(ResultSet myRs) throws Exception{
        //String id = myRs.getString("te_employee_id");
        String name = myRs.getString("te_employee_name");
        //String gender = myRs.getString("te_gender");
        //String email = myRs.getString("te_email");
        //int salary = myRs.getInt("te_salary");
        
        Employees employee = new Employees("", name, "", "", 0);
        
        return employee;
    }

    private static void close(Connection myConn, Statement myState, ResultSet myRs) throws SQLException {
        
        if (myRs != null) {
                myRs.close();
        }

        if (myState != null) {

        }

        if (myConn != null) {
            myConn.close();
        }
    }
    
    private void close(Statement myState, ResultSet myRs) throws SQLException {
            close(null, myState, myRs);		
    }
    
}
