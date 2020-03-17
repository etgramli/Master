interface A implements C {
}

interface B {
	C nodeEdge();
}

interface C {
	B alternativeA();
	B alternativeB();
}
