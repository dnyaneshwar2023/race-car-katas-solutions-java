package tddmicroexercises.tirepressuremonitoringsystem;

public class SafetyRange {
    private final double lowerBound;
    private final double upperBound;

    public SafetyRange(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isOutOfBounds(double value) {
        return value < lowerBound || value > upperBound;
    }
}
