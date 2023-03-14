package com.bams.pk.data.response

import com.bams.pk.data.model.ModelResults
import com.google.gson.annotations.SerializedName


class ModelResultNearby {

    @SerializedName("results")
    val modelResults: List<ModelResults> = emptyList()
}