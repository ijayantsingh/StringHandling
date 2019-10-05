package Solution9;

import java.util.Scanner;

public class AbsoluteWeight {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter String Value : ");
        String stringInput = scanner.nextLine();

        int LowerWeight = 0, UpperWeight = 0 ,absoluteWeight =0;

        for (int i = 0; i <stringInput.length() ; i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z'){
                UpperWeight += (int) stringInput.charAt(i);
            }
            else if (stringInput.charAt(i) >= 'a' || stringInput.charAt(i) <= 'z'){
                LowerWeight += (int) stringInput.charAt(i);
            }
        }
        absoluteWeight = UpperWeight - LowerWeight;
         System.out.println("absoluteWeight = " + absoluteWeight);
    }
        }