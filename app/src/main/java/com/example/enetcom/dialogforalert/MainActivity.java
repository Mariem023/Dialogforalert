package com.example.enetcom.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        // Définir le titre et le message de la boîte de dialogue.
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
        // Ajouter les boutons de dialogue.
        myAlertBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // L'utilisateur a cliqué sur le bouton OK.
                        Toast.makeText(getApplicationContext(), "Pressed OK",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // L'utilisateur a annulé la boîte de dialogue.
                        Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        // Créer et afficher l'AlertDialog.
        myAlertBuilder.show();
    }

}