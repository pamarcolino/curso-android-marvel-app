package com.example.testing.model

import com.example.core.domain.model.Character

class CharacterFactory {

    fun create(hero: Hero) = when(hero) {
        Hero.ThreeDMan -> Character(
            id = 1011334,
            name = "3d-Man",
            imageUrl = "url"
        )
        Hero.ABomb -> Character(
            id = 1011335,
            name = "A-Bomb",
            imageUrl = "url"
        )
    }

    sealed class Hero {
        object ThreeDMan : Hero()
        object ABomb : Hero()
    }

}