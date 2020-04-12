public class DuiXiang {

    private String name;
     private int age;
     private String address;
      private int money;

    public DuiXiang() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public DuiXiang(String name, int age, String address, int money) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.money = money;

    }

    public void statud(){
         System.out.println("好好学习天天向上哦！！！");
     }

     public void eat(){
         System.out.println("吃饭啦！！！！！");
     }

}
