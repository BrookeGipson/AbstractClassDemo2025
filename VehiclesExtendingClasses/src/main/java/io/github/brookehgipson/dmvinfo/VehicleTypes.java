package io.github.brookehgipson.dmvinfo;

public enum VehicleTypes {
    PASSENGER("Passenger"),
    MOTERCYCLE("Motorcycle"),
    BOAT("Boat"),
    TRAILER("Trailer");

    private final String displayName;
     VehicleTypes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String toString(int tabLevel) {
        String tabs = "\t".repeat(tabLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs)
                .append("Vehicle Category: ")
                .append(displayName)
                .append("\n");
        return sb.toString();

    }

    @Override
    public String toString() {
        return displayName;
    }



}
