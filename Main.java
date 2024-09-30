public class Main {
    public static void main(String[] args) {

        // 5 soccer players
        SoccerPlayer player1 = new SoccerPlayer("Messi", 36, "Inter Miami", 850);
        SoccerPlayer player2 = new SoccerPlayer("CR7", 38, "Al Nassr", 901);
        SoccerPlayer player3 = new SoccerPlayer("Neymar", 31, "Al Hilal", 450);
        SoccerPlayer player4 = new SoccerPlayer("Villa", 38, "Barca", 250);\

        // Constructor without a team
        SoccerPlayer player5 = new SoccerPlayer("Salah", 33, 200);


        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);


        SoccerPlayer player6 = new SoccerPlayer("CR7", 39, "Al-Nassr", 901);
        SoccerPlayer player7 = new SoccerPlayer("CR7", 39, "Al-Nassr", 901);


        System.out.println(player6.equals(player7)); /
    }
}
