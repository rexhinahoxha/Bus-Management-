import java.util.ArrayList; 
import java.util.Iterator;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7172550B-0B39-AC06-32F6-13F27BC1F34B]
// </editor-fold> 
public class BusManagement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.361169B4-CF20-E831-E5FD-1F1D0F396F49]
    // </editor-fold> 
    private ArrayList<Employee> mEmployee= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1A560AEC-40E1-D691-FCE8-B92EB1EA19B8]
    // </editor-fold> 
    private ArrayList<Bus> mBus= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.036C7AD0-52F8-0FBE-7CE2-160A4980F772]
    // </editor-fold> 
    private ArrayList<Timetable> mTimetable= new ArrayList();
    public static BusManagement instance= null;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2F42E74-2536-61D5-4134-9CC8720981E5]
    // </editor-fold> 
    public BusManagement () {
    }
    public static BusManagement getInstance()
    {
        if(instance==null)
            instance= new BusManagement();
        return instance;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.884F3D94-F088-6744-ECD7-3BD0D8815D47]
    // </editor-fold> 
    public ArrayList<Bus> getBus () {
        return mBus;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.22AF710A-2C28-F102-1933-8ED3195D7FAC]
    // </editor-fold> 
    public void setBus (ArrayList<Bus> val) {
        this.mBus = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB37739B-822A-73B2-03F6-8ACF42FF3B5B]
    // </editor-fold> 
    public ArrayList<Employee> getEmployee () {
        return mEmployee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6FFB86B7-44EC-E33E-C0EF-0660BE6C9FD3]
    // </editor-fold> 
    public void setEmployee (ArrayList<Employee> val) {
        this.mEmployee = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0E923843-6047-E37C-1F0B-E07EC32232C3]
    // </editor-fold> 
    public ArrayList<Timetable> getTimetable () {
        return mTimetable;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC397DE8-3FAC-65D2-2F7D-1AC4F249E2EE]
    // </editor-fold> 
    public void setTimetable (ArrayList<Timetable> val) {
        this.mTimetable = val;
    }

    
    public static void main(String[] args){
        //Initializing Bus Management 
        
        BusManagement bmanagement= new BusManagement();
        
        //Creating Bus Objects 
         Bus bus1= new Bus();
         bus1.setIdBus(1);
         bus1.setPlate("AA123BC");
         
         Bus bus2= new Bus();
         bus2.setIdBus(2);
         bus2.setPlate("AA124BC");
         
         Bus bus3= new Bus();
         bus3.setIdBus(3);
         bus3.setPlate("AA564BX");
         
         Bus bus4= new Bus();
         bus4.setIdBus(4);
         bus4.setPlate("AA563JX");
         
         Bus bus5= new Bus();
         bus5.setIdBus(5);
         bus5.setPlate("AA876JI");
         
         //adding bussess to Bus Management
         bmanagement.getBus().add(bus1);
         bmanagement.getBus().add(bus2);
         bmanagement.getBus().add(bus3);
         bmanagement.getBus().add(bus4);
         bmanagement.getBus().add(bus5);
         
         //Creating Roles 
         Role role1= new Role();
         role1.setIdRole(1);
         role1.setName("Driver");
         
         Role role2= new Role();
         role2.setIdRole(2);
         role2.setName("Busman");//faturino
         
         //Creating employee
         Employee employee1= new Employee();
         employee1.setIdEmployee(1);
         employee1.setName("Faik");
         employee1.setLastName("Fortuzi");
         
         Employee employee2= new Employee();
         employee2.setIdEmployee(2);
         employee2.setName("Enver");
         employee2.setLastName("Shaga");
         
         Employee employee3= new Employee();
         employee3.setIdEmployee(3);
         employee3.setName("Flladi");
         employee3.setLastName("Maja");
         
         Employee employee4= new Employee();
         employee4.setIdEmployee(4);
         employee4.setName("Trim");
         employee4.setLastName("Pasha");
         
         Employee employee5= new Employee();
         employee5.setIdEmployee(5);
         employee5.setName("Artur");
         employee5.setLastName("Pacolli");
         
         Employee employee6= new Employee();
         employee6.setIdEmployee(6);
         employee6.setName("Andi");
         employee6.setLastName("Fortuzi");
         
         Employee employee7= new Employee();
         employee7.setIdEmployee(7);
         employee7.setName("Elvis");
         employee7.setLastName("Shaga");
         
         Employee employee8= new Employee();
         employee8.setIdEmployee(8);
         employee8.setName("Denis");
         employee8.setLastName("Maja");
         
         Employee employee9= new Employee();
         employee9.setIdEmployee(9);
         employee9.setName("Fredi");
         employee9.setLastName("Pasha");
         
         Employee employee10= new Employee();
         employee10.setIdEmployee(10);
         employee10.setName("Adrian");
         employee10.setLastName("Pacolli");
         
         //assignin roles
         employee1.setRole(role1);
         employee2.setRole(role1);
         employee3.setRole(role1);
         employee4.setRole(role1);
         employee5.setRole(role1);
         employee6.setRole(role2);
         employee7.setRole(role2);
         employee8.setRole(role2);
         employee9.setRole(role2);
         employee10.setRole(role2);
         
         //Setting Driver and ticket man to bus 
         ArrayList busworker1= new ArrayList();
         busworker1.add(employee1);
         busworker1.add(employee6);
         bus1.setEmployee(busworker1);
         
         ArrayList busworker2= new ArrayList();
         busworker2.add(employee2);
         busworker2.add(employee7);
         bus2.setEmployee(busworker2);
         
         ArrayList busworker3= new ArrayList();
         busworker3.add(employee3);
         busworker3.add(employee8);
         bus3.setEmployee(busworker3);
         
         ArrayList busworker4= new ArrayList();
         busworker4.add(employee4);
         busworker4.add(employee9);
         bus4.setEmployee(busworker4);
         
         ArrayList busworker5= new ArrayList();
         busworker5.add(employee5);
         busworker5.add(employee10);
         bus5.setEmployee(busworker5);
         
         //setting bus to employee 
         employee1.setBus(bus1);
         employee2.setBus(bus2);
         employee3.setBus(bus3);
         employee4.setBus(bus4);
         employee5.setBus(bus5);
         employee6.setBus(bus1);
         employee7.setBus(bus2);
         employee8.setBus(bus3);
         employee9.setBus(bus4);
         employee10.setBus(bus5);
         
         // adding employees to bus management 
         
         bmanagement.getEmployee().add(employee1);
         bmanagement.getEmployee().add(employee2);
         bmanagement.getEmployee().add(employee3);
         bmanagement.getEmployee().add(employee4);
         bmanagement.getEmployee().add(employee5);
         bmanagement.getEmployee().add(employee6);
         bmanagement.getEmployee().add(employee7);
         bmanagement.getEmployee().add(employee8);
         bmanagement.getEmployee().add(employee9);
         bmanagement.getEmployee().add(employee10);
         
         // creating Timetable 
         Timetable t1= new Timetable();
         t1.setID(1);
         t1.setDate("2020-01-01");
         t1.setStartTime("08.00 am");
         t1.setEndTime("08.30 am");
         
         Timetable t2= new Timetable();
         t2.setID(2);
         t2.setDate("2020-01-01");
         t2.setStartTime("08.10 am");
         t2.setEndTime("08.40 am");
         
         Timetable t3= new Timetable();
         t3.setID(3);
         t3.setDate("2020-01-01");
         t3.setStartTime("08.20 am");
         t3.setEndTime("08.50 am");
         
         Timetable t4= new Timetable();
         t4.setID(4);
         t4.setDate("2020-01-01");
         t4.setStartTime("08.30 am");
         t4.setEndTime("09.00 am");
         
         Timetable t5= new Timetable();
         t5.setID(5);
         t5.setDate("2020-01-01");
         t5.setStartTime("09.00 am");
         t5.setEndTime("09.30 am");
         
         Timetable t6= new Timetable();
         t6.setID(6);
         t6.setDate("2020-01-01");
         t6.setStartTime("09.35 am");
         t6.setEndTime("10.05 am");
         
         Timetable t7= new Timetable();
         t7.setID(7);
         t7.setDate("2020-01-01");
         t7.setStartTime("10.05 am");
         t7.setEndTime("10.35 am");
         
         Timetable t8= new Timetable();
         t8.setID(8);
         t8.setDate("2020-01-01");
         t8.setStartTime("10.15 am");
         t8.setEndTime("10.45 am");
                 
         Timetable t10= new Timetable();
         t10.setID(10);
         t10.setDate("2020-01-02");
         t10.setStartTime("08.10 am");
         t10.setEndTime("08.40 am");
         
         Timetable t11= new Timetable();
         t11.setID(11);
         t11.setDate("2020-01-02");
         t11.setStartTime("08.20 am");
         t11.setEndTime("08.50 am");
         
         Timetable t12= new Timetable();
         t12.setID(12);
         t12.setDate("2020-01-02");
         t12.setStartTime("08.30 am");
         t12.setEndTime("09.00 am");
         
         Timetable t13= new Timetable();
         t13.setID(13);
         t13.setDate("2020-01-02");
         t13.setStartTime("09.00 am");
         t13.setEndTime("09.30 am");
         
         Timetable t14= new Timetable();
         t14.setID(14);
         t14.setDate("2020-01-03");
         t14.setStartTime("09.35 am");
         t14.setEndTime("10.05 am");
         
         Timetable t15= new Timetable();
         t15.setID(15);
         t15.setDate("2020-01-03");
         t15.setStartTime("10.05 am");
         t15.setEndTime("10.35 am");
         
         
         
         // setting timetable to busses
         ArrayList b1= new ArrayList();
         b1.add(t1);
         b1.add(t4);
         b1.add(t10);
         b1.add(t13);
         bus1.setTimetable(b1);
         
         ArrayList b2= new ArrayList();
         b2.add(t2);
         b2.add(t5);
         b2.add(t11);
         bus2.setTimetable(b2);
         
         ArrayList b3= new ArrayList();
         b3.add(t3);
         b3.add(t6);
         b3.add(t12);
         bus3.setTimetable(b3);
         
         ArrayList b4= new ArrayList();
         b4.add(t7);    
         b4.add(t14); 
         bus1.setTimetable(b4);
         
         ArrayList b5= new ArrayList();
         b5.add(t8); 
         b5.add(t15);        
         bus5.setTimetable(b5);
         
         //setting busses to timetable 
         t1.setBus(bus1);
         t4.setBus(bus1);
         t10.setBus(bus1);
         t13.setBus(bus1);
         t2.setBus(bus2);
         t5.setBus(bus2);
         t11.setBus(bus2);
         t3.setBus(bus3);
         t6.setBus(bus3);
         t12.setBus(bus3);
         t7.setBus(bus4);
         t14.setBus(bus4);
         t8.setBus(bus5);
         t15.setBus(bus5);
         
         //setting timetable to bus management 
         bmanagement.getTimetable().add(t1);
         bmanagement.getTimetable().add(t2);
         bmanagement.getTimetable().add(t3);
         bmanagement.getTimetable().add(t4);
         bmanagement.getTimetable().add(t5);
         bmanagement.getTimetable().add(t6);
         bmanagement.getTimetable().add(t7);
         bmanagement.getTimetable().add(t8);
         
         bmanagement.getTimetable().add(t10);
         bmanagement.getTimetable().add(t11);
         bmanagement.getTimetable().add(t12);
         bmanagement.getTimetable().add(t13);
         bmanagement.getTimetable().add(t14);
         bmanagement.getTimetable().add(t15);
        
         
         System.out.println("Crreating Reports"); 
         
         System.out.println("\nAll busses of the company are");         
         Iterator allbusses= bmanagement.getBus().iterator();
         while (allbusses.hasNext()){
             Bus bus= (Bus)allbusses.next();
             System.out.println("Bus number "+ bus.getIdBus()+ " has Plate number "+ bus.getPlate());
         }
         
         System.out.println("\nAll employees of the company are");         
         Iterator allempl= bmanagement.getEmployee().iterator();
         while (allempl.hasNext()){
             Employee empl=(Employee)allempl.next();
             System.out.println("Employee with id "+empl.getIdEmployee()+" is "+ empl.toString()+ " with role "+ empl.getRole().getName());
         }
         
         System.out.println("\nAll timetables of the company are");
         Iterator alltimetable= bmanagement.getTimetable().iterator();
         while (alltimetable.hasNext()){
             Timetable t= (Timetable)alltimetable.next();
             System.out.println("Timetable with id "+ t.getID() + " on date "+ t.getDate() +" has start time "+ t.getStartTime() +" and end time "+ t.getEndTime());
         }
         
         System.out.println("\nWhich employee works on what bus? And what Role has him?");
         
         Iterator bempl= bmanagement.getBus().iterator();
         while (bempl.hasNext()){
             Bus bus= (Bus)bempl.next();
             Iterator em= bus.getEmployee().iterator();
             while (em.hasNext()){
                 Employee em1=(Employee)em.next();
                 System.out.println("On Bus with Plate " + bus.getPlate() +" work employees " 
                         + em1.toString()+" with role "+ em1.getRole().getName());
             }
         }
         
          System.out.println("\nWhat are the timetable details?");
        Iterator alltimetable1= bmanagement.getTimetable().iterator();
         while (alltimetable1.hasNext()){
             Timetable time11= (Timetable)alltimetable1.next();
             System.out.println("Timetable with id "+ time11.getID() + " on date "+ time11.getDate() 
                     +" has start time "+ time11.getStartTime() +" and end time "+ time11.getEndTime()+" for bus plate " 
                     + time11.getBus().getPlate());
         }
         System.out.println("\nWhat is the timetable on date 2020-01-03?");
        Iterator dtimetable= bmanagement.getTimetable().iterator();
         while (dtimetable.hasNext()){
             Timetable time11= (Timetable)dtimetable.next();
             if(time11.getDate().equals("2020-01-03")){
             System.out.println("Timetable with id "+ time11.getID() + " on date "+ time11.getDate() 
                     +" has start time "+ time11.getStartTime() +" and end time "+ time11.getEndTime()+" for bus plate " 
                     + time11.getBus().getPlate());
             }
         }
         
         System.out.println("\nWhat is the timetable for each bus?");
        Iterator alltimetable2= bmanagement.getBus().iterator();
         while (alltimetable2.hasNext()){
             Bus buss= (Bus)alltimetable2.next();
             Iterator time=buss.getTimetable().iterator();
             while (time.hasNext()){
                 Timetable tim1=(Timetable)time.next();
             System.out.println("Bus with plate " + buss.getPlate()+ " has timetable on date " +tim1.getDate() + " Timetable with start time "
             + tim1.getStartTime()+" and end time " + tim1.getEndTime());
         }
         }
         
         System.out.println("\nWhat is the timetable for bus with plate 'AA123BC'?");
        Iterator alltimetable3= bmanagement.getBus().iterator();
         while (alltimetable3.hasNext()){
             Bus buss= (Bus)alltimetable3.next();
             if(buss.getPlate().equals("AA123BC"))
             {
             Iterator time=buss.getTimetable().iterator();
             while (time.hasNext()){
                 Timetable tim1=(Timetable)time.next();
             System.out.println("Bus with plate " + buss.getPlate()+ " has timetable on date " +tim1.getDate() + " Timetable with start time "
             + tim1.getStartTime()+" and end time " + tim1.getEndTime());
                                    }
         }
         }
         
                  
         
    }
}

