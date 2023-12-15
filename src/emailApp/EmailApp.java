package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("James", "Li");

        em1.setAlternateEmail("Zhiyueli@gmail.com");
        em1.setPassowrd("Ljglzy201812");
        em1.setMailboxCapacity(2000);
        em1.showInfo();
    }
}
