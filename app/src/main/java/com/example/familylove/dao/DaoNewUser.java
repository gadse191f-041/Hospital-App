package com.example.familylove.dao;

import com.example.familylove.model.NewUser;
import com.example.familylove.model.User;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DaoNewUser {
    private DatabaseReference databaseReference;

    public DaoNewUser(){
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        databaseReference=database.getReference(NewUser.class.getSimpleName());
    }
    public Task<Void> add(NewUser newUser){
       return databaseReference.push().setValue(newUser);
    }

    public Task<Void> update(String key, HashMap<String,Object> hashMap){
       return databaseReference.child(key).updateChildren(hashMap);
    }
}
