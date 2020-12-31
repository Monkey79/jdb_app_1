package com.mdangelo.jdbc_app_1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionMng {
	
	private static Connection connection;
	
	
	public static Connection getConnection() {
		
		try {
			if(connection == null) {
				Runtime.getRuntime().addShutdownHook(new MyShtDownHook());
				ResourceBundle rsBndl = ResourceBundle.getBundle("common");
				
				String driver = rsBndl.getString("data.source.db.driver");
				String url = rsBndl.getString("data.source.db.url");
				String user = rsBndl.getString("data.source.db.user");
				String password = rsBndl.getString("data.source.db.password");
				
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);				
			}
			
			return connection;			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
	static class MyShtDownHook extends Thread{

		@Override
		public void run() {
			try {
				Connection connection = ConnectionMng.getConnection();
				connection.close();
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		
		
		
	}

}
