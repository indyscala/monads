package scala.org.indyscala.dec2013

object monads {

  def dad = (x: Person) => x.father               //> dad: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.May
                                                  //| be[scala.org.indyscala.dec2013.Person]
  def mom = (x: Person) => x.mother               //> mom: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.Ma
                                                  //| ybe[scala.org.indyscala.dec2013.Person]
	Monarhs.george
		.father
		.bind(dad)
		.bind(mom)
		.bind(x => x.mother)              //> res0: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person] 
                                                  //| = Elizabeth Bowes-Lyon
		
  Monarhs.george
  	.father match {
  		case Just(x1) => x1.father
  			match {
  				case Just(x2) => x2.mother
  				case Empty => Empty
  			}
  		case Empty => Empty
  	}                                         //> res1: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person] 
                                                  //| = Elizabeth II
}