package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
    private final SafetyRange safetyRange;
    private final Sensor sensor;
    private boolean alarmOn;

    public Alarm(Sensor sensor, boolean alarmOn, SafetyRange safetyRange) {
        this.safetyRange = safetyRange;
        this.sensor = sensor;
        this.alarmOn = alarmOn;
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (safetyRange.isOutOfBounds(psiPressureValue)) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
