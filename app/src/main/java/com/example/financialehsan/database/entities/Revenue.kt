package com.example.financialehsan.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity("revenues")
data class Revenue(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("revenue_id")
    val id:Int =0 ,
    val amount:Long,
    @ColumnInfo("category_id")
    val categoryId:Int,
    val description:String
)
