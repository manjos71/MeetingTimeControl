package layout;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Anjos on 29/12/2016.
 */

public class Tempos {
    //public String timeStart;
    //public String timeStop;
    //public Date t1 = null;
    //public Date t2 = null;
    public String minsec;
    public Integer m;
    public Integer s;
    public String min;
    public String sec;

    ///*
    public Tempos(int m, int s) {
        if (this.m < 10 && this.s < 10) {
            minsec = ("0" + min + ":" + "0" + sec);
        } else if (this.m < 10 && this.s > 9) {
            minsec = ("0" + min + ":" + sec);
        } else if (this.m > 9 && this.s < 10) {
            minsec = (min + ":0" + sec);
        } else {
            minsec = (min + ":" + sec);
        }
    }
}







