public class MediaDouble {
    public static void main(String[] args){
        double[] array = {4.5, 5.3, 4.8, 6.5, 3.9};
        double soma = 0;

        for(int i=0; i<array.length; i++){
            soma += array[i];
        }
        double media = (soma/array.length);
        System.out.println("A média é: " + media);
    }
}