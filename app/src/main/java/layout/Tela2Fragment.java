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

import com.example.marcosantonio.myapplication.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tela2Fragment extends Fragment implements View.OnClickListener {
    private EditText    txtS1_C1, txtS1_E1, txtS1_C2, txtS1_E2, txtS1_C3, txtS1_E3, txtS1_C4, txtS1_E4, txtS2_C1, txtS2_E1, txtS2_C2,
            txtS2_E2, txtS2_C3, txtS2_E3, txtS3_C1, txtS3_E1, txtS3_C2, txtS3_E2, txtS3_C3, txtS3_E3, txtS3_C4, txtS3_E4;


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

    public Tela2Fragment() {
        // Required empty public constructor

    }


    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tela2, container, false);

        final EditText txtS1_C1 = (EditText) view.findViewById(R.id.txtS1_C1);
        final EditText txtS1_E1 = (EditText) view.findViewById(R.id.txtS1_E1);
        final EditText txtS1_C2 = (EditText) view.findViewById(R.id.txtS1_C2);
        final EditText txtS1_E2 = (EditText) view.findViewById(R.id.txtS1_E2);
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
        //final EditText txtS3_C2 = (EditText) view.findViewById(R.id.txtS3_C2);
        //final EditText txtS3_E2 = (EditText) view.findViewById(R.id.txtS3_E2);
        final EditText txtS3_C3 = (EditText) view.findViewById(R.id.txtS3_C3);
        final EditText txtS3_E3 = (EditText) view.findViewById(R.id.txtS3_E3);
        final EditText txtS3_C4 = (EditText) view.findViewById(R.id.txtS3_C4);
        final EditText txtS3_E4 = (EditText) view.findViewById(R.id.txtS3_E4);



        txtS1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
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

        /*
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
        */

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


        fab= (FloatingActionButton) view.findViewById(R.id.fab);
        fab1 = (FloatingActionButton) view.findViewById(R.id.fab_1);
        fab2 = (FloatingActionButton) view.findViewById(R.id.fab_2);
        fab3 = (FloatingActionButton) view.findViewById(R.id.fab_3);

        //Animations
        show_fab_1 = AnimationUtils.loadAnimation(getContext(), R.anim.fab1_show);
        //show_fab_1 = AnimationUtils.loadAnimation(getApplication(), R.anim.fab1_show);
        hide_fab_1 = AnimationUtils.loadAnimation(getContext(), R.anim.fab1_hide);
        show_fab_2 = AnimationUtils.loadAnimation(getContext(), R.anim.fab2_show);
        hide_fab_2 = AnimationUtils.loadAnimation(getContext(), R.anim.fab2_hide);
        show_fab_3 = AnimationUtils.loadAnimation(getContext(), R.anim.fab3_show);
        hide_fab_3 = AnimationUtils.loadAnimation(getContext(), R.anim.fab3_hide);

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

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.fab_1:

                break;

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

