package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {
    private Sensor sensor;
    private Alarm alarm;

    private static final double NORMAL_PRESSURE = 19.1;
    private static final double LOW_PRESSURE = 15.6;

    @Before
    public void initializeSensorAndAlarm(){
        this.sensor = Mockito.mock(Sensor.class);
        this.alarm = new Alarm(sensor);
    }

    @Test
    public void testCheckAlarmIsOffWhenNormalPressure(){
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(NORMAL_PRESSURE);
        alarm.check();

        Assert.assertFalse(alarm.getAlarmOn());
    }

    @Test
    public void testCheckAlarmIsOnWhenHighOrLowPressure(){
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE);
        alarm.check();

        Assert.assertTrue(alarm.getAlarmOn());
    }
}
