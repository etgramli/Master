LATEXMK      :=latexmk
LATEXMKARGS  :=-pdf

SOURCES      :=InterneDSLs.tex $(foreach dir,./, $(wildcard $(dir)/*/*.tex)) literature.bib

IMG_DIR      :=10_Pictures
INKSCAPE_SVGS:=$(wildcard $(IMG_DIR)/*.svg)
INKSCAPE_IMGS:=$(INKSCAPE_SVGS:.svg=.pdf)
UMLET_XMLS   :=$(wildcard $(IMG_DIR)/*.uxf)
UMLET_IMGS   :=$(UMLET_XMLS:.uxf=.pdf)

InterneDSLs.pdf: InterneDSLs.tex $(SOURCES) $(INKSCAPE_IMGS) $(UMLET_IMGS)
	$(LATEXMK) $(LATEXMKARGS) InterneDSLs

$(IMG_DIR)/%.pdf: $(IMG_DIR)/*.svg
	inkscape $< -A $@ --export-ignore-filters --without-gui --export-pdf-version=1.4

$(IMG_DIR)/%.pdf: $(IMG_DIR)/*.uxf
	umlet -action=convert -format=pdf -filename=$<
	mv $< $@

.PHONY: clean cleanup

cleanup: clean
	rm -rf *.pdf 0*/*.pdf

clean:
	rm -f *.aux *.bbl *.bcf *.blg *.fls *.fdb_latexmk *.glg *.glo *.gls *.idx *.ilg *.ind *.ist *.lof *.log *.lol *.lot *.out *.run.xml *.synctex.gz *.toc *.xdy */*.aux */*.bbl */*.bcf */*.blg */*.fls */*.fdb_latexmk */*.glo */*.idx */*.ilg */*.ind */*.ist */*.lof */*.log */*.lol */*.lot */*.out */*.run.xml */*.synctex.gz */*.toc */*.xdy
	rm -f $(INKSCAPE_IMGS) $(UMLET_IMGS)
