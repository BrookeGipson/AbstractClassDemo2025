package io.github.brookehgipson;

import io.github.brookehgipson.dmvinfo.passenger.ford.FordModel;
import io.github.brookehgipson.dmvinfo.passenger.ford.Models;

public class Main {
    public static void main(String[] args) {
        FordModel vehicle = new FordModel(
                "1FTFW1E50JFA12345",
                2018,
                Models.F150
        );
        System.out.println(vehicle);
    }
}