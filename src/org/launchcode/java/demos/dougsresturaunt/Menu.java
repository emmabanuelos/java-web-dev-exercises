//package org.launchcode.java.demos.dougsresturaunt;
//
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Menu {
//​
//        private ArrayList<MenuItem> items;
//​
//        private Date lastUpdated;
//​
//        public Menu() {
//            this.items = new ArrayList<>();
//            this.lastUpdated = new Date();
//        }
//​
//        ​
//        public void addItem(MenuItem aItem) {
//            items.add(aItem);
//            this.lastUpdated = new Date();
//        }
//​
//        public void removeItem(MenuItem item) {
//            this.items.remove(item);
//            this.lastUpdated = new Date();
//        }
//​
//        public ArrayList<MenuItem> getItems() {
//            return items;
//        }
//​
//        public Date getLastUpdated() {
//            return lastUpdated;
//        }
//​
//        @Override
//        public String toString() {
//            String menu = "";
//            for(MenuItem item : items) {
//                menu += item + "\n";
//            }
//            menu += lastUpdated;
//            return menu;
//        }
//​
//        ​
//        public static void main(String[] args) {
//            Menu menu = new Menu();
//​
//            menu.addItem(new MenuItem(10.00, "Cheese Sticks", "Appetizer"));
//            menu.addItem(new MenuItem(5.00, "Bread Sticks", "Appetizer"));
//​
//            System.out.println(menu.getItems());
//        }
//}
