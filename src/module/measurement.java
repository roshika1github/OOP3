package module;

public class measurement {
    public double value;


public static String SI_Unit="meter";

    public measurement(double value) {
        this.value = value;


public double getCm(){
    value= value*100;
    return;

public double getKm(){
    value=value/1000;
    return;


public double getMm(){
    value=value*1000;
    return;

public double getDm(){
    value = value * 10;
    return;

public static String getSIunit(){
    return SI_Unit;
                        }
                    }
                }
            }
        }

    }
}























