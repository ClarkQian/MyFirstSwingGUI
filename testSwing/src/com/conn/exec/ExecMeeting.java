package com.conn.exec;
import com.conn.NewConnect;

import java.security.interfaces.RSAKey;
import java.sql.*;
import java.util.Objects;
import java.util.Vector;
import java.util.regex.Pattern;

public class ExecMeeting {
    private String username;
    private Connection conn;
    public ExecMeeting(String username){
        this.username = username;
        conn = new NewConnect().connect();
    }
    public int Add(String date, String time, String location, String duration, String description) throws SQLException {


        PreparedStatement prestm = conn.prepareStatement("insert into MeetingAndAppointment_" + username + " values (?,?,?,?,?)");
        prestm.setString(1, date);
        prestm.setString(2, time);
        prestm.setString(3, location);
        prestm.setString(4, duration);
        prestm.setString(5, description);
        prestm.executeUpdate();
        prestm.close();

        //when success return 0;
        return 0;

    }

    public void Delete(String date, String time) throws SQLException {
        PreparedStatement prestm = conn.prepareStatement("Delete from MeetingAndAppointment_"+username+ " where date = ? and time = ?");
        prestm.setString(1, date);
        prestm.setString(2, time);
        prestm.executeUpdate();
        prestm.close();
    }

    public void Update(String date, String time, String colname, String value) throws SQLException {
        PreparedStatement prestm = conn.prepareStatement("update MeetingAndAppointment_"+username+" set "+colname+" = ? where date = ? and time = ?");
        prestm.setString(1, value);
        prestm.setString(2, date);
        prestm.setString(3, time);
        prestm.executeUpdate();
        prestm.close();

    }

    public ResultSet Search(String date) throws SQLException {

        PreparedStatement prestm = conn.prepareStatement("select * from MeetingAndAppointment_"+username+" where date = ? order by date, time");
        prestm.setString(1, date);
        return prestm.executeQuery();
    }

    //获取所有结果集合用于打印
    public Vector<Vector<Object>> GetAllRecords() throws SQLException {
        Statement stm = conn.createStatement();
        Vector<Vector<Object>> resV = new Vector<Vector<Object>>();
        ResultSet res = stm.executeQuery("Select * from MeetingAndAppointment_"+username);
        boolean more = res.next();
        while(more){
            Vector<Object> v = new Vector<>();
            v.add(res.getString(1));
            v.add(res.getString(2));
            v.add(res.getString(3));
            v.add(res.getString(4));
            v.add(res.getString(5));
            resV.add(v);
            more = res.next();
        }
        return  resV;
    }

    public Vector<Vector<Object>> GetAllCurrentRecords() throws SQLException {
        Statement stm = conn.createStatement();
        Vector<Vector<Object>> resV = new Vector<Vector<Object>>();
        ResultSet res = stm.executeQuery("Select * from MeetingAndAppointment_"+username +" where date >= curdate()");
        boolean more = res.next();
        while(more){
            Vector<Object> v = new Vector<>();
            v.add(res.getString(1));
            v.add(res.getString(2));
            v.add(res.getString(3));
            v.add(res.getString(4));
            v.add(res.getString(5));
            resV.add(v);
            more = res.next();
        }
        return  resV;
    }
    public void close() throws SQLException {
        conn.close();
    }

     public static void main(String[] args) throws SQLException {
         ExecMeeting test = new ExecMeeting("Name");
         Vector<Vector<Object>>  res = test.GetAllCurrentRecords();


         for(Vector<Object> i : res){
             for(Object j : i){
                 System.out.println(j);
             }
         }

//         for(int i = 0; i < res.size(); i++){
//             for (int j = 0; j < 5; j++){
//                 System.out.println(res.elementAt(i).elementAt(j));
//             }
//         }
//         Object a = new Object();
//
//         test.close();
     }

}
