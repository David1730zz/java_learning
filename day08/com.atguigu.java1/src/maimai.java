public class maimai {
        public static void main(String[] args) {
            int a = 10,b = 10;

            method(a,b); //调用method后，a = 100，b = 200
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }
        public static void method(int x, int y){
            x = x * 10;
            y = y * 20;
            System.out.println("a=" + x);
            System.out.println("b=" + y);
            System.exit(0);//在这里停止程序
        }
    }


