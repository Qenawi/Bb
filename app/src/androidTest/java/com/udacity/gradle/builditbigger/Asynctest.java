package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * Created by QEnawi on 8/2/2017.
 */
public class Asynctest extends ApplicationTestCase<Application> {


    public Asynctest() {
        super(Application.class);
    }

    public void test() {
        String result = null;

        Async endpointsAsyncTask = new Async(getContext());

        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}//end AsyncTaskTest
