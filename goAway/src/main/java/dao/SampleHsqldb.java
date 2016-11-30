package dao;    

import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
     
    public class SampleHsqldb {
    	public static void main(String[] args) {
     
    		try {
    			Class.forName("org.hsqldb.jdbcDriver");
    		} catch (ClassNotFoundException e) {
    			System.err.println("Nie udalo zainstalowac sterownik");
    			e.printStackTrace();
    			System.exit(1);
    		}

    		Connection connection = null;
    		try {
    			connection = DriverManager.getConnection(
    					"jdbc:hsqldb:file:dbpath/dbname", "SA", "");
    		} catch (SQLException e) {
    			System.err.println("Nie udalo polaczyc sie");
    			e.printStackTrace();
    			System.exit(1);
    		}
     
    		try {
    			Statement statement = connection.createStatement();
    			String query = "CREATE TABLE mytable (id IDENTITY , value VARCHAR(32))";
    			try {
    				statement.executeUpdate(query);
    			} catch (SQLException e) {
    			}
    			statement.close();
    			
    			statement = connection.createStatement();
    			query = "INSERT INTO mytable (value) VALUES('One')";
    			statement.executeUpdate(query);
    			statement.close();
    			
    			statement = connection.createStatement();
    			query = "INSERT INTO mytable (value) VALUES('Two')";
    			statement.executeUpdate(query);
    			statement.close();
    			
    			statement = connection.createStatement();
    			query = "INSERT INTO mytable (value) VALUES('Three')";
    			statement.executeUpdate(query);
    			statement.close();
    			
    			
    			statement = connection.createStatement();
    			query = "SELECT id, value FROM mytable";
    			ResultSet resultSet = statement.executeQuery(query);
    			
    			while (resultSet.next()) {
    				System.out.println(resultSet.getInt(1) + " "
    						+ resultSet.getString(2));
    			}
    			statement.close();
    			
    			statement = connection.createStatement();
    			query = "SHUTDOWN";
    			statement.execute(query);
    			statement.close();
     
    		} catch (SQLException e) {
    			e.printStackTrace();
    		}
    	}
    }

