public class Students {
    private String nome;
    private int roll_number;
    private double[] marks;

    public Students(String nome, int roll_number, double[] marks){
        this.nome = nome;
        this.roll_number = roll_number;
        this.marks = marks;
    }
    
    private double average(){
        double sum = 0;

        for(double mark : marks){
            sum += mark;
        }
        return sum/marks.length;
    }

    public void displayStudent(){
        System.out.printf("Estudante: %s, Matricula: %d, Média: %.2f", nome, roll_number, average());
    }
}
