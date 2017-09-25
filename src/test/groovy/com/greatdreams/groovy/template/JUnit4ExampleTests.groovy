package com.greatdreams.groovy.template

import org.junit.Test

import static groovy.test.GroovyAssert.shouldFail
/**
 * Created by greatdreams on 4/25/17.
 */
class JUnit4ExampleTests {
    @Test
    void indexOutOfBoundsAccess() {
        def numbers = [1, 2, 3, 4]
        shouldFail {
            numbers.get(4)
        }
    }

}
