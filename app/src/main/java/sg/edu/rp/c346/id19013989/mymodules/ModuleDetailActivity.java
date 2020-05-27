package sg.edu.rp.c346.id19013989.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvAcademicYear;
    TextView tvSemester;
    TextView tvModuleCredit;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");


        if (code.equals("C346")) {

            tvModuleCode.setText("Module Code: " + code);
            tvModuleName.setText("Module Name: Android Programming" );
            tvAcademicYear.setText("Academic Year: 2020");
            tvSemester.setText("Semester: 1" );
            tvModuleCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W66M");


        }

        else if (code.equals("C349")) {

            tvModuleCode.setText("Module Code: " + code);
            tvModuleName.setText("Module Name: Ipad Programming" );
            tvAcademicYear.setText("Academic Year: 2020");
            tvSemester.setText("Semester: 1" );
            tvModuleCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W66H");

        }


















    }
}
