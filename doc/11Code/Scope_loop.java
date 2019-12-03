interface LoopKnoten {
	MoreLoopKnoten loop();
}

interface MoreLoopKnoten extends nextScope {
	nextScope loop();
}
