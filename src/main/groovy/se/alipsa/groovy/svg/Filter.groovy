package se.alipsa.groovy.svg

class Filter extends AbstractElementContainer<Filter> {

  static final String NAME = 'filter'

  Filter(SvgElement<? extends SvgElement> parent) {
    super(parent, NAME)
  }

  Filter x(Number x) {
    addAttribute('x', x)
  }

  Filter x(String x) {
    addAttribute('x', x)
  }

  String getX() {
    getAttribute('x')
  }

  Filter y(Number y) {
    addAttribute('y', y)
  }

  Filter y(String y) {
    addAttribute('y', y)
  }

  String getY() {
    getAttribute('y')
  }

  Filter filterUnits(String units) {
    addAttribute('filterUnits', units)
  }

  String getFilterUnits() {
    getAttribute('filterUnits')
  }

  Filter width(Number width) {
    addAttribute('width', width)
  }

  Filter width(String width) {
    addAttribute('width', width)
  }

  String getWidth() {
    getAttribute('width')
  }

  Filter height(Number height) {
    addAttribute('height', height)
  }

  Filter height(String height) {
    addAttribute('height', height)
  }

  String getHeight() {
    getAttribute('height')
  }

  FeGaussianBlur addFeGaussianBlur() {
    add(new FeGaussianBlur(this))
  }

  FeBlend addFeBlend() {
    add(new FeBlend(this))
  }

  FeFlood addFeFlood() {
    add(new FeFlood(this))
  }

  FeColorMatrix addFeColorMatrix() {
    add(new FeColorMatrix(this))
  }

  FeComponentTransfer addFeComponentTransfer() {
    add(new FeComponentTransfer(this))
  }
}
