package dao;

import entity.Data;
import org.apache.commons.dbutils.QueryRunner;
import utils.DataSourceUtils;

import java.sql.SQLException;

/**
 * @author Dongao
 * @create 2020-03-11 13:54
 */
public class Dao {
    public void insert(Data data){
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into yiqitable values(?,?,?,?,?,?,?,?,?)";
        Object params[] = {data.getCityName(),data.getConfirmTotal(),data.getHealRate(),data.getHeal(),data.getDead(),
                data.getSuspect(),data.getDeadRate(),data.getConfirmToday(),data.getConfirmCuts()};
        try {
            qr.update(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
