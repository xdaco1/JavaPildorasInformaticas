package dbConnection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestDB {

    public static void main(String[] argv) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String connString = "jdbc:oracle:thin:@";
    	System.out.println("Introduce hostname or ip");
    	String hostName = scan.next();
    	
    	System.out.println("Introduce the port");
    	String dbPort = scan.next();
    	
    	System.out.println("Introduce the service name");
    	String serviceName = scan.next();
    	
    	System.out.println("DB Usernme:");
    	String dbUser = scan.next();
    	
    	System.out.println("DB Password");
    	String dbPass = scan.next();
    	
    	connString = connString + hostName + ":" + dbPort + "/" + serviceName;
    	System.out.println(connString);

    	scan.close();
    	
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        
        try {

             connection = DriverManager.getConnection(
                    //"jdbc:oracle:thin:@10.10.20.90:1525:pdb1",
            		connString, 
                    //"COLP_APP",
            		dbUser,
                    //"COLP_APP"
            		dbPass
                    );
        			

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("Connection Successful");
            
            try {
            	
            	connection.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
            

        } else {
            System.out.println("Failed to make connection!");
        }
    }

}
