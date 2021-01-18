/* description:
 * un token INTERSECT è
 * "&" solo se seguito da
 * 0 o più bianchi +
 * (ID + 0 o più bianchi + un carattere fra "<", ">", ".") 1 o più volte +
 * (0 o più bianchi + "&" + 0 o più bianchi + (ID + 0 o più bianchi + un carattere fra "<", ">", ".") 1 o più volte) 0 o più volte +
 * 0 o più bianchi +
 * ID +
 * un carattere fra ",", ";"
 *
 * di seguito una conversione in PCRE per scopi di testing
 *
 * &(?=[ \t\r\n]*([[:alpha:]][[:digit:][:alpha:]]*[ \t\r\n]*[\.<>]?)+([ \t\r\n]*&[ \t\r\n]*([[:alpha:]][[:digit:][:alpha:]]*[\.<>]?)+)*[ \t\r\n]*[[:alpha:]][[:digit:][:alpha:]]*[ \t\r\n]*[,;=\)])
 */

<YYINITIAL> {
	"&"/{WhiteSpace}*([:jletter:][:jletterdigit:]*{WhiteSpace}*[\.<>]?)+({WhiteSpace}*"&"{WhiteSpace}*([:jletter:][:jletterdigit:]*[\.<>]?)+)*{WhiteSpace}+[:jletter:][:jletterdigit:]*{WhiteSpace}*[,;=\)] {

		/* DEBUG */
		System.out.println("found INTERSECT at line " + (yyline + 1));

		return sym(Terminals.INTERSECT); }
}
