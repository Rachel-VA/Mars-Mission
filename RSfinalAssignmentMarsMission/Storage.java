
//this is a child CLASS of the Pod
public class Storage extends Pod{
    //create properties and data type
    private int numberOfSafetySuits;
    private int numberOfPortableOxygenTanks;
    private int numberOfCornInPounds;
    private int numberOfCoffeeInBoxes;
    private int numberOfWaterBottles;

//create constructor for the Class to load properties
public Storage(int numberOfSafetySuits,int numberOfPortableOxygenTanks,int numberOfCornInPounds,int numberOfCoffeeInBoxes,int numberOfWaterBottles){
    this.numberOfSafetySuits = numberOfSafetySuits;
    this.numberOfPortableOxygenTanks = numberOfPortableOxygenTanks;
    this.numberOfCornInPounds = numberOfCornInPounds;
    this.numberOfWaterBottles = numberOfWaterBottles;
    this.numberOfCoffeeInBoxes = numberOfCoffeeInBoxes;

}


//getter/setter methods
public int getnumberOfSafetySuits(){
    return numberOfSafetySuits;
}
public void setnumberOfSafetySuits(int numberOfSafetySuits){
    this.numberOfSafetySuits = numberOfSafetySuits;
}

public int getnumberOfPortableOxygenTanks(){
    return numberOfPortableOxygenTanks;
}
public void setnumberOfPortableOxygenTanks(int numberOfPortableOxygenTanks){
    this.numberOfPortableOxygenTanks = numberOfPortableOxygenTanks;
}

public int getnumberOfCornInPounds(){
    return numberOfCornInPounds;
}
public void setnumberOfCornInPounds(int numberOfCornInPounds){
    this.numberOfCornInPounds = numberOfCornInPounds;
}


public int getnumberOfCoffeeInBoxes(){
    return numberOfCoffeeInBoxes;
}
public void setnumberOfCoffeeInBoxes(int numberOfCoffeeInBoxes){
    this.numberOfCoffeeInBoxes = numberOfCoffeeInBoxes;
}

public int  getnumberOfWaterBottles(){
    return numberOfWaterBottles;
}
public void setnumberOfWaterBottles(int numberOfWaterBottles){
    this.numberOfWaterBottles = numberOfWaterBottles;
}


//method to display properties
public void SuppiesRemain(){
    System.out.println("Number of safety suits: " + numberOfSafetySuits);
    System.out.println("Number of portable oxygen tanks: " +  numberOfPortableOxygenTanks);
    System.out.println("Number of corn in stock : " + numberOfCornInPounds + "\tpounds");
    System.out.println("Number of water bottles in stock: " + numberOfCoffeeInBoxes + "\tboxes");
    System.out.println("Number of coffee in stock: " + numberOfCoffeeInBoxes + "\tlarge bottle");
}
    
}//close the public Class Storage
