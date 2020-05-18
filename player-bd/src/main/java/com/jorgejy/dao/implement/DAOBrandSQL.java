package com.jorgejy.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jorgejy.beans.Brand;
import com.jorgejy.dao.DAOBrand;

@Repository
public class DAOBrandSQL implements DAOBrand {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void add(Brand brand) throws Exception {
		String sql = "INSERT INTO brand(id,name) VALUES (?,?)";
		Connection connection = null;
		 try {
			connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,brand.getId());
			preparedStatement.setString(2, brand.getName());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if(connection != null) {
				connection.close();
			}
		}
	}
	
}
