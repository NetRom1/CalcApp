public class Main {
    public static void main(String[] args) {
        Calculator calc =  Calculator.instance.get();

        int a = calc.plus.apply(3, 3);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(a, b);
        int f = calc.pow.apply(a);
        int s = calc.abs.apply(-5);
        boolean k = calc.isPositive.test(5);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(f);
        calc.println.accept(s);
        calc.println1.accept(k);






    }
}
