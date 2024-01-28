package variables;

public class School {

    private int classroomAmount = 10;
    private int studentAmmount = 86;
    private int teachersAMount = 14;
    private double averageTeacherSalary = 70_000.0;
    private double totalExpenditure = 1_206_724.86;
    private double totalBudget = 1_500_000.0;
    private String name = "Red Mountain High School";
    private boolean isAccredited = true;

    public int studentsPerClassroom(){
       return Math.round((float) studentAmmount/classroomAmount);

    }

    public double costPerStudent(){
        double expenditureTeacher = teachersAMount * averageTeacherSalary;
        double studentExpenditure = totalExpenditure - expenditureTeacher;
        return studentExpenditure/studentAmmount;
    }

    public double costPerClassroom(){
       return studentsPerClassroom()*costPerStudent();
    }

    public boolean isWithinBudget(){
       return totalBudget > totalExpenditure;
    }

    public double roundToNearestCent(double value){
        int numPennies = (int) (value * 100);
       return numPennies/ 100.0 ;

    }

    public void main() {
    System.out.println("Students per classroom: " + studentsPerClassroom());
    System.out.println("Cost per student: " + roundToNearestCent(costPerStudent()));
    System.out.println("Cost per classroom: " + roundToNearestCent(costPerClassroom()));
    }
}
