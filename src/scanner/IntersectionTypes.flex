<YYINITIAL> {
	"$$" {
		/* DEBUG */
		System.out.println("found INTERSECT token at line " + (yyline + 1));

		return sym(Terminals.INTERSECT); }
}
