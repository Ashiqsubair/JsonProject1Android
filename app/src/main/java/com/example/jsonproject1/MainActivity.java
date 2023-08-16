package com.example.jsonproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String JSON_STRING="{\"employee\":{\"name\":\"Sachin\",\"salary\":56000}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JSONObject emp=(new JSONObject(JSON_STRING).getJSONObject("employee"));
            String empname= emp.getString("name");
            int Salary=emp.getInt("salary");

            String str="Name is : "+empname+", he has salary "+Salary;

            TextView tv=(TextView) findViewById(R.id.textView1);
            tv.setText(str);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}