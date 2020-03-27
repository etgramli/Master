LATEXMK       :=latexmk
LATEXMKARGS   :=-pdf

SOURCES       :=InterneDSLs.tex $(foreach dir,./, $(wildcard $(dir)/*/*.tex)) literature.bib
CODEFILES     := $(wildcard 11Code/*)
TMPFILEENDINGS:=*.aux *.bbl *.bcf *.blg *.fdb_latexmk *.fls *.glg *.glo *.gls *.idx *.ilg *.ind *.ist *.lof *.log *.lol *.lot *.out *.synctex.gz *.toc *.xdy
SUBDIRTMPFILES:=$(foreach dir,$(wildcard ./*/),$(addprefix $(dir),$(TMPFILEENDINGS)))

IMG_DIR       :=10_Pictures
INKSCAPE_SVGS :=$(wildcard $(IMG_DIR)/*.svg)
INKSCAPE_IMGS :=$(INKSCAPE_SVGS:.svg=.pdf)
UMLET_XMLS    :=$(wildcard $(IMG_DIR)/*.uxf)
UMLET_IMGS    :=$(UMLET_XMLS:.uxf=.pdf)
DOT_GRAPHS    :=$(wildcard $(IMG_DIR)/*.gv)
DOT_IMGS      :=$(DOT_GRAPHS:.gv=.tex)

InterneDSLs.pdf: InterneDSLs.tex $(SOURCES) $(INKSCAPE_IMGS) $(UMLET_IMGS) $(DOT_IMGS) $(CODEFILES)
	$(LATEXMK) $(LATEXMKARGS) InterneDSLs

$(IMG_DIR)/%.pdf: $(IMG_DIR)/%.svg
	inkscape $< -A $@ --export-ignore-filters --without-gui --export-pdf-version=1.4

$(IMG_DIR)/%.pdf: $(IMG_DIR)/%.uxf
	umlet -action=convert -format=pdf -filename=$<
	mv $<.pdf $@

$(IMG_DIR)/%.tex: $(IMG_DIR)/%.gv
	dot2tex --figonly -o $@ $<

.PHONY: clean cleanup

cleanup: clean
	rm -rf *.pdf 0*/*.pdf

clean:
	rm -f $(TMPFILEENDINGS) $(SUBDIRTMPFILES) $(INKSCAPE_IMGS) $(UMLET_IMGS) $(DOT_IMGS)
