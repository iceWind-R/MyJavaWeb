package utils;

import entity.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Dongao
 * @create 2020-03-03 15:45
 */
public class utils {
    private static void update(){
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into info values(null,'1','1','1','1','1','1','1','1')";
        try {
            qr.update(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Data> queryByDate(){
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from yiqitable";
        List<Data> list = null;
        try {
            list = queryRunner.query(sql,new BeanListHandler<Data>(Data.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;

    }

    public static void main(String[] args) {
        List<Data> list = queryByDate();
        System.out.println(list);
    }
}
