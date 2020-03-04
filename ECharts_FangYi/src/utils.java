import bao.DataSourceUtils;
import bao.entity;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Dongao
 * @create 2020-03-03 15:45
 */
public class utils {

    public static List<entity> queryByDate(String date){
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from info where date=?";
        List<entity> list = null;
        try {
            list = queryRunner.query(sql,new BeanListHandler<entity>(entity.class),date);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;

    }
}
