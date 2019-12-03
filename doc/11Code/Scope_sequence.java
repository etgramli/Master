interface SequenzEins {
	SequenzZwei SequenzEins();
}

interface SequenzZwei {
	nextScope SequenzZwei();
}
