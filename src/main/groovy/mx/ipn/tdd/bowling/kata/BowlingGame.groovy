package mx.ipn.tdd.bowling.kata

/**
 * Created by alberto on 24/10/15.
 */
class BowlingGame {
    Integer score = 0;

    def roll(Integer numberOfPins) {
        score += numberOfPins;
    }
}
