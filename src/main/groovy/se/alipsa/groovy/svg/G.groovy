package se.alipsa.groovy.svg

/** A container for grouping other SVG elements */
class G extends AbstractElementContainer<G> {

    static final String NAME='g'
    /*
    Number fontSize
    String fontFamily
    String fill
    String textAnchor

    List<SvgElement> items = []
    */

    String getName() {
        return NAME
    }

    G(SvgElement parent) {
        super(parent, NAME)
    }

    G fill(String fill) {
        addAttribute('fill', String.valueOf(fill))
    }

    G stroke(String stroke) {
        addAttribute('stroke', "$stroke")
    }

    G strokeWidth(Number strokeWidth) {
        addAttribute('stroke-width', "$strokeWidth")
    }

    G transform(String transformation) {
        addAttribute('transform', transformation)
    }

}
