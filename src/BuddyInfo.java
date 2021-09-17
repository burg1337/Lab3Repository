public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNum;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public BuddyInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public BuddyInfo(){
        this("Bob", "10 wind way", "111-222-333");
    }

    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo();
        Homer.setName("Homer");
        System.out.println("Hello " + Homer.getName());
    }
}
