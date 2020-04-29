package de.etgramlich.dsl.joi;

trait BeginScope {
    def singleton(string: String): ImplScopeScope4
    def component(string: String): ImplScopeScope4
}
