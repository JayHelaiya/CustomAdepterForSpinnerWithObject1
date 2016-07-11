package nichetech.com.customadepterforspinnerwithobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryList=new ArrayList<Country>();
        countryList.add(new Country("india",R.drawable.india));
        countryList.add(new Country("usa",R.drawable.usa));

        CountryAdepter countryAdepter=new CountryAdepter(getApplicationContext(),countryList);

        Spinner spinner=(Spinner)findViewById(R.id.simpleSpinner);
        spinner.setAdapter(countryAdepter);


    }
}
