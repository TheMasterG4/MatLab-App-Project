package cards

import groovy.transform.CompileStatic
import jdk.nashorn.internal.ir.annotations.Immutable

@CompileStatic
enum CardType {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
    ;

    @CompileStatic
    int[] value(){
        int[] x= new int[]{0}
        switch (this){
            case ACE-> x= new int[]{1,11}
            case TWO-> x= new int[]{2}
            case THREE-> x= new int[]{3}
            case FOUR-> x= new int[]{4}
            case FIVE-> x= new int[]{5}
            case SIX-> x= new int[]{6}
            case SEVEN-> x= new int[]{7}
            case EIGHT-> x= new int[]{8}
            case NINE-> x= new int[]{9}
            case TEN,JACK,QUEEN,KING-> x= new int[]{10}
        }
        return x
    }

    @CompileStatic
    int hierarchy(){
        int x=0
        switch (this){
            case ACE-> x=13
            case TWO-> x=1
            case THREE-> x=2
            case FOUR-> x=3
            case FIVE-> x=4
            case SIX-> x=5
            case SEVEN-> x=6
            case EIGHT-> x=8
            case NINE-> x=8
            case TEN-> x=9
            case JACK-> x=10
            case QUEEN-> x=11
            case KING-> x=12
        }
        return x
    }
}