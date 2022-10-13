package bubble2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap mot so khoi tao mang so nguyen");
        int size =scanner.nextInt();
        int[] list = new int[size];
        System.out.println("gia tri cua mang so nguyen" + list.length );
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();

        }
        System.out.println("mang so nguyen cua ban la: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");

        }
        System.out.println("bat dau sap xep mang so nguyen");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep (int [] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]) {
                    System.out.println("Swap" + list[j] +"with" +list[j+1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1]  = temp;

                    needNextPass =true;
                }
            }
            if (needNextPass == false){
                System.out.println("mang khong duoc khoi tao ");
                break;
            }
            System.out.print("mang sau khi sap xep "+i);
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]+"\t");

            }
            System.out.println();

        }
    }


}

