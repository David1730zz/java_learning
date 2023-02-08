package com.atguigu.exer2;

public class Girl {
    private String name;
    private int age;
/*****************************************************************/
    public Girl(){

    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**********************************************/
    public void Marry(Boy boy){
        System.out.println("我想嫁给：" + boy.getName());
//        boy.Marry(new Girl());  错误！是另一个girl调了，应该用this
        boy.Marry(this); //打印我想娶谁谁谁
    }

    /**
     * &#064;description  "比较两个对象的大小"
     * @param "girl"
     * @return 正数，认为当前对象大；负数，当前对象小；0，二者一样
     */
    public int compare(Girl girl){
        if(this.age > girl.age) {
            return 1;
        }else if(this.age < girl.age) {
            return -1;
        }else{
            return 0;
        }
        //return this.age - girl.age;

    }

}
