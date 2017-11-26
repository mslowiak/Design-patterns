package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        CargoSenderAdvisor cargoSenderAdvisor = new CargoSenderAdvisor();
        cargoSenderAdvisor.adviseSendingWay(new Cargo("Poland", 0.2));
        cargoSenderAdvisor.adviseSendingWay(new Cargo("Poland", 10));
        cargoSenderAdvisor.adviseSendingWay(new Cargo("Ukraine", 30));
        cargoSenderAdvisor.adviseSendingWay(new Cargo("USA", 30));
        cargoSenderAdvisor.adviseSendingWay(new Cargo("USA", 102));
    }
}
