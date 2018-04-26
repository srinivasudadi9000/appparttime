package app.parttime;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Otp extends Activity {
    private static final String TAG = "LoginActivity";
    EditText enter_mpin;
    ImageView i1, i2, i3, i4, back_img;
    TextView one, two, three, four, five, six, seven, eight, nine, zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);

        i1 = (ImageView) findViewById(R.id.imageview_circle1);
        i2 = (ImageView) findViewById(R.id.imageview_circle2);
        i3 = (ImageView) findViewById(R.id.imageview_circle3);
        i4 = (ImageView) findViewById(R.id.imageview_circle4);

        back_img = (ImageView) findViewById(R.id.back_img);
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        zero = (TextView) findViewById(R.id.zero);
     /*   enter_mpin = (EditText) findViewById(R.id.editText_enter_mpin);
        enter_mpin.requestFocus();
        enter_mpin.setInputType(InputType.TYPE_CLASS_NUMBER);
        enter_mpin.setFocusableInTouchMode(true);

        enter_mpin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "onKey: screen key pressed");
                i1.setImageResource(R.drawable.circle2);
            }
        });*/

    }
}
