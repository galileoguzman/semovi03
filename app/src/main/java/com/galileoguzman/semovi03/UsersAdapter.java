package com.galileoguzman.semovi03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

// Aquí revisa paso 4
// 4.1.- Tu adaptador debe heredar de ArrayAdapter
// 4.2.- Tu arrayAdapter debe contener la clase que quieres almancenar (User)
public class UsersAdapter extends ArrayAdapter<User> {

    // 4.3.- Todos los adaptadores deben tener un contexto y una lista
    private Context mContext;
    private List<User> userList = new ArrayList<>();

    // 4.4.- Todos los adaptadores deben tener un constructor público
    // 4.5.- Todos los adaptadores deben recibir como parametro para instanciar
    // ----- un contexto (Context) y un ArrayList de lo que quieres iterar (User)
    public UsersAdapter(@NonNull Context context,
                        ArrayList<User> list) {
        super(context, 0, list);

        // 4.6.- Instancia o inicializa
        mContext = context;
        userList = list;
    }

    // 4.7 Sobre escribir getView
    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        // 4.8 Obtener tu item para la lista
        View listItem = convertView;

        // 4.9 Inyecta tu xml item
        if (listItem == null) {
            listItem = LayoutInflater
                        .from(mContext)
                        .inflate(R.layout.users_item, parent, false);
        }




        // 4.10 Instanciar objeto que viene de la lista

        User user = userList.get(position);

        // 4.11 Instanciar elemento de vista que le inyectaremos info
        TextView tvUserFullname = (TextView) listItem
                                            .findViewById(R.id.tvUserFullname);

        // 4.12 inyecta información a tu vista
        tvUserFullname.setText(user.getFullname());

        // 4.13 Retorna la vista con info
        return listItem;

    }
}
