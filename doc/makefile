SOURCES:=InterneDSLs.tex $(foreach dir,./, $(wildcard $(dir)/*/*.tex))

InterneDSLs.pdf: InterneDSLs.tex $(SOURCES)
	latexmk -pdf $<

.PHONY: clean cleanup

cleanup: clean
	rm -rf *.pdf 0*/*.pdf

clean:
	rm -f *.aux *.bbl *.blg *.fls *.fdb_latexmk *.glg *.glo *.gls *.idx *.ilg *.ind *.ist *.lof *.log *.lol *.lot *.out *.synctex.gz *.toc */*.aux */*.bbl */*.blg */*.fls */*.fdb_latexmk */*.glo */*.idx */*.ilg */*.ind */*.ist */*.lof */*.log */*.lol */*.lot */*.out */*.synctex.gz */*.toc
