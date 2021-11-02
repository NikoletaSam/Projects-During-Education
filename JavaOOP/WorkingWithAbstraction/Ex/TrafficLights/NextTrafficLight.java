package WorkingWithAbstraction.Ex.TrafficLights;

public class NextTrafficLight {
    private TrafficLight light;
    private TrafficLight nextLight;

    public NextTrafficLight(TrafficLight light) {
        this.light = light;
    }

    public TrafficLight getNextLight() {
        if (this.light.equals(TrafficLight.RED)){
            return TrafficLight.GREEN;
        }
        if (this.light.equals(TrafficLight.GREEN)){
            return TrafficLight.YELLOW;
        }
        if (this.light.equals(TrafficLight.YELLOW)){
            return TrafficLight.RED;
        }
        return null;
    }
}
