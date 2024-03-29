package test.alipsa.groovy.svg

import se.alipsa.groovy.svg.Circle

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import se.alipsa.groovy.svg.Svg

class CircleTest {

    @Test
    void simpleCircleTest() {
        Svg svg = new Svg(100,100)
        Circle circle = svg.addCircle()
        .cx(50)
        .cy(50)
        .r(40)
        .stroke('green')
        .strokeWidth(4)
        .fill('yellow')

        assertEquals('<svg xmlns="http://www.w3.org/2000/svg" width="100" height="100">' +
            '<circle cx="50" cy="50" r="40" stroke="green" stroke-width="4" fill="yellow"/>' +
            '</svg>',
            svg.toXml()
        )
    }
}
