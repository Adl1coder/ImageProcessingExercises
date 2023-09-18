package com.adilegungorr.fairytaleapp.domain.usecase

import com.adilegungorr.fairytaleapp.domain.repos.FairytaleRepository
import com.adilegungorr.fairytaleapp.model.Fairytale
import javax.inject.Inject

class FairytaleUsecase @Inject constructor(
    private val fairytaleRepository: FairytaleRepository
) : SuspendUsecase<Unit, List<Fairytale>>() {
    override suspend fun execute(params: Unit): List<Fairytale> {
        return fairytaleRepository.getFairytaleList()
    }
}
