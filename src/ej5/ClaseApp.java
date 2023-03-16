package ej5;
public class ClaseApp {
    
    public static void main(String[] args) {
        Aula aula = new Aula(1671, 28, "matematicas");
        Aula aula2 = new Aula(3673, 26, "filosofía");
        Aula aula3 = new Aula(4564, 22, "fisica");
        Profesor prof1 = new Profesor("Antonio", "H", 30,"fisica");
        Profesor prof2 = new Profesor("Jose", "H", 35, "matematicas");
        Profesor prof3 = new Profesor("Carmen", "M", 28, "filosofia");
        Estudiantes estu1 = new Estudiantes("Jaimito", "H", 17,5.5);            
        Estudiantes estu2 = new Estudiantes("Pedro", "H", 17,6.4);
        Estudiantes estu3 = new Estudiantes("Fernando", "M", 17,7.5);
        Estudiantes estu4 = new Estudiantes("Maximiliano", "H", 17,4.6);
        Estudiantes estu5 = new Estudiantes("Juan Carlos", "H", 17,9.5);
        Estudiantes estu6 = new Estudiantes("Marcos", "H", 17,8.3);
        Estudiantes estu7 = new Estudiantes("Ivan", "M", 17,3.2);
        Estudiantes estu8 = new Estudiantes("Jesús", "M", 17,4.3);
        Estudiantes estu9 = new Estudiantes("Maria", "M", 17,5.1);
        Estudiantes estu10 = new Estudiantes("Jose", "H", 17,8.0);
        Estudiantes estu11 = new Estudiantes("David", "H", 17,4.7);
        Estudiantes estu12 = new Estudiantes("Alex", "H", 17,9.0);

    hacerNovillos(estu1);
    }

}