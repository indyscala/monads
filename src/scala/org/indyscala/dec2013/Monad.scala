package scala.org.indyscala.dec2013

trait Monad[M[_]] {
  def unit[A](value: A): M[A]
  def bind[A, B](v: M[A], f: A => M[B]): M[B]
}