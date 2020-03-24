interface A implements D {
	B nodeEdgeA();
}

interface B {
	C nodeEdgeB();
}

interface C {
	A alternativeC();
}
