package com.jorgejy.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jorgejy.beans.Player;
import com.jorgejy.dao.DAOPlayer;
@Repository
public class DAOPlayerSQL implements DAOPlayer {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void add(Player player) throws Exception {
		String sql = "INSERT INTO player(id,name,id_team,id_shirt) VALUES (?,?,?,?)";
		Connection connection = null;
		 try {
			connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getTeam().getId());
			preparedStatement.setInt(4, player.getShirt().getId());
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
