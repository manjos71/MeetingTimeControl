package layout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.marcosantonio.myapplication.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tela1Fragment extends Fragment implements View.OnClickListener {
    private EditText    txtS1_C1, txtS1_E1, txtS1_C2, txtS1_E2, txtS1_C3, txtS1_E3, txtS1_C4, txtS1_E4, txtS2_C1, txtS2_E1, txtS2_C2,
                        txtS2_E2, txtS2_C3, txtS2_E3, txtS3_C1, txtS3_E1, txtS3_C2, txtS3_E2, txtS3_C3, txtS3_E3, txtS3_C4, txtS3_E4;
    private TextView    lblS1_F1, lblS1_F2;

    private FloatingActionButton fab;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;
    private boolean FAB_Status = false;

    //Animations
    Animation show_fab_1;
    Animation hide_fab_1;
    Animation show_fab_2;
    Animation hide_fab_2;
    Animation show_fab_3;
    Animation hide_fab_3;

    public Tela1Fragment() {
        // Required empty public constructor

    }

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tela1, container, false);

        final EditText txtS1_C1 = (EditText) view.findViewById(R.id.txtS1_C1);
        final EditText txtS1_E1 = (EditText) view.findViewById(R.id.txtS1_E1);
        final TextView lblS1_F1 = (TextView) view.findViewById(R.id.lblS1_F1);
        final EditText txtS1_C2 = (EditText) view.findViewById(R.id.txtS1_C2);
        final EditText txtS1_E2 = (EditText) view.findViewById(R.id.txtS1_E2);
        final TextView lblS1_F2 = (TextView) view.findViewById(R.id.lblS1_F2);
        final EditText txtS1_C3 = (EditText) view.findViewById(R.id.txtS1_C3);
        final EditText txtS1_E3 = (EditText) view.findViewById(R.id.txtS1_E3);
        final EditText txtS1_C4 = (EditText) view.findViewById(R.id.txtS1_C4);
        final EditText txtS1_E4 = (EditText) view.findViewById(R.id.txtS1_E4);

        final EditText txtS2_C1 = (EditText) view.findViewById(R.id.txtS2_C1);
        final EditText txtS2_E1 = (EditText) view.findViewById(R.id.txtS2_E1);
        final EditText txtS2_C2 = (EditText) view.findViewById(R.id.txtS2_C2);
        final EditText txtS2_E2 = (EditText) view.findViewById(R.id.txtS2_E2);
        final EditText txtS2_C3 = (EditText) view.findViewById(R.id.txtS2_C3);
        final EditText txtS2_E3 = (EditText) view.findViewById(R.id.txtS2_E3);

        final EditText txtS3_C1 = (EditText) view.findViewById(R.id.txtS3_C1);
        final EditText txtS3_E1 = (EditText) view.findViewById(R.id.txtS3_E1);
        final EditText txtS3_C2 = (EditText) view.findViewById(R.id.txtS3_C2);
        final EditText txtS3_E2 = (EditText) view.findViewById(R.id.txtS3_E2);
        final EditText txtS3_C3 = (EditText) view.findViewById(R.id.txtS3_C3);
        final EditText txtS3_E3 = (EditText) view.findViewById(R.id.txtS3_E3);
        final EditText txtS3_C4 = (EditText) view.findViewById(R.id.txtS3_C4);
        final EditText txtS3_E4 = (EditText) view.findViewById(R.id.txtS3_E4);

        txtS1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//hh = horas AM/PM
                String currentTime = sdf.format(new Date());
                txtS1_C1.setText(currentTime);
            }
        });

        txtS1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_E1.setText(currentTime);
            }
        });

        txtS1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_C2.setText(currentTime);
            }
        });

        txtS1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_E2.setText(currentTime);
            }
        });

        txtS1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_C3.setText(currentTime);
            }
        });

        txtS1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_E3.setText(currentTime);
            }
        });

        txtS1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_C4.setText(currentTime);
            }
        });

        txtS1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS1_E4.setText(currentTime);
            }
        });

        txtS2_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_C1.setText(currentTime);
            }
        });

        txtS2_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_E1.setText(currentTime);
            }
        });

        txtS2_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_C2.setText(currentTime);
            }
        });

        txtS2_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_E2.setText(currentTime);
            }
        });

        txtS2_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_C3.setText(currentTime);
            }
        });

        txtS2_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS2_E3.setText(currentTime);
            }
        });

        txtS3_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_C1.setText(currentTime);
            }
        });

        txtS3_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_E1.setText(currentTime);
            }
        });

        txtS3_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_C2.setText(currentTime);
            }
        });

        txtS3_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_E2.setText(currentTime);
            }
        });

        txtS3_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_C3.setText(currentTime);
            }
        });

        txtS3_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_E3.setText(currentTime);
            }
        });

        txtS3_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_C4.setText(currentTime);
            }
        });

        txtS3_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                txtS3_E4.setText(currentTime);
            }
        });


        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab1 = (FloatingActionButton) view.findViewById(R.id.fab_1);
        fab2 = (FloatingActionButton) view.findViewById(R.id.fab_2);
        fab3 = (FloatingActionButton) view.findViewById(R.id.fab_3);

        //Animations
        show_fab_1 = AnimationUtils.loadAnimation(getContext(), R.anim.fab1_show);
        hide_fab_1 = AnimationUtils.loadAnimation(getContext(), R.anim.fab1_hide);
        show_fab_2 = AnimationUtils.loadAnimation(getContext(), R.anim.fab2_show);
        hide_fab_2 = AnimationUtils.loadAnimation(getContext(), R.anim.fab2_hide);
        show_fab_3 = AnimationUtils.loadAnimation(getContext(), R.anim.fab3_show);
        hide_fab_3 = AnimationUtils.loadAnimation(getContext(), R.anim.fab3_hide);

        /*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (FAB_Status == false) {
                    //Display FAB menu
                    expandFAB();
                    FAB_Status = true;
                } else {
                    //Close FAB menu
                    hideFAB();
                    FAB_Status = false;
                }
            }
        });
        */

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t1 = txtS1_C1.getText().toString();
                String[] tokens1 = t1.split(":");
                int t1hours = Integer.parseInt(tokens1[0]);
                int t1minutes = Integer.parseInt(tokens1[1]);
                int t1seconds = Integer.parseInt(tokens1[2]);
                int h1= t1hours;
                int m1= t1minutes;
                int s1= t1seconds;
                String t2 = txtS1_E1.getText().toString();
                String[] tokens2 = t2.split(":");
                int t2hours = Integer.parseInt(tokens2[0]);
                int t2minutes = Integer.parseInt(tokens2[1]);
                int t2seconds = Integer.parseInt(tokens2[2]);
                int h2= t2hours;
                int m2= t2minutes;
                int s2= t2seconds;

                if (s2<s1 && m2<m1){
                    int s2b=s2+60;
                    int s= s2b-s1;
                    int m2b=m2+60;
                    int m= m2b-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                        //lblS1_F1.setFont(new Font);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }else if (s2<s1 && m2>m1){
                    int s2b=s2+60;
                    int s= (s2b-s1);
                    int m2b=m2-1;
                    int m= m2b-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }else {
                    int s= s2-s1;
                    int m= m2-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }


                //***works***
                //String t2 = "00:03:23";
                //lblS1_F1.setText(t2);
                //lblS1_F2.setText(txtS1_E2.getText());
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblS1_F1.setText("");
            }
        });
        fab.setOnClickListener(this);
        fab3.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.fab:
                if (FAB_Status == false) {
                    //Display FAB menu
                    expandFAB();
                    FAB_Status = true;
                } else {
                    //Close FAB menu
                    hideFAB();
                    FAB_Status = false;
                }
                break;
            /*
            case R.id.fab_1:
                String t1 = txtS1_C1.getText().toString();
                String[] tokens1 = t1.split(":");
                int t1hours = Integer.parseInt(tokens1[0]);
                int t1minutes = Integer.parseInt(tokens1[1]);
                int t1seconds = Integer.parseInt(tokens1[2]);
                int h1= t1hours;
                int m1= t1minutes;
                int s1= t1seconds;
                String t2 = txtS1_E1.getText().toString();
                String[] tokens2 = t2.split(":");
                int t2hours = Integer.parseInt(tokens2[0]);
                int t2minutes = Integer.parseInt(tokens2[1]);
                int t2seconds = Integer.parseInt(tokens2[2]);
                int h2= t2hours;
                int m2= t2minutes;
                int s2= t2seconds;

                if (s2<s1 && m2<m1){
                    int s2b=s2+60;
                    int s= s2b-s1;
                    int m2b=m2+60;
                    int m= m2b-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }else if (s2<s1 && m2>m1){
                    int s2b=s2+60;
                    int s= (s2b-s1);
                    int m2b=m2-1;
                    int m= m2b-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }else {
                    int s= s2-s1;
                    int m= m2-m1;
                    if (s<10 && m<10) {
                        lblS1_F1.setText("0" + m + ":0" + s);
                    } else if (s<10 && m>9){
                        lblS1_F1.setText("" + m + ":0" + s);
                    }
                }
                break;
                */
        }
    }

    public static long getTimeDiff (Date time1, Date time2, TimeUnit timeUnit){
        long diffInMinutes = time2.getTime()-time1.getTime();
        return timeUnit.convert(diffInMinutes, TimeUnit.MINUTES);
    }

    public static final int sec (int s1, int s2, int m1, int m2, int h1) {
        if (s2>s1){
            s1 =s1+60;
            m1= m1-1;
            return s1;
        }
        if (m2>m1){
            m1 =m1+60;
            h1= h1-1;
        }
            return m1;
    }

    private void expandFAB() {

        //Floating Action Button 1
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fab1.getLayoutParams();
        layoutParams.rightMargin += (int) (fab1.getWidth() * 1.7);
        layoutParams.bottomMargin += (int) (fab1.getHeight() * 0.25);
        fab1.setLayoutParams(layoutParams);
        fab1.startAnimation(show_fab_1);
        fab1.setClickable(true);

        //Floating Action Button 2
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fab2.getLayoutParams();
        layoutParams2.rightMargin += (int) (fab2.getWidth() * 1.5);
        layoutParams2.bottomMargin += (int) (fab2.getHeight() * 1.5);
        fab2.setLayoutParams(layoutParams2);
        fab2.startAnimation(show_fab_2);
        fab2.setClickable(true);

        //Floating Action Button 3
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fab3.getLayoutParams();
        layoutParams3.rightMargin += (int) (fab3.getWidth() * 0.25);
        layoutParams3.bottomMargin += (int) (fab3.getHeight() * 1.7);
        fab3.setLayoutParams(layoutParams3);
        fab3.startAnimation(show_fab_3);
        fab3.setClickable(true);
    }


    private void hideFAB() {

        //Floating Action Button 1
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fab1.getLayoutParams();
        layoutParams.rightMargin -= (int) (fab1.getWidth() * 1.7);
        layoutParams.bottomMargin -= (int) (fab1.getHeight() * 0.25);
        fab1.setLayoutParams(layoutParams);
        fab1.startAnimation(hide_fab_1);
        fab1.setClickable(false);

        //Floating Action Button 2
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fab2.getLayoutParams();
        layoutParams2.rightMargin -= (int) (fab2.getWidth() * 1.5);
        layoutParams2.bottomMargin -= (int) (fab2.getHeight() * 1.5);
        fab2.setLayoutParams(layoutParams2);
        fab2.startAnimation(hide_fab_2);
        fab2.setClickable(false);

        //Floating Action Button 3
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fab3.getLayoutParams();
        layoutParams3.rightMargin -= (int) (fab3.getWidth() * 0.25);
        layoutParams3.bottomMargin -= (int) (fab3.getHeight() * 1.7);
        fab3.setLayoutParams(layoutParams3);
        fab3.startAnimation(hide_fab_3);
        fab3.setClickable(false);
    }

}
