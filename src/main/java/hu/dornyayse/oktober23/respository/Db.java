package hu.dornyayse.oktober23.respository;

import java.util.List;

import com.dieselpoint.norm.Database;

public class Db {
	private static Database db=null;

	private static Database getDb() {
		if (db==null) {
			db = new Database();
			db.setJdbcUrl("jdbc:mariadb://localhost:3307/okt23");
			db.setUser("root");
			db.setPassword("");
		}
		return db;
	}

	public static <T> List<T> loadAll(Class<T> clazz,String query,Object... params) {
		return getDb().where(query, params).results(clazz);
	}

	public static <T> T load(Class<T> clazz,String query,Object... params) {
		return getDb().where(query, params).first(clazz);
	}
	
	public static <T> void insert(T data) {
		getDb().insert(data);
	}
}
