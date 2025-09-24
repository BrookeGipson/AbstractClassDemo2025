package io.github.brookehgipson.dmvinfo;

public class Vehicle {
    private String vin;
    private int manufactureYear;
    private final VehicleTypes vehicletype;

    public Vehicle(String vin, int manufactureYear, VehicleTypes VehicleType) {
        this.vin = vin;
        this.manufactureYear = manufactureYear;
        this.vehicletype = VehicleType;
    }

    public String getVin() {
        return vin;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Information & Details");
        sb.append("\t").append("VIN: ").append(vin).append("\n");
        sb.append("\t").append("Manufacture Year: ").append(manufactureYear).append("\n");
        sb.append("\t").append("Vehicle Type: ").append(vehicletype).append("\n");
        return sb.toString();

    }
}