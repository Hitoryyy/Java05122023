package lecture_1_Java_basic;

/*
    Демонстрация различий между типами int и double.
*/
public class Example3 {
    public static void main(String[] args) {
        int var;    //  объявить целочисленную переменную
        double x;   //  объявить переменную с плавающей точкой

        var = 10;   //  присвоить переменной var значение 10
        x = 10.0;   //  присвоить переменной x значение 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();   //  вывести пустую строку

        //  Разделить значения обеих переменных на 4
        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменной var после деления: " +
                var);
        System.out.println("Значение переменной x после деления: " + x);
    }
}
