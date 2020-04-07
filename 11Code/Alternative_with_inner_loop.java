interface A extends C {
	B alternativeB();
	B alternativeC();
}

interface C extends B {
	C alternativeA();
}
