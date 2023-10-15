
//this is a child CLASS of the Pod

public class Dormitory extends Pod{
    //create propertie and data type for the Class
    private int numberOfSleepingPods;
    private int numberOfSleepingPodAvailable;
    private int numberOfSleepingBlankets;


    //create constructor for the Class
    public Dormitory(int numberOfSleepingPods,int numberOfSleepingPodAvailable,int numberOfSleepingBlankets){
        super();

        //set propterties for the Class
        this.numberOfSleepingPods = numberOfSleepingPods;
        this.numberOfSleepingPodAvailable = numberOfSleepingPodAvailable;
        this.numberOfSleepingBlankets = numberOfSleepingBlankets;

    }
    //create getter/setter methods to get the private properties
    public int getnumberOfSleepingPods(){
        return numberOfSleepingPods;
    }
    public void setnumberOfSleepingPods(int numberOfSleepingPods){
        this.numberOfSleepingPods = numberOfSleepingPods;
    }

    public int getnumberOfSleepingPodAvailable(){
        return numberOfSleepingPodAvailable;
    }
    public void setnumberOfSleepingPodAvailable(int numberOfSleepingPodAvailable){
        this.numberOfSleepingPodAvailable = numberOfSleepingPodAvailable;
    }


    public int getnumberOfSleepingBlankets(){
        return numberOfSleepingBlankets;
    }
    public void setnumberOfSleepingBlankets(int numberOfSleepingBlankets){
        this.numberOfSleepingBlankets = numberOfSleepingBlankets;
    }

    //create methods to display the proerties
    public void displaySleepingPods(){
        System.out.println("Total sleeping pods:" + numberOfSleepingPods);
        System.out.println("Number of sleeping pods available:" + numberOfSleepingPodAvailable);
        System.out.println("Number of sleeping blankets:" + numberOfSleepingBlankets);
    }
}
