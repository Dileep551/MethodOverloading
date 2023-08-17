public class Main {
    public static void main(String[] args) {
        System.out.println("New score is "+ calculateScore("Tim", 50));
        System.out.println("New Score is "+ calculateScore(10));

    calculateScore(75);
    calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName +" scored "+ score +" points");
        return score * 1000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed player scored "+ score +" points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player name, no player score");
        return 0;
    }

}