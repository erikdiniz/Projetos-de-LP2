import java.util.Arrays;

public class Disciplina {
    private String nome;
    private double[] notas;
    private int horasEstudo;
    private double media;
    private int[] pesos;

    public Disciplina(String nome){
        this.nome = nome;
        this.notas = new double[4];
        this.horasEstudo = 0;
        this.media = 0;
    }

    public Disciplina(String nome, int qntdNotas){
        this.nome = nome;
        this.notas = new double[qntdNotas];
        this.horasEstudo = 0;
        this.media = 0;
    }

    public Disciplina(String nome, int qntdNotas, int[] pesos){
        this.nome = nome;
        this.notas = new double[qntdNotas];
        this.horasEstudo = 0;
        this.media = 0;
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas){
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    private double calculaMedia(double[] notas, int[] pesos){
        double soma = 0;
        double somaPesos = 0;
        if (pesos == null){
            for (int i = 0; i < notas.length; i++){
                soma += notas[i];
            }
            media = soma/notas.length;
        } else {
            for (int i = 0; i < notas.length; i++){
                soma += notas[i]*pesos[i];
                somaPesos += pesos[i];
            }
            media = soma/somaPesos;
        }

        return media;
    }

    public boolean aprovado(){
        if (calculaMedia(notas, pesos) < 7){
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return nome + " " + horasEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
