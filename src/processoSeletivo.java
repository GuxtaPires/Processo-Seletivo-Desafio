import java.util.concurrent.ThreadLocalRandom;
public class processoSeletivo{
    public static void main(String[] args) {
        String [] candidatos = {"ana","joao","gabriel","gustavo","eduardo",};
        for (String candidato : candidatos){
            ligar(candidato);
        }
    }

    static void ligar(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !continuarTentando;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado");
        }while(continuarTentando && tentativasRealizadas < 3);

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"ana","joao","gabriel","gustavo","eduardo",};
        System.out.println("Informando os candidatos");
        for(int indice=0;indice < candidatos.length;indice++)
        {
            System.out.println("O candidato de numero " + (indice + 1) + "º é o " + candidatos[indice]);        
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"ana","joao","gabriel","gustavo","eduardo","vinicius","sabrina"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " Solicitou esse valor " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("candidato selecionado");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
        {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioPretendido)
        {
            System.out.println("Ligar ao candidato com contraproposta");
        }
        else
        {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}