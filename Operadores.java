public class Operadores{
    public static void main(String[] args){
    /*Operadores Aritméticos*/
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    /*Operadores de comparação*/
    /*Retornam FALSE OU TRUE*/
        int c = 20;
        int d = 15;
        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c >= d);
        System.out.println(c <= d);
    /*Operadores Lógicos*/
        boolean e = true;
        boolean f = false;
        System.out.println(e && f);/*E &&*/
        System.out.println(e || f);/*OU ||*/
        System.out.println(!e);/*NAO ! - negação, inverte valores, resposta aqui seria false */



    /*Operadores de Atribuição*/
        int g = 10;
        System.out.println(g += 5); 
        System.out.println(g -= 5);
        System.out.println(g *= 5);
        System.out.println(g /= 5);
        System.out.println(g %= 5);
    }
    

}