public class Table {
    public Table[] tableNumber;
    public int seats;
    public String description;
    private boolean isAvailable;

    public Table() {
    }

    public Table(Table[] tableNumber, int seats, String description) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.description = description;
        this.isAvailable = true;
    }

    public Table[] getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Table[] tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Table [tableNumber=" + tableNumber + ", seats=" + seats + ", description=" + description + "]";
    }
    
}
