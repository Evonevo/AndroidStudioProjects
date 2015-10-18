package proj3.piotr.infinitie22.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText eText;
    Button myButton;
    ListView lView;
    ArrayList<String> aList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText = (EditText)findViewById(R.id.editText);
        myButton = (Button)findViewById(R.id.button);
        lView = (ListView)findViewById(R.id.listView);

        aList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,aList);
        lView.setAdapter(adapter);

        myButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        addItem(eText.getText().toString());
    }

    private void addItem (String s){
       if (s.length() > 0) {
        this.aList.add(s);
        this.adapter.notifyDataSetChanged();
        this.eText.setText("");
    }
}
}
