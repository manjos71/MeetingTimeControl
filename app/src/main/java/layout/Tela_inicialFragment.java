package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.marcosantonio.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tela_inicialFragment extends Fragment implements View.OnClickListener{

    private TimePicker timepicker1;
    public EditText edtEditText1;


    public Tela_inicialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tela_inicial, container, false);

        final EditText edtEditText1 = (EditText)view.findViewById(R.id.edtEditText1);
        final EditText edtEditText2 = (EditText)view.findViewById(R.id.edtEditText2);
        final EditText edtEditText3 = (EditText)view.findViewById(R.id.edtEditText3);



        return view;
    }

    @Override
    public void onClick(View v) {

        //Intent it = new Intent(this, Tela1Fragment.class);
        //it.putExtra("VALOR",edtEditText1.getText().toString());

        //startActivity(it);
    }
}
