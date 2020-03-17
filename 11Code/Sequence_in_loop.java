interface A implements C {
}

interface B {
	C nodeEdge();
}

interface C {
	D alternativeC();
}

interface D {
	B nodeEdgeA();
}
