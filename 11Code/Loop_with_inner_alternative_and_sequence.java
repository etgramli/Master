interface A implements C {
}

interface C implements D
}

interface B {
	C nodeEdge();
}

interface C {
	B alternativeA();
	B alternativeB();
}
