package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.qenawi.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by QEnawi on 8/2/2017.
 */

class Async extends AsyncTask<Void, Void, String> {
    private MyApi myApiService = null;
    private Context context;

    Async(Context context) {
        this.context = context;
    }


    @Override
    protected String doInBackground(Void... voids) {
        if (myApiService == null) {  // Only do this once

            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://logo-175518.appspot.com/_ah/api/");

            myApiService = builder.build();
        }//end if

        try {
            return myApiService.knockMeOut().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }

    }//end doInBackground

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context, MainActivityAndroidLip.class);
        intent.putExtra(context.getString(R.string.joke), result);
        context.startActivity(intent);
    }//end onPostExecute


}
