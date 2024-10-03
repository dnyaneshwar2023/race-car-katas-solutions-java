package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlarmTest {
    Sensor sensor = Mockito.mock(Sensor.class);

    @Test
    public void shouldBeOn() {
        Alarm alarm = new Alarm(sensor, false, new SafetyRange(17, 21));

        when(sensor.popNextPressurePsiValue()).thenReturn(10.0);
        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void shouldBeOff() {
        Alarm alarm = new Alarm(sensor, false, new SafetyRange(17, 21));

        when(sensor.popNextPressurePsiValue()).thenReturn(18.0);
        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }
}
