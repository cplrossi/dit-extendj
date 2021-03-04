#!/bin/bash
# Just compile codebase in this directory with dit-extendj (deconfined intersection types ExtendJ)
# then launch main class with the Java Virtual Machine.
# Exit value of processes is checked on every step

# TODO: need to support new file hierarchy

MAIN_CLASSES="org.cplrossi.testgame.Game org.cplrossi.dit.IntercastDesugaring org.cplrossi.dit.PureLambda"

check() {
	if [[ $? -ne 0 ]]; then
		echo [ KO ] $1
		exit 1
	else
		echo [ OK ] $1
	fi
}

# Entry point

for file in $(find . -name '*.java'); do 
	java -jar ../dit-extendj.jar $file
	
	check $file
done

for main_class in $MAIN_CLASSES; do 
	echo "*** running $main_class ***"

	java -cp . $main_class

	check
done

