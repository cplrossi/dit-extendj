#!/bin/bash
# Just compile codebase in this directory with dit-extendj (deconfined intersection types ExtendJ)
# then launch main class with the Java Virtual Machine.
# Exit value of processes is checked on every step

# TODO: need to support new file hierarchy

MAIN='org.cplrossi.testgame.Game'

check() {
	if [[ $? -ne 0 ]]; then
		echo [ KO ] $1
		exit 1
	else
		echo [ OK ] $1
	fi
}

# Entry point
rm -f *.class

for file in $(find . -name '*.java'); do 
	java -jar ../dit-extendj.jar $file
	
	check $file
done

java -cp . $MAIN

check

