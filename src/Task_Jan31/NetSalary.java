package Task_Jan31;
public class NetSalary {
    public static void main(String[] args) {

        double basicPay = 80000;
        double HRA_PERCENTAGE = 0.40; // 40% of Basic Pay
        double DA_PERCENTAGE = 0.15;  // 15% of Basic Pay
        double PF_PERCENTAGE = 0.12;  // 12% of Basic Pay
        double TAX_PERCENTAGE = 0.10; // 10% of Gross Salary

        double hra = basicPay * HRA_PERCENTAGE;
        double da = basicPay * DA_PERCENTAGE;
        double pf = basicPay * PF_PERCENTAGE;

        double grossSalary = basicPay + hra + da; // // Gross Salary = Basic Pay + HRA + DA
        double tax = grossSalary * TAX_PERCENTAGE; // Tax = 10% of Gross Salary

        double Deductions = pf+tax;
        double netSalary = grossSalary - Deductions;

        System.out.println("Basic Pay: ₹" + basicPay);
        System.out.println("HRA: ₹" + hra);
        System.out.println("Dearness Allowances: ₹" + da);
        System.out.println("--------------------");
        System.out.println("Gross Salary: ₹" + grossSalary);

        System.out.println("--------------------");
        System.out.println("PF: ₹" + pf);
        System.out.println("TAX: ₹" + tax);
        System.out.println("Deductions: ₹" + Deductions);


        System.out.println("--------------------");
        System.out.println("Net Salary: ₹" +netSalary);

    }
}

//output:
/*
Basic Pay: ₹80000.0
HRA: ₹32000.0
Dearness Allowances: ₹12000.0
--------------------
Gross Salary: ₹124000.0
--------------------
PF: ₹9600.0
TAX: ₹12400.0
Deductions: ₹22000.0
--------------------
Net Salary: ₹102000.0
 */