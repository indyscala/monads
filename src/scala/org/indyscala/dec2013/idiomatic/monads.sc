package scala.org.indyscala.dec2013.idiomatic

object monads {

  def dad = (x: Person) => x.father               //> dad: => scala.org.indyscala.dec2013.idiomatic.Person => Option[scala.org.indy
                                                  //| scala.dec2013.idiomatic.Person]
  def mom = (x: Person) => x.mother               //> mom: => scala.org.indyscala.dec2013.idiomatic.Person => Option[scala.org.ind
                                                  //| yscala.dec2013.idiomatic.Person]
	
	for {
		dad <- Monarhs.george.father
		granpa <- dad.father
		greatgranma <- granpa.mother
		greatgreatgranma <- greatgranma.mother
	} yield greatgreatgranma                  //> res0: Option[scala.org.indyscala.dec2013.idiomatic.Person] = Some(Elizabeth 
                                                  //| Bowes-Lyon)
	
}