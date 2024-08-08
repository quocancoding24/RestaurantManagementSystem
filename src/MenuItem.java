public class MenuItem {
         private String name;
         private double price;
         private double numbers;
         
         public MenuItem() {
         }
         public MenuItem(String name, double price, double numbers) {
                  this.name = name;
                  this.price = price;
                  this.numbers = numbers;
         }
         public String getName() {
                  return name;
         }
         public void setName(String name) {
                  this.name = name;
         }
         public double getPrice() {
                  return price;
         }
         public void setPrice(double price) {
                  this.price = price;
         }
         public double getNumbers() {
                  return numbers;
         }
         public void setNumbers(double numbers) {
                  this.numbers = numbers;
         }
         @Override
         public String toString() {
                  return "MenuItem [name=" + name + ", price=" + price + ", numbers=" + numbers + "]";
         }
         
        
         
}
