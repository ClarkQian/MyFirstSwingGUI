package com.conn.exec;

import com.conn.NewConnect;

import java.sql.*;
import java.util.regex.Pattern;
import java.util.Vector;

public class ExecContact {
    private String username;
    private Connection conn;
    public ExecContact(String username){
        this.username = username;
        conn = new NewConnect().connect();
    }
    public int Add(String name, String address, String phonenumber, String email) throws SQLException {
//        String pattern_phone = "[0-9]+";
//        String pattern_email = ".+@.+";
//
//        boolean isMatchPhone = Pattern.matches(pattern_phone, phonenumber);
//        if (isMatchPhone == false){
//            return 1; //the number is wrong
//        }
//        boolean isMatchEmail = Pattern.matches(pattern_email, email);
//        if (isMatchEmail == false){
//            return 2; //the email is wrong
//        }
        PreparedStatement prestm = null;
        try {


            prestm = conn.prepareStatement("insert into ContactDetails_" + username + "(NAME, address, phonenumber, email) values (?,?,?,?)");
            prestm.setString(1, name);
            prestm.setString(2, address);
            prestm.setString(3, phonenumber);
            prestm.setString(4, email);
            prestm.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            prestm.close();
        }


        //when success return 0;
        return 0;

    }

    public void Delete(String name, String address, String phonenumber, String email) throws SQLException {
        PreparedStatement prestm = conn.prepareStatement("Delete from ContactDetails_"+username+ " where name = ? and address = ? and phonenumber = ? and email = ? ");
        prestm.setString(1, name);
        prestm.setString(2, address);
        prestm.setString(3, phonenumber);
        prestm.setString(4, email);
        prestm.executeUpdate();
        prestm.close();
    }

    public void Update(String name, String address, String phonenumber, String email, String colname, String value) throws SQLException {
        PreparedStatement prestm = conn.prepareStatement("update ContactDetails_"+username+" set "+colname+" = ? where name = ? and address = ? and phonenumber = ? and email = ?");
        prestm.setString(1, value);
        prestm.setString(2, name);
        prestm.setString(3,address);
        prestm.setString(4, phonenumber);
        prestm.setString(5, email);
        System.out.println(colname);
        System.out.println(value);
        System.out.println(name);
        System.out.println(address);
        System.out.println(phonenumber);
        System.out.println(email);

        prestm.executeUpdate();
        prestm.close();

    }

//    public void Search(String name) throws SQLException {
//        PreparedStatement prestm = conn.prepareStatement("select * from ContactDetails_"+username+" where name = ?");
//        prestm.setString(1,name);
//        prestm.executeUpdate();
//        prestm.close();
//    }

    //获取所有结果集合用于打印
//    public  GetAllRecords() throws SQLException {
//        Statement stm = conn.createStatement();
//        return stm.executeQuery("Select * from ContactDetails_"+username);
//    }
    public Vector<Vector<Object>> GetAllRecords() throws SQLException {
        Statement stm = conn.createStatement();
        Vector<Vector<Object>> resV = new Vector<Vector<Object>>();
        String sql = String.format("SELECT (@rownumber :=@rownumber + 1) AS line, NAME, address, phonenumber, email FROM (SELECT * FROM ContactDetails_%s ORDER BY NAME) c, (SELECT @rownumber := 0) r;",username
);
//        ResultSet res = stm.executeQuery("Select (@rownumber :=@ rownumber +1) as no, name, address, phonenumber, email from (select * from ContactDetails_"+username+ " order by name) c, (select @rownumber := 0) r");
        ResultSet res = stm.executeQuery(sql);
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
        ExecContact test = new ExecContact("Name");
//        test.Add("clark","home","123","23@qq.com");
        Vector<Vector<Object>> res = test.GetAllRecords();
        for(Vector<Object> i:res){
            for(Object j: i){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
