class LightSwitch{

   private boolean turnedOn;

   public void lightSwitch(){
     turnedOn = false;
   }

   public void flick(){
     if(turnedOn){
       turnedOn = false;
     }else{
       turnedOn = true;
     }
   }

   public boolean getStatus(){
     return turnedOn;
   }
 }