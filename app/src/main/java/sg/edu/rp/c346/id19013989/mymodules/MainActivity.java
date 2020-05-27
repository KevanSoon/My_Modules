package sg.edu.rp.c346.id19013989.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroidProgramming;
    TextView tvIpadProgramming;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroidProgramming = findViewById(R.id.textViewAndroidProgramming);
        tvIpadProgramming = findViewById(R.id.textViewIpadProgramming);

        tvAndroidProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code","C346");
                startActivity(intent);




            }
        });

        tvIpadProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("code","C349");
                startActivity(intent);


            }
        });


    }
}
