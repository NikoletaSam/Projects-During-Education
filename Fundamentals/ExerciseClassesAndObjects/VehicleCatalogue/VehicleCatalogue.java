package ExerciseClassesAndObjects.VehicleCatalogue;

public class VehicleCatalogue {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colourOfVehicle;
    private int horsePower;

    public VehicleCatalogue(String typeOfVehicle, String modelOfVehicle, String colourOfVehicle, int horsePower){
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colourOfVehicle = colourOfVehicle;
        this.horsePower = horsePower;
    }

    public String getModelOfVehicle(){
        return modelOfVehicle;
    }

    public String getTypeOfVehicle(){
        return typeOfVehicle;
    }

    public int getHorsePower(){
        return horsePower;
    }

    @Override
    public String toString(){
        return "Model: " + this.modelOfVehicle + "\n" + "Color: " + this.colourOfVehicle + "\n" +
                "Horsepower: " + this.horsePower;
    }

}
