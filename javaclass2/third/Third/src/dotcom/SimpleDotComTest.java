package dotcom;

import java.util.ArrayList;

public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        //int[] location = {1, 2, 3};
        ArrayList<Integer> location = new ArrayList<>();
        location.add(1);
        location.add(2);
        location.add(3);
        simpleDotCom.setLocation(location);
        String guess="2";
        String result1 = simpleDotCom.checkYourself("1");
        String result2 = simpleDotCom.checkYourself("1");
        String result3 = simpleDotCom.checkYourself("1");



        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }


}
