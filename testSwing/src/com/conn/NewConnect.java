package com.conn;

import java.sql.*;
import com.mysql.jdbc.Connection;

public class NewConnect {
    public NewConnect(){}
    public Connection connect(){
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //连接。返回连接共其他地方使用（这里直接测试)
        String url = "jdbc:mysql://47.107.44.55:3306/outerInterface?useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String name = "clark";
        String password = "123456";
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection(url, name, password);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
