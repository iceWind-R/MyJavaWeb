import dao.Dao;
import entity.Data;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Try {
    public static void f(String data){
        JSONObject jsonObject = JSONObject.fromObject(data);
        String data1 = jsonObject.getString("data");
        data1 = data1.substring(1);
        data1 = data1.substring(0,data1.length()-1);//去掉前后的双引号
        JSONObject jsonObject1 = JSONObject.fromObject(data1);
        for(int i=0;i<34;i++) {
            JSONObject jsonObject2 = jsonObject1.getJSONArray("areaTree")
                    .getJSONObject(0).getJSONArray("children").getJSONObject(i);//获取第i个省的数据
            for (int j = 0; j < jsonObject2.getJSONArray("children").size(); j++) {//遍历每个城市
                String cityName = jsonObject2.getJSONArray("children").getJSONObject(j).getString("name");

                JSONObject jsObj1 = jsonObject2.getJSONArray("children").getJSONObject(j).getJSONObject("total");
                int confirmTotal = jsObj1.getInt("confirm");
                String healRate = jsObj1.getString("healRate");
                int heal = jsObj1.getInt("heal");
                int dead = jsObj1.getInt("dead");
                int suspect = jsObj1.getInt("suspect");
                String deadRate = jsObj1.getString("deadRate");

                JSONObject jsObj2 = jsonObject2.getJSONArray("children").getJSONObject(j).getJSONObject("today");
                int confirmToday = jsObj2.getInt("confirm");
                int confirmCuts = jsObj2.getInt("confirmCuts");
                Data entity = new Data(cityName,confirmTotal,healRate,heal,dead,suspect,deadRate,confirmToday,confirmCuts);//将数据封装到实体类
                insert(entity);

            }

        }
        System.out.println(jsonObject1.getJSONArray("areaTree").getJSONObject(0).
                getJSONArray("children").getJSONObject(0).getJSONArray("children").getJSONObject(0).getJSONObject("total").getString("confirm"));

    }

    private static void insert(Data entity) {
        Dao dao = new Dao();
        dao.insert(entity);
    }

    public static void main(String[] args) {
        f(loadJson("https://view.inews.qq.com/g2/getOnsInfo?name=disease_h5"));
    }

    public static String loadJson (String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(),"UTF-8"));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
    public static void f2(){
        String data = "{\"name\":\"Maoshu\",\"age\":22,\"sex\":\"男\"," +
                "\"skill\":[\"java\",\"css\",\"html\",\"JavaScript\"]," +
                "\"depts\":[{\"deptno\":11,\"skill\":{\"java\":13,\"css\":13,\"html\":13,\"JavaScript\":13},\"dname\":\"Accounting\",\"loc\":\"中国\"}," +
                "{\"deptno\":22,\"skill\":{\"java\":13,\"css\":13,\"html\":13,\"JavaScript\":13},\"dname\":\"Maneager\",\"loc\":\"上海\"}]}";
        //解析字符串中的数据



        JSONObject jsonObject = JSONObject.fromObject(data);
        //读取
        String name = jsonObject.getString("name");
        System.out.println("年龄:"+name);

        //取得skill数组
        JSONArray skill = jsonObject.getJSONArray("skill");
        //遍历JSONArray数组
        for (int i = 0; i < skill.size(); i++) {
            System.out.println(skill.get(i));
        }
        //得到deptsJSONObject对象
        JSONArray depts = jsonObject.getJSONArray("depts");
        for (int i = 0; i < depts.size(); i++) {
            JSONObject tempDept = depts.getJSONObject(i);
            System.out.println("部门编号:"+tempDept.getString("deptno"));
            System.out.println("部门名称:"+tempDept.getString("dname"));
            System.out.println("部门位置:"+tempDept.getString("loc"));
        }
    }
}