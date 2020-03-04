package bao;

/**
 * @author Dongao
 * @create 2020-03-03 15:56
 */
public class entity {
    private int Id;
    private String Date;
    private String Province;
    private String City;
    private String Confirmed_num;
    private String Yisi_num;
    private String Cured_num;
    private String Dead_num;
    private String Code;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getConfirmed_num() {
        return Confirmed_num;
    }

    public void setConfirmed_num(String confirmed_num) {
        Confirmed_num = confirmed_num;
    }

    public String getYisi_num() {
        return Yisi_num;
    }

    public void setYisi_num(String yisi_num) {
        Yisi_num = yisi_num;
    }

    public String getCured_num() {
        return Cured_num;
    }

    public void setCured_num(String cured_num) {
        Cured_num = cured_num;
    }

    public String getDead_num() {
        return Dead_num;
    }

    public void setDead_num(String dead_num) {
        Dead_num = dead_num;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "bao.entity{" +
                "Id=" + Id +
                ", Date='" + Date + '\'' +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", Confirmed_num='" + Confirmed_num + '\'' +
                ", Yisi_num='" + Yisi_num + '\'' +
                ", Cured_num='" + Cured_num + '\'' +
                ", Dead_num='" + Dead_num + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
