package com.uppergain.mark4.mvvm;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.uppergain.mark4.mvvm.level.History;

import java.util.List;

@Dao
public interface HistoryDao {

    @Insert
    void insert(History history);
    //TODO:@Query("SELECT * FROM history_table ORDER BY EXIT_DATE DESC")

    @Query("SELECT * FROM history_table ORDER BY EXIT_DATE DESC")
    LiveData<List<History>> getHistory();

    @Query("DELETE FROM history_table")
    void deleteAll();

}
