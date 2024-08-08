import java.util.List;

public class Order {
         private int orderId;
         private Table table;
         private List<MenuItem> menuItems;
         private String status;
         public Order() {
         }
         public Order(int orderId, Table table, List<MenuItem> menuItems, String status) {
                  this.orderId = orderId;
                  this.table = table;
                  this.menuItems = menuItems;
                  this.status = status;
         }
         public int getOrderId() {
                  return orderId;
         }
         public void setOrderId(int orderId) {
                  this.orderId = orderId;
         }
         public Table getTable() {
                  return table;
         }
         public void setTable(Table table) {
                  this.table = table;
         }
         public List<MenuItem> getMenuItems() {
                  return menuItems;
         }
         public void setMenuItems(List<MenuItem> menuItems) {
                  this.menuItems = menuItems;
         }
         public String getStatus() {
                  return status;
         }
         public void setStatus(String status) {
                  this.status = status;
         }
         public double totalPrice() {
                  double total = 0.0;
                  for(MenuItem item : menuItems) {
                           total += item.getPrice();
                  }
                  return total;
         }
}
