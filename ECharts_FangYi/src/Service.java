import bao.entity;

import java.util.List;

/**
 * @author Dongao
 * @create 2020-03-03 15:55
 */
public class Service {


    public static List<entity> query(String date){
        return utils.queryByDate(date);
    }

}
