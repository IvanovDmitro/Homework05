package competition;

public class RunningTrack implements Obstacles {
    private final int lengthRunningTrack;

    public RunningTrack(int lengthRunningTrack) {
        this.lengthRunningTrack = lengthRunningTrack;
    }

    @Override
    public boolean overcome(int maxRun) {
        return maxRun > lengthRunningTrack;
    }

    @Override
    public String getNameObstacle() {
        return lengthRunningTrack + " meters";
    }
}