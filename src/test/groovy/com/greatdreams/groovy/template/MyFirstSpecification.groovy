package com.greatdreams.groovy.template

import spock.lang.*

/**
 * Created by greatdreams on 4/25/17.
 */
class MyFirstSpecification extends Specification{
    def "HashMap accepts null key"() {
        setup:
        def map = new HashMap()

        when:
        map.put(null, 'elem')

        then:
        notThrown(NullPointerException)

    }
}
