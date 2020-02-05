interface SchleifenKnoten {
	MehrSchleifenKnoten sequenzKnoten();
}

interface MehrSchleifenKnoten extends NextScope {
	NextScope sequenzKnoten();
}
