package lecture_1_Java_basic;

/*
    Демонстрация использования переменных.

*/
public class Example2 {
    public static void main(String[] args) {
        int var1;   //  Объявляется переменная
        int var2;   //  Объявляется ещё одна переменная

        var1 = 1024;    //  переменной var1 присваивается значение 1024

        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
    }
}
