public class Person {
    String name;
    int age;
    int sex;
    /**
     *  sex: 1男
     *  sex: 0女
     */


    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:" + age);
    }
    public int addAge(int i){//形参定义不能赋值
        age += i;
        return age;
    }
}
