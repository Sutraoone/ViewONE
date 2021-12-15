package com.gurupatidar.viewone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText et_link=(EditText) findViewById(R.id.et_link);
        EditText et_size=(EditText) findViewById(R.id.et_ssize);
        EditText et_auto_refresh=(EditText) findViewById(R.id.et_auto_refresh);
        CheckBox cb_screen_sleep_off= (CheckBox) findViewById(R.id.cb_screen_sleep_off);
        CheckBox cb_desktop_view=(CheckBox) findViewById(R.id.cb_desktop_view);
        Switch swtbtn_auto_referesh=(Switch) findViewById(R.id.swtbtn_auto_referesh);
        Button btn_start=(Button) findViewById(R.id.btn_start);

        cb_screen_sleep_off.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
                }
            }
        });
        cb_desktop_view.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                    String desktop="true";
                }
                else
                {
                    String desktop="false";
                }
            }
        });
        et_auto_refresh.setVisibility(View.INVISIBLE);
        swtbtn_auto_referesh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if (!compoundButton.isChecked())
                {
                    et_auto_refresh.setVisibility(View.INVISIBLE);
                    flag="False";
                }else if(compoundButton.isChecked())
                {
                    et_auto_refresh.setVisibility(View.VISIBLE);
                    flag="True";
                }
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String link=et_link.getText().toString();
                String size=et_size.getText().toString();
                String referesh= et_auto_refresh.getText().toString();
                if (link.isEmpty())
                {
                    et_link.setError("Enter Link ??");
                    et_link.requestFocus();
                }
                else if(size.isEmpty())
                {
                    et_size.setError("Enter Size");
                    et_size.requestFocus();
                }else if(flag.equalsIgnoreCase("True"))
                {
                    et_auto_refresh.setError("Enter Time");
                    et_auto_refresh.requestFocus();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,WebViewActivity.class);
                    intent.putExtra("link",link);
                    startActivity(intent);
                }
            }
        });

    }
} 