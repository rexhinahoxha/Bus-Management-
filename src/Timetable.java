

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CDFA009B-4F37-DAA1-DE7A-461B6236ACE2]
// </editor-fold> 
public class Timetable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.717035FA-335D-2B01-D42E-23A938E439A0]
    // </editor-fold> 
    private String Date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C5920872-C193-DA94-7637-8A389B25E2F9]
    // </editor-fold> 
    private int ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F2B7E1AC-DB12-51B4-507F-9DD7C6459445]
    // </editor-fold> 
    private String StartTime;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B681F08-A98E-83EA-A305-D0BAB937BCFA]
    // </editor-fold> 
    private String EndTime;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.30698ED2-CD10-4C1C-10A0-BAF45E33CF77]
    // </editor-fold> 
    private Bus mBus;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05219BA6-5DED-08D6-436C-B7464E471003]
    // </editor-fold> 
    public Timetable () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0BCF5BC7-4126-2869-BB7A-FEF8B6F27E9F]
    // </editor-fold> 
    public String getDate () {
        return Date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4E873EF5-4334-1084-FBE3-69BECD1D0BA3]
    // </editor-fold> 
    public void setDate (String val) {
        this.Date = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.77AFD51F-2B01-9825-F336-F42182703502]
    // </editor-fold> 
    public String getEndTime () {
        return EndTime;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CBE717E9-A287-1890-3FC7-C1190FB9DA94]
    // </editor-fold> 
    public void setEndTime (String val) {
        this.EndTime = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.79FCE7FC-BC82-9E7F-1E7F-F08C853E47B7]
    // </editor-fold> 
    public int getID () {
        return ID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E552670-BCE6-8913-9676-762867156BA9]
    // </editor-fold> 
    public void setID (int val) {
        this.ID = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.27DC6D84-16DA-DF31-7556-231F07656616]
    // </editor-fold> 
    public String getStartTime () {
        return StartTime;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D03BAC76-069D-1924-AF8A-EF31D4B5D8DB]
    // </editor-fold> 
    public void setStartTime (String val) {
        this.StartTime = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5FF29253-4EC9-3859-A9D7-7AB895702D14]
    // </editor-fold> 
    public void setBus (Bus val) {
        this.mBus=val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D4E7183F-0989-A81F-AF24-2913AC6DEE38]
    // </editor-fold> 
    public Bus getBus () {
        return mBus;
    }
@Override 
public String toString(){
    return Date+ " "+ StartTime +" " + EndTime;
}
}

