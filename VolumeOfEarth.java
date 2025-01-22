public class VolumeOfEarth {
    public static void main(String [] args){
        int earthRadius=6378;
        double volumeofearthinkm=(4/3.0)*Math.PI*Math.pow(earthRadius,3);
        double volumeofearthinmiles=(4/3.0)*Math.PI*Math.pow((earthRadius*1.6),3);
        System.out.println("The volume of earth in cubic kilometers is "+volumeofearthinkm+" and cubic miles is "+volumeofearthinmiles);
    }
}