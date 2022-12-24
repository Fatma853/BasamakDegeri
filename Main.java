import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Bir sayı giriniz: ");
    int number = input.nextInt();
    int tempNumber = number;
    int basValue = 0;
    int sonuc =0;

   
    while (tempNumber != 0) {
      basValue = tempNumber % 10;
      tempNumber /= 10;
      sonuc += basValue;
    }
    System.out.println(sonuc);
    
  }
}