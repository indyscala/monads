package scala.org.indyscala.dec2013

object monads {

  
  Monarhs.george
  	.father match {
  		case Just(x1) => x1.father
  			match {
  				case Just(x2) => x2.mother
  				case Empty => Empty
  			}
  		case Empty => Empty
  	}                                         //> res0: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person] 
                                                  //| = Elizabeth II
  
  def dad = (x: Person) => x.father               //> dad: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.Ma
                                                  //| ybe[scala.org.indyscala.dec2013.Person]
  def mom = (x: Person) => x.mother               //> mom: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.Ma
                                                  //| ybe[scala.org.indyscala.dec2013.Person]
  
	Monarhs.george
		.father
		.bind(dad)
		.bind(mom)
		.bind(x => x.mother)              //> res1: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person] 
                                                  //| = Elizabeth Bowes-Lyon
		
	for {
		dad <- Monarhs.george.father
		granpa <- dad.father
		greatgranma <- granpa.mother
		greatgreatgranma <- greatgranma.mother
	} yield greatgreatgranma                  //> res2: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person] 
                                                  //| = Elizabeth Bowes-Lyon
	 
}