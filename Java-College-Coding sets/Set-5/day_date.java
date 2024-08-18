import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class day_date {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String date =sc.next();
        getdaymonthyear(date);
    }
    public static void getdaymonthyear(String date)
    {
        LocalDate currDate = LocalDate.parse(date);
        int day=currDate.getDayOfMonth();
        int mon =currDate.getMonthValue();
        int year=currDate.getYear();

        dayofyear(day,mon,year);
    }
    public static void dayofyear(int day,int mon,int year)
    {
        int days [] ={31,28,31,30,31,30,31,31,30,31,30,31};
        if(mon>2 && year%4==0 && (year%100!=0||year%400==0))
        {
            ++day;
        }
        while(--mon>0)
        {
            day=day+days[mon-1];
        }
        System.out.println(day);
    }
}
