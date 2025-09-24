package io.github.brookehgipson.passenger;

import io.github.brookehgipson.dmvinfo.Vehicle;
import io.github.brookehgipson.dmvinfo.VehicleTypes;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle(
            String vin,
            int manufactureYear,
            Makes make
    ) {
        super(
                vin,
                manufactureYear,
                VehicleTypes.PASSENGER
        );
        this.make = make;
    }

}
