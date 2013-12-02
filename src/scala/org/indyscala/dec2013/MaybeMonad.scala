package scala.org.indyscala.dec2013

object MaybeMonad extends Monad[Maybe] {
  override def unit[A](value: A): Maybe[A] = Maybe(value)

  def bind[A, B](v: A, f: A => Maybe[B]): Maybe[B] =
    bind(unit(v), f)

  override def bind[A, B](v: Maybe[A], f: A => Maybe[B]): Maybe[B] =
    v match {
      case Empty => Empty
      case Just(x) => f(x)
    }
}