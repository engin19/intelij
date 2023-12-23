package class15;

public class Average {
    private String name;
    private double math;
    private double reading;
    private double science;
    public Average(String Sname,double Smath,double Sreading,double Sscience){
          name=Sname;
          math=Smath;
          reading=Sreading;
          science=Sscience;
    }
    void calcAve(){
        double avg=((math+reading+science)/3);
        System.out.println(name+" your average is :"+avg);
    }

}
