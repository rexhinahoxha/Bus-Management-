import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4589760A-4F75-54F2-1ED3-1B428B0EC575]
// </editor-fold> 
public class Bus {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A5B3FB6A-E77B-F06B-FFC3-D68F091ABD00]
    // </editor-fold> 
    private String Plate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2B84D28E-D817-B5ED-779E-6C9D2E5193E1]
    // </editor-fold> 
    private int idBus;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FA98146-1B7F-9656-EE94-E3EA22D7B55A]
    // </editor-fold> 
    private ArrayList<Employee> mEmployee= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C946EFE3-5588-1517-682B-31FA76E6B5FB]
    // </editor-fold> 
    private ArrayList<Timetable> mTimetable= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CF049758-122E-8231-52C2-27413F8DF71F]
    // </editor-fold> 
    public Bus () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.806642DF-2CCC-7478-2B1F-C7C51BFC36AF]
    // </editor-fold> 
    public String getPlate () {
        return Plate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5DE2DE1C-8EBF-41F7-5644-59755BDD8E7E]
    // </editor-fold> 
    public void setPlate (String val) {
        this.Plate = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DFFA6801-A39A-F582-6D1B-224B0CC58B37]
    // </editor-fold> 
    public int getIdBus () {
        return idBus;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F372454E-A24B-899A-5491-7AB55CFC5497]
    // </editor-fold> 
    public void setIdBus (int val) {
        this.idBus = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24A92253-F8BC-7F11-25E6-D417D698757C]
    // </editor-fold> 
    public ArrayList<Employee> getEmployee () {
        return mEmployee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.864857EB-2AD4-9243-D456-5B90C1CDAD19]
    // </editor-fold> 
    public void setEmployee (ArrayList<Employee> val) {
        this.mEmployee = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF99D7DB-78AE-2298-B496-6B208A3DE1E7]
    // </editor-fold> 
    public ArrayList<Timetable> getTimetable () {
        return mTimetable;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0AD2440E-9B20-8104-B237-F81ACDCD76D3]
    // </editor-fold> 
    public void setTimetable (ArrayList<Timetable> val) {
        this.mTimetable = val;
    }
@Override 
public String toString(){
    return Plate;
}
}

