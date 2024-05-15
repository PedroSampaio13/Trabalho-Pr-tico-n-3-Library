import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double > numeros = new ArrayList<>();
        numeros.add(1.1);
        numeros.add(1.2);
        numeros.add(3.4);
        numeros.add(15.1);
        numeros.add(1.1);
        double media = NumberUtils.calcularMedia(numeros);
        System.out.println("Media: "+media);
        double mediana = NumberUtils.calcularMedian(numeros);
        System.out.println("Mediana: "+mediana);
        List<Double> moda = NumberUtils.calcularModa(numeros);
        System.out.println("Moda: "+moda);
        List<Double> numerosCrescentes = new ArrayList<>(numeros);
        NumberUtils.ordenar(numerosCrescentes,true);
        System.out.println("Ordem crescente: "+numerosCrescentes);
        List<Double> numerosDescrescentes = new ArrayList<>(numeros);
        NumberUtils.ordenar(numerosDescrescentes,false);
        System.out.println("Ordem descrescente: "+numerosDescrescentes);
    }
}