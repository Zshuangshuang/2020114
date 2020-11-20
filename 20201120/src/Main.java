import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-20
 * Time: 20:48
 **/
public class Main {

    public static void main(String[] args)throws IOException {
        /*//输入：多组输入，一行有两个整数，分别表示年份和月份，用空格分隔。
        //输出：针对每组输入，输出为一行，一个整数，表示这一年这个月有多少天。
        //思路：(1)先针对输入的字符串进行划分，将前[0,3)划分为年，后半部分[4,5)划分为月.此处用spilt方法进行操作
        //(2)创建一个数组分别表示1,2,3……12个月份的天数，2月暂且用0表示
        //(3)针对年份进行分情况讨论，若年份是闰年，那么tmp[1]=29,否则tmp[1]=28；
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while((s=bufferedReader.readLine()) != null){
            String[] ret = s.split(" ");
            int year = Integer.parseInt(s.substring(0,s.indexOf(" ")));
            int month = Integer.parseInt(s.substring(s.indexOf(" ")+1));
            int[] tmp = {31,0,31,30,31,30,31,31,30,31,30,31};
            if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
                tmp[1] = 29;
            }else {
                tmp[1] = 28;
            }
            System.out.println(tmp[month-1]);
        }*/
        //实现简单计算器
        //思路：(1)先从计算器读入多组数据，设置两个数组，分别保存a、'.',b的值
        //(2)分别从两个数组读出a,b真正的值
        //(3)判断符号是否为+-*/
        //(4)分情况讨论出书是否为0的情况
       /* Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            //读入一行字符
            String ret = scanner.nextLine();
            //将字符串转为数组
            char[] chars = ret.toCharArray();
            //用来一会儿保存a和'.'的数据
            char[] a1 = new char[chars.length];
            //用来一会儿保存b中的数据
            char[] b1 = new char[chars.length];
            //ch负责保存运算符号
            char ch = 0;
            //用来标记b的元素所在位置
            int n = 0;
            for (int i = 0; i < chars.length; i++) {
                //这个if条件语句是为了找到a
                if (chars[i] >= '0' && chars[i] <= '9'){
                    a1[i] = chars[i];
                }else if (chars[i] == '.'){
                    a1[i] = chars[i];
                }else {
                    ch = chars[i];
                    n = i;
                    break;
                }

            }
            for (int i = n+1; i < chars.length; i++) {
                b1[i] = chars[i];
            }
            String str1 = String.valueOf(a1);
            double a = Double.parseDouble(str1);
            String str2 = String.valueOf(b1);
            double b = Double.parseDouble(str2);
            //计算
            if (ch == '+'){
                System.out.printf("%.4f+%.4f=%.4f",a,b,a+b);
            }else if (ch == '-'){
                System.out.printf("%.4f-%.4f=%.4f",a,b,a-b);
            }else if (ch == '*'){
                System.out.printf("%.4f*%.4f=%.4f",a,b,a*b);
            }else if(ch == '/'){
                if (b == 0){
                    System.out.println("Wrong!Division by zero!");
                }else{
                    System.out.printf("%.4f/%.4f=%.4f",a,b,a/b);
                }
            }else {
                System.out.println("Invalid operation!");
            }
            System.out.println();
        }*/
       /* Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for (int row = 0; row < n; row++) {
                for (int i = 0; i <= row; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
