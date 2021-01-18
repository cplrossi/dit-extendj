#!/bin/bash

JARFILE=./dit-extendj.jar
SRCFILE=./testfiles/Test3.java

clear

jdb -sourcepath build/generated-src/ast:build/generated-src/parser:build/generated-src/scanner:extendj/src/backend:extendj/src/backend-main:extendj/src/frontend-main:extendj/src/frontend -classpath $JARFILE org.extendj.JavaCompiler $SRCFILE

