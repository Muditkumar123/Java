

import java.util.*;
        public class logical {
            public static void main(String[] args) {


                System.out.printf("Input the marks:");
                Scanner str = new Scanner(System.in);
                float a = str.nextFloat();
                float b = str.nextFloat();
                float c = str.nextFloat();
                float per = ((a + b + c) / 3) * 100;
                if ((per >= 40 && a >= 33) || (per >= 40 && b >= 33) || (per >= 40 && c >= 33)) {
                    System.out.println("You pass!");
                } else {
                    System.out.println("You fail!");
                }

            }
        }