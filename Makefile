.PHONY: build run clean

name = FinalProj

LIB_DIR = lib
ANTLR_JAR = antlr-4.13.1-complete.jar
ANTLR_PATH = $(LIB_DIR)/$(ANTLR_JAR)
CLASSPATH = $(ANTLR_PATH):./target
JAVAC = javac -cp $(CLASSPATH)
ANTLR = java -jar $(ANTLR_PATH) -no-visitor -no-listener
TESTRIG = java -cp $(CLASSPATH) org.antlr.v4.gui.TestRig

build:
	mkdir -p ./target
	kotlinc -cp $(CLASSPATH) -d ./target ./src/backend/*.kt
	$(ANTLR) -o ./target/ ./src/*.g4
	$(JAVAC) -d ./target ./target/src/*.java

run:
	@jupyter nbconvert \
		--to notebook --execute worksheet.ipynb --output output.ipynb 2>&1 | \
		grep -v '\[main\]' | grep -v '\[IOPUB\]' | grep -v '\[Thread-' | \
	       	grep -v '\[NbConvertApp\]'

clean:
	rm -rf ./target
	rm -f ./output.ipynb
