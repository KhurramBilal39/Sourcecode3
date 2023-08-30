package com.example.sourcecodepart3

import androidx.room.*

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM expense")

    fun gellAllEntity() : List<RoomExpense>

    @Insert
    fun addTxt( expense: RoomExpense)

    @Update
    fun updateTxt( expense: RoomExpense)

    @Delete
    fun deleteTxt( expense: RoomExpense)

}