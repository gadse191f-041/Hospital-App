package com.example.familylove.dao;

import com.example.familylove.model.Mail;
import com.example.familylove.model.NewUser;
import com.example.familylove.model.User;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DaoMail {
    private DatabaseReference databaseReference;
    public DaoMail(){
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        databaseReference=database.getReference(NewUser.class.getSimpleName());
    }
    public Task<Void> add(Mail mail){
        return databaseReference.push().setValue(mail);
    }
}
