package LAB_Assignment_2;
class S4_Tape extends S4_Publication {
    private int playingTime;

    public int getPlayingTime() {
        return playingTime;
    }
    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
}