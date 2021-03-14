package calcula;

public class Programa {
    public static void main(String[] args) {

        Atendente funcionario = new Atendente("Mario", 1600, 0.01);
        funcionario.calculaImposto();

        Supervisor superior = new Supervisor("José", 15678, 0.05);
        superior.calculaImposto();

        Gerente dono = new Gerente("Maria", 50997, 0.1);
        dono.calculaImposto();

    }

}
