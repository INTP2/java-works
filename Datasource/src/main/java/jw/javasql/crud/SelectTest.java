package jw.javasql.crud;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args){

        //构建Java和数据库之间的桥梁介质
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("注册驱动成功!");
        }catch(ClassNotFoundException e1){
            System.out.println("注册驱动失败!");
            e1.printStackTrace();
            return;
        }

        String url="jdbc:mysql://localhost:3306/test";
        Connection conn = null;
        try {
            //构建Java和数据库之间的桥梁：URL，用户名，密码
            conn = DriverManager.getConnection(url, "root", "123456");

            //构建数据库执行者
            Statement stmt = conn.createStatement();
            System.out.println("创建Statement成功！");

            //执行SQL语句并返回结果到ResultSet
            ResultSet rs = stmt.executeQuery("select bookid, bookname, price from t_book order by bookid");

            //开始遍历ResultSet数据
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt("price"));
            }

            rs.close();
            stmt.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(null != conn)
                {
                    conn.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
