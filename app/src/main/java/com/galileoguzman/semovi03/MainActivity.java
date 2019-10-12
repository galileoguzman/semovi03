package com.galileoguzman.semovi03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1.- Declaro objeto que vendrá de la vista
    private ListView lvUsers;

    // 6.- Propiedades para el adaptador
    private UsersAdapter usersAdapter;
    private ArrayList<User> users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2.- Instanciar nuestro obj lista
        lvUsers = (ListView) findViewById(R.id.lvUsers);

        // 3.- Crea tu clase que inyectaras en la lista (POJO)
        // User.java con setters y getters

        // 4.- Crea una clase adapter para tu modelo del paso 3

        // 5.- Datos
        User user1 = new User("Galileo", "Guzman", "@galileoguzman");
        User user2 = new User("Daneri", "Garcia", "danerigd");
        User user3 = new User("Raul", "Dominguez", "undifined");

        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        // 7.- Instanciar mi adaptador
        usersAdapter = new UsersAdapter(this, users);

        // 8.- Asignar adaptador al ListView
        lvUsers.setAdapter(usersAdapter);

        // 9.- Set onclick listener

        lvUsers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("lvUsers Click", String.valueOf(i));

                User user = (User) users.get(i);

                Intent intent = new Intent(MainActivity.this, UserDetailActivity.class);
                intent.putExtra("twitterAccount", user.getTwitter());
                startActivity(intent);

            }
        });


    }
}
