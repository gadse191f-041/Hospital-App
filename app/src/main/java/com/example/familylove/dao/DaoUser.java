package com.example.familylove.dao;

import com.example.familylove.model.NewUser;
import com.example.familylove.model.User;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DaoUser {
    private DatabaseReference databaseReference;

    public DaoUser(){
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        databaseReference=database.getReference(NewUser.class.getSimpleName());
    }
    public Task<Void> add(User user){
        return databaseReference.push().setValue(user);
    }
    public Task<Void> update(String key, HashMap<String,Object> hashMap){
        return databaseReference.child(key).updateChildren(hashMap);
    }
    public Task<Void> read(String key, HashMap<String,Object> hashMapO){
        return databaseReference.child(key).updateChildren(hashMapO);
    }
}
