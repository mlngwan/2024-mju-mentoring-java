package com.mentoring.mju.v1.racing.domain;

import java.util.Random;

public class Car {
    Random random = new Random();
    int distance = 0;

    public void carShouldGo(){
        int randNum = random.nextInt(10);
        if(randNum >= 4){
            this.distance++;
        }
    }
}
