package mySQL;

import java.sql.*;

public class Dame1 {
    public static void main(String[] args)  {
        String url="jdbc:mysql://127.0.0.1:3306/students";
        String use="root";
        String password="123456";
        String sql="select*from student";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,use,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            System.out.println(resultSet.getString("name"));
//            while (resultSet.next()){
//                String st=resultSet.getString("name");
//                System.out.println(st);
//            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void jdbcConnStat(String url,String use,String password,String sql){
        try {
//            ��ȡ����
            Connection conn=DriverManager.getConnection(url,use,password);
//            ��ȡִ��sql����
            Statement stmt= conn.createStatement();
//            ִ��sql���
            ResultSet rs = stmt.executeQuery("select*from student");
            rs.getString("name");
//            �ͷ���Դ
//            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("����");
            throw new RuntimeException(e);
        }
    }
}
