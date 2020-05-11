package com.fifth_fleet.jagras;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Testwb {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("MMddHHmmss");
        int dd = Integer.valueOf(fm.format(Calendar.getInstance().getTime()));
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/microblog?useUnicode=true&characterEncoding=utf8",
                        "root", "admin");
                Statement s = c.createStatement();
        )
        {
            for (int i = 1; i <=10 ; i++) {
                String datenow = date.toString();
                String name = "BSPuppy";//itime;name;message
                String message = "楼主说得对"+i;
                String sqlFormat = "insert into singlewb values (null,"+dd+","+"'%s'"+","+"'%s'"+")";
                System.out.println("before"+sqlFormat);
                String sql = String.format(sqlFormat,name,message);
                System.out.println("后面"+sql);
                s.execute(sql);
            }

            System.out.println("已经成功创建10条分类测试数据");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}