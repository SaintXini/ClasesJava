package clase08_POO.clase;

public class Student {
    // Atributo
    int score;

    // constructor
    public Student (int score) {
        this.score = score;
    }

    // metodo
    public void aprobo(){
        if (score >= 60){
            System.out.println("El estudiante aprobo");
        } else {
            System.out.println("El estudiante no aprobo");
        }
    }



}
