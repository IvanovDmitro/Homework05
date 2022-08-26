package competition;

public class Participant implements Capabilities {

    private final String name;
    private final int maxRun;
    private final int maxJump;
    protected boolean isPass;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    void checkObstacle(Obstacles obstacles) {
        if (obstacles instanceof RunningTrack) {
            this.run(obstacles);
        } else if (obstacles instanceof Wall) {
            this.jump(obstacles);
        }
    }

    @Override
    public void run(Obstacles runningTrack) {
        if (runningTrack.overcome(maxRun)) {
            isPass = true;
            System.out.println("Participant " + name + " passed obstacle running track at distance "
                    + runningTrack.getNameObstacle());
        } else {
            isPass = false;
            System.out.println("Participant " + name + " didn't pass obstacle running track at distance "
                    + runningTrack.getNameObstacle() + " passed only " + maxRun);
        }
    }

    @Override
    public void jump(Obstacles wall) {
        if (wall.overcome(maxJump)) {
            isPass = true;
            System.out.println("Participant " + name + " passed obstacle wall at distance "
                    + wall.getNameObstacle());
        } else {
            isPass = false;
            System.out.println("Participant " + name + " didn't pass obstacle wall at distance "
                    + wall.getNameObstacle() + " passed only " + maxJump);
        }
    }

    public boolean isPass() {
        return isPass;
    }
}
