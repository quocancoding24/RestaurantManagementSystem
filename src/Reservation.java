public class Reservation extends Table{
         private int reservationId;
         private String customerName;
         private String reservationTime;
         public Reservation() {
         }
         public Reservation(int reservationId, String customerName, String reservationTime) {
                  this.reservationId = reservationId;
                  this.customerName = customerName;
                  this.reservationTime = reservationTime;
         }
         public int getReservationId() {
                  return reservationId;
         }
         public void setReservationId(int reservationId) {
                  this.reservationId = reservationId;
         }
         public String getCustomerName() {
                  return customerName;
         }
         public void setCustomerName(String customerName) {
                  this.customerName = customerName;
         }
         public String getReservationTime() {
                  return reservationTime;
         }
         public void setReservationTime(String reservationTime) {
                  this.reservationTime = reservationTime;
         }
         
}
