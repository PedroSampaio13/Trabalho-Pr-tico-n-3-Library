import java.util.*;

public class NumberUtils {

    //Calcular a media da lista de numeros
    public static double calcularMedia(List<Double> numeros){
        double soma = 0.0;

        for (double num: numeros){
            soma += num;
        }

        return soma / numeros.size();
    }

    //Calcular a mediana da lista de numeros
    public static double calcularMedian(List<Double> numeros){
        List<Double> numeroOrganizados = new ArrayList<>(numeros);
        Collections.sort(numeroOrganizados);
        int tamanho = numeroOrganizados.size();
        if (tamanho % 2 == 0){
            return (numeroOrganizados.get(tamanho / 2-1) + numeroOrganizados.get(tamanho / 2));
        }else {
            return numeroOrganizados.get(tamanho / 2);
        }
    }

    //Calcular a moda da lista de numeros
    public static List<Double> calcularModa(List<Double> numeros){
        Map<Double, Integer> mapaDeFrequencia = new HashMap<>();
        for (double num: numeros){
            mapaDeFrequencia.put(num, mapaDeFrequencia.getOrDefault(num, 0) + 1);
        }

        int frequenciaMaxima = Collections.max(mapaDeFrequencia.values());
        List<Double> moda = new ArrayList<>();
        for (Map.Entry<Double, Integer> entry: mapaDeFrequencia.entrySet()){
            if (entry.getValue() == frequenciaMaxima){
                moda.add(entry.getKey());
            }
        }
        return moda;
    }

    //Ordenar as listas por ordem crescete ou decrescente
    public static void ordenar(List<Double> numeros, boolean crescente){
        if (crescente){
            Collections.sort(numeros);
        } else {
            Collections.sort(numeros,Collections.reverseOrder());
        }
    }
}
