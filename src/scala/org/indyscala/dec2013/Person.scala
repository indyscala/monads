package scala.org.indyscala.dec2013

case class Person(name: String,
  father: Maybe[Person] = Maybe(null), 
  mother: Maybe[Person] = Maybe(null)) {
  override def toString() = name
}
