package day10_IfStatement;
/*
grade: int score =
	90 ~ 100 ==> A
	80 ~ 89 ==> B
	70 ~ 79 ==> C
	60 ~ 69 ==> D
	otherwise ==> F

	GradeCalculator
 */
public class GradeCalculator {

    public static void main(String[] args) {
        int score = 55;
        String grade = "";// it will be replace because of being empty

      if (score >= 90 && score <= 100){
          grade = score + " is A";
      }else if (score >= 80 && score <= 89){
          grade = score + " is B";
      }else if (score >= 70 && score <= 79){
          grade = score + " is C";
      }else if (score >= 60 && score <= 69){
          grade = score + " is D";
      }else if(score >= 0 && score <= 50){
          grade = score + " you made F";
      }else{ // score < 0 || score > 100
          grade = " invalid score";
      }

        System.out.println(grade);






    }
}
