package com.example.foodorderingapp.Domain

class FoodDomain {
     var pic: Int
    var title: String
    private var description: String
    var fee: Double
    private var numberInCart = 0

    constructor(pic: Int, title: String, description: String, fee: Double) {
        this.pic = pic
        this.title = title
        this.description = description
        this.fee = fee
    }

    constructor(pic: Int, title: String, description: String, fee: Double, numberInCart: Int) {
        this.pic = pic
        this.title = title
        this.description = description
        this.fee = fee
        this.numberInCart = numberInCart
    }
}


