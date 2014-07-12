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


public class MyActivity extends Activity {

    EditText eTdegreeC;
    EditText eTdegreeF;

    EditText eTinch_mm;
    EditText eTmm_inch;

    EditText eTft_meter;
    EditText eTmeter_ft;

    EditText eTkm_meter;
    EditText eTmeter_km;
    EditText eTmpH_fpH;
    EditText eTfpH_mpH;
    EditText eTkmps_mps;
    EditText eTmps_kmps;

    EditText eTin_ft;
    EditText eTft_in;

    EditText eTgalperyard;
    EditText eTliterspermeter;
    EditText eTinchpermile;
    EditText eTmeterperKm;




    TextWatcher txtinch_ft;
    TextWatcher txtft_inch;
    TextWatcher txtwatchdegreeC;
    TextWatcher txtwatchdegreeF;
    TextWatcher txtwatchin_mm;
    TextWatcher txtwatchmm_in;
    TextWatcher txtwatchftmeter;
    TextWatcher txtwatchmeterF;
    TextWatcher txtwatchkm_meter;
    TextWatcher txtwatchmeter_km;

    TextWatcher txtwatchmPH_fph;
    TextWatcher txtwatchfph_mpH;

    TextWatcher txtwatchkmps_mps;
    TextWatcher txtwatchmps_kmps;

    TextWatcher txtwatchgalperyard;
    TextWatcher txtwatchliterpermeter;

    TextWatcher txtwatchinchpermile;
    TextWatcher txtwatchmeterperkm;

    private void setTextWatchters(){
        txtwatchin_mm=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try{

                    double inch=Double.parseDouble(charSequence.toString());
                    double mm=(inch/0.039370);
                    eTmm_inch.setText(String.format("%.02f",mm));

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
                    eTinch_mm.setText(String.format("%.02f",inch));

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
                    double meter =feet/3.2808;
                    eTmeter_ft.setText(String.format("%.04f",meter));
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
                    double feet= meter* 3.2808;
                    eTft_meter.setText(String.format("%.04f",feet));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtwatchkm_meter=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double km=Double.parseDouble(charSequence.toString());
                    double meters=km/1.609;
                    eTmeter_km.setText(String.format("%.04f",meters));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        txtwatchmeter_km=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double meter=Double.parseDouble(charSequence.toString());
                    double km=meter*1.609;
                    eTkm_meter.setText(String.format("%.04f",km));
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
                    eTfpH_mpH.setText(String.format("%.04f",fph));
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
                    eTmpH_fpH.setText(String.format("%.04f",mpH));
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
                    eTinchpermile.setText(String.format("%.04f",inpermile));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        txtinch_ft=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    double inch=Double.parseDouble(charSequence.toString());
                    double ft=inch*0.08;
                    eTft_in.setText(String.format("%.02f",ft));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };


        txtft_inch=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                try {
                    double ft=Double.parseDouble(charSequence.toString());
                    double inch=ft/0.08;
                    //eTin_ft.setText(String.format("%0.2f",inch));
                    eTin_ft.setText(String.format("%.02f",inch));
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

        eTin_ft.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTft_in.removeTextChangedListener(txtft_inch);
                eTin_ft.removeTextChangedListener(txtinch_ft);
                setListnerinch_ft(b);
            }
        });

        eTft_in.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTft_in.removeTextChangedListener(txtft_inch);
                eTin_ft.removeTextChangedListener(txtinch_ft);
                setListnerinch_ft(false);
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



        eTkm_meter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmeter_km.removeTextChangedListener(txtwatchmeter_km);
                eTkm_meter.removeTextChangedListener(txtwatchkm_meter);
                setListnermeter_km(b);

            }
        });

        eTmeter_km.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                eTmeter_km.removeTextChangedListener(txtwatchmeter_km);
                eTkm_meter.removeTextChangedListener(txtwatchkm_meter);
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

    private void setListnerinch_ft(boolean b) {
        if(b)
            eTin_ft.addTextChangedListener(txtinch_ft);
        else
            eTft_in.addTextChangedListener(txtft_inch);
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
            eTkm_meter.addTextChangedListener(txtwatchkm_meter);
        }
        else {
            eTmeter_km.addTextChangedListener(txtwatchmeter_km);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        eTdegreeC=(EditText) findViewById(R.id.eTdegreeC);
        eTdegreeF=(EditText) findViewById(R.id.eTdegreeF);
        eTft_meter =(EditText)findViewById(R.id.eTfeet_m);
        eTinch_mm=(EditText)findViewById(R.id.eTinch_mm);
        eTmm_inch=(EditText)findViewById(R.id.eTmm_inch);
        eTmeter_ft =(EditText)findViewById(R.id.eTmeter_f);

        eTmeter_km=(EditText)findViewById(R.id.eTmeter_km);
        eTkm_meter=(EditText)findViewById(R.id.eTkm_meter);

        eTmpH_fpH=(EditText)findViewById(R.id.eTmpH_fph);
        eTfpH_mpH=(EditText)findViewById(R.id.eTfpH_mph);

        eTkmps_mps=(EditText)findViewById(R.id.eTkmph_mps);
        eTmps_kmps=(EditText)findViewById(R.id.eTmps_kmph);

        eTgalperyard=(EditText)findViewById(R.id.eTgalPerliters);
        eTliterspermeter=(EditText)findViewById(R.id.eTliterspermeter);

        eTinchpermile=(EditText)findViewById(R.id.eTinchpermile);
        eTmeterperKm=(EditText)findViewById(R.id.eTmperkm);

        eTin_ft=(EditText)findViewById(R.id.eTinch_ft);
        eTft_in=(EditText)findViewById(R.id.eTft_inch);

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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
