//package org.launchcode.java.demos.dougsresturaunt;
//
//    import java.util.Objects;
//​
//    public class MenuItem {
//​
//        private String description;
//        private double price;
//        private String category;
//        private boolean isNew;
//​
//        public MenuItem(double price, String description, String category) {
//​
//            this.price = price;
//            this.description = description;
//            this.category = category;
//            this.isNew = true;
//        }
//​
//        public MenuItem(double price) {
//            this(price, "", "");
//        }
//​
//        public String getDescription() {
//            return this.description;
//        }
//​
//        public void setDescription() {
//            this.description = description;
//        }
//​
//        public double getPrice() {
//            return this.price;
//        }
//​
//        public void setPrice(double price) {
//            this.price = price;
//        }
//​
//        public void setDescription(String description) {
//            this.description = description;
//        }
//​
//        public String getCategory() {
//            return category;
//        }
//​
//        public void setCategory(String category) {
//            this.category = category;
//        }
//​
//        public boolean isNew() {
//            return isNew;
//        }
//​
//        public void setNew(boolean aNew) {
//            isNew = aNew;
//        }
//​
//        @Override
//        public String toString() {
//            return "Description: " + this.description + " Price: " + this.price;
//        }
//​
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            MenuItem menuItem = (MenuItem) o;
//            return Objects.equals(description, menuItem.description) &&
//                    Objects.equals(category, menuItem.category);
//        }
//​
//        @Override
//
//        public int hashCode() {
//            return Objects.hash(description, category);
//        }
//}
