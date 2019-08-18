package pcnote.Day03;

public class Demo1 {
    public static void main(String[] args) {
//      if...else语句
//        int a = 1;
//        int b = 3;
//        if (a == b){
//            System.out.println("a = b");
//        }else{
//            System.out.println("a不等于b");
//        }
//        int c = 3;
//        if (b == c){
//            System.out.println("b = c");
//        }else{
//            System.out.println("b不等于c");
//        }
//      if...else if语句
//        int a = 150;
//        if (a < 0 || a > 100){
//            System.out.println("您输入的成绩有误");
//        }else if(a > 90 && a <= 100){
//            System.out.println("优");
//        }else if(a > 80 && a <= 90) {
//            System.out.println("良");
//        }else if(a > 70 && a <= 80) {
//            System.out.println("中");
//        }else if(a >= 60 && a <= 70) {
//            System.out.println("可");
//        }else{
//            System.out.println("差");
//        }
//        switch语句
        int weekday = 6;
        switch (weekday){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
    }
}
