package sg.edu.rp.c346.id21018157.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;
    TextView tvViewMods;

    ImageView ivMod1;
    TextView tvMod1;

    TextView tvMod2;
    ImageView ivMod2;

    ImageView ivMod3;
    TextView tvMod3;

    TextView tvMod4;
    ImageView ivMod4;

    ImageView ivMod5;
    TextView tvMod5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.textViewWelcome);
        tvViewMods = findViewById(R.id.textViewModDes);
        ivMod1 = findViewById(R.id.imageViewMod1);
        tvMod1 = findViewById(R.id.textViewMod1);
        tvMod2 = findViewById(R.id.textViewMod2);
        ivMod2 = findViewById(R.id.imageViewMod2);
        ivMod3 = findViewById(R.id.imageViewMod3);
        tvMod3 = findViewById(R.id.textViewMod3);
        tvMod4 = findViewById(R.id.textViewMod4);
        ivMod4 = findViewById(R.id.imageViewMod4);
        ivMod5 = findViewById(R.id.imageViewMod5);
        tvMod5 = findViewById(R.id.textViewMod5);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module","C203");   //module is the name for ALL 1-5
                intent.putExtra("name1","Web Application in PHP");
                intent.putExtra("year1","2022");
                intent.putExtra("sem1","1");
                intent.putExtra("credit1","4");
                intent.putExtra("venue1","W65H");
                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module","C235");   //module is the name for ALL 1-5
                intent.putExtra("name2","IT Security and Management");
                intent.putExtra("year2","2022");
                intent.putExtra("sem2","1");
                intent.putExtra("credit2","4");
                intent.putExtra("venue2","W65G");

                startActivity(intent);
            }
        });

        tvMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module","C218");   //module is the name for ALL 1-5
                intent.putExtra("name3","UI/UX Design for Apps");
                intent.putExtra("year3","2022");
                intent.putExtra("sem3","1");
                intent.putExtra("credit3","4");
                intent.putExtra("venue3","E66B");
                startActivity(intent);
            }
        });

        tvMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module","C206");   //module is the name for ALL 1-5
                intent.putExtra("name4","Software Development Process");
                intent.putExtra("year4","2022");
                intent.putExtra("sem4","1");
                intent.putExtra("credit4","4");
                intent.putExtra("venue4","E66K");
                startActivity(intent);
            }
        });

        tvMod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module","C346");   //module is the name for ALL 1-5
                intent.putExtra("name5","Mobile App Development");
                intent.putExtra("year5","2022");
                intent.putExtra("sem5","1");
                intent.putExtra("credit5","4");
                intent.putExtra("venue5","E62E");
                startActivity(intent);
            }
        });

    }
}