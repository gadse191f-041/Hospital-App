package com.example.familylove;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Hooks
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navView);
        toolbar=findViewById(R.id.toolbar);

        //Tool Bar
       setSupportActionBar(toolbar);

        //Navigation Drawer Menu
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open_drawer,R.string.navigation_close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.navHome);


        //Catergory Dispaly
        CardView cardPharmacy=(CardView) findViewById(R.id.cardPharmacy);
        CardView cardAboutUs=(CardView) findViewById(R.id.cardAboutUs);
        CardView cardClinic=(CardView) findViewById(R.id.cardClinic);
        CardView cardEchanelling=(CardView)findViewById(R.id.cardEchanelling);
        CardView cardChild=(CardView)findViewById(R.id.cardChild);
        CardView cardPregnency=(CardView)findViewById(R.id.cardPregnency);

        cardChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentChild=new Intent(DashboardActivity.this,CildActivity.class);
                startActivity(intentChild);
            }
        });

        cardPharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPharmacy=new Intent(DashboardActivity.this,PharmacyActivity.class);
                startActivity(intentPharmacy);
            }
        });
        cardAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAboutUs=new Intent(DashboardActivity.this,AboutUsActivity.class);
                startActivity(intentAboutUs);
            }
        });
        cardClinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentClinic=new Intent(DashboardActivity.this,ClinicActivity.class);
                startActivity(intentClinic);
            }
        });
        cardEchanelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEchanelling=new Intent(DashboardActivity.this,DoctorAppointmentActivity.class);
                startActivity(intentEchanelling);
            }
        });
        cardPregnency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPregnency=new Intent(DashboardActivity.this,PregnencyActivity.class);
                startActivity(intentPregnency);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navHome:
                break;

            case R.id.navContactUs:
                Intent intentContactUs=new Intent(DashboardActivity.this,ContactUsActivity.class);
                startActivity(intentContactUs);
                break;

            case R.id.navOther:
                Intent intentMailUs=new Intent(DashboardActivity.this,MailUsActivity.class);
                startActivity(intentMailUs);
                break;

            case R.id.navLogin:
                Intent intentLogin=new Intent(DashboardActivity.this,LoginActivity.class);
                startActivity(intentLogin);
                break;

            case R.id.navLogout:
                Intent intentLogg=new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(intentLogg);
                break;

            case R.id.navProfile:
                Intent intentProfile=new Intent(DashboardActivity.this,ProfileActivity.class);
                startActivity(intentProfile);
                break;

            case R.id.navFacebook:
                Toast.makeText(this,"FaceBook Page Opend",Toast.LENGTH_SHORT).show();
                break;

            case R.id.navYoutube:
                Toast.makeText(this,"Youtube Opened",Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}