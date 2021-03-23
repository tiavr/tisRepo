package fc;

import javax.lang.model.element.VariableElement;

public class Variables {
    private String[] pays;

    public Variables(){

        pays = new String[]{"FRANCE", "ALLEMAGNE", "ESPAGNE", "ITALIE", "ANGLETERRE"};
    }

    public String[] getPays(){

        return pays;
    }


}
