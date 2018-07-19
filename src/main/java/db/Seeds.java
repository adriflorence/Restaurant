package db;

import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Seeds {

    public static void seedData() throws ParseException {
        DBHelper.deleteAll(Customer.class);
        DBHelper.deleteAll(Booking.class);
        DBHelper.deleteAll(RestaurantTable.class);
        DBHelper.deleteAll(MenuItem.class);

        RestaurantTable restaurantTable1 = new RestaurantTable("Table 1", 2);
        RestaurantTable restaurantTable2 = new RestaurantTable("Table 2", 4);
        RestaurantTable restaurantTable3 = new RestaurantTable("Table 3", 4);
        RestaurantTable restaurantTable4 = new RestaurantTable("Table 4", 2);
        RestaurantTable restaurantTable5 = new RestaurantTable("Table 5", 2);
        RestaurantTable restaurantTable6 = new RestaurantTable("Table 6", 8);
        RestaurantTable restaurantTable7 = new RestaurantTable("Table 7", 5);
        RestaurantTable restaurantTable8 = new RestaurantTable("Table 8", 4);
        RestaurantTable restaurantTable9 = new RestaurantTable("Table 9", 2);
        RestaurantTable restaurantTable10 = new RestaurantTable("Table 10", 10);
        RestaurantTable restaurantTable11 = new RestaurantTable("Table 11", 4);
        RestaurantTable restaurantTable12 = new RestaurantTable("Table 12", 4);
        DBHelper.saveOrUpdate(restaurantTable1);
        DBHelper.saveOrUpdate(restaurantTable2);
        DBHelper.saveOrUpdate(restaurantTable3);
        DBHelper.saveOrUpdate(restaurantTable4);
        DBHelper.saveOrUpdate(restaurantTable5);
        DBHelper.saveOrUpdate(restaurantTable6);
        DBHelper.saveOrUpdate(restaurantTable7);
        DBHelper.saveOrUpdate(restaurantTable8);
        DBHelper.saveOrUpdate(restaurantTable9);
        DBHelper.saveOrUpdate(restaurantTable10);
        DBHelper.saveOrUpdate(restaurantTable11);
        DBHelper.saveOrUpdate(restaurantTable12);


        ArrayList<MenuItem> meal1 = new ArrayList<>();
        ArrayList<MenuItem> meal2 = new ArrayList<>();
        ArrayList<MenuItem> meal3 = new ArrayList<>();
        MenuItem menuItem1 = new MenuItem("Body of Christ", 2.99, "Entry");
        MenuItem menuItem2 = new MenuItem("Italian Salad", 5.50, "Entry");
        MenuItem menuItem3 = new MenuItem("Soup Of The Day", 4.00, "Entry");
        MenuItem menuItem4 = new MenuItem("Mushroom Pie", 5.99, "Entry");

        MenuItem menuItem5 = new MenuItem("Pasta Napolitana", 12.50, "Main");
        MenuItem menuItem6 = new MenuItem("House Lasagne", 17.00, "Main");
        MenuItem menuItem7 = new MenuItem("The Veggie Pizza", 9.90, "Main");
        MenuItem menuItem8 = new MenuItem("Crispy Seitan Burger", 9.90, "Main");

        MenuItem menuItem9 = new MenuItem("Pint Punk IPA", 3.90, "Drink");
        MenuItem menuItem10 = new MenuItem("Gin & Tonic", 4.70, "Drink");
        MenuItem menuItem11 = new MenuItem("Glass of Red Wine", 3.10, "Drink");
        MenuItem menuItem12 = new MenuItem("OJ Glass", 2.00, "Drink");

        MenuItem menuItem13 = new MenuItem("CC CheeseCake", 3.90, "Sweet");
        MenuItem menuItem14 = new MenuItem("Red Berry Sorbet", 4.00, "Sweet");


        meal1.add(menuItem1);
        meal1.add(menuItem2);
        meal1.add(menuItem3);
        meal1.add(menuItem4);
        meal1.add(menuItem5);
        meal1.add(menuItem8);
        meal1.add(menuItem9);
        meal1.add(menuItem10);

        meal2.add(menuItem1);
        meal2.add(menuItem4);
        meal2.add(menuItem7);
        meal2.add(menuItem7);

        meal3.add(menuItem10);
        meal3.add(menuItem9);

        DBHelper.saveOrUpdate(menuItem1);
        DBHelper.saveOrUpdate(menuItem2);
        DBHelper.saveOrUpdate(menuItem3);
        DBHelper.saveOrUpdate(menuItem4);
        DBHelper.saveOrUpdate(menuItem5);
        DBHelper.saveOrUpdate(menuItem6);
        DBHelper.saveOrUpdate(menuItem7);
        DBHelper.saveOrUpdate(menuItem8);
        DBHelper.saveOrUpdate(menuItem9);
        DBHelper.saveOrUpdate(menuItem10);
        DBHelper.saveOrUpdate(menuItem11);
        DBHelper.saveOrUpdate(menuItem12);
        DBHelper.saveOrUpdate(menuItem13);
        DBHelper.saveOrUpdate(menuItem14);
        DBHelper.saveOrUpdate(meal1);
        DBHelper.saveOrUpdate(meal2);
        DBHelper.saveOrUpdate(meal3);


        Customer customer1 = new Customer("John McClane");
        Customer customer2 = new Customer("David Copperfield");
        Customer customer3 = new Customer("Craig McDowall");
        Customer customer4 = new Customer("Phoebe Buffay");
        Customer customer5 = new Customer("Holden Caulfield ");
        Customer customer6 = new Customer("Johann Sebastian Bach");
        Customer customer7 = new Customer("Lyle Mitchell");
        Customer customer8 = new Customer("Eric Cartman");
        Customer customer9 = new Customer("Ali Baba");
        Customer customer10 = new Customer("Campbell Miller");
        Customer customer11 = new Customer("Abraham Lincoln");
        Customer customer12 = new Customer("Pope John Paul II");
        Customer customer13 = new Customer("Debi Skea");
        Customer customer14 = new Customer("Mila Kunis");
        Customer customer15 = new Customer("Steven Bonner");
        Customer customer16 = new Customer("Fred Flintstone");
        Customer customer17 = new Customer("Robinson Crusoe");
        Customer customer18 = new Customer("Harjit Singh");
        Customer customer19 = new Customer("Bart Simpson");
        Customer customer20 = new Customer("Winnie-the-Pooh");
        Customer customer21 = new Customer("Cleyra Uzcategui");
        Customer customer22 = new Customer("Roddy Daly");
        Customer customer23 = new Customer("Jacob Rees-Mogg");
        Customer customer24 = new Customer("Jack Murning");
        Customer customer25 = new Customer("Usain Bolt");
        Customer customer26 = new Customer("Matt Bryce");
        Customer customer27 = new Customer("Farheen Mulla");
        Customer customer28 = new Customer("Arnold Alois Schwarzenegger");
        Customer customer29 = new Customer("Tom Johnston");
        Customer customer30 = new Customer("Vladimir Lenin");
        Customer customer31 = new Customer("Richard Phillips-Kerr");
        Customer customer32 = new Customer("Angelina Blyth");
        Customer customer33 = new Customer("Tom Selleck");


        DBHelper.saveOrUpdate(customer1);
        DBHelper.saveOrUpdate(customer2);
        DBHelper.saveOrUpdate(customer3);
        DBHelper.saveOrUpdate(customer4);
        DBHelper.saveOrUpdate(customer5);
        DBHelper.saveOrUpdate(customer6);
        DBHelper.saveOrUpdate(customer7);
        DBHelper.saveOrUpdate(customer8);
        DBHelper.saveOrUpdate(customer9);
        DBHelper.saveOrUpdate(customer10);
        DBHelper.saveOrUpdate(customer11);
        DBHelper.saveOrUpdate(customer12);
        DBHelper.saveOrUpdate(customer13);
        DBHelper.saveOrUpdate(customer14);
        DBHelper.saveOrUpdate(customer15);
        DBHelper.saveOrUpdate(customer16);
        DBHelper.saveOrUpdate(customer17);
        DBHelper.saveOrUpdate(customer18);
        DBHelper.saveOrUpdate(customer19);
        DBHelper.saveOrUpdate(customer20);
        DBHelper.saveOrUpdate(customer21);
        DBHelper.saveOrUpdate(customer22);
        DBHelper.saveOrUpdate(customer23);
        DBHelper.saveOrUpdate(customer24);
        DBHelper.saveOrUpdate(customer25);
        DBHelper.saveOrUpdate(customer26);
        DBHelper.saveOrUpdate(customer27);
        DBHelper.saveOrUpdate(customer28);
        DBHelper.saveOrUpdate(customer29);
        DBHelper.saveOrUpdate(customer30);
        DBHelper.saveOrUpdate(customer31);
        DBHelper.saveOrUpdate(customer32);
        DBHelper.saveOrUpdate(customer33);

        // BOOKING date & time creations
        Date date1 = new SimpleDateFormat("ddMMyyyy").parse("22072018");
        Date date2 = new SimpleDateFormat("ddMMyyy").parse("23072018");
        Date date3 = new SimpleDateFormat("ddMMyy").parse("190718");
        Date date4 = new SimpleDateFormat("ddMMyy").parse("200718");
        Date date5 = new SimpleDateFormat("ddMMyy").parse("210718");

        Date startTime1 = new SimpleDateFormat("HHmm").parse("1930");
        Date endTime1 = new SimpleDateFormat("HHmm").parse("2130");
        Date startTime2 = new SimpleDateFormat("HHmm").parse("1230");
        Date endTime2 = new SimpleDateFormat("HHmm").parse("1530");
        Date startTime3 = new SimpleDateFormat("HHmm").parse("1600");
        Date endTime3 = new SimpleDateFormat("HHmm").parse("1800");
        Date startTime4 = new SimpleDateFormat("HHmm").parse("1800");
        Date endTime4 = new SimpleDateFormat("HHmm").parse("1930");

//        Booking 1
        Booking booking1 = new Booking(customer1, restaurantTable1, date1, 2, startTime1, endTime1);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking1);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking1);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking1);

        // BOOKING 2
        Booking booking2 = new Booking(customer2, restaurantTable2, date1, 2, startTime2, endTime2);
//        booking2.setTotalCost(75.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking2);

        // BOOKING 3
        Booking booking3 = new Booking(customer3, restaurantTable3, date1, 4, startTime2, endTime2);
//        booking3.setTotalCost(120.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking3);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking3);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking3);
        // BOOKING 4
        Booking booking4 = new Booking(customer4, restaurantTable4, date1, 2, startTime2, endTime2);
//        booking4.setTotalCost(150.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking4);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking4);

        // BOOKING 5

        Booking booking5 = new Booking(customer5, restaurantTable5, date1, 2, startTime3, endTime3);
//        booking5.setTotalCost(90.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking5);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking5);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking5);

        // BOOKING 6
        Booking booking6 = new Booking(customer6, restaurantTable6, date1, 5, startTime3, endTime3);
        booking6.setTotalCost(100.00);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking6);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking6);

        // BOOKING 7
        Booking booking7 = new Booking(customer6, restaurantTable1, date2, 2, startTime2, endTime2);
//        booking7.setTotalCost(200.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking7);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking7);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking7);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking7);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking7);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking7);

//        Booking 8
        Booking booking8 = new Booking(customer7, restaurantTable10, date1, 9, startTime2, endTime3);
//        booking8.setTotalCost(300.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking8);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking8);

//        Booking 9
        Booking booking9 = new Booking(customer8, restaurantTable2, date1, 2, startTime1, endTime1);
//        booking9.setTotalCost(75.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking9);

//        Booking 10
        Booking booking10 = new Booking(customer9, restaurantTable5, date1, 2, startTime1, endTime1);
//        booking10.setTotalCost(100.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking10);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking10);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking10);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking10);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking10);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking10);

//        Booking 11
        Booking booking11 = new Booking(customer10, restaurantTable3, date3, 4, startTime1, endTime1);
//        booking11.setTotalCost(111.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking11);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking11);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking11);

//        Booking 12
        Booking booking12 = new Booking(customer11, restaurantTable4, date3, 1, startTime3, endTime3);
//        booking12.setTotalCost(25.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking12);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking12);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking12);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking12);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking12);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking12);

//        Booking 13
        Booking booking13 = new Booking(customer12, restaurantTable5, date3, 2, startTime2, startTime3);
//        booking13.setTotalCost(24.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking13);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking13);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking13);

//        Booking 14
        Booking booking14 = new Booking(customer13, restaurantTable6, date3, 6, startTime1, endTime1);
//        booking14.setTotalCost(265.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking14);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking14);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking14);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking14);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking14);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking14);

//        Booking 15
        Booking booking15 = new Booking(customer14, restaurantTable7, date3, 6, startTime1, endTime1);
//        booking15.setTotalCost(178.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking15);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking15);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking15);

//        Booking 16
        Booking booking16 = new Booking(customer15, restaurantTable7, date3, 5, startTime2, endTime2);
//        booking16.setTotalCost(201.00);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking16);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking16);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking16);

//        Booking 17
        Booking booking17 = new Booking(customer6, restaurantTable10, date3, 10, startTime3, endTime3);
        DBMenuItem.addMenuItemToBooking(menuItem1, booking17);
        DBMenuItem.addMenuItemToBooking(menuItem4, booking17);
        DBMenuItem.addMenuItemToBooking(menuItem5, booking17);

//        Booking 18
        Booking booking18 = new Booking(customer29, restaurantTable9, date3, 10, startTime2, endTime2);

//        Booking 19
        Booking booking19 = new Booking(customer17, restaurantTable8, date3, 4, startTime1, endTime1);

//        Booking 20
        Booking booking20 = new Booking(customer6, restaurantTable4, date4, 2, startTime1, endTime1);

//        Booking 21
        Booking booking21 = new Booking(customer6, restaurantTable6, date5, 2, startTime4, endTime4);

//        Booking 22
        Booking booking22 = new Booking(customer24, restaurantTable1, date5, 2, startTime1, endTime1);

//        Booking 23
        Booking booking23 = new Booking(customer25, restaurantTable2, date5, 2, startTime2, endTime2);


        // SAVE BOOKINGS
        DBHelper.saveOrUpdate(booking1);
        DBHelper.saveOrUpdate(booking2);
        DBHelper.saveOrUpdate(booking3);
        DBHelper.saveOrUpdate(booking4);
        DBHelper.saveOrUpdate(booking5);
        DBHelper.saveOrUpdate(booking6);
        DBHelper.saveOrUpdate(booking7);
        DBHelper.saveOrUpdate(booking8);
        DBHelper.saveOrUpdate(booking9);
        DBHelper.saveOrUpdate(booking10);
        DBHelper.saveOrUpdate(booking11);
        DBHelper.saveOrUpdate(booking12);
        DBHelper.saveOrUpdate(booking13);
        DBHelper.saveOrUpdate(booking14);
        DBHelper.saveOrUpdate(booking15);
        DBHelper.saveOrUpdate(booking16);
        DBHelper.saveOrUpdate(booking17);
        DBHelper.saveOrUpdate(booking18);
        DBHelper.saveOrUpdate(booking19);
        DBHelper.saveOrUpdate(booking20);
        DBHelper.saveOrUpdate(booking21);
        DBHelper.saveOrUpdate(booking22);
        DBHelper.saveOrUpdate(booking23);

    }
}
