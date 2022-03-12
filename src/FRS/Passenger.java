package FRS;

public class Passenger {
    private static Address address;
    private static Contact contact;
    private int id;
    private static int idCounter ;

    public Passenger(String addressState, String addressCity,
                                     String addressStreet, String contactName, String contactPhone,
                                     String contactEmail ) {
        this.address = new Address(addressState, addressCity, addressStreet);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
        this.id = ++idCounter;
    }

    public Passenger() {
        this("West Bengal", "Kolkata", "Picnic Garden", "Arpan Hazra", "+981123455670", "ah@gmail.com");
    }


    //private Address getAddress(){ }

    public String getAddressDetails() {
        return "Passenger address is: " + address.state + " " + address.city + " " + address.street;
    }
    //private Address updateAddressDetails(){}

    public void updateAddressDetails(String addressDetail) {
        addressDetail = getAddressDetails();
    }

    //private Contact getContact(){ }

    public String getContactDetails() {
        return "Passenger name is: " + contact.name + " EmailId: " + contact.email + " Phone Number is: " + contact.phone;
    }

   //private Contact updateContactDetails(){}

    public void updateContactDetails(String contactDetail) {
        contactDetail = getContactDetails();
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public Address() {
            this("Picnic Garden", "Kolkata", "West Bengal");
        }
    }

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public Contact() {
            this("Arpan", "+981123455670", "ah@gmail.com");
        }
    }


    public int getPassengerCount(int idCounter,int id) {
        return idCounter;
    }


}
