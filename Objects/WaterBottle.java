class WaterBottle {
  private int waterLevel;

  public WaterBottle(){
    waterLevel = 100;
  }

  void drink(){
    if (waterLevel == 0){
      System.out.println("No more water!");
    }
    else if (waterLevel < 10){
      System.out.println("Enough for a sip");
      waterLevel = 0;
    }
    else{
      System.out.println("Drank a mouthful");
      waterLevel -= 10;
    }
  }

  void check(){
    System.out.println("Water level: " + waterLevel);
  }

}