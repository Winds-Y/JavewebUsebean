package henu.util;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * User: Yangtse
 * Date: 2017/11/20
 * Time: 20:46
 */
public class DbcpPool {
    private static final String TAG="DBConnFactory";
    private static Connection con=null;
    private static PreparedStatement stmt=null;
    private static ResultSet rs=null;
    private static BasicDataSource dataSource=null;
    private static String sql;
    public static void initDBconn () {
        if(dataSource!=null){
            try {
                dataSource.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            dataSource=null;
        }
        try {
            Properties properties=new Properties();
            properties.getProperty("driverClassName","com.mysql.jdbc.Driver");
            properties.setProperty("url","jdbc:mysql://localhost:3306/javawebexer5?useSSL=false");
            properties.setProperty("username","root");
            properties.setProperty("password","root");
            properties.setProperty("maxActive","30");
            properties.setProperty("maxIdle","10");
            properties.setProperty("maxWait","1000");
            properties.setProperty("removeAbandoned","false");
            properties.setProperty("removeAbandonedTime","120");
            properties.setProperty("testOnBorrow","true");
            properties.setProperty("logAbandoned","true");
            dataSource= BasicDataSourceFactory.createDataSource(properties);
            con= (Connection) dataSource.getConnection();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void setSql(String sql) throws SQLException {
        DbcpPool.sql=sql;
        stmt=(PreparedStatement) con.prepareStatement(sql);
    }
    /*public void cbsetString(int index,String value) throws SQLException {
       stmt.setString(index,value);
    }
    public void cbsetInt(int index,int value) throws SQLException {
       stmt.setInt(index,value);
    }
    public void cbsetBinaryStream(int index, FileInputStream in) throws IOException, SQLException {
       //stmt.setBinaryStream(index,in,in.available());
       stmt.setBlob(index,in,in.available());
    }*/
    public static ResultSet executeQuery() {
        try {
            rs=stmt.executeQuery();
        }catch (SQLException e) {
            // TODO: handle exception
            System.out.println("DBConnFactory.executeQuery()");
            System.err.println("executeQuery发生异常："+e.getMessage());
            System.err.println("异常SQL语句："+sql);
        }
        return rs;
    }
    public static void executeUpdate() {
        int rowCount;
        try {
            rowCount=stmt.executeUpdate();
            System.out.println(TAG+"->executeUpdate->rowCount="+rowCount);
        }catch (SQLException e) {
            // TODO: handle exception
            System.out.println("DBConnFactory.executeUpdate()");
            System.err.println("executeUpdate发生异常："+e.getMessage());
            System.err.println("异常SQL语句："+sql);
        }
    }
    public static void close() {
        try {
            if(rs!=null)rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
