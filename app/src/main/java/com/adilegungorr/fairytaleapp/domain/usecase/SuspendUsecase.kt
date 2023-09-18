package com.adilegungorr.fairytaleapp.domain.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext



 //P: Parametre türü.
// R: Dönüş değeri türü.

abstract class SuspendUsecase<in P, R>(
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) {


    suspend operator fun invoke(params: P): R {
        return withContext(coroutineDispatcher) {
            execute(params)
        }
    }


    @Throws(RuntimeException::class)
    protected abstract suspend fun execute(params: P): R
}
