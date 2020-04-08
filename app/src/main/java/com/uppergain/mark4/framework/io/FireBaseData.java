package com.uppergain.mark4.framework.io;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;

/**
 * 共通機能<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-22
 */
public class FireBaseData implements DataFileIO {

    private static final String TAG = "FireBaseData";
    private final FirebaseDatabase database;
    DatabaseReference myRef;

    public FireBaseData() {
        // Write a message to the database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("UUID").child(String.valueOf(new Date()));;
    }

    @Override
    public Object reder(String target) {
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return null;
    }

    @Override
    public void writer(String target, Object data) {
        myRef.child(target).setValue(data);
        //myRef.setValue(data);
    }

    @Override
    public Object update(String key, Object newData) {
        return null;
    }

    @Override
    public void delete(String targetData) {

    }

    @Override
    public int counter() {
        return 0;
    }

    /**
     * FireBaseのキーを取得する
     * @return
     */
    public String getKey(){
        String key = myRef.getKey();
        return key;
    }
}
