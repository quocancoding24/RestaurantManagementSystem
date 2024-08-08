public class Table {
    public Table[] tableNumber;
    public int seats;
    public String description;

    public Table(Table[] tableNumber, int seats, String description) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.description = description;
    }

    public boolean isAvailable(){
        
    }

    @Override
    public String toString() {
        return "Table [tableNumber=" + tableNumber + ", seats=" + seats + ", description=" + description + "]";
    }
    
}
