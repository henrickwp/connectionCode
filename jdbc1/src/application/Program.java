package application;

import java.sql.Connection;

import Db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.closeConnection();
		DB.closeConnection();

	}

}
