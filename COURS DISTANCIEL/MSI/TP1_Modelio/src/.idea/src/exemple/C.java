package exemple;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cc0a014d-1ad8-4c00-8d86-d7691f26f440")
public class C {
    @objid ("d78babbb-1641-4f2d-bc60-232557bd9a46")
    private List<A> a = new ArrayList<A> ();

    @objid ("c442ae33-8680-47b8-b441-9d99fcb4af41")
    List<A> getA() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.a;
    }

    @objid ("bfab8b8c-d96e-449f-86dd-396d0c2e6949")
    void setA(List<A> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.a = value;
    }

}
