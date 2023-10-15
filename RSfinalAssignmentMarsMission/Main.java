import java.util.ArrayList;


//Rachael Savage's code. May 9, 2022
/* Java structure: 
 * 1. create a file with a name
 * 2.create a Main Class and a main method
 * 3. additiona Clasess, must make the Class name exact to the file name
 * 4.inside each class,  create methods properties/data type
 * 5. inside the Class method, create statements and variables
 */
//Create the Main Class and main method here to start the program




public class Main{ //this is the Main Class

    //declare colors and terminate color commands here to use inside the main method
    public static final String ANSI_RESET = "\u001B[0m"; //to terminate a color
    
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; 
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; 

public static void main(String[] args){//this is the main method to run the program

//call all sub methods in order of desire display
title();
PatrictAndADayOnMars();
MarsOverView();
BaseDirectory();




///%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%   BEGIN COMMAND CENTER     %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
System.out.println(GREEN_BOLD_BRIGHT + "\t\t\t\t\tMONDAY\n" + ANSI_RESET);
System.out.println("Patrict is excited to begin his exploration. He is heading north to go to the base command center.\nHe needs to check whether the command center is allow accessed.");
System.out.println(GREEN_BOLD_BRIGHT + "\nATTENTION: Please check the monitor next to the door to make sure oxygen level at least 19.5%");
System.out.println("When the lights are on and oxygen level at least 19.5%, the door is unlcoked and access is allowed." + ANSI_RESET);
//create a new object for the Commandcenter Class
   CommandCenter commandSystem = new CommandCenter(51,"Cafeteria, storage,lab, outside",32, 50);
   commandSystem.settemperatureControl(75);
   

   /*************************-----NOTE----turnLightOn and turnWaterOn methods are created in the parent CLASS Pod */
//set the initial inheritant values for light and water here
commandSystem.turnLightOn(true);
commandSystem.turnOxygenOn(true);
commandSystem.acessedAllow(true);
commandSystem.doorUnlocked(true);


if(commandSystem.turnLightOn()== true){
    System.out.println("Light status:\tON");
}
else{
    System.out.println("Light status:\tOFF");
}

if(commandSystem.turnOxygenOn()== true){
    System.out.println("Oxygen level:\tSAFE");
}
else{
    System.out.println("Oxygen level:\tUNSAFE");
}

if(commandSystem.doorUnlocked()== true){
    System.out.println("Door:\tUNLOCKED");
}
else{
    System.out.println("Door:\tLOCKED");
}

if(commandSystem.doorUnlocked()== true){
    System.out.println("Acess:\tGRANTED");
}
else{
    System.out.println("Acess:\tDENIED");
}


if(commandSystem.turnLightOn() && commandSystem.turnOxygenOn() && commandSystem.doorUnlocked() && commandSystem.acessedAllow()==true){
    System.out.println("\n\nCOMMAND CENTER MONITOR: \nLights:\tON.\nDoor:\tUNLOCKED\nAccess: \tAllOWED\n");
    System.out.println(GREEN_BOLD_BRIGHT + "\n\t\tWELCOME TO THE COMMAND CENTER\n\n" + ANSI_RESET);
    System.out.println("Patrict enters the room. It's a large open area with lots of big and small monitors display on the walls.");
    System.out.println("Patrict feels amazed at the sight of the area. He surprised that the room temperature.");
    System.out.println("It's feel just like on Earth. He turns his eyes to look for the room thermometer. He saw a small monitor on the wall. ");
    System.out.println("He walks toward the direction and he read:");
    System.out.println(YELLOW_BOLD_BRIGHT + "temperature in command center is:" + commandSystem.gettemperatureControl());
    System.out.println("\n" + ANSI_RESET);
    System.out.println("Patrict is slowing scan his eyes all of the room. He open his bag and take out paper and pencile to take note of the area.");
   commandSystem.commandCenterequipment();
    
   System.out.println("It's 5pm. Patrict is finishing his writing and his day. As he leaving the command center are, he turns off lights and the door.");
System.out.println(GREEN_BOLD_BRIGHT + "End of the command center exploration\n\n" + ANSI_RESET);
}
else{
    System.out.println("Acessed denied. Please chect with the base commander.");
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%    END COMMAND CENTER    %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


/***@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  BEGIN LABORATORY  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/
System.out.println(YELLOW_BOLD_BRIGHT+"\t\t\t\t\tTUESDAY\n\n" + ANSI_RESET);
System.out.println("As Patrict's original plan, he will visit the laboratory today.");
System.out.println("Patrict is eager to see the lab because this is the place where Martians citizens grow vegetable for food.");
System.out.println("He is checking the navigation sign. Then, he's heading west. He arrived the lab, but noone here. He needs to check whether he can get in.");
System.out.println("Patrict is looking at the sign next to the door. It says:");
System.out.println(YELLOW_BOLD_BRIGHT+ "\n\tATTENTION: Please check monitor. Do not enter if the room status display OXYGEN lower 19.5% " + ANSI_RESET);
System.out.println("Patrict then checking the monitor.");


//create a new object for the Laboratory Class
 Laboratory laboratory = new Laboratory("letture",50);
 laboratory.settemperatureControl(65);

/*************************-----NOTE----turnLightOn and turnWaterOn methods are created in the parent CLASS Pod */
 //initiate the inherant values
 laboratory.turnLightOn(true);
 laboratory.turnOxygenOn(true);
 laboratory.turnWaterOn(true);
 laboratory.doorUnlocked(true);

if(laboratory.turnLightOn()== true){
    System.out.println("Light status:\tON");
}
else{
    System.out.println("Light status:\tOFF"); 
}

if(laboratory.turnOxygenOn()== true){
    System.out.println("Oxygen level:\t19.97%. SAFE LEVEL");
}
else{
    System.out.println("Oxygen level:\tBELOW 19.5%. UNSAFE LEVEL");
}

if(laboratory.doorUnlocked()== true){
    System.out.println("Door:\tUNLOCKED");
}
else{
    System.out.println("Door:\tLOCKED");
}

if(laboratory.turnWaterOn()== true){
    System.out.println("Water system:\tON");
}
else{
    System.out.println("water system:\tOFF");
}


if(laboratory.turnLightOn() && laboratory.turnOxygenOn() && laboratory.doorUnlocked() && laboratory.turnWaterOn()){
    System.out.println(YELLOW_BOLD_BRIGHT + "\n\n\t\t\tWELCOME TO THE LABORATORY" + ANSI_RESET);
    System.out.println("Lights are on. Oxygen level is safe to enter. Door is unlcoked and the water system is On");
    System.out.println("Since it says the oxygen level in the room is safe, Patrict enter the room.");
    System.out.println("It's a large open area similar to the command center. However, the room has many glass cases \nwhich contain plants and vegetable inside.");
    System.out.println("Each case has a display monitor. Patrict feels much colder in this room, so he wants to check the temperature.");
    System.out.println("He saw a small monitor on the wall. He walk toward it and read:");
    System.out.println(YELLOW_BOLD_BRIGHT + "Current temperature is:"+laboratory.gettemperatureControl());
    System.out.println("\n" + ANSI_RESET);
    System.out.println("Patrict begins to take notes as he observe each plant case and read its display monitor.");
    System.out.println("Since this is the place where providing the main food source for the entire base, there are a lot of plants and vegetables.");
    System.out.println("Patrict counts:");
    laboratory.currentGrowingPlantsInLab();
    System.out.println("\nPatrict had a very busy day as he got a lot of writing done. It's nearly 5pm. He's packing to get ready to leave the room.");
    System.out.println(YELLOW_BOLD_BRIGHT + "End of the lab exploration day" + ANSI_RESET);

}
else{
    System.out.println("The room is not safe to enter this time. Plase come back when the lights are on and the oxygen level is safe.");
}
/***@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    END LABORATORY  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ */


///############################################# BEGIN  CAFETERIA  ###############################################################
System.out.println(GREEN_BOLD_BRIGHT+ "\n\t\t\t\t\tWEDNESDAY\n" + ANSI_RESET);
System.out.println("Patrict is heading east to the base cafeteria. He's excited to learn about the cafeteria structure on Mars.");
System.out.println("He's also excited about the experience of having a meal on Mars. He thinks that this will be the most amazing experience in his life.");
System.out.println("He arrived at the cefeteria. But noone there. He's not sure if it's open or not. He looks at the sign next to the entry. It says:");
System.out.println(GREEN_BOLD_BRIGHT + "ATTENTION: this is a self-service cafeteria. Please check the monitor for safety before enter." + ANSI_RESET);
System.out.println("Patrict is checking the monitor, it displays:");


//create a new object (cafeteria) for the CLASS Cafeteria. if there is constructors of the Cafeteria, pass them inside the parentheses
 //Cafeteria cafeteria = new Cafeteria("\tdinner from 5-7 pm\n","Grilled salmon with lemon sauce","","","","","","");
   Cafeteria cafeteria = new Cafeteria("Grilled salmon with lemon sauce",922,"Pumkin soup",641,"Grilled beef with lemon grass",873,"Easy skillet Kale with onion and olive oil",452);
   Cafeteria Breakfast = new Cafeteria("","","","","","","","");
 /*************************-----NOTE----turnLightOn and turnWaterOn methods are created in the parent CLASS Pod */
 //set the initial inheritant values for light and water here
//set Light & water On by calling the caferia object and pass boolean value inside for para
cafeteria.turnLightOn(true);
cafeteria.turnWaterOn(true);
cafeteria.turnOxygenOn(true);
cafeteria.doorUnlocked(true);

cafeteria.settemperatureControl(74); //initial the inherant value
cafeteria.setMainDish01Calories(865);
cafeteria.setMainDish02Calories(987);
cafeteria.setsideDishACalories(674);
cafeteria.setsideDishBCalories(462);
//cafeteria.setmealService("Lunch serve at 11-1");

//create Arraylist and a new lunchFood object to contain list of items. Must import  java.util.ArrayList on top
ArrayList<String> lunchFood = new ArrayList<String>();
lunchFood.add("Protein Salad");
lunchFood.add("Cheeseburger");
lunchFood.add("Chicken Sandwich");
lunchFood.add("Vegetable Sandwich");
lunchFood.add("Vgetable Eggrolls");
lunchFood.add("Chicken Fried");

//create a arrayList and a new object drink to contain and load drink
ArrayList<String> drink = new ArrayList<String>();
drink.add("Kale smoothie");
drink.add("Strawberry and banana smoothie");
drink.add("Ice green tea");
drink.add("Coffe and milk");
drink.add("water bottles");


//Create an arrayList with an object name. Call the object name in the main method/main Class and add in items
  //ArrayList is a resizable array use to store reference data type. items can be added/remove after compiled
  

//using if statement to print out water and light on for Cafeteria Class

if(cafeteria.turnLightOn() == true){
    System.out.println("Light status:\tON");
}
else{
    System.out.println("Light status:\tOFF");
}


if(cafeteria.turnOxygenOn()== true){
    System.out.println("Oxygen level:\tSAFE");
}
else{
    System.out.println("Oxygen level:\tUNSAFE");
}
if(cafeteria.doorUnlocked()== true){
    System.out.println("Door:\tUNLOCKED");
}
else{
    System.out.println("Door:\tLOCKED");
}


if(cafeteria.turnWaterOn() == true){
    System.out.println("Water system:\tON");
}
else{
    System.out.println("Water system:\tOFF");
}


//if both light and water are on, cafeteria open
if(cafeteria.turnLightOn() && cafeteria.turnWaterOn() && cafeteria.turnOxygenOn() && cafeteria.doorUnlocked()){
    System.out.println(GREEN_BOLD_BRIGHT + "\n\t\tCAFETERIA IS OPEN" + ANSI_RESET);
    System.out.println("Patrict entered the room. He's looking around. No one here. He notices a thermometer on the wall.");
    System.out.println("He wants to know what is the temperature in the room. The thermometer displays:");
    System.out.println( GREEN_BOLD_BRIGHT + "Cafeteria temperature is:" + cafeteria.gettemperatureControl());
    System.out.println("\n" + ANSI_RESET);
    System.out.println("Patrict feels the temperature is just about right, he thought. Patrict feels hungry. He wants to have the special breakfast.");
    System.out.println("Perhaps, he will never have another chance to eat a meal on Mars. He wants to take his time to enjoy the food.");
    System.out.println("He look at the menu:");
    System.out.println(BLUE_BOLD_BRIGHT + "\n\t\tWEDNESDAY BREAKFAST MENU\n" + ANSI_RESET);
    Breakfast.ShowCafeteriaMenu();
    
    //cafeteria.ShowCafeteriaMenu();
    
    System.out.println("Patrict wants to order some cereal, an egg, a cup of cofee, and a water bottle.");
    System.out.println("Patrict finished his breakfast and begin to take notes.");
    System.out.println("\nIt's 11:30 am. Patrict feels hungry and he want to order lunch. He looks at the menu, it shows:");
   
    //load and get the lunchFood arraylist
    System.out.println(BLUE_BOLD_BRIGHT + "\nLUNCH MENU\n" + ANSI_RESET);
    for(int i = 0; i < lunchFood.size(); i++){
        System.out.println(lunchFood.get(i));
    }
    System.out.println("Patrict also wants to get some drink. He looks at the drink menu. It shows:");
    System.out.println(BLUE_BOLD_BRIGHT +"\nTYPE OF DRINK\n" +ANSI_RESET);
    System.out.println(drink);//this way print out items in a array list way, it doesn't start new line
    
    // dinner meals are using setter/getter methods
    System.out.println(BLUE_BOLD_BRIGHT + "\nDINNER MENU\n" +ANSI_RESET);
    cafeteria.setdinnerMainDish01("");
    System.out.println("Grilled salmon with lemon sauce" + cafeteria.getdinnerMainDish01());
    System.out.println("Calories" + cafeteria.getMainDish01Calories());

    cafeteria.setdinnerMainDish02("");
    System.out.println("\nGrilled beef with lemon grass" + cafeteria.getdinnerMainDish02());
    System.out.println("Calories:" + cafeteria.getMainDish02Calories());

    cafeteria.setdinnerSideDishA("");
    System.out.println("\nPubmkin soup" + cafeteria.getdinnerSideDishA());
    System.out.println("Calories:" +  cafeteria.getsideDishACalories());

    cafeteria.setdinnerSideDishB("");
    System.out.println("\nEasy skillet Kale with onion and olive oil" + cafeteria.getdinnerSideDishB());
    System.out.println("Calories:" + cafeteria.getsideDishBCalories());
    System.out.println("\nPatrict is getting ready to leave the cafeteria.");
    System.out.println(BLUE_BOLD_BRIGHT + "\n\n End of the day at cafeteria" + ANSI_RESET);
    
}

if(cafeteria.turnLightOn() == false ||cafeteria.turnWaterOn()== false ||cafeteria.turnOxygenOn()==false){
    System.out.println(YELLOW_BOLD_BRIGHT+ "CAFETERIA IS CLOSED" + ANSI_RESET);
}

//###############################################     END CAFETERIA   #########################################################

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  BEGIN  DORMITORY !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


System.out.println(CYAN_BOLD_BRIGHT + "\n\n\t\t\n\n\nTHURSDAY\n" + ANSI_RESET);
System.out.println("Though Patrict has slept in the dormitory in the last 3 nights, he hasn't look around the entire area.");
System.out.println("He will begin his exploration at the Dormitory today. He woke up and he check to see if the area is ready to tour.");


// create a new object for Dormitory Class
   Dormitory sleepingPod = new Dormitory(50,12,105);
   //set initial value for the objects
   sleepingPod.turnLightOn(true);
   sleepingPod.turnWaterOn(true);
   sleepingPod.turnOxygenOn(true);
   sleepingPod.doorUnlocked(true);
   sleepingPod.settemperatureControl(68);


   if(sleepingPod.turnLightOn()== true){
       System.out.println("Light status:\tON");
   }
   else{
System.out.println("Light status:\tOFF");
   }

   if(sleepingPod.turnOxygenOn()== true){
       System.out.println("Oxygen still on and it's safe to stay");
   }
   else{
       System.out.println("Oxygen level is unsafe. Please leave the room");
   }


   if(sleepingPod.turnWaterOn()== true){
       System.out.println("Water system is ON");
   }
   else{
       System.out.println("Water system is OFF");
   }

   if(sleepingPod.doorUnlocked()== true){
       System.out.println("Door still open");
   }
   else{
       System.out.println("Door is locked");
   }
   if(sleepingPod.turnLightOn() && sleepingPod.turnWaterOn() &&  sleepingPod.turnOxygenOn()  && sleepingPod.doorUnlocked()==true){
    System.out.println(CYAN_BOLD_BRIGHT + "\n\n\t\tWELCOME TO DORMITORY" + ANSI_RESET);
    System.out.println("Patrict sees lights, oxygen, water, and doors are opened. He begins to tour the Dormitory.");
    System.out.println("He noticed that:");  
    sleepingPod.displaySleepingPods();
    System.out.println("");
    System.out.println(CYAN_BOLD_BRIGHT + "\nEnd of the dormitory day\n\n" + ANSI_RESET);
   }
   else{
       System.out.println(RED_BOLD_BRIGHT+ "Dormitory is temporary closed due to unsafe oxygen level. Please check back in five minutes." + ANSI_RESET);
   }

   
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   END DORMITORY  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!/

//-&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&   BEGIN  STORAGE    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
System.out.println(PURPLE_BOLD_BRIGHT + "\n\t\t\t\tFRIDAY" + ANSI_RESET);
System.out.println("Patrict is begin his last day and is walking toward southwest to the storage.");
System.out.println("He arrived at the storage and noticed that sign:");
System.out.println(PURPLE_BOLD_BRIGHT + "ATENTION: Please check the monitor for safety before enter the storage." + ANSI_RESET);
System.out.println("Patrict is reading the monitor. Its status is:");

//create a new object for Storage Class
Storage storage = new Storage(100,2, 150, 3540, 75410);
//initiate the inherant values
storage.turnLightOn(true);
storage.turnOxygenOn(true);
storage.doorUnlocked(true);
storage.settemperatureControl(65);

/******---NOTE----turnLightOn and turnWaterOn methods are created in the parent CLASS Pod */


if(storage.turnLightOn() && storage.turnOxygenOn() && storage.doorUnlocked()== true){
    System.out.println("\nLight status: ON\tOxygen level is safe\tDoor is unlocked");
    System.out.println("Access storage is allowed");
    System.out.println(PURPLE_BOLD_BRIGHT + "\n\nWELCOME TO THE BASE STORAGE" + ANSI_RESET);
    System.out.println("Patrict entered the storage. It's a large room with shelves that hold containers with labels.");
    System.out.println("Patrict begins to take notes of the items:");
    storage.SuppiesRemain();
    System.out.println("\nPatrict is finishing his day at the storage. He is getting ready to leave the room.");
    System.out.println(PURPLE_BOLD_BRIGHT + "\n\nEnd of the day" + ANSI_RESET);
}
else{
    System.out.println("Access storage is denied. Please check back later");
}

//-&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& END   BEGIN  STORAGE      &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


}//CLOSE THE MAIN METHOD BRACKET


//00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000


//create a title method to display the program's title. Then call its name in the main method (we can also simply print out the title)
//this is a sub method outside of the main method. we can create as many as we need and call their names inside the main method for it to run
public static void title(){
    System.out.println(RED_BOLD_BRIGHT+ "\n\n\n\n*************************************************  WELCOME TO RACHAEL'S MARS BASE   **********************************************\n\n" + ANSI_RESET);
}


//a sub method to display base navigation. must call its name in the mean method. Java runs in order from top to bottom
public static void BaseDirectory(){
System.out.println(YELLOW_BOLD_BRIGHT+ "\n\n\t\tBASE NAVIGATIONS\n\n" + ANSI_RESET);
System.out.println("The base composed of five connected pods \n");
System.out.println(BLUE_BOLD_BRIGHT + "1.COMMAND CENTER: North\n2.LABORATORY: West \n3.CAFETERIA: East\n4.DORMITORY: South\n5.STORAGE: Southwest\n\n"+ ANSI_RESET);
//System.out.println("");

}

//sub method
public static void MarsOverView(){
    System.out.println(PURPLE_BOLD_BRIGHT + "\t\tMARS OVERVIEW\n\n" + ANSI_RESET);
    System.out.println("Mars is the fourth planet from the Sun and the second smallest planet. It's also known as the Red Planet.");
    System.out.println("It's similar to Eart in many ways, inlcuding clouds, winds, approximate 24h day. Seasonal weather patterns\n are similar to Earth with polar ice caps, volcanoes, and canyons etc.");
    System.out.println("Mars is a terrestrial planet with a thin atmosphere. It can be easily seen from Earth as it has a reddish color.");
    System.out.println("Mars is less than 35 million miles from Earth. Its equatorial redius is 2,110 miles. Daytime surface temperature\nabout -10F.Summer can get up to 62F");
    System.out.println("Mars has lowed gravity than Earth. However, it has dengerous Radiation to living organisms.");
    System.out.println( RED_BOLD_BRIGHT+ "\n\n\tWARNING: Exposure to radiation causes grave radiation illnesses. DO NOT EXIT THE BASE WITHOUT PERMISSION" + ANSI_RESET);

    
}

//sub method
public static void PatrictAndADayOnMars(){
   
    System.out.println(CYAN_BOLD_BRIGHT + "\t\t PATRICT AND THE JOURNEY ON MARS BASE \n" + ANSI_RESET);
    System.out.println( YELLOW_BOLD_BRIGHT + "Patrict is a space journalist and an international TV host. He has a passion to learn and explore space science.");
    System.out.println("Patrict is invited to visit Rachael base on Mars. He will have five day to experience the life on Mars and write a journal about it.");
    System.out.println("Today is Monday and it's the first day he arrived on the base. He'll begin the exploration at the Command Center.");
    System.out.println("Tuesday, he will visit the laboratory. Wednesday, he will explore cafeteria. Thursday, he will tour dormitory.");
    System.out.println("He will spend his last day at the base storage." + ANSI_RESET);
    
}


}//CLOSE THE MAIN CLASS BRACKET


