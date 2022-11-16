package LoopWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력시 종료");
        while(true) {   // 무한반복, 0 또는 1 사용 x 반드시 불린타입
            System.out.print(">> ");
            String text = scanner.nextLine();   // string 변수에 스캐너로 입력받음
            if(text.equals("exit")) {   // string 타입 변수 text가 exit랑 같을 때
                break;  // while 문을 탈출
            }
        }
        scanner.close();
    }
}
