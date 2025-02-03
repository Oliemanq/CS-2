import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[12];

        for(int i = 0; i < 12; i++){

            System.out.println("Enter name: ");
            String tempName = sc.nextLine();
            System.out.println("Enter age: ");
            int tempAge = sc.nextInt();
            System.out.println("Made person");
            people[i] = new Person(tempName, tempAge);

        }
        System.out.println("People: ");
        for(int i = 0; i < 12; i++){
            System.out.println(people[i].getName() + " is " + people[i].getAge() + " years old.");
        }
    }
}

