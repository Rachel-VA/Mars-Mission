

//this is a child CLASS of the Pod
//using "extends" command keyword and the parent Class Pod to enherit methods from the paren CLASS Pod
public class Cafeteria extends Pod{
    //create properties and data type
    
    private String mealService;

    private String TypeOfFood1;
    private String TypeOfFood2;
    private String TypeOfFood3;
    private String TypeOfFood4;
    
    
    private String drink1;
    private String drink2;
    private String drink3;
    
    private String dinnerMainDish01;
    private int MainDish01Calories;

    private String dinnerSideDishA;
    private int sideDishACalories;

    private String dinnerMainDish02;
    private int MainDish02Calories;

    private String dinnerSideDishB;
    private int sideDishBCalories;
    //create constructor
      public Cafeteria(String dinnerMainDish01,int MainDish01Calories,String dinnerSideDishA,int sideDishACalories,String dinnerMainDish02,int MainDish02Calories,String dinnerSideDishB,int sideDishBCalories){
          this.dinnerMainDish01 = dinnerMainDish01;
          this.MainDish01Calories = MainDish01Calories;

          this.dinnerSideDishA = dinnerSideDishA;
          this.sideDishACalories = sideDishACalories;

          this.dinnerMainDish02 = dinnerMainDish02;
          this.MainDish02Calories = MainDish02Calories;

          this.dinnerSideDishB = dinnerSideDishB;
          this.sideDishBCalories = sideDishBCalories;
      }
    //create constructor for the cafeeteria Class
   public Cafeteria(String mealService,String TypeOfFood1,String TypeOfFood2,String TypeOfFood3,String TypeOfFood4,String drink1,String drink2,String drink3){
       
    this.mealService = mealService;
    
       this.TypeOfFood1 = TypeOfFood1;
       this.TypeOfFood2 = TypeOfFood2;
       this.TypeOfFood3 = TypeOfFood3;
       this.TypeOfFood4 = TypeOfFood4;


       this. drink1 = drink1;
       this.drink2 = drink2;
       this.drink3 = drink3;
    }
    
public String getmealService(){
    return mealService;
}
public void setmealService(String mealService){
    this.mealService = mealService;
}


public String getTypeOfFood1(){
    return TypeOfFood1;
}

public void setTypeOfFood1(String TypeOfFood1){
this.TypeOfFood1 = TypeOfFood1;
}


public String getTypeOfFood2(){
    return TypeOfFood2;
}
public void setTypeOfFood2(String TypeOfFood2){
    this.TypeOfFood2 = TypeOfFood2;
}


public String getTypeOfFood3(){
    return TypeOfFood3;
}
public void setTypeOfFood3(String TypeOfFood3){
    this.TypeOfFood3 = TypeOfFood3;
}


public String getTypeOfFood4(){
return TypeOfFood4;
}

public void setTypeOfFood4(String TypeOfFood4){
    this.TypeOfFood4 = TypeOfFood4;
}


public String getdrink1(){
    return drink1;
}
public void setdrink1(String drink1){
    this.drink1 = drink1;
}

public String getdrink2(){
    return drink2;
}

public void setdrink2(String drink2){
    this.drink2 = drink2;
}

public String getdrink3(){
    return drink3;
}

public void setdrink3(String drink3){
    this.drink3 = drink3;
}

//create methods to display the proerties
public void ShowCafeteriaMenu(){
    System.out.println("BreakFast serve from 6-9" + mealService);
    System.out.println("egg" + TypeOfFood1);
    System.out.println("cereal" + TypeOfFood2 );
    System.out.println("pancake " + TypeOfFood3);
    System.out.println("turkey bacon" + TypeOfFood4);
    System.out.println("coffee" + drink1);
    System.out.println("milk" + drink2);
    System.out.println("orange juice, water bottles" + drink3);

    //System.out.println("temperature:" + gettemperatureControl());

}

//create setter.getter methods to access the private properties
public String getdinnerMainDish01(){
    return dinnerMainDish01;
}
public void setdinnerMainDish01(String dinnerMainDish01){
    this.dinnerMainDish01 = dinnerMainDish01;
}


public int getMainDish01Calories(){
    return MainDish01Calories;
}
 public void setMainDish01Calories( int MainDish01Calories){
     this.MainDish01Calories = MainDish01Calories;
 }



 public String getdinnerMainDish02(){
    return dinnerMainDish02;
}
public void setdinnerMainDish02(String dinnerMainDish02){
    this.dinnerMainDish02 = dinnerMainDish02;
}

public int getMainDish02Calories(){
    return MainDish02Calories;
}

public void setMainDish02Calories(int MainDish02Calories){
this.MainDish01Calories = MainDish02Calories;
}




 public String getdinnerSideDishA(){
return dinnerSideDishA;
 }
 
public void setdinnerSideDishA(String dinnerSideDishA){
    this.dinnerSideDishA = dinnerSideDishA;
}



public int getsideDishACalories(){
    return sideDishACalories;
}

public void setsideDishACalories( int sideDishACalories){
    this.sideDishACalories = sideDishACalories;
}



public String getdinnerSideDishB(){
    return dinnerSideDishB;
}
public void setdinnerSideDishB(String dinnerSideDishB ){
    this.dinnerSideDishB = dinnerSideDishB;
}

public int getsideDishBCalories(){
    return sideDishBCalories;
}
public void setsideDishBCalories(int sideDishBCalories){
    this.sideDishBCalories = sideDishBCalories;
}



}//closed Class bracket
