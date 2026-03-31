package br.edu.ifsuldeminas.mch.login;

import android.view.View;
import android.widget.Toast;

public class RegisterClickerListener implements View.OnClickListener {


    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Botão Cadastrar Clicado!", Toast.LENGTH_LONG).show();
    }
}
