
/**
 * Write a description of class MySolutions here.
 *
 * @author Erica lee
 * @version Sept 12, 2023
 */
public class MySolutions
{
    public void celsuisToFarenheit(){
        double C, F;
        C = 20;
        F = C * 9/5 + 32;
        System.out.println(C +" °C = " + F + " °F");
    }
    public void elapsedTime(){
        int H=10, M=55;
        double S=0, P;
        System.out.print("The current time is "+H+":"+M+":"+S);
        S = H * 3600 + M * 60;
        System.out.println(" It has been "+S+" seconds since the day began.");
        S = 86400-S;
        System.out.println("There are "+S+" left in the day.");
        P = ((86400-S)/86400)*100;
        System.out.println("The day is "+P+" % done.");
    }
    public void secondsToHMS(){
        int H, M, S, S1;
        S1 = 5000;
        System.out.print(S1+" seconds = ");
        H = S1/3600;
        M = (S1-(H*3600))/60;
        S = S1-((3600*H)+(M*60));
        System.out.println(H+" hours, "+M+" minutes, and "+S+" seconds.");
    }
}
