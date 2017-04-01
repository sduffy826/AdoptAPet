package com.example.duffy_w530.project3_adoptpet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // For fun set toolbar to have icon and text (typically you wouldn't override toolbar this way)
    Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
    toolbar.setLogo(R.drawable.paw);
    toolbar.setTitle(R.string.toolbar_title);
    toolbar.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
  }

  // This dials the phone number; user has to click button to make call
  public void dialPhone(View view) {
    Intent phoneDialIntent = new Intent();
    phoneDialIntent.setAction(Intent.ACTION_DIAL);
    phoneDialIntent.setData(Uri.parse("tel:800AdoptMe"));
    startActivity(phoneDialIntent);
  }

  // Display website
  public void goToWebSite(View view) {
    // Shortest version of launching intent :)
    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://rbari.org")));
  }

  // Show the map, this version shows the street view
  public void showMap(View view) {
    Uri googleMapUri = Uri.parse("google.streetview:cbll=41.026646,-74.235466");
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, googleMapUri);
    // Make sure we use google maps
    mapIntent.setPackage("com.google.android.apps.maps");
    startActivity(mapIntent);
  }
}
