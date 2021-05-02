# ExtendJ with Deconfined Intersection Types

This is an extension to [ExtendJ](https://extendj.org/) compiler. It implements
[a Java 8 language extension by Dezani-Ciancaglini, Giannini and Venneri](https://drops.dagstuhl.de/opus/volltexte/2020/13225/) that allows an intersection type
(e. g. `I & J`) to be used everywhere a reference type is allowed. Just a subset
of intersection types is currently implemented, that is intersections of
(potentially parametrized) interfaces only.

While working for simple use cases (see `testfiles/`), this project is in an embryonic state.

## Building

Building process is tested under OpenJDK8. To build the extended compiler, just run on the shell:

    $ ./gradlew
    
The final artifact is `extendj-dit.jar`, located in the root directory.
    
## Run tests

Run on the shell:

    $ cd testfiles && ./test.sh
    
## Cleaning

To clean the project tree from Gradle generated files, run on the shell:

    $ ./gradlew clean
    
To clean `testfiles/` subtree from generated classes, run on the shell:

    $ cd testfiles && ./clean.sh
