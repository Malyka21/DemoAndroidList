package sg.edu.rp.c346.id20047536.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        AndroidVersion av1 = new AndroidVersion(name: "Pie", version: "9.0");
        al.add(av1);
        al.add(new AndroidVersion(name: "Oreo", version: "8.0"));
        al.add(new AndroidVersion(name: "Nougat", version: "7.0"));
        al.add(new AndroidVersion(name: "Marshmallow", version: "6.0"));

        adapter = new CustomAdapter(MainActivity.this, R.layout.row, al );

        lv.setAdapter(aa);
    }
}