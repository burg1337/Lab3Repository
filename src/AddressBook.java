import java.util.ArrayList;
//yo yo change from the github
public class AddressBook {
    ArrayList<BuddyInfo> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bi){
        if (bi != null){
            addressBook.add(bi);
        }
    }

    public void removeBuddy(int index){
        if (index >= 0 && index < addressBook.size()){
            addressBook.remove(index);
        }
    }

    public void newMethodForBranch(){
        System.out.println("yo yo new branch");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("tom", "carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
