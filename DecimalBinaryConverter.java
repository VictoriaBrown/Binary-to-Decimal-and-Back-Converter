/* Binary to Decimal/Decimal to Binary
Programmer:           Victoria Brown
Date:                 September 2016
DecimalBinaryConverter.java */

import java.util.Scanner;

public class DecimalBinaryConverter {

  public static void main(String[] args) {

    // Variables:
    Scanner input = new Scanner(System.in);
    String binaryDecimal;
    String binary;
    String decimal;

    System.out.println("Please enter 'Binary' or 'Decimal' for which you would like to convert: ");
    binaryDecimal = input.nextLine();

    if (binaryDecimal.equals("Binary") || binaryDecimal.equals("binary")) {
      System.out.println("Please enter the binary you'd like to convert to decimal: ");
      binary = input.nextLine();
      System.out.println(Integer.parseInt(binary, 2));
    } else {
      System.out.println("Please enter the decimal you'd like to convert to binary: ");
      decimal = input.nextLine();
      int newDecimal = Integer.parseInt(decimal);
      System.out.println(Integer.toBinaryString(newDecimal));
    }

  }
}
