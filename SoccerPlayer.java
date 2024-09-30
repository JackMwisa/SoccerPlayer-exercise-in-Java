import java.util.Objects;

public class SoccerPlayer {
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }


    public SoccerPlayer(String name, int age, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = "Unknown";
        this.scoredGoals = scoredGoals;
    }


    public SoccerPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return age == that.age &&
                scoredGoals == that.scoredGoals &&
                Objects.equals(name, that.name) &&
                Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, team, scoredGoals);
    }


}