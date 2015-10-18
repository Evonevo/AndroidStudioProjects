package proj1.piotr.infinitie22.com.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ArrayList<String> forecastW = new ArrayList<String>();
        forecastW.add("Monday: 5/10/2015");
        forecastW.add("Tuesday: 6/10/2015");
        forecastW.add("Weadnesday: 7/10/2015");
        forecastW.add("Thursday: 8/10/2015");
        forecastW.add("Friday: 9/10/2015");

        ArrayAdapter<String> forecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.list_item_forecast, // The name of the layout ID.
                        R.id.list_item_forecast_textview, // The ID of the textview to populate.
                        forecastW);

        View rootView = View.inflate(R.layout.fragment_main,container , false);



        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listvew_forecast);
        listView.setAdapter(forecastAdapter);






        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
