package com.revature.dao.impl;

import com.revature.dao.BoardUserCKDao;
import com.revature.pojo.Board;
import com.revature.service.Connections;

import java.sql.*;
import java.util.ArrayList;

public class BoardUserCKDaoImpl implements BoardUserCKDao{

    @Override
    public ArrayList<Board> getBoardsByUserId(int userId) {

        ArrayList<Board> board = new ArrayList<Board>();
        ArrayList<String> boardNames = new ArrayList<String>();
        String sql = "SELECT BOARD.* FROM BOARD INNER JOIN boardusers ON board.B_ID = boardusers.B_ID INNER JOIN users ON boardusers.U_ID = users.U_ID WHERE  boardusers.U_ID = ?";

        try(Connection connect = Connections.getConnection()){
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            int noCols = md.getColumnCount();
            while(rs.next()) {
                    board.add(
                            new Board(
                                    rs.getInt("B_ID"),
                                    rs.getString("B_TITLE"),
                                    rs.getString("B_DESC"))
                    );
                return board;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
