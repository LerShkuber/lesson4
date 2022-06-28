package com.company;

public class Main {

    public static void main(String[] args) {
        // writBegin1◦Begin1◦
        //. Дана сторона квадрата a. Найти его периметр P = 4·a
        //Ввод или присвоение исходных данных
        /*
        int a = 5;
        //Вычисление результата
        int p = 4 * a;
        //Вывод результата
        System.out.println(p);
        */

        //Begin2◦ Дана сторона квадрата a. Найти его площадь S = a**2
        /*int a=8;
        int S=a*a;
        System.out.println("У квадрата со стороной "+a+" площадь " + S);
        */
        //Begin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве
        // значения π использовать 3.14.
        /*int d=10;
        final double pi = 3.14;
        double L = pi*d;
        System.out.println("У круга с диаметром" + d +" длина окружности" + L);
*/
        //Begin5. Дана длина ребра куба a. Найти объем куба V = a 3 и площадь его поверхности S = 6·a
       /* int a = 5;
        int V = a*a*a;
        int S = a*a*6;
        System.out.println("Объем куба: "+V);
        System.out.println("Площадь поверхности куба: "+S);
        */
        //Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти
        // его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
        int a = 2;
        int b = 3;
        int c = 4;
        int V = a*b*c;
        int S = 2*(a*b + b*c + a*c);
        System.out.println("Объем параллелепипеда равен" +V);
        System.out.println("Площадь поверхности равна" +S);
        */
        //Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
        int a = 3;
        int b = 4;
        int d = 2;
        double c = (double) (a+b) / d;
        System.out.println("Среднее арифметическое" + c);
        */
       // Begin9. Даны два неотрицательных числа a и b. Найти их среднее геометрическое,
        // то есть квадратный корень из их произведения: √a·b.
        double a = 3.45;
        double b = 7.2;
        double g_avg = Math.sqrt(a * b);
        System.out.println(g_avg);*/
       // Begin10. Даны два ненулевых числа. Найти сумму, разность, произведение ичастное их квадратов.
        int a=25;
        int b=45;
        int s=(a*a)+(b*b);
        int r=(b*b)-(a+a);
        int p=(a*a)*(a*a);
        double c=(a*a)/(double)(b*b);
        System.out.println("Сумма: "+s);
        System.out.println("Разность: "+r);
        System.out.println("Произведение: "+p);
        System.out.println("Частное: "+c);
        */
        //Begin11. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.
        int a=-5;
        int b=24;
        a=Math.abs(a);
        b=Math.abs(b);
        double s=a+b;
        System.out.println("Сумма модулей"+(int)s);
        s=a-b;
        System.out.println("Разность модулей"+(int)s);
        s=a*b;
        System.out.println("Произведение модулей"+(int)s);
        s=(double)a/b;
        System.out.println("Частное модулей"+s);
        */
        //Begin22. Поменять местами содержимое переменных A и B и вывести новые значения A и B.
        int a=3;
        int b=10;
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+"b="+b);*/
        //Begin12. Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
        c =√a 2 + b 2,P = a + b + c.
        int a =
        int b =
        int c =
        int p=





    }
}
