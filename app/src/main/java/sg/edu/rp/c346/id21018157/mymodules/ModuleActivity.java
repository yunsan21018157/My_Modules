package sg.edu.rp.c346.id21018157.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView tvWelcome;
    TextView tvViewMods;
    TextView tvDetails;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvWelcome = findViewById(R.id.textViewWelcome);
        tvViewMods = findViewById(R.id.textViewModDes);
        tvDetails = findViewById(R.id.textViewDetails);
        btnReturn = findViewById(R.id.buttonReturn);

        //receive data from MainActivity for each mod
        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("module");

        if (moduleSelected.trim().equalsIgnoreCase("C203")) {

            String moduleName = intentReceived.getStringExtra("name1");
            String moduleYear = intentReceived.getStringExtra("year1");
            String moduleSem = intentReceived.getStringExtra("sem1");
            String moduleCredit = intentReceived.getStringExtra("credit1");
            String moduleVenue = intentReceived.getStringExtra("venue1");

            tvDetails.setText("Module Code: " + moduleSelected + "\nModule Name: " + moduleName +
                    "\nAcademic Year: " + moduleYear + "\nSemester: " + moduleSem + "\nModule Credit: " + moduleCredit + "\nVenue: " + moduleVenue);

        } else if (moduleSelected.trim().equalsIgnoreCase("C235")) {

                String moduleName = intentReceived.getStringExtra("name2");
                String moduleYear = intentReceived.getStringExtra("year2");
                String moduleSem = intentReceived.getStringExtra("sem2");
                String moduleCredit = intentReceived.getStringExtra("credit2");
                String moduleVenue = intentReceived.getStringExtra("venue2");
              tvDetails.setText("Module Code: " + moduleSelected + "\nModule Name: " + moduleName +
                    "\nAcademic Year: " + moduleYear + "\nSemester: " + moduleSem + "\nModule Credit: " + moduleCredit + "\nVenue: " + moduleVenue);

        } else if (moduleSelected.trim().equalsIgnoreCase("C218")) {

                String moduleName = intentReceived.getStringExtra("name3");
                String moduleYear = intentReceived.getStringExtra("year3");
                String moduleSem = intentReceived.getStringExtra("sem3");
                String moduleCredit = intentReceived.getStringExtra("credit3");
                String moduleVenue = intentReceived.getStringExtra("venue3");
              tvDetails.setText("Module Code: " + moduleSelected + "\nModule Name: " + moduleName +
                    "\nAcademic Year: " + moduleYear + "\nSemester: " + moduleSem + "\nModule Credit: " + moduleCredit + "\nVenue: " + moduleVenue);

        } else if (moduleSelected.trim().equalsIgnoreCase("C206")) {

                String moduleName = intentReceived.getStringExtra("name4");
                String moduleYear = intentReceived.getStringExtra("year4");
                String moduleSem = intentReceived.getStringExtra("sem4");
                String moduleCredit = intentReceived.getStringExtra("credit4");
                String moduleVenue = intentReceived.getStringExtra("venue4");
              tvDetails.setText("Module Code: " + moduleSelected + "\nModule Name: " + moduleName +
                    "\nAcademic Year: " + moduleYear + "\nSemester: " + moduleSem + "\nModule Credit: " + moduleCredit + "\nVenue: " + moduleVenue);

        } else if (moduleSelected.trim().equalsIgnoreCase("C346")) {

                String moduleName = intentReceived.getStringExtra("name5");
                String moduleYear = intentReceived.getStringExtra("year5");
                String moduleSem = intentReceived.getStringExtra("sem5");
                String moduleCredit = intentReceived.getStringExtra("credit5");
                String moduleVenue = intentReceived.getStringExtra("venue5");
              tvDetails.setText("Module Code: " + moduleSelected + "\nModule Name: " + moduleName +
                    "\nAcademic Year: " + moduleYear + "\nSemester: " + moduleSem + "\nModule Credit: " + moduleCredit + "\nVenue: " + moduleVenue);
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}