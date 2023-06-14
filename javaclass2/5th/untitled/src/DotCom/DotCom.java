package DotCom;

import java.util.ArrayList;

public class DotCom {
    private String name;

    ArrayList<String> location;

    public DotCom(String name) {
        this.name = name;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String checkYourSelf(String userInput) {
        String status = "miss";

        int index = location.indexOf(userInput);
        if (index >= 0) {
            location.remove(index);
            if (location.isEmpty()) {
                status = "kill";
            } else {
                status = "hit";
            }
        }

        return status;
    }
}

