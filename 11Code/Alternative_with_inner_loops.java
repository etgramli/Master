interface A extends C, D {
	B alternativeB();
}

interface C extends B {
	C alternativeA();
}

interface D extends B {
	D alternativeC();
}
