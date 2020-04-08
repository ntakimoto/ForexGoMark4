package com.uppergain.mark4.framework.io;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * 共通機能<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.2
 * @since 2020-02-22
 */
public class FireBaseData implements DataFileIO {

    private static final String TAG = "FireBaseData";
    private final FirebaseDatabase database;
    DatabaseReference myRef;

    public FireBaseData(String path) {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference(path);
    }

    @Override
    public Object reder(String target) {
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
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
