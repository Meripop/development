package com.example.incomeexpenditureapp2.touch
//itt ertesitjuk az adaptert h egy elemet swipeoltunk vagy ilyesmi
interface MoneyTouchHelperCallback{
    fun onDismissed(position:Int) //pozicio
    fun onItemMoved(fromPosition:Int,toPosition: Int)//honnan hova helzeztuk at
}