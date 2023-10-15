//this is a child CLASS of the Pod

public class CommandCenter extends Pod {
    private boolean acessedAllow;
    private int numberOfCameraObservation;
    private String areaInObservation;
    private int numberOfDesks;
    private int numberOfComputers;


    //constructor for the Class
    public CommandCenter(int numberOfCameraObservation,String areaInObservation,int numberOfDesks,int numberOfComputers){
        this.numberOfCameraObservation = numberOfCameraObservation;
        this.areaInObservation = areaInObservation;
        this.numberOfDesks = numberOfDesks;
        this.numberOfComputers = numberOfComputers;
    }

    //getter/setter methods
    public boolean acessedAllow(){
        return acessedAllow;
    }
    public void acessedAllow(boolean acessedAllow){
        this.acessedAllow = acessedAllow;
    }

    public int getnumberOfCameraObservation(){
        return numberOfCameraObservation;
    }
    public void setnumberOfCameraObservation(int numberOfCameraObservation){
        this.numberOfCameraObservation = numberOfCameraObservation;
    }
     public String getareaInObservation(){
         return areaInObservation;
     }
     public void setareaInObservation(String areaInObservation){
         this.areaInObservation = areaInObservation;
     }




    public int getnumberOfDesks(){
        return numberOfDesks;
    }
    public void setnumberOfDesks(int numberOfDesks){
        this.numberOfDesks = numberOfDesks;
    }

    public int getnumberOfComputers(){
        return numberOfComputers;
    }
    public void setnumberOfComputers(int numberOfComputers){
        this.numberOfComputers = numberOfComputers;
    }

    // method to display
    public void commandCenterequipment(){
        System.out.println("Total cameras in used:" + numberOfCameraObservation);
        System.out.println(" Area under surveillance: " + areaInObservation);
        System.out.println("Number of desks: " + numberOfDesks);
        System.out.println("Number of computers:" + numberOfComputers);
    }

    
   

    
    
}
