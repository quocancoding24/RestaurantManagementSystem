import java.util.List;

public class Restaurant {
    public String name;
    public String address;
    public List<Table> tables;
    public String menu;
    public List<Order> orders;

    public Restaurant() {
    }

    public Restaurant(String name, String address, List<Table> tables, String menu, List<Order> order) {
        this.name = name;
        this.address = address;
        this.tables = tables;
        this.menu = menu;
        this.orders = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
    public List<Order> getOrder() {
        return orders;
    }

    public void setOrder(List<Order> order) {
        this.orders = order;
    }

    public boolean makeReservation(Reservation reservation){
        return true;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
    public void removeOrder(Order order){
        orders.remove(order);
    }
    public Table findAvailableTable(){
        for(Table table : tables) {
            if(table.isAvailable()){
                return table;
            }
        }
        return null;
    }
}
