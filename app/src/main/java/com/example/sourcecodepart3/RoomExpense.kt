package com.example.sourcecodepart3

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.time.temporal.TemporalAmount

@Entity(tableName = "expense")
class RoomExpense {

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
    @ColumnInfo(name = "title")
    var title:String = ""
    @ColumnInfo(name = "amount")
    var amount:String = ""

    constructor(id:Int , title:String, amount: String){

        this.id = id
        this.title = title
        this.amount = amount

    }

    @Ignore

    constructor(title:String, amount: String){
        this.title = title
        this.amount = amount
    }

}