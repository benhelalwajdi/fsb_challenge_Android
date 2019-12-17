package com.wbh.fsb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HistoricalActivity extends AppCompatActivity {


    List<String> characters;


    public Context getApplicationContext() {
        return super.getApplicationContext();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);
        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);
        //rv.setLayoutManager(new LinearLayoutManager(this));
       // rv.setAdapter(new MyAdapter(this.getApplicationContext()));
        getCustomerData(this.getApplicationContext());
    }


    public void getCustomerData(final Context applicationContext){
        List<String> arrayList = null;
        for (int i = 0; i<=10; i++) {
            arrayList.add("Le temperateur de votre maison  : 27 , le temperateur de la voiture :  16 ");
        }
        characters = arrayList;
        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);
        rv.setLayoutManager(new LinearLayoutManager(applicationContext));
        rv.setAdapter(new MyAdapter(characters));


    }

}

