package com.alessandroreis.java.recyclerviewjava;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.alessandroreis.java.recyclerviewjava.model.Email;
import com.alessandroreis.java.recyclerviewjava.model.Emails;
import com.mooveit.library.Fakeit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fakeit.init();
        setContentView(R.layout.activity_main);

        emailAdapter = new EmailAdapter(new ArrayList<>(Emails.fakeEmails()));

        final RecyclerView rv = findViewById(R.id.recycler_view_main);
        rv.setAdapter(emailAdapter);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmail();
                rv.scrollToPosition(0);
            }
        });

    }

    private void addEmail() {
        try {
            Date sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR")).parse(
                    Fakeit.dateTime().dateFormatter()
            );

            StringBuilder preview = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                preview.append(Fakeit.lorem().words());
                preview.append(" ");
            }

            emailAdapter.getEmails().add(0, Email.EmailBuilder.builder()
                    .setStared(false)
                    .setUnread(true)
                    .setUser(Fakeit.name().firstName())
                    .setSubject(Fakeit.company().name())
                    .setDate(new SimpleDateFormat("d MMM", new Locale("pt", "BR")).format(sdf))
                    .setPreview(preview.toString())
                    .build()
            );
        } catch (ParseException e) {
        }

        emailAdapter.notifyItemInserted(0);
    }
}