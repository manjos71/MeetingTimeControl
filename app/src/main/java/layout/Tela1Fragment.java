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

//import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tela1Fragment extends Fragment implements View.OnClickListener {
    private EditText    txtS1_C1, txtS1_E1, txtS1_C2, txtS1_E2, txtS1_C3, txtS1_E3, txtS1_C4, txtS1_E4, txtS2_C1, txtS2_E1, txtS2_C2,
                        txtS2_E2, txtS2_C3, txtS2_E3, txtS3_C1, txtS3_E1, txtS3_C2, txtS3_E2, txtS3_C3, txtS3_E3, txtS3_C4, txtS3_E4;
    private TextView    lblS1_F1, lblS1_F2, lblS1F3;

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
        final TextView lblS1_F3 = (TextView) view.findViewById(R.id.lblS1_F3);
        final EditText txtS1_C4 = (EditText) view.findViewById(R.id.txtS1_C4);
        final EditText txtS1_E4 = (EditText) view.findViewById(R.id.txtS1_E4);
        final TextView lblS1_F4 = (TextView) view.findViewById(R.id.lblS1_F4);

        final EditText txtS2_C1 = (EditText) view.findViewById(R.id.txtS2_C1);
        final EditText txtS2_E1 = (EditText) view.findViewById(R.id.txtS2_E1);
        final TextView lblS2_F1 = (TextView) view.findViewById(R.id.lblS2_F1);
        final EditText txtS2_C2 = (EditText) view.findViewById(R.id.txtS2_C2);
        final EditText txtS2_E2 = (EditText) view.findViewById(R.id.txtS2_E2);
        final TextView lblS2_F2 = (TextView) view.findViewById(R.id.lblS2_F2);
        final EditText txtS2_C3 = (EditText) view.findViewById(R.id.txtS2_C3);
        final EditText txtS2_E3 = (EditText) view.findViewById(R.id.txtS2_E3);
        final TextView lblS2_F3 = (TextView) view.findViewById(R.id.lblS2_F3);

        final EditText txtS3_C1 = (EditText) view.findViewById(R.id.txtS3_C1);
        final EditText txtS3_E1 = (EditText) view.findViewById(R.id.txtS3_E1);
        final TextView lblS3_F1 = (TextView) view.findViewById(R.id.lblS3_F1);
        final EditText txtS3_C2 = (EditText) view.findViewById(R.id.txtS3_C2);
        final EditText txtS3_E2 = (EditText) view.findViewById(R.id.txtS3_E2);
        final TextView lblS3_F2 = (TextView) view.findViewById(R.id.lblS3_F2);
        final EditText txtS3_C3 = (EditText) view.findViewById(R.id.txtS3_C3);
        final EditText txtS3_E3 = (EditText) view.findViewById(R.id.txtS3_E3);
        final TextView lblS3_F3 = (TextView) view.findViewById(R.id.lblS3_F3);
        final EditText txtS3_C4 = (EditText) view.findViewById(R.id.txtS3_C4);
        final EditText txtS3_E4 = (EditText) view.findViewById(R.id.txtS3_E4);
        final TextView lblS3_F4 = (TextView) view.findViewById(R.id.lblS3_F4);

        //txtS1_C1.setHint("19:51:00");

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

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //S1_L1
                    String timeStart = txtS1_C1.getText().toString();
                    String timeStop = txtS1_E1.getText().toString();
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    int limit = 3;
                    Date t1 = null;
                    Date t2 = null;
                    String minsec = null;
                    try {
                        t1 = format.parse(timeStart);
                        t2 = format.parse(timeStop);
                        DateTime dt1 = new DateTime(t1);
                        DateTime dt2 = new DateTime(t2);
                        String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                        String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                        int m = Integer.parseInt(min);
                        int s = Integer.parseInt(sec);
                        if (m < 10 && s < 10) {
                            minsec = ("0" + min + ":" + "0" + sec);
                        } else if (m < 10 && s > 9) {
                            minsec = ("0" + min + ":" + sec);
                        } else if (m > 9 && s < 10) {
                            minsec = (min + ":0" + sec);
                        } else {
                            minsec = (min + ":" + sec);
                        }
                        if (m >= limit & s > 0) {
                            lblS1_F1.setTextColor(getResources().getColor(R.color.red));
                        } else {
                            lblS1_F1.setTextColor(getResources().getColor(R.color.blue));
                        }
                        lblS1_F1.setText(minsec);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                //S1_L2
                timeStart = txtS1_C2.getText().toString();
                timeStop = txtS1_E2.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 10;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS1_F2.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS1_F2.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS1_F2.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S1_L3
                timeStart = txtS1_C3.getText().toString();
                timeStop = txtS1_E3.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 8;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS1_F3.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS1_F3.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS1_F3.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S1_L4
                timeStart = txtS1_C4.getText().toString();
                timeStop = txtS1_E4.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 4;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS1_F4.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS1_F4.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS1_F4.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S2_L1
                timeStart = txtS2_C1.getText().toString();
                timeStop = txtS2_E1.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 2;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS2_F1.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS2_F1.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS2_F1.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S2_L2
                timeStart = txtS2_C2.getText().toString();
                timeStop = txtS2_E2.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 4;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS2_F2.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS2_F2.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS2_F2.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S2_L3
                timeStart = txtS2_C3.getText().toString();
                timeStop = txtS2_E3.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 6;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS2_F3.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS2_F3.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS2_F3.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S3_L1
                timeStart = txtS3_C1.getText().toString();
                timeStop = txtS3_E1.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 15;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS3_F1.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS3_F1.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS3_F1.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S3_L2
                timeStart = txtS3_C2.getText().toString();
                timeStop = txtS3_E2.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 8;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS3_F2.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS3_F2.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS3_F2.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S3_L3
                timeStart = txtS3_C3.getText().toString();
                timeStop = txtS3_E3.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 30;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS3_F3.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS3_F3.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS3_F3.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //S3_L4
                timeStart = txtS3_C4.getText().toString();
                timeStop = txtS3_E4.getText().toString();
                format = new SimpleDateFormat("HH:mm:ss");
                limit = 3;
                try {
                    t1 = format.parse(timeStart);
                    t2 = format.parse(timeStop);
                    DateTime dt1 = new DateTime(t1);
                    DateTime dt2 = new DateTime(t2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    int m= Integer.parseInt(min);
                    int s= Integer.parseInt(sec);
                    if (m < 10 && s < 10) {
                        minsec = ("0" + min + ":" + "0" + sec);
                    } else if (m < 10 && s > 9) {
                        minsec = ("0" + min + ":" + sec);
                    } else if (m > 9 && s < 10) {
                        minsec = (min + ":0" + sec);
                    } else {
                        minsec = (min + ":" + sec);
                    }
                    if (m>=limit & s>0){
                        lblS3_F4.setTextColor(getResources().getColor(R.color.red));
                    }else {
                        lblS3_F4.setTextColor(getResources().getColor(R.color.blue));
                    }
                    lblS3_F4.setText(minsec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
////////////////////
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblS1_F1.setText("");
                lblS1_F2.setText("");
                lblS1_F3.setText("");
                lblS1_F4.setText("");
                lblS2_F1.setText("");
                lblS2_F2.setText("");
                lblS2_F3.setText("");
                lblS3_F1.setText("");
                lblS3_F2.setText("");
                lblS3_F3.setText("");
                lblS3_F4.setText("");
            }
        });
        fab.setOnClickListener(this);
        //fab1.setOnClickListener(this);
        fab3.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.fab:
                if (FAB_Status == false) {
                    expandFAB();
                    FAB_Status = true;
                } else {
                    hideFAB();
                    FAB_Status = false;
                }
                break;
            /*
            case R.id.fab_1:
                String dateStart = txtS1_C1.getText().toString();
                String dateStop = txtS1_E1.getText().toString();
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                Date d1 = null;
                Date d2 = null;
                try {
                    d1 = format.parse(dateStart);
                    d2 = format.parse(dateStop);
                    DateTime dt1 = new DateTime(d1);
                    DateTime dt2 = new DateTime(d2);
                    String min = String.valueOf(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60);
                    String sec = String.valueOf(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60);
                    lblS1_F1.setText(min + ":" + sec );
                } catch (Exception e) {
                    e.printStackTrace();
                }break;
                */
        }
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
