package proj3.piotr.infinitie22.com.myapplication3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;




public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartAction(View view){

        EditText eText = (EditText)findViewById(R.id.editText);
        String st = eText.getText().toString();
        Intent it = new Intent(getBaseContext(),Activity.class);
        it.putExtra("Msg",st);
        startActivity(it);
    }

    public  void OpenUrl (View view){
        Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.onet.pl"));
        startActivity(intent);
    }
}
