package lv1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요 : ");
            String input1 = sc.nextLine();
            // Integer.parseInt()는 String을 int로 변환
            int num1 = Integer.parseInt(input1);
            if (num1 < 0) {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요 : ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);
            if (num2 < 0) {
                System.out.println("양의 정수만 입력할 수 있습니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /) : ");
            String input3 = sc.nextLine();

            int result = 0; // 변수 선언

            switch (input3) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    while (true) {
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 두 번째 숫자(분모)는 0일 수 없습니다.");
                        } else if (num2 > num1) {
                            System.out.println("나눗셈 연산에서 두 번째 숫자(분모)는 첫 번째 숫자(분자)보다 작아야 합니다.");
                        } else { // 위 조건에 해당하지 않는 정상 입력한 경우
                            break;
                        }
                        System.out.print("두 번째 숫자를 다시 입력하세요 : ");
                        /*String input2 = sc.nextLine();      // 먼저 문자열 입력을 받고
                        num2 = Integer.parseInt(input2);    // 그 문자열을 정수로 변환해서 num2에 저장 */
                        num2 = Integer.parseInt(sc.nextLine());
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("계산 결과 : " + result);
            System.out.print("계산을 계속하시겠습니까? (exit 입력 시 종료) : ");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }

    }
}
