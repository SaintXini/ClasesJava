package clase8_POO.modifacodres_acceso;

public class Student {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 60;
    }
}
