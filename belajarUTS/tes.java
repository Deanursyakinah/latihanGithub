package belajarUTS;

import java.util.ArrayList;

public class tes {

    // Enum untuk tipe kamar
    enum RoomType {
        SINGLE, DOUBLE, SUITE
    }

    static class Room {
        private int roomNumber;
        private double price;
        private RoomType type;
        private boolean isAvailable;

        public Room(int roomNumber, double price, RoomType type) {
            this.roomNumber = roomNumber;
            this.price = price;
            this.type = type;
            this.isAvailable = true;
        }

        // Getter dan setter untuk isAvailable
        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        // Metode untuk mencetak informasi kamar
        public String getRoomInfo() {
            return "Room Number: " + roomNumber + ", Type: " + type + ", Price: $" + price + ", Available: "
                    + isAvailable;
        }
    }

    static class Hotel {
        private ArrayList<Room> rooms;
        private Hotel instance = null;

        private Hotel() {
            rooms = new ArrayList<>();
            // Tambahkan data dummy (kamar-kamar hotel) ke dalam ArrayList rooms.
            rooms.add(new Room(101, 100.0, RoomType.SINGLE));
            rooms.add(new Room(102, 120.0, RoomType.SINGLE));
            rooms.add(new Room(103, 150.0, RoomType.DOUBLE));
            rooms.add(new Room(104, 200.0, RoomType.DOUBLE));
            rooms.add(new Room(201, 250.0, RoomType.SUITE));
        }

        public Hotel getInstance() {
            if (instance == null) {
                instance = new Hotel();
            }
            return instance;
        }

        public ArrayList<Room> getRooms() {
            return rooms;
        }

        // Metode untuk mencetak ketersediaan kamar berdasarkan tipe
        public void PrintRoomAvailabilityPerType(RoomType type) {
            for (Room room : rooms) {
                if (room.isAvailable() && room.type == type) {
                    System.out.println(room.getRoomInfo());
                }
            }
        }

        // Metode untuk melakukan pemesanan kamar
        public boolean BookRoom(int roomNumber) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber && room.isAvailable()) {
                    room.setAvailable(false);
                    // Lakukan pembayaran di sini
                    return true;
                }
            }
            return false;
        }

        // Metode untuk membatalkan pemesanan kamar
        public boolean CancelBook(int roomNumber) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber && !room.isAvailable()) {
                    room.setAvailable(true);
                    // Pembayaran tetap dihitung sebagai revenue hotel
                    return true;
                }
            }
            return false;
        }

        // Metode untuk mengedit pemesanan kamar
        public boolean EditBooking(int roomNumber, int additionalStayDays) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber && !room.isAvailable()) {
                    // Lakukan penambahan durasi menginap di sini
                    // Lakukan pembayaran tambahan di sini
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance();

        // Cetak ketersediaan kamar tipe SINGLE
        System.out.println("Available Single Rooms:");
        hotel.PrintRoomAvailabilityPerType(RoomType.SINGLE);

        // Coba memesan kamar
        int roomNumberToBook = 101;
        if (hotel.BookRoom(roomNumberToBook)) {
            System.out.println("Room " + roomNumberToBook + " has been booked.");
        } else {
            System.out.println("Room " + roomNumberToBook + " is not available or does not exist.");
        }

        // Cetak ketersediaan kamar tipe DOUBLE
        System.out.println("\nAvailable Double Rooms:");
        hotel.PrintRoomAvailabilityPerType(RoomType.DOUBLE);

        // Coba membatalkan pemesanan kamar
        int roomNumberToCancel = 102;
        if (hotel.CancelBook(roomNumberToCancel)) {
            System.out.println("Booking for Room " + roomNumberToCancel + " has been canceled.");
        } else {
            System.out.println("Cannot cancel booking for Room " + roomNumberToCancel
                    + ". It may not exist or is already available.");
        }

        // Cetak ketersediaan kamar tipe SUITE
    }
}
