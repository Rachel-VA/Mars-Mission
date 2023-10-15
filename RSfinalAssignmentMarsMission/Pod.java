
/*this is the PARENT CLASS for all other pods which are child Classes.
we'll only need to create objects for the child Classes, NOT the parent Class

*/


public class Pod {
    //these private properties and methods are only acessible by the child Classes
    //create property data types for the Class Pod
    //private properties must use getter/setter methods to call
    private boolean turnWaterOn;
    private boolean turnLightOn;
    private boolean turnOxygenOn;
    private boolean doorUnlocked;

    private int temperatureControl;

    

//create public getter/setter methods to access private properties
public boolean turnWaterOn(){//getter method (waterOn method) by returning the exact name of property
    return turnWaterOn; //return the value
}

public void turnWaterOn(boolean turnWaterOn){  //setter method (waterOn method) by pass the property name in para
    this.turnWaterOn = turnWaterOn;
}

public boolean turnLightOn(){//getter method
    return turnLightOn;
}
public void turnLightOn(boolean turnLightOn){//setter method
    this.turnLightOn = turnLightOn;
}

public boolean turnOxygenOn(){
    return turnOxygenOn;
}
public void turnOxygenOn(boolean turnOxygenOn){
    this.turnOxygenOn = turnOxygenOn;
}



//setter/getter temperature control
public void settemperatureControl(int temperatureControl){
    this.temperatureControl = temperatureControl;
}
public int gettemperatureControl(){
    return temperatureControl;
}

//setter/getter method for doorUnclocked
public boolean doorUnlocked(){
    return doorUnlocked;
}
public void doorUnlocked(boolean doorUnlocked){
    this.doorUnlocked = doorUnlocked;
}







}//close Class Pod bracket
