public class JavaUniversität{
    public static int[] nichtAusreichendeNoten(int[] grades) {
        int cnt = 0;
        int[] inadequateGrades = new int[100];
        for (int grade : grades) {
            if (grade < 40) {
                inadequateGrades[cnt] = grade;
                cnt++;
            }
        }
        return inadequateGrades;
    }

    public static float durchschnittswert(int[] grades){
        float sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum/grades.length;
    }

    public static int[] abgerundeteNoten(int[] grades){
        int[] roundedGrades = new int[100];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > 38){
                if(grades[i] + 1 % 5 == 0){
                    roundedGrades[i] = grades[i] + 1;
                }
                else if(grades[i] + 2 % 5 == 0){
                    roundedGrades[i] = grades[i] + 2;
                }
                else{
                    roundedGrades[i] = grades[i];
                }
            }
            else{
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public static int maximaleAbgerundeteNote(int[] grades){
        int[] roundedGrades = new int[100];
        int maximalGrade = Integer.MIN_VALUE;
        roundedGrades = abgerundeteNoten(grades);
        for(int grade : grades){
            if(grade > maximalGrade){
                maximalGrade = grade;
            }
        }
        return maximalGrade;
    }

}