package com.codetmen.simpecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_number1)
    EditText etNumber1;
    @BindView(R.id.cb_check1)
    CheckBox cbCheck1;
    @BindView(R.id.et_number2)
    EditText etNumber2;
    @BindView(R.id.cb_check2)
    CheckBox cbCheck2;
    @BindView(R.id.et_number3)
    EditText etNumber3;
    @BindView(R.id.cb_check3)
    CheckBox cbCheck3;
    @BindView(R.id.btn_add)
    Button btnAdd;
    @BindView(R.id.btn_subtract)
    Button btnSubtract;
    @BindView(R.id.btn_multiple)
    Button btnMultiple;
    @BindView(R.id.btn_divide)
    Button btnDivide;
    @BindView(R.id.tv_total)
    TextView tvTotal;

    private Float input1, input2, input3;
    private String result;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // click btn add listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTotal();
            }
        });

        // click btn subtract listener
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractTotal();
            }
        });

        // click btn multiple listener
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multipleTotal();
            }
        });

        // click btn divide listener
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideTotal();
            }
        });
    }

    // Method sum all input active with add condition
    private void addTotal(){
        if (cbCheck1.isChecked()&&cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 + input2 + input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck2.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());

                result = String.valueOf(input1 + input2);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 + input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber2.getText().toString())||TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input2 + input3);
                tvTotal.setText(result);
            }
        } else {
            Toast.makeText(this, "Please select minimum 2 box", Toast.LENGTH_LONG).show();
        }
    }

    // Method sum all input active with subtract condition
    private void subtractTotal(){
        if (cbCheck1.isChecked()&&cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 - input2 - input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck2.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());

                result = String.valueOf(input1 - input2);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 - input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber2.getText().toString())||TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input2 - input3);
                tvTotal.setText(result);
            }
        } else {
            Toast.makeText(this, "Please select minimum 2 box", Toast.LENGTH_LONG).show();
        }
    }

    // Method sum all input active with multiple condition
    private void multipleTotal(){
        if (cbCheck1.isChecked()&&cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 * input2 * input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck2.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());

                result = String.valueOf(input1 * input2);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 * input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber2.getText().toString())||TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input2 * input3);
                tvTotal.setText(result);
            }
        } else {
            Toast.makeText(this, "Please select minimum 2 box", Toast.LENGTH_LONG).show();
        }
    }

    // Method sum all input active with divide condition
    private void divideTotal(){
        if (cbCheck1.isChecked()&&cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 / input2 / input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck2.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber2.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input2 = Float.valueOf(etNumber2.getText().toString());

                result = String.valueOf(input1 / input2);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck1.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber1.getText().toString()) || TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input1 = Float.valueOf(etNumber1.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input1 / input3);
                tvTotal.setText(result);
            }
        }
        else if (cbCheck2.isChecked()&&cbCheck3.isChecked()){
            if (TextUtils.isEmpty(etNumber2.getText().toString())||TextUtils.isEmpty(etNumber3.getText().toString())){
                Toast.makeText(this, "Please fill the empty input", Toast.LENGTH_LONG).show();
            } else {
                input2 = Float.valueOf(etNumber2.getText().toString());
                input3 = Float.valueOf(etNumber3.getText().toString());

                result = String.valueOf(input2 / input3);
                tvTotal.setText(result);
            }
        } else {
            Toast.makeText(this, "Please select minimum 2 box", Toast.LENGTH_LONG).show();
        }
    }
}
