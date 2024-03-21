# Advancing Code Readability: Mined & Modified Code for Dataset Generation
This repository contains all LaTeX documents created during the master thesis.
The main documents are the `master-thesis.tex` and `master-thesis.pdf`.

## Files
The following LaTeX files are within this repository:

### Master thesis
The repository contains the submitted master thesis `Advancing Code Readability: Mined & Modified Code for Dataset Generation` as pdf (`master-thesis.pdf`) and the source file (`master-thesis.tex`). The images embedded in the document are located in the `img` folder. 

### User Study
During the thesis a user study was conducted. You can find the concept of the study before conduction as pdf (`user-study.pdf`) and tex (`user-study.tex`). The file was not updated during and after survey conduction.

### Exposé
Before the thesis was written the initial idea is captured in the exposé. You can find the pdf (`expose.pdf`) and the tex (`expose.tex`) of the exposé within this repository. The file was not updated after submission.

### Documentation
You can find the documentation of the used LaTeX-Template in `se2thesis.pdf`.

## TexStudio Configuration
MikTex on Windows was used to compile the tex files of this repository. Apply these changes to the default configuration of TeXstudio:
- Set default compiler to "txs:///pdflatex/[--shell-escape]"
- Set bibleography program to Biber

You can then use the following commands:
- Press F5 to compile and show PDF
- Press F8 after change of bibleography to remake it

Sometimes it is necessary to delete all generated files (all except the .tex file) and recompile from scratch so that the citations are updated and displayed correctly.