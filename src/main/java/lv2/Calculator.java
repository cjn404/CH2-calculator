package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 연산 결과 저장할 컬렉션 필드 (private)
    private List<Integer> resultList;

    // 생성자에서 리스트 초기화
    public Calculator() {
        resultList = new ArrayList<>();
    }

    // 연산 메서드 - 결과를 리스트에 저장
    public int add(int a, int b) {
        int result = a + b;
        resultList.add(result);
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        resultList.add(result);
        return result;
    }

    public int mult(int a, int b) {
        int result = a * b;
        resultList.add(result);
        return result;
    }

    public int div(int a, int b) {
        int result = a / b;
        resultList.add(result);
        return result;
    }

    // 값을 읽어오는 게터 - resultList 가져오기
    public List<Integer> getResultList() {
        return resultList;
    }

    // 값을 수정하는 세터
    public void setResultList(List<Integer> newResultList) {
        this.resultList = newResultList;
    }
}
