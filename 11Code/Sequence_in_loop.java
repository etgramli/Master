interface A implements D {
}

interface D implements E {
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
