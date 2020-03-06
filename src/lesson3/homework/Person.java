package lesson3.homework;

public class Person {

    static String name = "Vova";


    static class Account {
        String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            String accountInfo = "Имя владельца: " + name + ", пароль: " + password;
            System.out.println(accountInfo);
        }



    }

    public static void main(String[] args) {
        Account account = new Account("12345678");


    }


}
