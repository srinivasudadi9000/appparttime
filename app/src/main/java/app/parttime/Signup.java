package app.parttime;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

public class Signup extends Activity implements DatePickerDialog.OnDateSetListener {
    EditText datetime_btn;
    Calendar calendar;
    DatePickerDialog datePickerDialog;
    int Year, Month, Day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        datetime_btn = (EditText) findViewById(R.id.datetime_btn);

        calendar = Calendar.getInstance();

        Year = calendar.get(Calendar.YEAR) ;
        Month = calendar.get(Calendar.MONTH);
        Day = calendar.get(Calendar.DAY_OF_MONTH);
        datetime_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_LEFT = 0;
                final int DRAWABLE_TOP = 1;
                final int DRAWABLE_RIGHT = 2;
                final int DRAWABLE_BOTTOM = 3;

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (datetime_btn.getRight() - datetime_btn.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here
                        datePickerDialog = DatePickerDialog.newInstance(Signup.this, Year, Month, Day);

                        datePickerDialog.setThemeDark(false);

                        datePickerDialog.showYearPickerFirst(false);

                        datePickerDialog.setAccentColor(Color.parseColor("#009688"));

                        datePickerDialog.setTitle("Select Date From DatePickerDialog");

                        datePickerDialog.show(getFragmentManager(), "DatePickerDialog");

                        return true;
                    }
                }
                return false;
            }
        });
     }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = "Selected Date : " + dayOfMonth + "-" + monthOfYear + "-" + year;

        Toast.makeText(Signup.this, date, Toast.LENGTH_LONG).show();
    }
}
