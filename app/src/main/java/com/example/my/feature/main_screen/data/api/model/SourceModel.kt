package com.example.my.feature.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class SourceModel(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)