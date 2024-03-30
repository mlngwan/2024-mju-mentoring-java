package com.mentoring.mju.v1.racing.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class InputView {

    // Todo : 입력 받기
    private static final Scanner input = new Scanner(System.in);

    private List<String> getCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String CarName = input.nextLine();
        return Arrays.asList(CarName.split(","));
    }

    private int getTryNumber(){
        System.out.println("시도할 횟수는 몇회인가요?");
        return input.nextInt();
    }
}
