package rippleeffect.c4console.com.buttonclickeffect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button 2nd, On click color change
        final Button btn_colorchange=(Button)findViewById(R.id.btn_colorchange);
        btn_colorchange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
               startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }
}
