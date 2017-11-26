package State;

public class GameStartedState implements GameState {
    @Override
    public void startGame(GameSupervisor gameSupervisor) {
        System.out.println("Game is already started");
    }

    @Override
    public boolean isStarted() {
        return true;
    }
}
