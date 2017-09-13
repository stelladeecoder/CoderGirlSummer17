
/**
 * Write a description of class Temperatures here.
 *
 * @Delores Carey
 * @September 10, 2017
 */
import static java.lang.System.out;
public class Temperatures
{
    public static void main(String[] args)
{
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
         
        String times[] = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        out.println("Temperature Calculator");
        out.println();
        out.println("The data provided are:");
        for (int r=0; r<4; r++)
        {
            out.println();
            out.print(times[r]);
            for (int c=0;c<7;c++)
            {
                out.printf("%4d", temps[r][c]);
            }
        }
        out.println();
        out.println();
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println();
        out.println("Average by day:");
        out.println();
        int sunSum =0;
        int monSum =0;
        int tueSum =0;
        int wedSum =0;
        int thuSum =0;
        int friSum =0;
        int satSum =0;
        for (int r=0;r<4;r++)
        {
            sunSum += temps[r][0];
            monSum += temps[r][1];
            tueSum += temps[r][2];
            wedSum += temps[r][3];
            thuSum += temps[r][4];
            friSum += temps[r][5];
            satSum += temps[r][6];
            }
        int sunAvg = sunSum/4;
        int monAvg = monSum/4;
        int tueAvg = tueSum/4;
        int wedAvg = wedSum/4;
        int thuAvg = thuSum/4;
        int friAvg = friSum/4;
        int satAvg = satSum/4;
        int avgByDay[] = {sunAvg,monAvg,tueAvg,wedAvg,thuAvg,friAvg,satAvg};
        String weekDays[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for (int x=0; x<avgByDay.length; x++)
        {
            out.println(weekDays[x] + ": " + avgByDay[x]);
        }
        out.println();
        out.println("Average by time:");
        out.println();
        int sum7a = 0;
        int sum3p = 0;
        int sum7p = 0;
        int sum3a = 0;
        for (int c=0;c<7;c++)
        {
            sum7a += temps[0][c];
            sum3p += temps[1][c];
            sum7p += temps[2][c];
            sum3a += temps[3][c];
        }
        int avg7a = sum7a/7;
        int avg3p = sum3p/7;
        int avg7p = sum7p/7;
        int avg3a = sum3a/7;
        int avgByTime[] = {avg7a,avg3p,avg7p,avg3a};
        for (int x=0; x<avgByTime.length; x++)
        {
            out.println(times[x] + avgByTime[x]);
        }
        int totalSum = 0;
        for (int r=0; r<4; r++)
        {
            for (int c=0;c<7;c++)
            {
                totalSum += temps[r][c];
            }
        }
        int totalAverage = totalSum/28;
        out.println();
        out.println("The final average temperature for the week was: ");
        out.println();
        out.println("Overall: " + totalAverage);
}
}
