SOURCES      :=InterneDSLs.tex $(foreach dir,./, $(wildcard $(dir)/*/*.tex))

IMG_DIR      :=10_Pictures
INKSCAPE_SVGS:=$(wildcard $(IMG_DIR)/*.svg)
INKSCAPE_IMGS:=$(INKSCAPE_SVGS:.svg=.eps)
UMLET_XMLS   :=$(wildcard $(IMG_DIR)/*.uxf)
UMLET_IMGS   :=$(UMLET_XMLS:.uxf=.eps)

InterneDSLs.pdf: InterneDSLs.tex $(SOURCES) $(INKSCAPE_IMGS) $(UMLET_IMGS)
	pdflatex InterneDSLs.tex
	xindy -I xindy -M InterneDSLs -t InterneDSLs.glg -o InterneDSLs.gls InterneDSLs.glo

$(IMG_DIR)/%.eps: $(IMG_DIR)/*.svg
	inkscape $< -E $@ --export-ignore-filters --export-ps-level=3

$(IMG_DIR)/%.eps: $(IMG_DIR)/*.uxf
	umlet -action=convert -format=eps -filename=$<
	mv $< $@

.PHONY: clean cleanup

cleanup: clean
	rm -rf *.pdf 0*/*.pdf

clean:
	rm -f *.aux *.bbl *.bcf *.blg *.fls *.fdb_latexmk *.glg *.glo *.gls *.idx *.ilg *.ind *.ist *.lof *.log *.lol *.lot *.out *.run.xml *.synctex.gz *.toc *.xdy */*.aux */*.bbl */*.bcf */*.blg */*.fls */*.fdb_latexmk */*.glo */*.idx */*.ilg */*.ind */*.ist */*.lof */*.log */*.lol */*.lot */*.out */*.run.xml */*.synctex.gz */*.toc */*.xdy
	rm -f $(INKSCAPE_IMGS) $(UMLET_IMAGES) $(IMG_DIR)/*-eps-converted-to.pdf
