package org.indywidualni.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mediaStreamer = (Button) findViewById(R.id.media_streamer);
        Button scoresApp = (Button) findViewById(R.id.scores_app);
        Button libraryApp = (Button) findViewById(R.id.library_app);
        Button buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        Button baconReader = (Button) findViewById(R.id.bacon_reader);
        Button capstone = (Button) findViewById(R.id.capstone);

        if (mediaStreamer != null)
            mediaStreamer.setOnClickListener(this);

        if (scoresApp != null)
            scoresApp.setOnClickListener(this);

        if (libraryApp != null)
            libraryApp.setOnClickListener(this);

        if (buildItBigger != null)
            buildItBigger.setOnClickListener(this);

        if (baconReader != null)
            baconReader.setOnClickListener(this);

        if (capstone != null)
            capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.media_streamer:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.media_streamer)), Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores_app:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.scores_app)), Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_app:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.library_app)), Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.build_it_bigger)), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bacon_reader:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.bacon_reader)), Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, String.format(getString(R.string.button_toast),
                        getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
