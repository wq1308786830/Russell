package com.example.datastore;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.datastore.utils.DataTool;


public class MyActivity extends Activity {

    private EditText et_username, et_password;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.i("MyActivity", "onCreate method is executed");

        et_username = (EditText) findViewById(R.id.username);
        et_password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.login);
        checkBox= (CheckBox)findViewById(R.id.remember);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                if (checkBox.isChecked()) {
                    DataTool.saveInfo(MyActivity.this, username, password);
                    Toast.makeText(MyActivity.this, "已记住密码", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(getBaseContext(), "登录中...", Toast.LENGTH_SHORT).show();

            }
        });

    }

    /**
     * 生命周期演示
    */
    /*
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyActivity", "onStart method is executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyActivity", "onStop method is executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyActivity", "onPause method is executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyActivity", "onResume method is executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyActivity", "onRestart method is executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyActivity", "onDestroy method is executed");
    }
*/
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
