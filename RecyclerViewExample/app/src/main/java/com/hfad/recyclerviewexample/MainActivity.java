package com.hfad.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contacsrecview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacsrecview=findViewById(R.id.contacsRecView);

        ArrayList<Contact> contacts=new ArrayList<>();
        contacts.add(new Contact("Kate Winslet","kate@gmail.com","https://im.idiva.com/content/2020/Apr/Kate-Winslet-Recalls-India-Trip-Says-Himalayan-Man-Recognised-Her-As-Rose-from-Titanic-iDiva-1_5ea8145aa4fc4.jpg"));
        contacts.add(new Contact("Chris Evan","chirs@gmail.com","hhttps://www.joblo.com/assets/images/joblo/news/2021/01/chris-evans-captain-america-marvel-mcu.jpg"));
        contacts.add(new Contact("scarlett johansson","scarlett@gmail.com","https://i.pinimg.com/originals/28/bb/e9/28bbe944261180a0f1f2ef8bb478e7be.jpg"));
        contacts.add(new Contact("christian bale","christian@gmail.com","https://dailysuperheroes.com/wp-content/uploads/2020/06/BaleBatmanDS-Cropped.jpg"));

        ContactsRecViewAdapter adapter=new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contacsrecview.setAdapter(adapter);
        contacsrecview.setLayoutManager(new GridLayoutManager(this,2));
    }
}