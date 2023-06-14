package DotCom;

import java.util.ArrayList;
public class DotComBurst {
    private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();

    private GameHelper gameHelper = new GameHelper();

    private int numOfGuess;

    public static void main(String[] args) {
        DotComBurst game = new DotComBurst();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        dotComs.add(new DotCom("google.com"));
        dotComs.add(new DotCom("naver.com"));
        dotComs.add(new DotCom("kakao.com"));

        for (DotCom dotcom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotcom.setLocation(newLocation);
        }
    }

    public void startPlaying() {
        while (!dotComs.isEmpty()) {
            String userGuess = gameHelper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        for (DotCom dotCom : dotComs) {
            String result = dotCom.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComs.remove(dotCom);
            }
            System.out.println(result);
        }
    }
    private void finishGame() {
        if (numOfGuess < 18) {
            System.out.println("You did well!");
        } else {
            System.out.println("Not bed...");
        }
    }

}
