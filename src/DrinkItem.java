enum Volume {
         S,M,L
}
public class DrinkItem extends MenuItem{
         private Volume volume;

         public DrinkItem() {
         }

         public DrinkItem(String name, double price, double numbers, Volume volume) {
                  super(name, price, numbers);
                  this.volume = volume;
         }

         public Volume getVolume() {
                  return volume;
         }

         public void setVolume(Volume volume) {
                  this.volume = volume;
         }

         @Override
         public String toString() {
                  return "DrinkItem [volume=" + volume + ", toString()=" + super.toString() + "]";
         }
         
         
}
