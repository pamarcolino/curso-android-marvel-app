package com.example.core.data.repository

import kotlinx.coroutines.flow.Flow
import com.example.core.domain.model.Character

interface FavoritesRepository {

    fun getAll() : Flow<List<Character>>

    suspend fun isFavorite(characterId: Int): Boolean

    suspend fun saveFavorite(character: Character)

    suspend fun deleteFavorite(character: Character)
}