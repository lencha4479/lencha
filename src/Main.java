
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static String calc(String input) throws IOException {
        String[] l = input.split(" ");
        if (l.length != 3) {
            throw new RuntimeException("Вы ввели неверное выражение!");
        } else {
            int result = 0;
            int a1 = 0;
            int b1 = 0;
            String a = l[0];
            String op = l[1];
            String b = l[2];
            if (!a.equals("+") && !a.equals("-") && !a.equals("*") && !a.equals("/") && !b.equals("+") && !b.equals("-") && !b.equals("*") && !b.equals("/")) {
                try {
                    a1 = Integer.parseInt(a);
                    b1 = Integer.parseInt(b);
                    if (a1 > 10 || a1 < 1 || b1 > 10 || b1 < 1) {
                        throw new RuntimeException("Числа должны быть от 1-го до 10-ти!");
                    }
                } catch (NumberFormatException var10) {
                    var10.printStackTrace();
                }


                if (op.equals("+")) {
                    result = a1 + b1;
                } else if (op.equals("-")) {
                    result = a1 - b1;
                } else if (op.equals("*")) {
                    result = a1 * b1;
                } else {
                    if (!op.equals("/")) {
                        throw new RuntimeException("Вы ввели неверное выражение!");
                    }

                    result = a1 / b1;
                }

                String str = "" + result;
                return str;
            } else {
                throw new RuntimeException("Вы ввели неверное выражение!");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calc(reader.readLine()));
    }
}
