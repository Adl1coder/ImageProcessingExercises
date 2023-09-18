package com.adilegungorr.fairytaleapp.domain.repos

import com.adilegungorr.fairytaleapp.model.Fairytale

interface FairytaleRepository {

    suspend fun getFairytaleList(): List<Fairytale>
}