public class Main {
    public static void main(String[] args) {
        calculateScore(true,800,5,100);
//         int methodScore =calculateScoreInt(true,10000,8,200);
        System.out.println("Your final score was " + calculateScoreInt(true,10000,8,200));
        int position = calculatingHighScorePosition(30);
        displayHighScorePosition("Easin", position);

    }
    public static void calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScoreInt(boolean isGameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
    public  static  void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " should to get into position "
                + position + " on the high score list");
    }
    public  static  int calculatingHighScorePosition(int score){
        int result;
        if(score >=1000){
            result = 1;
        }else if(score >= 500 && score <1000){
            result = 2;
        }else if(score >= 100 && score <500){
            result = 3;
        }else{
            result = 4;
        }
        return result;
    }

}