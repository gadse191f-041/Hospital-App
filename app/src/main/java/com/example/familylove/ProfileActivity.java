package com.example.familylove;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.familylove.dao.DaoNewUser;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.CDATASection;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ProfileActivity extends AppCompatActivity {
   private static final int Image_Capture_Code = 1;
    ImageView   imgCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btnUpdate = (Button) findViewById(R.id.btnUpdate);
        imgCapture =(ImageView)findViewById(R.id.imgProfilePhoto);

        //update profile details
        TextInputEditText txtUpdateNic=(TextInputEditText)findViewById(R.id.txtUpdateNic);
        TextInputEditText txtUpdateAddress=(TextInputEditText)findViewById(R.id.txtUpdateAddress);
        TextInputEditText txtUpdateTelephone=(TextInputEditText)findViewById(R.id.txtUpdateTepelhone);
        DaoNewUser daoNewUser=new DaoNewUser();

        //Update the Profile
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,Object> hashMap=new HashMap<>();
                hashMap.put("nic",txtUpdateNic.getText().toString());
                hashMap.put("address",txtUpdateAddress.getText().toString());
                hashMap.put("telephone",txtUpdateTelephone.getText().toString());
                daoNewUser.update("-Mvflq9XsxCBKHM4QIuc",hashMap).addOnSuccessListener(suc->
                {
                    Toast.makeText(getApplicationContext(),"Profile Updated",Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er->{
                    Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                });

                Intent intentDashboard = new Intent(ProfileActivity.this, DashboardActivity.class);
                startActivity(intentDashboard);
            }
        });

        //Image Btn Fuction
        ImageButton btnsetWallpaper = (ImageButton) findViewById(R.id.imgbtnChangeImage);

        btnsetWallpaper.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Intent cInt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cInt, Image_Capture_Code);
            }
        });
    }


    // ----------------------------------------------------------------
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Image_Capture_Code && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            imgCapture.setImageBitmap(imageBitmap);
            imgCapture.setSaveEnabled(true);
        }
    }
    String currentPhotoPath;

    private File createImageFile() throws IOException {
        // Create an image file name
        String imageFileName = "pp" ;
        File storageDir = getExternalFilesDir("C:\\#Hasheera Malshi\\Mobile Tutorial\\MyApp\\FamilyLove\\app\\src\\main\\res\\drawable");
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        currentPhotoPath = image.getAbsolutePath();
        return image;
    }
}