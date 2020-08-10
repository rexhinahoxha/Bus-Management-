import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A434CB77-FC7D-E05F-92B2-57281C33479C]
// </editor-fold> 
public class Role {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.470A831C-322F-72C7-FBD4-8B105ED8721B]
    // </editor-fold> 
    private int idRole;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DFAB94AF-F8ED-40F2-BB7E-57F20099EBC8]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.74E59980-6CB9-FE6D-CAAC-61566204E666]
    // </editor-fold> 
    private ArrayList<Employee> mEmployee= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F6EAE5F6-3CFD-FCCD-4441-98F4FAA193A8]
    // </editor-fold> 
    public Role () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4432AF10-948E-8102-C982-5533C9DC9E57]
    // </editor-fold> 
    public String getName () {
        return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EAE7B836-70AB-A532-6066-354278F0D505]
    // </editor-fold> 
    public void setName (String val) {
        this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C034B3A0-D728-37DE-0424-6F572C5307EC]
    // </editor-fold> 
    public int getIdRole () {
        return idRole;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B0DB5BBB-8308-A4E4-9513-240C8E61338A]
    // </editor-fold> 
    public void setIdRole (int val) {
        this.idRole = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B370560C-5395-5FDB-C086-B98B0F79B686]
    // </editor-fold> 
    public ArrayList<Employee> getEmployee () {
        return mEmployee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FBB1BDA2-5D98-16D4-EE63-8E978E5C1AF8]
    // </editor-fold> 
    public void setEmployee (ArrayList<Employee> val) {
        this.mEmployee = val;
    }

}

