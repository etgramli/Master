interface A extends B {
}

interface B extends E {
	C nodeEdgeA();
}

interface C {
	D nodeEdgeB();
}

interface D {
	B alternativeC();
}
