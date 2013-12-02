package scala.org.indyscala.dec2013.idiomatic

case class Person(name: String,
  father: Option[Person] = None, 
  mother: Option[Person] = None) {
  override def toString() = name
}
