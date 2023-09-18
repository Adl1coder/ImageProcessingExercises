package com.adilegungorr.fairytaleapp.model

import android.os.Parcelable

// Parcelable arayüzü, nesnelerin serileştirilmesini ve Android bileşenleri arasında iletilmesi  için
import kotlinx.parcelize.Parcelize

@Parcelize // Parcelable arayüzünü otomatik olarak uygular
data class Fairytale
    (
    val name: String? = null,        // Peri masalının adı
    val fairytale: String? = null,   // Peri masalının metni
    val imageUrl: String? = null    // Peri masalının görsel URL'si
) : Parcelable
