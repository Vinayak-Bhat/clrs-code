package com.vinayak.clrs.test

import com.vinayak.clrs.MaxSubArray
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MaxSubArrayTest {

    @Test
    fun test1(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(-1,2,3,-4,99,-111))
        assertEquals(triple.first,1)
        assertEquals(triple.second,4)
        assertEquals(triple.third,100)
    }

    @Test
    fun test2(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(1,1,1,1,1))
        assertEquals(triple.first,0)
        assertEquals(triple.second,4)
        assertEquals(triple.third,5)
    }
    @Test
    fun test3(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(0))
        println(triple)
        assertEquals(triple.first,0)
        assertEquals(triple.second,0)
        assertEquals(triple.third,0)
    }

}