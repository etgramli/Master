add_cus_dep('glo', 'gls', 1, 'makeglo2gls');
sub makeglo2gls {
    system("makeglossaries '$_[0]'");
}
