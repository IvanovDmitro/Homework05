package competition;

public class Participant implements Capabilities {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    boolean checkObstacle(Obstacles obstacles) {
        if (obstacles instanceof RunningTrack) {
            return this.run(obstacles);
        } else if (obstacles instanceof Wall) {
            return this.jump(obstacles);
        }
        return true;
    }

    @Override
    public boolean run(Obstacles runningTrack) {
        if (runningTrack.overcome(maxRun)) {
            System.out.printf("Participant %s pass obstacle running track at distance %s\n"
                    , name, runningTrack.getNameObstacle());
            return true;
        } else {
            System.out.printf("Participant %s didn't pass obstacle running track at distance %s passed only %d\n"
                    , name, runningTrack.getNameObstacle(), maxRun);
            return false;
        }
    }

    @Override
    public boolean jump(Obstacles wall) {
        if (wall.overcome(maxJump)) {
            System.out.printf("Participant %s pass obstacle wall at distance %s\n"
                    , name, wall.getNameObstacle());
            return true;
        } else {
            System.out.printf("Participant %s didn't pass obstacle wall at distance %s passed only %d\n"
                    , name, wall.getNameObstacle(), maxJump);
            return false;
        }
    }
}
