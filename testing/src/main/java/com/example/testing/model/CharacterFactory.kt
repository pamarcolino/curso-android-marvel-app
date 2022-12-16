package com.example.testing.model

import com.example.core.domain.model.Character

class CharacterFactory {

    fun create(hero: Hero) = when(hero) {
        Hero.ThreeDMan -> Character(
                "3d-Man",
                "url.jpg"
        )
        Hero.ABomb -> Character(
        "A-Bomb",
        "url.jpg"
        )
    }

    sealed class Hero {
        object ThreeDMan : Hero()
        object ABomb : Hero()
    }

}