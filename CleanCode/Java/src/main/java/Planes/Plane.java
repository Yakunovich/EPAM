package Planes;

import java.util.Objects;

abstract public class Plane {
   
    String planeModel;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;
     
    public Plane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.planeModel = planeModel;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    } 

    public String getPlaneModel() {
        return modelOfPlane;
    }

    public int getMaxPlaneSpeed() {
        return maxSpeed;
    }

    public int GetMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeModel='" + planeModel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object plane) {
        if (this == plane) return true;
        if (!(plane instanceof Plane)) return false;
        Plane currentPlane = (Plane) plane;
        return maxSpeed == currentPlane.maxSpeed &&
                maxFlightDistance == currentPlane.maxFlightDistance &&
                maxLoadCapacity == currentPlane.maxLoadCapacity &&
                Objects.equals(planeModel, currentPlane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
