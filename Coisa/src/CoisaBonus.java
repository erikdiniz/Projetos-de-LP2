import java.util.Scanner;

public class CoisaBonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String comando = "";
        
        while (!comando.equals("X")){
            System.out.println("\n\n--- MENU ---\n\n 1. Registrar descanso\n 2. Adicionar tempo online\n 4. Informações sobre tempo online\n 5. Cadastrar disciplina\n 6. Cadastrar horas à disciplina\n 7. Cadastrar nota à disciplina\n 8. Status da disciplina\n 9. Adicionar resumo\n 10. Ver resumos\n 11. Fechar programa\n\n O que vamos fazer?");

            comando = sc.nextLine().toUpperCase();

            switch (comando){
                
                case "1":
                Descanso descanso = new Descanso();
                System.out.println("Por quantas semanas você descansou?");
                int semanas = sc.nextInt();
                descanso.defineNumeroSemanas(semanas);
                System.out.println("Quantas horas você descansou ao todo?");
                int horasDescanso = sc.nextInt();
                descanso.defineHorasDescanso(horasDescanso);
                System.out.println("\n\nVocê está " + descanso.getStatusGeral() + "!");
                String limpaBuffer = sc.nextLine();
                break;

                case "2":
                System.out.println("Qual o nome da disciplina?");
                String disciplinaHoras = sc.nextLine();
                System.out.println("Essa disciplina tem uma quantidade mínima de horas requisitadas? (s/n)");
                String esperado = sc.nextLine();
                if (esperado.toUpperCase().equals("S")){
                    System.out.println("Quantas horas são esperadas nessa disciplina?");
                    int horasEsperadas = sc.nextInt();
                    RegistroTempoOnline reg = new RegistroTempoOnline(disciplinaHoras, horasEsperadas);
                    System.out.println("Quantas horas você já dedicou a essa disciplina?");
                    int horasDedicadas = sc.nextInt();
                    reg.adicionaTempoOnline(horasDedicadas);
                    System.out.println("\n" + reg.toString());

                } else if (esperado.toUpperCase().equals("N")){
                    RegistroTempoOnline reg = new RegistroTempoOnline(disciplinaHoras);
                    System.out.println("Quantas horas você já dedicou a essa disciplina?");
                    int horasDedicadas = sc.nextInt();
                    reg.adicionaTempoOnline(horasDedicadas);
                    System.out.println("\n" + reg.toString());
                
                } else {
                    System.out.println("Opção inválida");
                }
                String limpaBuffer1 = sc.nextLine();
                break;
            }
        }
    }
}
