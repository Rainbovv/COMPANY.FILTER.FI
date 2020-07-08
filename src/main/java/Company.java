import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private static List<Employee> employees;
    private static int i;

    public static void generate() {

        Random random = new Random();
        Faker faker = new Faker();

        employees = new ArrayList<>();

        for (i = 0; i < 10; i++) {

            String fullName = faker.name().fullName();
            float salary =  random.nextFloat() * 10000 + 10000;
            float experience = random.nextFloat() * 12 + 3;

            employees.add(new Employee(fullName,salary,experience));
        }
    }

    public static void printAllCompact() {
        i = 1;
        employees.forEach(e -> System.out.printf("%d. %s%n", i++ , e.getFullName() ));
    }

    public static void printAllDetailed() {
        i = 1;
        employees.forEach(e -> System.out.printf("%2d. %-25s   %.0f$    %2.0f years%n",
                                                i++ , e.getFullName(), e.getSalary(), e.getExperience()));
    }
}
