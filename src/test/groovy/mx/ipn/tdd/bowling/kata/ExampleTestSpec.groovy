package mx.ipn.tdd.bowling.kata

import spock.lang.Specification

/**
 * Created by alberto on 24/10/15.
 */
class ExampleTestSpec extends Specification {
    def "Example test method should pass"() {
        given:
        ExampleTest example = new ExampleTest()
        expect:
        example.shouldPass()
    }

    def "Example test method should fail"() {
        given:
        ExampleTest example = new ExampleTest()
        expect:
        example.shouldFail() == false
    }
}
