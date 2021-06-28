package com.vinayak.clrs

import kotlin.Int.Companion.MIN_VALUE

class MaxSubArray{

    fun getMaxCenter(array:IntArray): Triple<Int, Int, Int>{
        val mid = array.size/2
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
        if(sum>maxSum){
            maxSum = sum;
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
        if(sum>rightMax){
            rightMax = sum;
        }
        return Triple(leftIndex,rightIndex,maxSum+rightMax)
    }

    fun getMaxSubArray(input: IntArray) : Triple<Int, Int, Int> {
        if(input.size <= 1){
            return Triple(0,0,input.get(0))
        } else {
            val leftTriple = getMaxSubArray(input.copyOfRange(0,(input.size/2)))
            val rightTriple = getMaxSubArray(input.copyOfRange(input.size/2,input.size))
            val centerTriple = getMaxCenter(input)
            return if(leftTriple.third >= centerTriple.third && leftTriple.third >= rightTriple.third){
                leftTriple
            }else if(rightTriple.third >= leftTriple.third && rightTriple.third >= centerTriple.third){
                rightTriple
            }else {
                centerTriple
            }

        }


    }

}