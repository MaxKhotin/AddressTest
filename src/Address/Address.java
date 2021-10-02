package Address;

public class Address {
        private int index;
        private String country;
        private String city;
        private String street;
        private int house;
        private int apartment;

        void setIndex (int i) {
            index = i;
        }
         int getIndex () {
            return index;
        }

        void setCountry (String co){
            country = co;
        }
        String getCountry (){
            return country;
        }

        void setCity (String ci){
            city = ci;
        }
        String getCity (){
            return city;
        }

        void setStreet (String s){
            street = s;
        }
        String getStreet(){
            return street;
        }

        void setHouse (int h){
            house = h;
        }
        int getHouse (){
            return house;
        }

        void setApartment (int a) {
            apartment = a;
        }
        int getApartment (){
            return apartment;
        }

        void getInfo () {
            System.out.println(getIndex()+"  "+getCountry()+"  "+getCity()+"  "+getStreet()+"  "+getHouse()+"  "+getApartment());
        }
}
