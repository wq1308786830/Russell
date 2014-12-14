package com.example.filespermissions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.filespermissions.utils.DataTool;


public class MyActivity extends Activity {

    private RadioGroup radioGroup;
    private EditText editText;
    private String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        editText = (EditText)findViewById(R.id.datas);
        s = editText.getText().toString();

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.prival:
                DataTool.saveInfo(this, s, 1);
                break;
            case R.id.readable:
                DataTool.saveInfo(this, s, 2);
                break;
            case R.id.writable:
                DataTool.saveInfo(this, s, 3);
                break;
            case R.id.readable_writable:
                DataTool.saveInfo(this, s, 4);
                break;
            case R.id.publics:
                DataTool.saveInfo(this, s, 5);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
}
