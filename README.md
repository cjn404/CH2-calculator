# Ch2 java 계산기 과제

## 목표
자바 문법의 실습과 객체 지향 개념의 적용

<br>

## 개발 대상
자바 문법 단계별로 Lv1 부터 LV2 까지 각각의 계산기 구현

<br>

## 개발 프로세스
- **LV1** : 클래스 없이 자바의 기본 문법만을 사용하여 계산기 구현
- **LV2** : 객체 지향 개념 적용하여 클래스 정의, 연산 수행 메소드 계산기 구현

<br>

## 디렉토리 구조
```
──src
    └── main
        └── java
            ├── lv1
            │   └── Main.java
            └── lv2
                ├── Calculator.java
                └── Main.java
```

<br>

## 주요 기능
- **Lv1** 
  - 입력
    - 정수 : 2개의 양의 정수(0 포함)만 입력 가능하며 입력 값 전후의 공백은 자동 제거. 아닌 값 입력 시 해당 단계에서부터 반복
    - 사칙연산 기호 : 4개의 사칙연산 기호(+, -, *, /) 중 한 가지만 입력 가능하며 입력 값 전후의 공백은 자동 제거. 아닌 값 입력 시 해당 단계에서부터 반복
    - exit : 대소문자 구분없이 처리
  - exit 입력 전까지 계산 기능 및 결과 반환 구현
  - 예외 처리 : 나눗셈 연산에 한하여 분모와 분자 값에 예외 조건 2가지(0, 분모>분자) 상정
  - 주요 키워드 : Scanner, while, try-catch, if, switch, tirm(). equalsIgnoreCase()
 
- **Lv2**  
  - Main 클래스는 Lv1 기반
  - 계산된 결과 값들을 기록 및 저장하는 컬렉션 타입 필드를 가진  Calculator 클래스 구현
  - Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못 하도록 캡슐화
  - 클래스에 FIFO 기능 구현
  - 주요 키워드 : private, List, getter, setter, FIFO

<br>

## 개발 환경
java gradle corretto 17

<br>

## 트러블 슈팅 
1. 정수와 문자열 각각 구분하여 Scanner 하였더니 오류 발생. 이에 String 으로 통일
2. String 통일로 인해 숫자 입력시 오류 발생. 이에 Integer.parseInt() 로 String 을 int 변환
3. 단, 숫자 입력 시 Integer.parseInt() 는 숫자가 아닌 값을 넣으면 NumberFormatException 이 발생. 이에 try-catch 문으로 처리

<br>

## 개선 사항
FIFO니까 List 말고 Queue로 구현해볼 것
