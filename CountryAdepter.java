package nichetech.com.customadepterforspinnerwithobject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdepter extends BaseAdapter{

    Context context;
    ArrayList<Country> countryList;
    LayoutInflater inflter;

    public CountryAdepter(Context context, ArrayList<Country> countryList) {

        this.context=context;
        this.countryList=countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {

        inflter = (LayoutInflater.from(context));
        view = inflter.inflate(R.layout.countries_custom_adepter, null);

        ImageView icon = (ImageView) view.findViewById(R.id.country);
        TextView names = (TextView) view.findViewById(R.id.country_name);
        icon.setImageResource(countryList.get(position).getImage());
        names.setText(countryList.get(position).getName());
        return view;
    }
}
