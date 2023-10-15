
//this is a child CLASS of the Pod
public class Laboratory extends Pod{
    //create properties/data type

    private String plantType;
    private int numberOfPlants;


    //create constructor for the lab Class
    public Laboratory(String plantType,int numberOfPlants){
        this.plantType = plantType;
        this.numberOfPlants = numberOfPlants;
    }

    //getter and setter methods
    public String getplantType(){
        return plantType;
    }
    public void setplantType(String plantType){
        this.plantType = plantType;
    }


    public int getnumberOfPlants(){
        return numberOfPlants;
    }
    public void setnumberOfPlants(int numberOfPlants){
        this.numberOfPlants = numberOfPlants;
    }

    //create method to display properties
    public void currentGrowingPlantsInLab(){
        System.out.println("Type of plant:" + plantType);
        System.out.println("Number of growing plants:" + numberOfPlants);

    }
    
}
