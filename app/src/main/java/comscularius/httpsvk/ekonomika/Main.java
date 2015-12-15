package comscularius.httpsvk.ekonomika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener {
    //1
    TextView Bj1;
    TextView Xj1;
    TextView BjX1;
    TextView X1;
    TextView BjXj1;
    //2
    TextView Bj2;
    TextView Xj2;
    TextView BjX2;
    TextView X2;
    TextView BjXj2;
    //3
    TextView Bj3;
    TextView Xj3;
    TextView BjX3;
    TextView X3;
    TextView BjXj3;
    //4
    TextView Bj4;
    TextView Xj4;
    TextView BjX4;
    TextView X4;
    TextView BjXj4;
    //5
    TextView Bj5;
    TextView Xj5;
    TextView BjX5;
    TextView X5;
    TextView BjXj5;
    //6
    TextView Bj6;
    TextView Xj6;
    TextView BjX6;
    TextView X6;
    TextView BjXj6;
    //7
    TextView Bj7;
    TextView Xj7;
    TextView BjX7;
    TextView X7;
    TextView BjXj7;
    //8
    TextView Bj8;
    TextView Xj8;
    TextView BjX8;
    TextView X8;
    TextView BjXj8;
    //9
    TextView Bj9;
    TextView Xj9;
    TextView BjX9;
    TextView X9;
    TextView BjXj9;

    Button button;
    Spinner spinner;
    TextView Vivod;
    EditText BjeditText;
    EditText XjeditText;
    EditText XeditText;
    float Bj,Xj,BjX,BjXj;
    int X;


    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner =(Spinner)findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        BjeditText =(EditText)findViewById(R.id.BjeditText);
        XjeditText =(EditText)findViewById(R.id.XjeditText);
        XeditText =(EditText)findViewById(R.id.XeditText);

        Vivod =(TextView)findViewById(R.id.Vivod);
        //1
        Bj1 = (TextView)findViewById(R.id.Bj1);
        Xj1 = (TextView)findViewById(R.id.Xj1);
        BjX1 = (TextView)findViewById(R.id.BjX1);
        X1 = (TextView)findViewById(R.id.X1);
        BjXj1 = (TextView)findViewById(R.id.BjXj1);
        //2
        Bj2 = (TextView)findViewById(R.id.Bj2);
        Xj2 = (TextView)findViewById(R.id.Xj2);
        BjX2 = (TextView)findViewById(R.id.BjX2);
        X2 = (TextView)findViewById(R.id.X2);
        BjXj2 = (TextView)findViewById(R.id.BjXj2);
        //3
        Bj3 = (TextView)findViewById(R.id.Bj3);
        Xj3 = (TextView)findViewById(R.id.Xj3);
        BjX3 = (TextView)findViewById(R.id.BjX3);
        X3 = (TextView)findViewById(R.id.X3);
        BjXj3 = (TextView)findViewById(R.id.BjXj3);
        //4
        Bj4 = (TextView)findViewById(R.id.Bj4);
        Xj4 = (TextView)findViewById(R.id.Xj4);
        BjX4 = (TextView)findViewById(R.id.BjX4);
        X4 = (TextView)findViewById(R.id.X4);
        BjXj4 = (TextView)findViewById(R.id.BjXj4);
        //5
        Bj5 = (TextView)findViewById(R.id.Bj5);
        Xj5 = (TextView)findViewById(R.id.Xj5);
        BjX5 = (TextView)findViewById(R.id.BjX5);
        X5 = (TextView)findViewById(R.id.X5);
        BjXj5 = (TextView)findViewById(R.id.BjXj5);
        //6
        Bj6 = (TextView)findViewById(R.id.Bj6);
        Xj6 = (TextView)findViewById(R.id.Xj6);
        BjX6 = (TextView)findViewById(R.id.BjX6);
        X6 = (TextView)findViewById(R.id.X6);
        BjXj6 = (TextView)findViewById(R.id.BjXj6);
        //7
        Bj7 = (TextView)findViewById(R.id.Bj7);
        Xj7 = (TextView)findViewById(R.id.Xj7);
        BjX7 = (TextView)findViewById(R.id.BjX7);
        X7 = (TextView)findViewById(R.id.X7);
        BjXj7 = (TextView)findViewById(R.id.BjXj7);
        //8
        Bj8 = (TextView)findViewById(R.id.Bj8);
        Xj8 = (TextView)findViewById(R.id.Xj8);
        BjX8 = (TextView)findViewById(R.id.BjX8);
        X8 = (TextView)findViewById(R.id.X8);
        BjXj8 = (TextView)findViewById(R.id.BjXj8);
        //9
        Bj9 = (TextView)findViewById(R.id.Bj9);
        Xj9 = (TextView)findViewById(R.id.Xj9);
        BjX9 = (TextView)findViewById(R.id.BjX9);
        X9 = (TextView)findViewById(R.id.X9);
        BjXj9 = (TextView)findViewById(R.id.BjXj9);
        /*
        //метод всплывающий сообщений
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                String[] choose = getResources().getStringArray(R.array.pokazateli);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                toast.show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        switch (spinner.getSelectedItemPosition())
        {
            case (0):
                try {
                    Bj = Float.parseFloat(BjeditText.getText().toString());

                } catch (NumberFormatException e) {
                    a = 0;
                }  try {
                    X = Integer.parseInt(XeditText.getText().toString());
                } catch (NumberFormatException e) {
                    a = 0;
                }  try {
                    Xj = Float.parseFloat(XjeditText.getText().toString());
                } catch (NumberFormatException e) {
                    a = 0;
                }
                try {
                    Bj1.setText((int) Bj);
                    Xj1.setText((int)Xj);
                    BjX1.setText((int) (Bj*X));
                    X1.setText(X);
                    BjXj1.setText((int) (Bj*Xj));
                } catch (Exception e) {
                    Vivod.setText("Vivod: "+ e);
                }
                break;
            case (1):
                //**

                //**
            Vivod.setText("Vivod: "+ a);
                break;
        }
    }
}
