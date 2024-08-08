import java.util.ArrayList;
import java.util.List;

public class Menu {
         private List<MenuItem> menuItems;

         public Menu() {
                  this.menuItems = new ArrayList<>();
         }
         public void addMenuItem(MenuItem menuItem) {
                  menuItems.add(menuItem);
         }
         public void removeMenuItem(MenuItem menuItem) {
                  menuItems.remove(menuItem);
         }
         public MenuItem findMenuItem(String name) {
                  for(MenuItem item : menuItems) {
                           if(item.getName().equals(name)){
                                    return item;
                           }
                  }
                  return null;
         }
         public List<MenuItem> getMenuItems() {
                  return menuItems;
         }
         public void setMenuItems(List<MenuItem> menuItems) {
                  this.menuItems = menuItems;
         }
         
}
         