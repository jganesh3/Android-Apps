package gj.nurseryrhymes;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Locale;


public class MyActivity extends Activity implements TextToSpeech.OnInitListener{

    private TextToSpeech tts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


       //Remove for Pro Version
        /*AdView adView = (AdView) this.findViewById(R.id.adMob);
        //adView.setAdSize(AdSize.SMART_BANNER);
        //adView.setAdUnitId(AD_ID);
        //request TEST ads to avoid being disabled for clicking your own ads
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);*/


        tts =new TextToSpeech(this,this);


        ImageButton apple=(ImageButton)findViewById(R.id.apple_btn);
        ImageButton ball=(ImageButton)findViewById(R.id.ball_btn);
        ImageButton cat=(ImageButton)findViewById(R.id.cat_btn);
        ImageButton dog=(ImageButton)findViewById(R.id.dog_btn);
        ImageButton egg=(ImageButton)findViewById(R.id.eggbtn);
        ImageButton fish=(ImageButton)findViewById(R.id.fish_btn);
        ImageButton girl=(ImageButton)findViewById(R.id.girl_btn);
        ImageButton hat=(ImageButton)findViewById(R.id.hat_btn);
        ImageButton icecream=(ImageButton)findViewById(R.id.ice_btn);
        ImageButton jug=(ImageButton)findViewById(R.id.jug_btn);
        ImageButton kite=(ImageButton)findViewById(R.id.kite_btn);
        ImageButton leaf=(ImageButton)findViewById(R.id.leaf_btn);
        ImageButton moon=(ImageButton)findViewById(R.id.moon_btn);
        ImageButton nest=(ImageButton)findViewById(R.id.net_btn);
        ImageButton orange=(ImageButton)findViewById(R.id.orange_btn);
        ImageButton pencil=(ImageButton)findViewById(R.id.pencil_btn);
        ImageButton queen=(ImageButton)findViewById(R.id.qeen_btn);
        ImageButton rabbit=(ImageButton)findViewById(R.id.rabbit_btn);
        ImageButton star=(ImageButton)findViewById(R.id.star_btn);
        ImageButton tomato=(ImageButton)findViewById(R.id.tomato_btn);
        ImageButton umbrella=(ImageButton)findViewById(R.id.umbrell_btn);
        ImageButton van=(ImageButton)findViewById(R.id.van_btn);
        ImageButton watch=(ImageButton)findViewById(R.id.watch_btn);
        ImageButton xylophone=(ImageButton)findViewById(R.id.xray_btn);
        ImageButton yatch=(ImageButton)findViewById(R.id.yatch_btn);
        ImageButton zebra=(ImageButton)findViewById(R.id.zebra_btn);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("A for Apple");
            }
        });


        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("B for Ball");
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("C for Cat");
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("D for Dog");
            }
        });

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("E for Egg");
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("F for Fish");
            }
        });

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("G for Girl");
            }
        });

        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("H for Hat");
            }
        });

        icecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("I for Ice Cream");
            }
        });

        jug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("J for Jug");
            }
        });

        kite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("K for Kite");
            }
        });

        leaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("L for Leaf");
            }
        });

        moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("M for Moon");
            }
        });

        nest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("N for Nest");
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("O for Orange");
            }
        });

        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("P for Pencil");
            }
        });

        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("Q for Queen");
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("R for Rabbit");
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("S for Star");
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("T for Tomato");
            }
        });

        umbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("U for Umbrella");
            }
        });

        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("V for Van");
            }
        });

        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("W for Watch");
            }
        });

        xylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("X for Xylophone");
            }
        });

        yatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("Y for Yacht");
            }
        });

        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speak("Z for Zebra");
            }
        });

    }


    @Override
    protected void onDestroy() {
        //On destroy remove
        tts.stop();
        tts.shutdown();
        tts=null;
        super.onDestroy();
    }



    @Override
    public void onPause(){

        super.onPause();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;


    }



    private void Speak(String s){
        tts.speak(s, TextToSpeech.QUEUE_FLUSH, null);
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS)
        {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Toast.makeText(this, "This Language is not supported", Toast.LENGTH_LONG).show();
            }
            else
            {
                //Toast.makeText(this, "Ready to Speak", Toast.LENGTH_LONG).show();

            }

        }
        else
        {
            Toast.makeText(this, "Can Not Speak", Toast.LENGTH_LONG).show();
        }

    }

}
