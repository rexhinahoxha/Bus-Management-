
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.93980311-2A55-F7D1-CBF6-7A40A40D9346]
// </editor-fold> 
public class Employee {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1938B863-FF69-FDCA-9F3E-BD83308ABADD]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CCED4385-1C13-55EB-1239-1C1C7BF1FECF]
    // </editor-fold> 
    private String LastName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5153911F-5048-1070-3156-8773216136D4]
    // </editor-fold> 
    private int idEmployee;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.220F6000-DFC2-6FC4-7202-91576BF97A09]
    // </editor-fold> 
    private Role mRole;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F4B9A0A-EE89-1C91-4301-CE98E9D5E5F9]
    // </editor-fold> 
    private Bus mBus;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5218540F-48E7-054C-2548-AAAAE9DB9D02]
    // </editor-fold> 
    public Employee () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F96127F3-C45C-9AF5-AAB2-EF2D75E42087]
    // </editor-fold> 
    public String getLastName () {
        return LastName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DAEE1789-5D4E-9B7E-3D3D-CB637310BC14]
    // </editor-fold> 
    public void setLastName (String val) {
        this.LastName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F65ABAA7-02D1-F95C-BD2A-F0DEE97565B2]
    // </editor-fold> 
    public String getName () {
        return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B396BF7F-419F-FA15-70D9-1404CE8147E4]
    // </editor-fold> 
    public void setName (String val) {
        this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B5FF883B-7895-D572-DEC1-08EB386C46CD]
    // </editor-fold> 
    public int getIdEmployee () {
        return idEmployee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.30B53C6A-1B24-025A-37CC-02F707265319]
    // </editor-fold> 
    public void setIdEmployee (int val) {
        this.idEmployee = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F1BB79B1-591C-EABF-4C84-58FF6B376671]
    // </editor-fold> 
    public Bus getBus () {
        return mBus;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B708A984-C09D-E6C7-29B5-943820572A36]
    // </editor-fold> 
    public void setBus (Bus val) {
        this.mBus = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A366C1B4-2470-F908-3D24-0DE467E23A27]
    // </editor-fold> 
    public Role getRole () {
        return mRole;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.46EFFD38-4F64-EB72-9AFE-2BF755650AC4]
    // </editor-fold> 
    public void setRole (Role val) {
        this.mRole = val;
    }
@Override 
public String toString(){
    return Name+" "+LastName;
}
}

