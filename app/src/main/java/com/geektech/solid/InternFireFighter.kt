package com.geektech.solid

// L-Liskov Substitution Principle intern fire-fighter must do all works as real fire-fighters to become them
//I-Interface Segregation Principle, there are two interfaces which can do student

class InternFireFighter: Firefighter(),Improve,Study {

    override fun driveFireEngine() {
        TODO("Not yet implemented")
    }

    override fun putOutTheFire() {
        TODO("Not yet implemented")
    }

    override fun savePeople() {
        TODO("Not yet implemented")
    }

    override fun study() {
        TODO("Not yet implemented")
    }

    override fun improve() {
        super.improve()
    }
}