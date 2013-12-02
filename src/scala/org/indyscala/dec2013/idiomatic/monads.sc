package scala.org.indyscala.dec2013.idiomatic

object monads {
	
	for {
		dad <- Monarhs.george.father
		granpa <- dad.father
		greatgranma <- granpa.mother
		greatgreatgranma <- greatgranma.mother
	} yield greatgreatgranma                  //> res0: Option[scala.org.indyscala.dec2013.idiomatic.Person] = Some(Elizabeth 
                                                  //| Bowes-Lyon)
	
}