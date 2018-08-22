package Switch;

public class Principal {
    public static void main(String[] args) {
        Switch controleSwitch = new Switch();

        controleSwitch.verificaPortas();
        controleSwitch.liberaPorta(9);
        controleSwitch.verificaPortas();
        controleSwitch.ocupaPorta(3);
        controleSwitch.liberaPorta(2);
        controleSwitch.verificaPortas();
        controleSwitch.ocupaPorta(1);
        controleSwitch.verificaPortas();
        controleSwitch.reset();
        controleSwitch.verificaPortas();

    }

}
