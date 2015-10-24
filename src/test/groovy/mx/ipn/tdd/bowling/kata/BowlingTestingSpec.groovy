package mx.ipn.tdd.bowling.kata

import spock.lang.Specification

/**
 * Created by alberto on 24/10/15.
 */
class BowlingTestingSpec extends Specification {
    def "Should get score from twenty rolls and get a gutter game"() {
        given:
        BowlingGame game = new BowlingGame()
        for (attempt in 0..20) {
            game.roll(0)
        }
        expect:
        game.score == 0
    }

    def "Should get score from twenty rolls throw one pin each attempt"() {
        given:
        BowlingGame game = new BowlingGame()
        for (attempt in 0..19) {
            game.roll(1)
        }
        expect:
        game.score == 20
    }

}
