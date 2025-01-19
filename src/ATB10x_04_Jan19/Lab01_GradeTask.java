package ATB10x_04_Jan19;

public class Lab01_GradeTask {
    public static void main(String[] args) {
        int score=75;
        System.out.println("The score of the Student SARAN is "  + score);
/*A: 90-100

    B: 80-89

    C: 70-79

    D: 60-69

    F: 0-59*/
        String Grade = (score>=90)&&(score<=100)?"Grade A":(score>=80)&&(score<=89)?"Grade B":(score>=70)&&(score<=79)?"Grade C":(score>=60)&&(score<=69)?"Grade D":"FAIL";
        System.out.println("The Grade of the Student SARAN is " + Grade);

        //output
//The score of the Student SARAN is 75
//The Grade of the Student SARAN is Grade C
    }
}
