package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtmi, txtkm, txtlb,txtkg, txtgallon, txtlitre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtmi = findViewById(R.id.txtmi);
        txtkm = findViewById(R.id.txtkm);
        txtlb = findViewById(R.id.txtlb);
        txtkg = findViewById(R.id.txtkg);
        txtgallon = findViewById(R.id.txtgallon);
        txtlitre = findViewById(R.id.txtlitre);

        txtF.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strF = s.toString();
                        Log.i("UnitConverter", "Value in txtF = " + strF);

                        if (!txtF.isFocused())
                            return;
                        if (strF.length() == 0)
                            return;
                        try {
                            double valF = Double.parseDouble(strF);
                            double valC = (valF - 32.0)*5/9;
                            String strC = Double.toString(valC);
                            Log.i("UnitConverter", "Value in txtC = " + strC);
                            MainActivity.this.txtC.setText(strC);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtC.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strC = s.toString();
                        Log.i("UnitConverter", "Value in txtC = " + strC);
                        if (!txtC.isFocused())
                            return;
                        if (strC.length() == 0)
                            return;
                        try {
                            double valC = Double.parseDouble(strC);
                            double valF = valC*9/5 + 32 ;
                            String strF = Double.toString(valF);
                            Log.i("UnitConverter", "Value in txtF = " + strF);
                            MainActivity.this.txtF.setText(strF);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtmi.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strmi = s.toString();
                        Log.i("UnitConverter", "Value in txtmi = " + strmi);
                        if (!txtmi.isFocused())
                            return;
                        if (strmi.length() == 0)
                            return;
                        try {
                            double valmi = Double.parseDouble(strmi);
                            double valkm = valmi * 1.60934;
                            String strkm = Double.toString(valkm);
                            Log.i("UnitConverter", "Value in txtkm = " + strkm);

                            MainActivity.this.txtkm.setText(strkm);

                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtkm.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strkm = s.toString();
                        Log.i("UnitConverter", "Value in txtkm = " + strkm);
                        if (!txtkm.isFocused())
                            return;
                        if (strkm.length() == 0)
                            return;
                        try {
                            double valkm = Double.parseDouble(strkm);
                            double valmi = valkm / 1.60934;
                            String strmi = Double.toString(valmi);
                            Log.i("UnitConverter", "Value in txtmi = " + strmi);
                            MainActivity.this.txtmi.setText(strmi);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtlb.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strlbs = s.toString();
                        Log.i("UnitConverter", "Value in txtlbs = " + strlbs);
                        if (!txtlb.isFocused())
                            return;
                        if (strlbs.length() == 0)
                            return;
                        try {
                            double vallbs = Double.parseDouble(strlbs);
                            double valkg = vallbs / 2.20462;
                            String strkg = Double.toString(valkg);
                            Log.i("UnitConverter", "Value in txtkg = " + strkg);
                            MainActivity.this.txtkg.setText(strkg);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtkg.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strkg = s.toString();
                        Log.i("UnitConverter", "Value in txtkg = " + strkg);
                        if (!txtkg.isFocused())
                            return;
                        if (strkg.length() == 0)
                            return;
                        try {
                            double valkg = Double.parseDouble(strkg);
                            double vallbs = valkg * 2.20462;
                            String strlbs = Double.toString(vallbs);
                            Log.i("UnitConverter", "Value in txtlbs = " + strlbs);
                            MainActivity.this.txtlb.setText(strlbs);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtgallon.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strgal = s.toString();
                        Log.i("UnitConverter", "Value in txtgal = " + strgal);
                        if (!txtgallon.isFocused())
                            return;
                        if (strgal.length() == 0)
                            return;
                        try {
                            double valgal = Double.parseDouble(strgal);
                            double valL = valgal * 3.78541;
                            String strL = Double.toString(valL);
                            Log.i("UnitConverter", "Value in txtL = " + strL);
                            MainActivity.this.txtlitre.setText(strL);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtlitre.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
                    @Override
                    public void afterTextChanged(Editable s) {
                        String strL = s.toString();
                        Log.i("UnitConverter", "Value in txtL = " + strL);
                        if (!txtlitre.isFocused())
                            return;
                        if (strL.length() == 0)
                            return;
                        try {
                            double valL = Double.parseDouble(strL);
                            double valgal = valL / 3.78541;
                            String strgal = Double.toString(valgal);
                            Log.i("UnitConverter", "Value in txtgal = " + strgal);
                            MainActivity.this.txtgallon.setText(strgal);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );
    }
}