package layout;
import layout.Tela1Fragment;

import static com.example.marcosantonio.myapplication.R.id.txtS1_C1;

/**
 * Created by Anjos on 29/12/2016.
 */

public class Tempos {
    public String t1 ;
    public String t2 ;
    public String interval;

    ///*
    public Tempos() {
        //String t1 = "00:10:00";
        String[] tokens1 = t1.split(":");
        int h1 = Integer.parseInt(tokens1[0]);
        int m1 = Integer.parseInt(tokens1[1]);
        int s1 = Integer.parseInt(tokens1[2]);
        String t2 = "00:14:59";
        String[] tokens2 = t2.split(":");
        int h2 = Integer.parseInt(tokens2[0]);
        int m2 = Integer.parseInt(tokens2[1]);
        int s2 = Integer.parseInt(tokens2[2]);

        if (s2<s1 && m2<m1){
            int s2b=s2+60;
            int s= s2b-s1;
            int m2b=m2+60;
            int m= m2b-m1;
            if (s<10 && m<10) {
                interval =("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }else if (s2<s1 && m2>m1){
            int s2b=s2+60;
            int s= (s2b-s1);
            int m2b=m2-1;
            int m= m2b-m1;
            if (s<10 && m<10) {
                interval=("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }else {
            int s= s2-s1;
            int m= m2-m1;
            if (s<10 && m<10) {
                interval=("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }

    }
    //*/

    /*
    public String interval(String interval) {
        String t1 = "00:10:00";
        String[] tokens1 = t1.split(":");
        int h1 = Integer.parseInt(tokens1[0]);
        int m1 = Integer.parseInt(tokens1[1]);
        int s1 = Integer.parseInt(tokens1[2]);
        String t2 = "00:14:59";
        String[] tokens2 = t2.split(":");
        int h2 = Integer.parseInt(tokens2[0]);
        int m2 = Integer.parseInt(tokens2[1]);
        int s2 = Integer.parseInt(tokens2[2]);

        if (s2<s1 && m2<m1){
            int s2b=s2+60;
            int s= s2b-s1;
            int m2b=m2+60;
            int m= m2b-m1;
            if (s<10 && m<10) {
                interval =("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }else if (s2<s1 && m2>m1){
            int s2b=s2+60;
            int s= (s2b-s1);
            int m2b=m2-1;
            int m= m2b-m1;
            if (s<10 && m<10) {
                interval=("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }else {
            int s= s2-s1;
            int m= m2-m1;
            if (s<10 && m<10) {
                interval=("0" + m + ":0" + s);
            } else if (s<10 && m>9){
                interval=("" + m + ":0" + s);
            }
        }
        return interval; }
        */
}




