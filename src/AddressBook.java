import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bi){
        addressBook.add(bi);
    }

    public void removeBuddy(BuddyInfo bi){
        addressBook.remove(bi);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("tom", "carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
