package entity;

/**
 * @author Dongao
 * @create 2020-03-11 13:48
 */
public class Data {
    private String cityName;
    private int confirmTotal;
    private String healRate;
    private int heal;
    private int dead;
    private int suspect;
    private String deadRate;
    private int confirmToday;
    private int confirmCuts;

    public Data() {
    }

    public Data(String cityName, int confirmTotal, String healRate, int heal, int dead, int suspect, String deadRate, int confirmToday, int confirmCuts) {
        this.cityName = cityName;
        this.confirmTotal = confirmTotal;
        this.healRate = healRate;
        this.heal = heal;
        this.dead = dead;
        this.suspect = suspect;
        this.deadRate = deadRate;
        this.confirmToday = confirmToday;
        this.confirmCuts = confirmCuts;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getConfirmTotal() {
        return confirmTotal;
    }

    public void setConfirmTotal(int confirmTotal) {
        this.confirmTotal = confirmTotal;
    }

    public String getHealRate() {
        return healRate;
    }

    public void setHealRate(String healRate) {
        this.healRate = healRate;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }

    public int getSuspect() {
        return suspect;
    }

    public void setSuspect(int suspect) {
        this.suspect = suspect;
    }

    public String getDeadRate() {
        return deadRate;
    }

    public void setDeadRate(String deadRate) {
        this.deadRate = deadRate;
    }

    public int getConfirmToday() {
        return confirmToday;
    }

    public void setConfirmToday(int confirmToday) {
        this.confirmToday = confirmToday;
    }

    public int getConfirmCuts() {
        return confirmCuts;
    }

    public void setConfirmCuts(int confirmCuts) {
        this.confirmCuts = confirmCuts;
    }

    @Override
    public String toString() {
        return "Data{" +
                "cityName='" + cityName + '\'' +
                ", confirmTotal=" + confirmTotal +
                ", healRate='" + healRate + '\'' +
                ", heal=" + heal +
                ", dead=" + dead +
                ", suspect=" + suspect +
                ", deadRate='" + deadRate + '\'' +
                ", confirmToday=" + confirmToday +
                ", confirmCuts=" + confirmCuts +
                '}';
    }
}
