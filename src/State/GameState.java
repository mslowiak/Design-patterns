package State;

public interface GameState {
    void startGame(GameSupervisor gameSupervisor);
    boolean isStarted();
}
