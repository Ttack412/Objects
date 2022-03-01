class Main {
  public static void main(String[] args) {

    // Making an instance of the class. This is an object.
    // The new keyword makes sure a new object is created.
    WaterBottle bottleOne = new WaterBottle();

    // The waterLevel of only this object will change.
    // If you make a new waterBottle it will start at 100 waterLevel.
    bottleOne.drink();

    // This bottleTwo is not a new waterBottle. It is referencing bottleOne so the waterLevels are the same.
    // If you drink from this the waterLevel is bottleOne will also drop.
    // If you used the syntax for creating bottleOne you would have a new WaterBottle with a separate waterLevel.

    WaterBottle bottleTwo = bottleOne;
    
    bottleTwo.drink();
    bottleTwo.check();
    bottleOne.check();

   
    //---------------------------------------------------------------
  
    //1. Create an Object from your LightSwitch class called lights and notice how the lines below are now ok.

    LightSwitch lights = new LightSwitch();
    
    // You can use the lines below to test your LightSwitch class. (Don't change this code)

    
    System.out.println("Lightswitch:");
    System.out.println(lights.getStatus());
    lights.flick();
    System.out.println(lights.getStatus());
  }
}