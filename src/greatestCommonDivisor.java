import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {

        Scanner nhap=new Scanner(System.in);

        System.out.println("nhap a:");
        int a= nhap.nextInt();

        System.out.println("nhap b:");
        int b=nhap.nextInt();

        //ham abs()de trar ve gia tri tuyet doi(phan duong ) cua a,b
        a=Math.abs(a);
        b=Math.abs(b);

        if (a ==0 || b==0){
            System.out.println("k co ucln");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else b=b-a;
        }
        System.out.println("ucln:"+ a );
    }
}
