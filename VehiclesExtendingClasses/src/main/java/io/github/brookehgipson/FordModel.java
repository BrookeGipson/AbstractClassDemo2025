package io.github.brookehgipson;

import io.github.brookehgipson.passenger.Ford.Models;
import io.github.brookehgipson.dmvinfo.passenger.Makes;
import io.github.brookehgipson.dmvinfo.passenger.PassengerVehicle;

public class FordModel extends PassengerVehicle {

    private final Models model;

    public FordModel(
            String vin,
            int manufactureYear,
            Models model
    ) {
        super(
                vin,
                manufactureYear,
                Makes.FORD
        );
        this.model = model;
    }
    public Models getModel() {
        return model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.appendtoString()
    }

    @Override
    protected int toString(int tabLevel, StringBuilder sb) {
        int newTabLevel = super.toString(tabLevel, sb);
        String tabs = "\t".repeat(newTabLevel);
        sb.append(tabs);
        sb.append("Model: ").append(model).append("\n");
        return newTabLevel;
    }
}

