interface A implements C {
	B alternativeB();
	B alternativeC();
}

interface C implements B {
	C nodeEdgeA();
}
