package simpleConverter.cp2c;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.gj.simpleconverter.R;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.drive.internal.ad;


public class MyActivity extends Activity {



    EditText eTdegreeC;
    EditText eTdegreeF;

    EditText eTinch_mm;
    EditText eTmm_inch;

    EditText eTft_meter;
    EditText eTmeter_ft;

    EditText eTkm_mile;
    EditText eTmile_km;
    EditText eTmpH_fpH;
    EditText eTfpH_mpH;
    EditText eTkmps_mps;
    EditText eTmps_kmps;

    EditText eTgalperyard;
    EditText eTliterspermeter;
    EditText eTinchpermile;
    EditText eTmeterperKm;


    EditText degree;
    EditText con_degree;
    EditText minutes;
    EditText seconds;

    EditText eTftTomm;
    EditText eTmmTOft;

    EditText eTftTOmeter;
    EditText eTmeterTOft;

    EditText eTMPA_PSI;
    EditText eTPSI_MPA;

    TextWatcher txtwatchmpa_psi;
    TextWatcher txtwatchpsi_mpa;
    TextWatcher txtwatchKm;
    TextWatcher txtwatchcm;
    TextWatcher txtwatchdegreeC;
    TextWatcher txtwatchdegreeF;
    TextWatcher txtwatchin_mm;
    TextWatcher txtwatchmm_in;
    TextWatcher txtwatchftmeter;
    TextWatcher txtwatchmeterF;
    TextWatcher txtwatchkm_mile;
    TextWatcher txtwatchmile_km;

    TextWatcher txtwatchmPH_fph;
    TextWatcher txtwatchfph_mpH;

    TextWatcher txtwatchkmps_mps;
    TextWatcher txtwatchmps_kmps;

    TextWatcher txtwatchgalperyard;
    TextWatcher txtwatchliterpermeter;

    TextWatcher txtwatchinchpermile;
    TextWatcher txtwatchmeterperkm;


    TextWatcher txtdegree;
    TextWatcher txtminutes;
    TextWatcher txtseconds;
    TextWatcher txtcondegree;


    TextWatcher txtftTOmm;
    TextWatcher txtmmTOft;

    TextWatcher txtftTOmeter;
    TextWatcher txtmeterTOfeet;




    private void setTextWatchters(){


        txtwatchpsi_mpa=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double psi=Double.parseDouble(charSequence.toString());
                    double mpa=psi/145.037;
                    eTMPA_PSI.setText(String.format("%.03f",mpa));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchmpa_psi=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try{

                    double mpa=Double.parseDouble(charSequence.toString());
                    double psi=mpa*145.0377;
                    eTPSI_MPA.setText(String.format("%.03f",psi));

                }catch (Exception e){

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        txtmeterTOfeet=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double meter = Double.parseDouble(charSequence.toString());
                    double feet=meter/0.305;
                    eTftTOmeter.setText(String.format("%.03f",feet));

                }catch (Exception e){

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtftTOmeter=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double ft=Double.parseDouble(charSequence.toString());
                    double meter=ft*0.305;
                    eTmeterTOft.setText(String.format("%.03f",meter));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        txtmmTOft=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double mm = Double.parseDouble(charSequence.toString());
                    double ft = mm / 304.800;
                    eTftTomm.setText(String.format("%.03f", ft));
                }catch(Exception e){

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtftTOmm=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {



            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double feet = Double.parseDouble(charSequence.toString());
                    double mm = feet * 304.800;
                    eTmmTOft.setText(String.format("%.03f", mm));
                }catch (Exception e){

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };




        txtwatchin_mm=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try{

                    double inch=Double.parseDouble(charSequence.toString());
                    double mm=(inch/0.039370);
                    eTmm_inch.setText(String.format("%.01f",mm));

                }catch(Exception e){
                    e.printStackTrace();
                }


            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchmm_in=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try{
                    // eTinch_mm.removeTextChangedListener(txtwatchin_mm);
                    double mm=Double.parseDouble(charSequence.toString());
                    double inch=(mm * 0.039370);
                    eTinch_mm.setText(String.format("%.01f",inch));

                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };



        txtwatchdegreeC=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try{

                    double degreeC=Double.parseDouble(charSequence.toString());
                    double degreeF=(degreeC*9/5)+32;
                    eTdegreeF.setText(String.format("%.02f",degreeF));

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchdegreeF=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try{

                    double degreeF=Double.parseDouble(charSequence.toString());
                    double degreeC=((degreeF-32)*5/9);
                    eTdegreeC.setText(String.format("%.02f",degreeC));

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchftmeter =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double feet=Double.parseDouble(charSequence.toString());
                    double meter =feet/12;
                    eTmeter_ft.setText(String.format("%.02f",meter));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchmeterF =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double meter=Double.parseDouble(charSequence.toString());
                    double feet= meter* 12;
                    eTft_meter.setText(String.format("%.02f",feet));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchkm_mile =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double km=Double.parseDouble(charSequence.toString());
                    double mile=km/1.609;
                    eTmile_km.setText(String.format("%.03f", mile));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchmile_km =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double mile=Double.parseDouble(charSequence.toString());
                    double km=mile*1.609;
                    eTkm_mile.setText(String.format("%.03f", km));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchmPH_fph=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double mpH=Double.parseDouble(charSequence.toString());
                    double fph=mpH*1.46667;
                    eTfpH_mpH.setText(String.format("%.02f",fph));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchfph_mpH=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double fph=Double.parseDouble(charSequence.toString());
                    double mpH=fph/1.46667;
                    eTmpH_fpH.setText(String.format("%.02f",mpH));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchkmps_mps=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double kmps=Double.parseDouble(charSequence.toString());
                    double mps=kmps*0.28;
                    eTmps_kmps.setText(String.format("%.02f",mps));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchmps_kmps=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double mps=Double.parseDouble(charSequence.toString());
                    double kmps=mps/0.28;
                    eTkmps_mps.setText(String.format("%.02f",kmps));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        txtdegree=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                double minute_temp=0;
                double degree_temp=0;
                double condegree_temp=0;
                double seconds_temp=0;
                try {
                    degree_temp=Double.parseDouble(charSequence.toString());

                    if(minutes.getText().toString().matches(""))
                        minute_temp=0;
                    else
                        minute_temp=Double.parseDouble(minutes.getText().toString());
                    if(seconds.getText().toString().matches(""))
                        seconds_temp=0;
                    else
                        seconds_temp=Double.parseDouble(seconds.getText().toString());

                    condegree_temp=degree_temp+(minute_temp/60)+(seconds_temp/3600);
                    con_degree.setText(String.format("%.04f", condegree_temp));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtminutes=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                double minute_temp=0;
                double degree_temp=0;
                double condegree_temp=0;
                double seconds_temp=0;
                try {

                    minute_temp=Double.parseDouble(charSequence.toString());
                    if(degree.getText().toString().matches("")) degree_temp=0;
                    else
                        degree_temp=Double.parseDouble(degree.getText().toString());

                    if(seconds.getText().toString().matches(""))seconds_temp=0;
                    else
                        seconds_temp=Double.parseDouble(seconds.getText().toString());

                    condegree_temp=degree_temp+(minute_temp/60)+(seconds_temp/3600);
                    con_degree.setText(String.format("%.04f", condegree_temp));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtseconds=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                double minute_temp=0;
                double degree_temp=0;
                double condegree_temp=0;
                double seconds_temp=0;

                try {
                    seconds_temp=Double.parseDouble(charSequence.toString());
                    if(degree.getText().toString().matches("")) degree_temp=0;
                    else
                        degree_temp=Double.parseDouble(degree.getText().toString());

                    if(minutes.getText().toString().matches(""))minute_temp=0;
                    else
                        minute_temp=Double.parseDouble(minutes.getText().toString());

                    condegree_temp=degree_temp+(minute_temp/60)+(seconds_temp/3600);
                    con_degree.setText(String.format("%.04f",condegree_temp));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtcondegree=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                double minute_temp=0;
                int minute_temp1=0;
                double degree_temp=0;
                double degree_temp1=0;
                double condegree_temp=0;
                int condegree_temp1=0;
                double seconds_temp=0;
                double seconds_temp1=0;

                try{

                    condegree_temp=Double.parseDouble(charSequence.toString());
                    condegree_temp1=(int)Math.floor(condegree_temp);

                    minute_temp=condegree_temp-condegree_temp1;
                    if(minute_temp!=0.0) {


                        // degree.setText(String.format("%.02f", degree_temp1));
                        degree.setText(Integer.toString(condegree_temp1));
                        minute_temp *= 60.0;
                        minute_temp1 =(int) Math.floor(minute_temp);  // Update this

                        seconds_temp = minute_temp - minute_temp1;
                        seconds_temp *= 60.0;
                        seconds_temp1 = Math.round(seconds_temp); //


                        minutes.setText(Integer.toString(minute_temp1));
                        seconds.setText(String.format("%.02f",seconds_temp1));
                    }else{
                        degree.setText(Integer.toString(condegree_temp1));
                        minutes.setText(Integer.toString(minute_temp1));
                        seconds.setText(String.format("%.02f",seconds_temp1));
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };




        txtwatchgalperyard=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double galpermetersquare=Double.parseDouble(charSequence.toString());
                    double literspermetersquare=galpermetersquare*4.53;
                    eTliterspermeter.setText(String.format("%.04f",literspermetersquare));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        txtwatchliterpermeter=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double literpermetersquare=Double.parseDouble(charSequence.toString());
                    double gaperyardsquare=literpermetersquare/4.53;
                    eTgalperyard.setText(String.format("%.04f",gaperyardsquare));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };



        txtwatchinchpermile=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double inchpermile=Double.parseDouble(charSequence.toString());
                    double meterperkm=inchpermile/63.4;
                    eTmeterperKm.setText(String.format("%.04f",meterperkm));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchmeterperkm=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double meterperKm=Double.parseDouble(charSequence.toString());
                    double inpermile=meterperKm*63.4;
                    eTinchpermile.setText(String.format("%.02f",inpermile));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };



    }



    private void setFocusChangeListnersonET(){


        eTPSI_MPA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    eTMPA_PSI.removeTextChangedListener(txtwatchmpa_psi);
                    eTPSI_MPA.addTextChangedListener(txtwatchpsi_mpa);
                }else{
                    eTPSI_MPA.removeTextChangedListener(txtwatchpsi_mpa);
                }
            }
        });


        eTMPA_PSI.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if(b){
                    eTPSI_MPA.removeTextChangedListener(txtwatchpsi_mpa);
                    eTMPA_PSI.addTextChangedListener(txtwatchmpa_psi);
                }else
                {
                    eTMPA_PSI.removeTextChangedListener(txtwatchmpa_psi);
                }
            }
        });



        eTftTOmeter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    eTmeterTOft.removeTextChangedListener(txtmeterTOfeet);
                    eTftTOmeter.addTextChangedListener(txtftTOmeter);
                }else{
                    eTftTOmeter.removeTextChangedListener(txtftTOmeter);
                }
            }
        });


        eTmeterTOft.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    eTftTOmeter.removeTextChangedListener(txtftTOmeter);
                    eTmeterTOft.addTextChangedListener(txtmeterTOfeet);

                }else{
                    eTmeterTOft.removeTextChangedListener(txtmeterTOfeet);
                }
            }
        });




        eTmmTOft.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    eTftTomm.removeTextChangedListener(txtftTOmm);
                    eTmmTOft.addTextChangedListener(txtmmTOft);
                }else{
                    eTmmTOft.removeTextChangedListener(txtmmTOft);
                }
            }
        });



        eTftTomm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    eTmmTOft.removeTextChangedListener(txtmmTOft);
                    eTftTomm.addTextChangedListener(txtftTOmm);
                }else{
                    eTftTomm.removeTextChangedListener(txtftTOmm);
                }
            }
        });








        minutes.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) {
                    con_degree.removeTextChangedListener(txtcondegree);
                    degree.removeTextChangedListener(txtdegree);
                    seconds.removeTextChangedListener(txtseconds);
                    minutes.addTextChangedListener(txtminutes);
                }else{
                    minutes.removeTextChangedListener(txtminutes);
                }
            }
        });


        degree.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) {
                    con_degree.removeTextChangedListener(txtcondegree);
                    seconds.removeTextChangedListener(txtseconds);
                    minutes.removeTextChangedListener(txtminutes);
                    degree.addTextChangedListener(txtdegree);
                }else{
                    degree.removeTextChangedListener(txtdegree);
                }
            }
        });

        seconds.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    con_degree.removeTextChangedListener(txtcondegree);
                    minutes.removeTextChangedListener(txtminutes);
                    degree.removeTextChangedListener(txtdegree);
                    seconds.addTextChangedListener(txtseconds);
                }else{
                    seconds.removeTextChangedListener(txtseconds);
                }

            }
        });


        con_degree.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                con_degree.removeTextChangedListener(txtcondegree);
                if(!b){
                    con_degree.removeTextChangedListener(txtcondegree);
                    Listerswitch(0);
                }
                else {
                    Listerswitch(1);
                }
            }
        });



        eTdegreeC.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTdegreeC.removeTextChangedListener(txtwatchdegreeC);
                eTdegreeF.removeTextChangedListener(txtwatchdegreeF);
                setListenerdegreeFC(b);

            }
        });

        eTdegreeF.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTdegreeC.removeTextChangedListener(txtwatchdegreeC);
                eTdegreeF.removeTextChangedListener(txtwatchdegreeF);
                setListenerdegreeFC(false);
            }
        });


        eTinch_mm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmm_inch.removeTextChangedListener(txtwatchmm_in);
                eTinch_mm.removeTextChangedListener(txtwatchin_mm);
                setListenerin_mm(!b);
            }
        });

        eTmm_inch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmm_inch.removeTextChangedListener(txtwatchmm_in);
                eTinch_mm.removeTextChangedListener(txtwatchin_mm);
                setListenerin_mm(b);
            }
        });


        eTft_meter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTft_meter.removeTextChangedListener(txtwatchftmeter);
                eTmeter_ft.removeTextChangedListener(txtwatchmeterF);
                setListenerFT_M(b);

            }
        });

        eTmeter_ft.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTft_meter.removeTextChangedListener(txtwatchftmeter);
                eTmeter_ft.removeTextChangedListener(txtwatchmeterF);
                setListenerFT_M(!b);

            }
        });



        eTkm_mile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmile_km.removeTextChangedListener(txtwatchmile_km);
                eTkm_mile.removeTextChangedListener(txtwatchkm_mile);
                setListnermeter_km(b);

            }
        });

        eTmile_km.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmile_km.removeTextChangedListener(txtwatchmile_km);
                eTkm_mile.removeTextChangedListener(txtwatchkm_mile);
                setListnermeter_km(!b);
            }
        });

        eTmpH_fpH.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTfpH_mpH.removeTextChangedListener(txtwatchfph_mpH);
                eTmpH_fpH.removeTextChangedListener(txtwatchmPH_fph);
                setListnermph_fph(b);
            }
        });

        eTfpH_mpH.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmpH_fpH.removeTextChangedListener(txtwatchmPH_fph);
                eTfpH_mpH.removeTextChangedListener(txtwatchfph_mpH);
                setListnermph_fph(false);
            }
        });

        eTkmps_mps.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTkmps_mps.removeTextChangedListener(txtwatchkmps_mps);
                eTmps_kmps.removeTextChangedListener(txtwatchmps_kmps);
                setListnerkmph_mps(b);
            }
        });

        eTmps_kmps.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTkmps_mps.removeTextChangedListener(txtwatchkmps_mps);
                eTmps_kmps.removeTextChangedListener(txtwatchmps_kmps);
                setListnerkmph_mps(!b);
            }
        });


        eTgalperyard.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTgalperyard.removeTextChangedListener(txtwatchgalperyard);
                eTliterspermeter.removeTextChangedListener(txtwatchliterpermeter);
                setListnergalperyd_literpermete(b);
            }


        });

        eTliterspermeter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTliterspermeter.removeTextChangedListener(txtwatchliterpermeter);
                eTgalperyard.removeTextChangedListener(txtwatchgalperyard);
                setListnergalperyd_literpermete(false);
            }
        });


        eTmeterperKm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmeterperKm.removeTextChangedListener(txtwatchmeterperkm);
                eTinchpermile.removeTextChangedListener(txtwatchinchpermile);
                setListnermeterperkm_inchperkm(b);
            }
        });

        eTinchpermile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTinchpermile.removeTextChangedListener(txtwatchinchpermile);
                eTmeterperKm.removeTextChangedListener(txtwatchmeterperkm);
                setListnermeterperkm_inchperkm(false);
            }
        });




    }

    private void Listerswitch(int b){
        switch(b){
            case 0:con_degree.removeTextChangedListener(txtcondegree);
                minutes.addTextChangedListener(txtminutes);
                seconds.addTextChangedListener(txtseconds);
                degree.addTextChangedListener(txtdegree);
                break;
            case 1: con_degree.addTextChangedListener(txtcondegree);
                minutes.removeTextChangedListener(txtminutes);
                degree.removeTextChangedListener(txtdegree);
                seconds.removeTextChangedListener(txtseconds);
                break;
            default:break;
        }
    }
    private void setListnermeterperkm_inchperkm(boolean b) {
        if(!b){
            eTinchpermile.addTextChangedListener(txtwatchinchpermile);
        }else{
            eTmeterperKm.addTextChangedListener(txtwatchmeterperkm);
        }
    }

    private void setListnergalperyd_literpermete(boolean b) {
        if(b){
            eTgalperyard.addTextChangedListener(txtwatchgalperyard);
        }else{
            eTliterspermeter.addTextChangedListener(txtwatchliterpermeter);
        }
    }


    private void setListnerkmph_mps(boolean b) {
        if(b){
            eTkmps_mps.addTextChangedListener(txtwatchkmps_mps);
        }else{
            eTmps_kmps.addTextChangedListener(txtwatchmps_kmps);
        }
    }

    private void setListnermph_fph(boolean b) {
        if(b){
            eTmpH_fpH.addTextChangedListener(txtwatchmPH_fph);

        }else{
            eTfpH_mpH.addTextChangedListener(txtwatchfph_mpH);

        }
    }

    private void setListnermeter_km(boolean b) {
        if (b) {
            eTkm_mile.addTextChangedListener(txtwatchkm_mile);
        }
        else {
            eTmile_km.addTextChangedListener(txtwatchmile_km);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        AdView adView = (AdView) this.findViewById(R.id.adMob);
        //adView.setAdSize(AdSize.SMART_BANNER);
        //adView.setAdUnitId(AD_ID);
        //request TEST ads to avoid being disabled for clicking your own ads
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        eTdegreeC=(EditText) findViewById(R.id.eTdegreeC);
        eTdegreeF=(EditText) findViewById(R.id.eTdegreeF);
        eTft_meter =(EditText)findViewById(R.id.eTfeet_m);
        eTinch_mm=(EditText)findViewById(R.id.eTinch_mm);
        eTmm_inch=(EditText)findViewById(R.id.eTmm_inch);
        eTmeter_ft =(EditText)findViewById(R.id.eTmeter_f);

        eTmile_km =(EditText)findViewById(R.id.eTmile_km);
        eTkm_mile =(EditText)findViewById(R.id.eTkm_miles);

        eTmpH_fpH=(EditText)findViewById(R.id.eTmpH_fph);
        eTfpH_mpH=(EditText)findViewById(R.id.eTfpS_mph);

        eTkmps_mps=(EditText)findViewById(R.id.eTkmph_mps);
        eTmps_kmps=(EditText)findViewById(R.id.eTmps_kmph);

        eTgalperyard=(EditText)findViewById(R.id.eTgalPerYard);
        eTliterspermeter=(EditText)findViewById(R.id.eTliterspermeter);

        eTinchpermile=(EditText)findViewById(R.id.eTinchpermile);
        eTmeterperKm=(EditText)findViewById(R.id.eTmperkm);

        degree=(EditText)findViewById(R.id.degree);
        con_degree=(EditText)findViewById(R.id.degreeconverted);
        minutes=(EditText)findViewById(R.id.minutes);
        seconds=(EditText)findViewById(R.id.seconds);


        eTftTomm=(EditText)findViewById(R.id.eVft_mm);
        eTmmTOft = (EditText) findViewById(R.id.eVmm_ft);

        eTftTOmeter=(EditText)findViewById(R.id.eVft_meter);
        eTmeterTOft=(EditText)findViewById(R.id.eVmeter_ft);

        eTMPA_PSI=(EditText)findViewById(R.id.eTMPA_PSI);
        eTPSI_MPA=(EditText)findViewById(R.id.eTPSI_MPA);



        setTextWatchters();
        setFocusChangeListnersonET();



    }



    private void setListenerFT_M(boolean shouldSetTheListener) {
        if (shouldSetTheListener) {
            eTft_meter.addTextChangedListener(txtwatchftmeter);
        }
        else {
            eTmeter_ft.addTextChangedListener(txtwatchmeterF);
        }
    }





    private void setListenerin_mm(boolean shouldSetTheListener) {
        if (shouldSetTheListener) {
            eTmm_inch.addTextChangedListener(txtwatchmm_in);
        } else {

            eTinch_mm.addTextChangedListener(txtwatchin_mm);
        }
    }

    private void setListenerdegreeFC(boolean shouldSetTheListener) {
        if (shouldSetTheListener) {
            eTdegreeC.addTextChangedListener(txtwatchdegreeC);

        } else {
            eTdegreeF.addTextChangedListener(txtwatchdegreeF);
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
        if (id == R.id.action_refresh) {
            resetAllEditText();
        }
        return super.onOptionsItemSelected(item);
    }

    private void resetAllEditText() {

        eTdegreeC.setText("");
        eTdegreeF.setText("");
        eTft_meter.setText("");
        eTinch_mm.setText("");
        eTmm_inch.setText("");
        eTmeter_ft.setText("");

        eTmile_km.setText("");
        eTkm_mile.setText("");

        eTmpH_fpH.setText("");
        eTfpH_mpH.setText("");

        eTkmps_mps.setText("");
        eTmps_kmps.setText("");

        eTgalperyard.setText("");
        eTliterspermeter.setText("");

        eTinchpermile.setText("");
        eTmeterperKm.setText("");

        degree.setText("");
        con_degree.setText("");
        minutes.setText("");
        seconds.setText("");


        eTftTomm.setText("");
        eTmmTOft.setText("");

        eTftTOmeter.setText("");
        eTmeterTOft.setText("");

        eTMPA_PSI.setText("");
        eTPSI_MPA.setText("");



    }
}
