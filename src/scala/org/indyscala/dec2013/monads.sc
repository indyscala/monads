package scala.org.indyscala.dec2013

object monads {
  //house of windsor tree for prince george
  //http://www.britroyals.com/windsor.htm
  
  val george5 = Person("George V")                //> george5  : scala.org.indyscala.dec2013.Person = George V
  val maryOfTeck = Person("Mary of Teck")         //> maryOfTeck  : scala.org.indyscala.dec2013.Person = Mary of Teck
  val george6 = Person("George VI",
  								Maybe(george5),
  								Maybe(maryOfTeck)
  							)
                                                  //> george6  : scala.org.indyscala.dec2013.Person = George VI
  val elizabethBowesLyon = Person("Elizabeth Bowes-Lyon")
                                                  //> elizabethBowesLyon  : scala.org.indyscala.dec2013.Person = Elizabeth Bowes-L
                                                  //| yon
  val elizabeth2 = Person("Elizabeth II",
  									Maybe(george6),
  									Maybe(elizabethBowesLyon))
                                                  //> elizabeth2  : scala.org.indyscala.dec2013.Person = Elizabeth II
  val philip = Person("Philip Duke of Edinburgh") //> philip  : scala.org.indyscala.dec2013.Person = Philip Duke of Edinburgh
  val charles = Person("Prince Charles",
  								Maybe(philip),
  								Maybe(elizabeth2))
                                                  //> charles  : scala.org.indyscala.dec2013.Person = Prince Charles
  val diana = Person("Princess Diana")            //> diana  : scala.org.indyscala.dec2013.Person = Princess Diana
  
  val william = Person("Prince William",
  								Maybe(charles),
  								Maybe(diana))
                                                  //> william  : scala.org.indyscala.dec2013.Person = Prince William
  	
  val catherine = Person("Catherine Dutchess of Cambridge")
                                                  //> catherine  : scala.org.indyscala.dec2013.Person = Catherine Dutchess of Camb
                                                  //| ridge
 
  val george =
  	Person("Prince George",
  		Maybe(william),
  		Maybe(catherine))                 //> george  : scala.org.indyscala.dec2013.Person = Prince George
 
  def dad = (x: Person) => x.father               //> dad: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.Ma
                                                  //| ybe[scala.org.indyscala.dec2013.Person]
  def mom = (x: Person) => x.mother               //> mom: => scala.org.indyscala.dec2013.Person => scala.org.indyscala.dec2013.Ma
                                                  //| ybe[scala.org.indyscala.dec2013.Person]
	Maybe(george) bind(dad) bind(mom) bind(mom)
                                                  //> res0: scala.org.indyscala.dec2013.Maybe[scala.org.indyscala.dec2013.Person]
                                                  //|  = __
  
}