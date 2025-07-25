package lv2;

import java.util.Scanner;

// 클래스 선언
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculator 클래스 사용
        Calculator calc = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요 : ");
            String input1 = sc.nextLine();

            int num1 = 0; // try 바깥에서 변수 선언해야 오류X

            try {
                // Integer.parseInt()는 String을 int로 변환
                num1 = Integer.parseInt(input1.trim()); // 입력값의 앞뒤 공백 제거
                if (num1 < 0) {
                    System.out.println("양의 정수만 입력할 수 있습니다.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력할 수 있습니다.");
                continue;
            }

            int num2 = 0;

            while (true) {

                System.out.print("두 번째 숫자를 입력하세요 : ");
                String input2 = sc.nextLine();

                try {
                    num2 = Integer.parseInt(input2.trim());
                    if (num2 < 0) {
                        System.out.println("양의 정수만 입력할 수 있습니다.");
                        continue;
                    }
                    break; // 입력이 정상이면 반복 종료
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력할 수 있습니다.");
                    continue;
                }
            }

            String input3;
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /) : ");
                input3 = sc.nextLine().trim();

                // 연산기호가 정확히 하나이고 + - * / 중 하나인지 체크
                if (input3.length() == 1 && (input3.equals("+") || input3.equals("-") || input3.equals("*") || input3.equals("/"))) {
                    break;  // 올바른 연산자면 반복 종료
                } else {
                    System.out.println("잘못 입력하셨습니다. 사칙연산 기호(+, -, *, /) 중 하나를 입력하세요.");
                }
            }

            int result = 0; // 변수 선언

            switch (input3) {
                case "+":
                    result = calc.add(num1, num2);
                    break;
                case "-":
                    result = calc.sub(num1, num2);
                    break;
                case "*":
                    result = calc.mult(num1, num2);
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
                        System.out.print("두 번째 숫자를 재입력하세요 : ");
                        /*String input2 = sc.nextLine();      // 먼저 문자열 입력을 받고
                        num2 = Integer.parseInt(input2);    // 그 문자열을 정수로 변환해서 num2에 저장 */
                        num2 = Integer.parseInt(sc.nextLine());
                    }
                    result = calc.div(num1, num2);
                    break;
            }

            System.out.println("계산 결과 : " + result);
            System.out.println("지금까지 저장된 계산 결과들입니다 : " + calc.getResultList());
            System.out.print("계산을 계속하시겠습니까? (exit 입력 시 종료) : ");
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) { // 대소문자 구분없이 입력값 체크 - equalsIgnoreCase()
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        // 가장 먼저 저장된 데이터 삭제
        calc.removeFirstResult();
        System.out.println("가장 먼저 저장된 데이터 삭제 후 남은 계산 결과들입니다 : " + calc.getResultList());
    }
}
