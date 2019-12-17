package com.wbh.fsb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getCustomerData();
    }


    public void clickAction(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_profile:
                startActivity(new Intent(HomeActivity.this, AccountActivity.class));
                break;
            case R.id.btn_map:
                startActivity(new Intent(HomeActivity.this, MapActivity.class));
                break;
            case  R.id.btn_chats:
                startActivity(new Intent(HomeActivity.this, ChatActivity.class));
                break;
            case  R.id.btn_check:
                startActivity(new Intent(HomeActivity.this, QRActivity.class));
                break;
            case  R.id.btn_Bills:
                startActivity(new Intent(HomeActivity.this, BillActivity.class));

        }

    }


    public void getCustomerData(){

        TextView amount = findViewById(R.id.amount);
        amount.setText( "Prévision d'augmentation de la consommation d'énergie au cours de ce mois\n La temperateur de votre maison  : 27 , le temperateur de la voiture :  16 ");
    }

}
