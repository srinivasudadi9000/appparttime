package app.parttime;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {
    ImageView image_home;
    MediaPlayer ring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        image_home = (ImageView) findViewById(R.id.needle);

        Animation rotation = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.rotation);
        image_home.startAnimation(rotation);
        ring = MediaPlayer.create(SplashScreen.this, R.raw.track_3);
        ring.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                ring.stop();
                Intent login = new Intent(SplashScreen.this,Login.class);
                startActivity(login);
              //  finish();
            }
        }, 6800);

    }
}
