package com.gurupatidar.viewone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    String flag = "false";
    Intent intent,intent4,intent6,intent8,intent10,intent12,intent14,intent16,intent18,intent20;
    String desktop= "false";
    String link;
    String size;
    String[] numArray = {"2","4","6","8","10","12","14","16","18","20"};
    String selected="2";

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent=new Intent(MainActivity.this,WebViewActivity.class);
        intent4=new Intent(MainActivity.this,Screen4.class);
        intent6=new Intent(MainActivity.this,Screen6.class);
        intent8=new Intent(MainActivity.this,Screen8.class);
        intent10=new Intent(MainActivity.this,Screen10.class);
        intent12=new Intent(MainActivity.this,Screen12.class);
        intent14=new Intent(MainActivity.this,Screen14.class);
        intent16=new Intent(MainActivity.this,Screen16.class);
        intent18=new Intent(MainActivity.this,Screen18.class);
        intent20=new Intent(MainActivity.this,Screen20.class);

        EditText et_link=(EditText) findViewById(R.id.et_link);
       // EditText et_size=(EditText) findViewById(R.id.et_ssize);
        EditText et_auto_refresh=(EditText) findViewById(R.id.et_auto_refresh);
        CheckBox cb_screen_sleep_off= (CheckBox) findViewById(R.id.cb_screen_sleep_off);
        CheckBox cb_desktop_view=(CheckBox) findViewById(R.id.cb_desktop_view);
        Switch swtbtn_auto_referesh=(Switch) findViewById(R.id.swtbtn_auto_referesh);
        Button btn_start=(Button) findViewById(R.id.btn_start);
        et_auto_refresh.setVisibility(View.INVISIBLE);
        NumberPicker screenSize=findViewById(R.id.screenSize);


        et_link.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                    if(Patterns.WEB_URL.matcher((et_link.getText().toString())).matches())
                    {}
                    else{et_link.setError("Invalid URL");
                    }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        if(screenSize !=null)
        {
            screenSize.setMinValue(0);
            screenSize.setMaxValue(numArray.length-1);
            screenSize.setDisplayedValues(numArray);
            screenSize.setWrapSelectorWheel(true);

            screenSize.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
                @Override
                public void onValueChange(NumberPicker numberPicker, int i, int i1)
                {
                    selected= numArray[screenSize.getValue()];
                    Toast.makeText(MainActivity.this, ""+selected, Toast.LENGTH_SHORT).show();
                }
            });
        }
        cb_screen_sleep_off.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
                }
            }
        });

        intent.putExtra("desktop","false");
        intent4.putExtra("desktop","false");
        intent6.putExtra("desktop","false");
        intent8.putExtra("desktop","false");
        intent10.putExtra("desktop","false");
        intent12.putExtra("desktop","false");
        intent14.putExtra("desktop","false");
        intent16.putExtra("desktop","false");
        intent18.putExtra("desktop","false");
        intent20.putExtra("desktop","false");
        cb_desktop_view.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                   desktop="true";
                   intent.putExtra("desktop",desktop);
                   intent4.putExtra("desktop",desktop);
                   intent6.putExtra("desktop",desktop);
                   intent8.putExtra("desktop",desktop);
                   intent10.putExtra("desktop",desktop);
                   intent12.putExtra("desktop",desktop);
                   intent14.putExtra("desktop",desktop);
                   intent16.putExtra("desktop",desktop);
                   intent18.putExtra("desktop",desktop);
                   intent20.putExtra("desktop",desktop);

                }
            }
        });
        intent.putExtra("flag","False");
        intent4.putExtra("flag","False");
        intent6.putExtra("flag","False");
        intent8.putExtra("flag","False");
        intent10.putExtra("flag","False");
        intent12.putExtra("flag","False");
        intent14.putExtra("flag","False");
        intent16.putExtra("flag","False");
        intent18.putExtra("flag","False");
        intent20.putExtra("flag","False");
        swtbtn_auto_referesh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if (!compoundButton.isChecked())
                {
                    et_auto_refresh.setVisibility(View.INVISIBLE);
                    flag="False";
                    intent.putExtra("flag",flag);
                    intent4.putExtra("flag",flag);
                    intent6.putExtra("flag",flag);
                    intent8.putExtra("flag",flag);
                    intent10.putExtra("flag",flag);
                    intent12.putExtra("flag",flag);
                    intent14.putExtra("flag",flag);
                    intent16.putExtra("flag",flag);
                    intent18.putExtra("flag",flag);
                    intent20.putExtra("flag",flag);
                }else if(compoundButton.isChecked())
                {
                    et_auto_refresh.setVisibility(View.VISIBLE);
                    flag="True";
                    intent.putExtra("flag",flag);
                    intent4.putExtra("flag",flag);
                    intent6.putExtra("flag",flag);
                    intent8.putExtra("flag",flag);
                    intent10.putExtra("flag",flag);
                    intent12.putExtra("flag",flag);
                    intent14.putExtra("flag",flag);
                    intent16.putExtra("flag",flag);
                    intent18.putExtra("flag",flag);
                    intent20.putExtra("flag",flag);
                }
            }
        });
        if (flag.equalsIgnoreCase("True"))
        {
            String time=et_auto_refresh.getText().toString();
            Long time2=Long.parseLong(time);
            Long time3=60*time2;
            time2=time3*1000l;
            intent.putExtra("time",time2);
            intent4.putExtra("time",time2);
            intent6.putExtra("time",time2);
            intent8.putExtra("time",time2);
            intent10.putExtra("time",time2);
            intent12.putExtra("time",time2);
            intent14.putExtra("time",time2);
            intent16.putExtra("time",time2);
            intent18.putExtra("time",time2);
            intent20.putExtra("time",time2);
        }

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                link=et_link.getText().toString();
                String test=et_auto_refresh.getText().toString();

                if (link.isEmpty())
                {
                    et_link.setError("Enter Link ??");
                    et_link.requestFocus();
                }
                else if(flag.equalsIgnoreCase("True"))
                {
                    if(test.isEmpty())
                    {
                        et_auto_refresh.setError("Enter Time");
                        et_auto_refresh.requestFocus();
                    }
                    if(!test.isEmpty())
                    {
                        intent.putExtra("url", link);
                        intent4.putExtra("url", link);
                        intent6.putExtra("url", link);
                        intent8.putExtra("url", link);
                        intent10.putExtra("url", link);
                        intent12.putExtra("url", link);
                        intent14.putExtra("url", link);
                        intent16.putExtra("url", link);
                        intent18.putExtra("url", link);
                        intent20.putExtra("url", link);

                        if (selected.equalsIgnoreCase("2"))
                        {
                            startActivity(intent);
                        }
                        if (selected.equalsIgnoreCase("4"))
                        {
                            startActivity(intent4);
                        }
                        if (selected.equalsIgnoreCase("6"))
                        {
                            startActivity(intent6);
                        }
                        if (selected.equalsIgnoreCase("8"))
                        {
                            startActivity(intent8);
                        }
                        if (selected.equalsIgnoreCase("10"))
                        {
                            startActivity(intent10);
                        }
                        if (selected.equalsIgnoreCase("12"))
                        {
                            startActivity(intent12);
                        }
                        if (selected.equalsIgnoreCase("14"))
                        {
                            startActivity(intent14);
                        }
                        if (selected.equalsIgnoreCase("16"))
                        {
                            startActivity(intent16);
                        }
                        if (selected.equalsIgnoreCase("18"))
                        {
                            startActivity(intent18);
                        }
                        if (selected.equalsIgnoreCase("20"))
                        {
                            startActivity(intent20);
                        }

                    }
                }
                else  {
                    intent.putExtra("url", link);
                    intent4.putExtra("url", link);
                    intent6.putExtra("url", link);
                    intent8.putExtra("url", link);
                    intent10.putExtra("url", link);
                    intent12.putExtra("url", link);
                    intent14.putExtra("url", link);
                    intent16.putExtra("url", link);
                    intent18.putExtra("url", link);
                    intent20.putExtra("url", link);

                    if (selected.equalsIgnoreCase("2"))
                    {
                    startActivity(intent);
                    }
                    if (selected.equalsIgnoreCase("4"))
                    {
                        startActivity(intent4);
                    }
                    if (selected.equalsIgnoreCase("6"))
                    {
                        startActivity(intent6);
                    }
                    if (selected.equalsIgnoreCase("8"))
                    {
                        startActivity(intent8);
                    }
                    if (selected.equalsIgnoreCase("10"))
                    {
                        startActivity(intent10);
                    }
                    if (selected.equalsIgnoreCase("12"))
                    {
                        startActivity(intent12);
                    }
                    if (selected.equalsIgnoreCase("14"))
                    {
                        startActivity(intent14);
                    }
                    if (selected.equalsIgnoreCase("16"))
                    {
                        startActivity(intent16);
                    }
                    if (selected.equalsIgnoreCase("18"))
                    {
                        startActivity(intent18);
                    }
                    if (selected.equalsIgnoreCase("20"))
                    {
                        startActivity(intent20);
                    }
                }
            }});
    }
} 