import java.util.Scanner;
/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10
                               2n-1
 ******************* tab 0 star 19 n 1
  *****************      1      17   2
   ***************       2      15   3
    *************        3      13   4
     ***********         4      11   5
      *********          5      9    6
       *******           6      7    7
        *****            7      5    8
         ***             8      3    9
          *              9     1    10
 */
public class Reverse_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int digitNum = input.nextInt();

        for (int i = 0; i < digitNum; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (digitNum-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}
