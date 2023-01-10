public class PassObject {
    public static void main(String[] args) {
        //要想在main方法使用其他方法，就得创建这个方法的对象，比如下面的
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");

        for(int i = 1;i <= time;i++){
            //设置圆的半径值
            c.radius = i;
            //Circle c的意思是新建了Circle类的一个c对象
            //等同于Circle c = new Circle();
            // 那么c.radius就是设置这个对象中radius的值
            double area = c.findArea();//c对象中findArea方法
            System.out.println(c.radius + "\t\t" + area);
        }
    }
}
