package com.openclassrooms.realestatemanager.data.api.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */

data class Geometry(
        @SerializedName("location")
        val location: Location
)