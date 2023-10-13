import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите ваш текуший баланс:");
        int DenegNaSimkeSeychas = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите сумму пополнения:");
        int Popolnenie = in2.nextInt();
        if (Popolnenie > 1000){
            int ItogovayaSumma=(int)(DenegNaSimkeSeychas + Popolnenie + Popolnenie/100);
            System.out.println("Вы пополнили счет на " + Popolnenie + " рублей - бонус равен " + Popolnenie/100 + " рубля/ей, итоговая сумма на балансе " + ItogovayaSumma + " рубля/ей" );
        }
        if (Popolnenie <= 1000){
            int ItogovayaSumma2=(int)(DenegNaSimkeSeychas + Popolnenie);
            System.out.println("Вы пополнили счет на " + Popolnenie + " рублей - бонусы не начислены, итоговая сумма на балансе " + ItogovayaSumma2 + " рубля/ей" );
        }
        in1.close();
        in2.close();
    }
}