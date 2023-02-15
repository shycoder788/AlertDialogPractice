package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSuccessDialog();
            }
        });

        findViewById(R.id.buttonWarning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showWarningDialog();
            }
        });

        findViewById(R.id.buttonError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showErrorDialog();
            }
        });
    }
    private void showSuccessDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogTheme);
        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.layout_success_dialog,
                (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.success_title));
        ((TextView) view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
        ((Button) view.findViewById(R.id.buttonAction)).setText(getResources().getString(R.string.okay));
        ((ImageView) view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_done);

        AlertDialog alertDialog = builder.create();

        view.findViewById(R.id.buttonAction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow()!=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void showWarningDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogTheme);
        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.layout_warning_dialog,
                (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.warning_title));
        ((TextView) view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
        ((Button) view.findViewById(R.id.buttonYes)).setText(getResources().getString(R.string.yes));
        ((Button) view.findViewById(R.id.buttonNo)).setText(getResources().getString(R.string.no));
        ((ImageView) view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_warning);

        AlertDialog alertDialog = builder.create();

        view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
            }
        });

        if(alertDialog.getWindow()!=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void showErrorDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogTheme);
        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.layout_error_dialog,
                (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.success_title));
        ((TextView) view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
        ((Button) view.findViewById(R.id.buttonAction)).setText(getResources().getString(R.string.okay));
        ((ImageView) view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_warning);

        AlertDialog alertDialog = builder.create();

        view.findViewById(R.id.buttonAction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow()!=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}