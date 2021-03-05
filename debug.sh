#!/bin/bash

JARFILE=./dit-extendj.jar
SRCFILE=./testfiles/org/cplrossi/dit/PureLambda.java

clear

jdb \
	-sourcepath build/generated-src/ast:build/generated-src/parser:build/generated-src/scanner:extendj/src/backend:extendj/src/backend-main:extendj/src/frontend:extendj/src/frontend-main\
	-classpath $JARFILE \
	org.extendj.JavaCompiler $SRCFILE

