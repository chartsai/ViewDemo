package idv.chatea.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        View bgView = findViewById(R.id.backgroundView);
        bgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ResultActivity.this, "Click Background", Toast.LENGTH_SHORT).show();
            }
        });

        View circularView = findViewById(R.id.circularView);
        circularView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ResultActivity.this, "Click circle", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
