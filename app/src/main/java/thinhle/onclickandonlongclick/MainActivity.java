package thinhle.onclickandonlongclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private Button btnResult;
    private int numA, numB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button) findViewById(R.id.btn_result);
        editTextA = (EditText) findViewById(R.id.edt_num_a);
        editTextB = (EditText) findViewById(R.id.edt_num_b);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextB.getText().toString().isEmpty() || editTextA.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Nhập vào số hợp lệ!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    numA = Integer.parseInt(editTextA.getText().toString());
                    numB = Integer.parseInt(editTextB.getText().toString());
                    Toast.makeText(MainActivity.this, "Kết quả A + B là: " + (numA + numB), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Thinh Le", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}
