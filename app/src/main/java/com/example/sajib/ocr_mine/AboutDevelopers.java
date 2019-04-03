package com.example.sajib.ocr_mine;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AboutDevelopers extends AppCompatActivity {
    private TextView text_sajib, text_riad;
    StringBuffer lastBuffer = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developers);
        text_sajib = (TextView) findViewById(R.id.id_for_sajib);
        text_riad = (TextView) findViewById(R.id.id_for_riad);

        jsonTask jtask = new jsonTask();
        jtask.execute("https://api.myjson.com/bins/1ce7v2");
    }

    public class jsonTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection httpURLConnection = null;
            BufferedReader bufferedReader = null;

            String name, department, batch, roll, university, bg, section,email;
            try {
                URL url = new URL("https://api.myjson.com/bins/1ce7v2");
                httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer firstBuffer = new StringBuffer();
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                }
                String file = stringBuffer.toString();
                JSONArray jsonArray = new JSONArray(file);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject obj = jsonArray.optJSONObject(i);
                    name = obj.getString("name");
                    department = obj.getString("Department");
                    university = obj.getString("University");
                    bg = obj.getString("Blood-Group");
                    email=obj.getString("Email");
                    roll = obj.getString("Roll");
                    batch = obj.getString("Batch");
                    if(i==0)
                        firstBuffer.append("\n"+"Name: " + name + "\n" + "Roll: " + roll + "\n" + "Batch: " + batch + "\n" + "Department: " + department+ "\n" + "University: " + university + "\n" + "Blood-Group :" + bg + "\n"+email);
                    else if(i==1)
                        lastBuffer.append("Name: " + name + "\n" + "Roll: " + roll + "\n" + "Batch: " + batch + "\n" + "Department: " + department +"\n" + "University: " + university + "\n" + "Blood-Group :" + bg + "\n"+email);
                    firstBuffer.append("\n");
                    lastBuffer.append("\n");


                }
                ///text_riad.setText(lastBuffer.toString());
                return firstBuffer.toString();//,lastBuffer.toString();
            } catch (Exception e) {
                return  null ;
            } finally {
                httpURLConnection.disconnect();
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    return null ;
                }
            }
        }

        @Override
        protected void onPostExecute(String s) {

            if(s==null)
            {
                Toast.makeText(AboutDevelopers.this,"No Internet Connection!",Toast.LENGTH_SHORT).show();
            }
            else
            {
                super.onPostExecute(s);
                // super.onPostExecute(t);
                text_sajib.setText(s);
                text_riad.setText(lastBuffer.toString());
            }

        }
    }
}
