package mrperfect.example.covidtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class MyCustomAdapter extends ArrayAdapter<CountryMode> {
    private Context context;
    private List<CountryMode> countryModesList;




    public MyCustomAdapter( Context context, List<CountryMode> countryModesList) {
        super(context, R.layout.list_custom_item, countryModesList);

        this.context = context;
        this.countryModesList = countryModesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_custom_item, null, true);
        TextView tvCountryName = view.findViewById(R.id.tvCountryName);
        ImageView imageView = view.findViewById(R.id.imageFlag);

        tvCountryName.setText(countryModesList.get(position).getCountry());


        return super.getView(position, convertView, parent);
    }
}
