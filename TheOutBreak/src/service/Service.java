package service;

import entity.Data;
import utils.utils;

import java.util.List;

/**
 * @author Dongao
 * @create 2020-03-11 14:26
 */
public class Service {


    public static List<Data> query(){
        System.out.println("service");
        System.out.println(utils.queryByDate());
        return utils.queryByDate();
    }

    public static void main(String[] args) {
         query();
    }

}
