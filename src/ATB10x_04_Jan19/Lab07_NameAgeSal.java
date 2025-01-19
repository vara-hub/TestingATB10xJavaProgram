package ATB10x_04_Jan19;

public class Lab07_NameAgeSal {
    public static void main(String[] args) {
        // Take inputs from CLI options

        String name = args[0]; //Varalaksmi

        String age_string = args[1]; //32
        int age = Integer.parseInt(age_string);

        String salary_string = args[2]; //150000
        int salary = Integer.parseInt(salary_string);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        //output:
    // Name: Varalaksmi
      //  Age: 32
        //Salary: 150000
}
}