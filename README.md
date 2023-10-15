# Mars-Mission


This app simulate a mar mission with various activities related to space pods, including laboratories, storage, and cafeteria functionalities. The application utilizes Object-Oriented Programming principles and provides a colorful terminal output experience.

## Classes

### **Pod** (Parent Class)
- Manages core functionalities for every pod.
- Properties include water, light, oxygen controls, door status, and temperature control.

### **Laboratory** (Child of Pod)
- Helps in managing plants in a laboratory environment.
- Properties include the type of plant and the number of plants.

### **Storage** (Child of Pod)
- Helps in managing resources and goods stored.
- Properties include counts of safety suits, oxygen tanks, corn, coffee, and water bottles.

### **Cafeteria** (Child of Pod)
- Used to manage the food inventory and serving.

## Key Concepts Used

- **Classes and Objects**: Defined multiple classes like Pod, Laboratory, Storage, and possibly Cafeteria.
  
- **Inheritance**: Child classes (like Laboratory and Storage) inherit properties and methods from the parent Pod class.
  
- **Encapsulation**: Used private properties coupled with public getters and setters to shield internal state and ensure data integrity.
  
- **ArrayList**: Utilized for potential dynamic data storage or manipulation.

- **ANSI Colors**: For enhanced terminal output visualization. Colors include red, green, yellow, blue, purple, cyan, and white.

## Enhancements & Terminal Output Styling

Using ANSI commands, the terminal output can be made more visually appealing. Different color codes can be used to highlight or distinguish different parts of the output. For example:

```java
System.out.println(RED_BOLD_BRIGHT + "This is a bright red text!" + ANSI_RESET);
