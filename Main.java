public class Main {
    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("CR7", 39, "Al-Nassr", 901);
        SoccerPlayer player2 = new SoccerPlayer("CR7", 39, "IAl-Nassr", 901);

        System.out.println(player1.equals(player2));
    }
}
