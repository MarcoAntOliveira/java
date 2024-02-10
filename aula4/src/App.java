public class App {
    public static void main(String[] args) throws Exception {
        String numero1 = "40";
        String numero2 = "50";

        Integer x = Integer.parseInt(numero1);
        Integer y = Integer.parseInt(numero2);

        Double price = 5.30;
        Double price_valor = 4.40;
        Double sum = price + price_valor;

        System.out.println(sum);
        System.out.println(x + y);
        System.out.println( numero1+numero2);
    }
}
