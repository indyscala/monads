package scala.org.indyscala.dec2013.idiomatic

object Monarhs {
  //house of windsor tree for prince george
  //http://www.britroyals.com/windsor.htm
  
  val george5 = Person("George V")                //> george5  : scala.org.indyscala.dec2013.Person = George V
  val maryOfTeck = Person("Mary of Teck")         //> maryOfTeck  : scala.org.indyscala.dec2013.Person = Mary of Teck
  val george6 = Person("George VI",
  								Some(george5),
  								Some(maryOfTeck)
  							)
                                                  //> george6  : scala.org.indyscala.dec2013.Person = George VI
  val elizabethBowesLyon = Person("Elizabeth Bowes-Lyon")
                                                  //> elizabethBowesLyon  : scala.org.indyscala.dec2013.Person = Elizabeth Bowes-L
                                                  //| yon
  val elizabeth2 = Person("Elizabeth II",
  									Some(george6),
  									Some(elizabethBowesLyon))
                                                  //> elizabeth2  : scala.org.indyscala.dec2013.Person = Elizabeth II
  val philip = Person("Philip Duke of Edinburgh") //> philip  : scala.org.indyscala.dec2013.Person = Philip Duke of Edinburgh
  val charles = Person("Prince Charles",
  								Some(philip),
  								Some(elizabeth2))
                                                  //> charles  : scala.org.indyscala.dec2013.Person = Prince Charles
  val diana = Person("Princess Diana")            //> diana  : scala.org.indyscala.dec2013.Person = Princess Diana
  
  val william = Person("Prince William",
  								Some(charles),
  								Some(diana))
                                                  //> william  : scala.org.indyscala.dec2013.Person = Prince William
  	
  val catherine = Person("Catherine Dutchess of Cambridge")
                                                  //> catherine  : scala.org.indyscala.dec2013.Person = Catherine Dutchess of Camb
                                                  //| ridge
 
  val george =
  	Person("Prince George",
  		Some(william),
  		Some(catherine))                 //> george  : scala.org.indyscala.dec2013.Person = Prince George
 
}