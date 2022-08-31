public class Person {
    public static void main(String[] args) {
        personInfo(1);
        personInfo(2);
        personInfo(3);
    }


    public static void personInfo(int x) {
        String[] willSmith = new String[]{"Will Smith", "New York", "2936729462846"};
        String[] jackieChan = new String[]{"Jackie Chan", "Shanghai", "12312412412"};
        String[] sherlockHolmes = new String[]{"Sherlock Holmes", "London", "37742123513"};

        if (x == 1) {
            System.out.println("Call to person: " + willSmith[0] + " from the city: " + willSmith[1] + " phone number: " + willSmith[2]);
        } else if (x == 2) {
            System.out.println("Call to person: " + jackieChan[0] + " from the city: " + jackieChan[1] + " phone number: " + jackieChan[2]);
        } else {
            System.out.println("Call to person: " + sherlockHolmes[0] + " from the city: " + sherlockHolmes[1] + " phone number: " + sherlockHolmes[2]);
        }
    }

}
