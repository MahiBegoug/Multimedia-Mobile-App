package com.example.dictionnaire

import android.media.Image
import java.io.Serializable

data class Word(
    val wordText: String?,
    val type: String?,
    val meaning: String?,
    val sound: String?,
    val image: String?
):Serializable {}