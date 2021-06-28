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
        assertEquals(1,triple.first)
        assertEquals(4,triple.second)
        assertEquals(100,triple.third)
    }

    @Test
    fun test2(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(1,1,1,1,1))
        assertEquals(0,triple.first)
        assertEquals(4,triple.second)
        assertEquals(5,triple.third)
    }

    @Test
    fun test3(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(0))
        println(triple)
        assertEquals(0,triple.first)
        assertEquals(0,triple.second)
        assertEquals(0,triple.third)
    }

    @Test
    fun test4(){
        val x = MaxSubArray()
        val triple =  x.getMaxCenter(intArrayOf(-1,-1,-1,-1,-1))
        //expected values are such that the center sub array should be across the left and right sub-arrays.
        //here left sub array is (-1,-1,-1) and right one is (-1,-,1)
        assertEquals(2,triple.first)
        assertEquals(3,triple.second)
        assertEquals(-2,triple.third)
    }
    @Test
    fun maxSubArrayTest1(){
        val testClass = MaxSubArray()
        val triple = testClass.getMaxSubArray(intArrayOf(-1,-1,-1,-1,-1))
        assertEquals(0,triple.first)
        assertEquals(0,triple.second)
        assertEquals(-1,triple.third)

    }

    @Test
    fun maxSubArrayTest2(){
        val x = MaxSubArray()
        val triple =  x.getMaxSubArray(intArrayOf(1,1,1,1,1))
        assertEquals(0,triple.first)
        assertEquals(4,triple.second)
        assertEquals(5,triple.third)
    }

    @Test
    fun maxSubArrayTest3(){
        val x = MaxSubArray()
        val triple =  x.getMaxSubArray(intArrayOf(1,1,-1,-1))
        assertEquals(0,triple.first)
        assertEquals(1,triple.second)
        assertEquals(2,triple.third)
    }
    @Test
    fun maxSubArrayTest4(){
        val x = MaxSubArray()
        val triple =  x.getMaxSubArray(intArrayOf(-1,-1,1,1))
        assertEquals(0,triple.first)
        assertEquals(1,triple.second)
        assertEquals(2,triple.third)
    }

    @Test
    fun maxSubArrayTest5(){
        val x = MaxSubArray()
        val triple =  x.getMaxSubArray(intArrayOf(1,1,1,1,-1))
        assertEquals(0,triple.first)
        assertEquals(3,triple.second)
        assertEquals(4,triple.third)
    }


    @Test
    fun maxSubArrayTest6(){
        val x = MaxSubArray()
        val triple =  x.getMaxSubArray(intArrayOf(1,1,1,-1,-1))
        assertEquals(0,triple.first)
        assertEquals(2,triple.second)
        assertEquals(3,triple.third)
    }

}