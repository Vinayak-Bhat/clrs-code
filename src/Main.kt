package com.vinayak.clrs

import kotlin.Int.Companion.MIN_VALUE

fun main(){
    val x = MaxSubArray()
    println( x.getMaxCenter(intArrayOf(-1,2,3,-4,99,-111)))
}

class MaxSubArray(){

    fun getMaxCenter(array:IntArray): Triple<Int, Int, Int>{
        val mid = array.size/2-1
        var maxSum = MIN_VALUE
        var sum = 0
        var leftIndex = 0
        var rightIndex = array.size-1
        for(index in mid downTo 0){
            print(index)
            sum += array[index]
            if(sum>maxSum){
                maxSum = sum;
                leftIndex = index;
            }
        }
        sum = 0
        var rightMax = MIN_VALUE
        for(index in mid+1 until array.size){
            print(index)
            sum += array[index]
            if(sum>rightMax){
                rightMax = sum;
                rightIndex = index;
            }
        }
        return Triple(leftIndex,rightIndex,maxSum+rightMax)
    }

}