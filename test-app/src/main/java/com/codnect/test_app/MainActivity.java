package com.codnect.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.codnect.go.GoBinder;
import com.codnect.go.annotation.FormField;
import com.codnect.go.annotation.Form;
import com.codnect.go.annotation.LayoutBind;
import com.codnect.go.annotation.OnClick;
import com.codnect.go.annotation.ViewBind;
import com.codnect.go.form.ModelForm;

@LayoutBind(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewBind(R.id.buttonClick)
    private Button buttonClick;

    @ViewBind(R.id.editTextMessage)
    private EditText editTextMessage;

    @ViewBind(R.id.checkBox)
    private CheckBox checkBox;

    @Form(
            name = "loginForm",
            fields = {
                    @FormField(name = "message", id = R.id.editTextMessage),
                    @FormField(name = "check", id = R.id.checkBox)
            }
    )
    private ModelForm loginForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GoBinder.getInstance().initilaze(this);
    }

    @OnClick(value = R.id.buttonClick, formName = "loginForm")
    public void clickButton(){
        Toast.makeText(MainActivity.this, "heyyy", Toast.LENGTH_LONG).show();
    }

}
