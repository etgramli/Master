interface A extends D {
	B nodeEdgeA();
}

interface B {
	C nodeEdgeB();
}

interface C {
	A alternativeC();
}
