package scala.org.indyscala.dec2013

object Maybe {
  def apply[A](x: A): Maybe[A] =
    if (x == null)
      Empty
    else
      Just(x) //> apply: [A](x: A)Maybe[A]
}

sealed abstract class Maybe[+A] {
  self =>
  def isEmpty: Boolean
  def get: A
  def unit[A](value: A): Maybe[A] = Maybe(value)
  def bind[B](f: A => Maybe[B]): Maybe[B] =
    if (this.isEmpty)
      Empty
    else
      f( this.get )
  def flatMap[B](f: A => Maybe[B]): Maybe[B] = bind(f)
  def map[B](f: A => B): Maybe[B] = 
    if (this.isEmpty)
      Empty
    else
      Just(f(this.get))
}

case class Just[A](x: A) extends Maybe[A] {
  def isEmpty = false
  def get = x
		  
  override def toString = x.toString
}
case object Empty extends Maybe[Nothing] {
  def isEmpty = true
  def get = ???

  override def toString = "__"
}