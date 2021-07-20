package Lexical;
import Syntactic.sym;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import main.java.Class.Token;


public class Scanner implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 128;
	private final int YY_EOF = 129;
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public Scanner (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public Scanner (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Scanner () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NOT_ACCEPT,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NOT_ACCEPT,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NOT_ACCEPT,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,130,
"49:8,48:3,49,48:2,49:18,11,18,1,49:5,45,46,43,42,13,41,12,44,40:10,49,14,16" +
",17,15,49:2,31,47:2,35,47,33,37,47:5,26,23,47,19,47:2,34,28,38,47:2,22,21,4" +
"7,49:6,24,47:2,10,4,3,36,8,2,47:2,5,25,9,20,39,47,30,6,7,47,27,29,47,32,47," +
"49:5,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,90,
"0,1:2,2,3,1:3,4,5,6,7,1:6,8,9,1:4,9:5,10,9,1,11,9:4,12,13,14,15,9,1,16,12,1" +
"7,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,4" +
"2,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61")[0];

	private int yy_nxt[][] = unpackFromString(62,50,
"1,2,3,38,68,38:2,70,38:3,4,5,6,7,8,9,10,39,72,38:3,74,38:2,76,38:7,78,89,38" +
",82,38:2,11,12,13,14,15,16,17,38,18,42,-1:52,41,19,41:7,-1:8,41:21,-1:7,41," +
"-1:13,4,-1:55,20,-1:47,21,-1,22,-1:49,23,-1:72,11,-1:57,18,-1:3,41:9,-1:8,4" +
"1:21,44,-1:6,41,-1:4,41:9,-1:8,41:9,52,41:2,88,41:8,44,-1:6,41,-1:4,41:9,-1" +
":8,41:10,75,41:10,44,-1:6,41,-1:4,37:9,-1:8,37:21,44,-1:6,37,-1:4,41:9,-1:8" +
",41:21,-1:7,41,-1:19,21,-1:34,43,-1:50,31,-1:48,41:2,24,41:6,-1:8,41:21,44," +
"-1:6,41,-1:4,41:9,40,-1:7,41:21,44,-1:6,41,-1:4,41:7,25,41,-1:8,41:21,44,-1" +
":6,41,-1:4,41:9,-1:8,41:2,26,27,41:17,44,-1:6,41,-1:4,41:2,28,41:6,-1:8,41:" +
"21,44,-1:6,41,-1:4,41:2,29,41:6,-1:8,41:21,44,-1:6,41,-1:4,41:4,30,41:4,-1:" +
"8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41,32,41:19,44,-1:6,41,-1:4,41:9,-1:8,41:" +
"20,33,44,-1:6,41,-1:4,41:9,-1:8,41:17,34,41:3,44,-1:6,41,-1:4,41:8,35,-1:8," +
"41:21,44,-1:6,41,-1:4,41:9,-1:8,41:6,36,41:14,44,-1:6,41,-1:4,41:4,45,41:4," +
"-1:8,41:21,44,-1:6,41,-1:4,41:8,46,-1:8,41:21,44,-1:6,41,-1:4,41:2,47,41:6," +
"-1:8,41:21,44,-1:6,41,-1:4,41:4,48,41:4,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:" +
"8,41:6,49,41:14,44,-1:6,41,-1:4,41:9,-1:8,41:8,50,41:12,44,-1:6,41,-1:4,41:" +
"5,51,41:3,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41:19,53,41,44,-1:6,41,-1:4," +
"41:7,54,41,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41:11,55,41:9,44,-1:6,41,-1" +
":4,41:9,-1:8,41,56,41:19,44,-1:6,41,-1:4,41:3,57,41:3,58,41,-1:8,41:21,-1:7" +
",41,-1:4,41:9,-1:8,41:5,63,41:15,44,-1:6,41,-1:4,41:6,59,41:2,-1:8,41:21,-1" +
":7,41,-1:4,41:2,64,41:6,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41,60,41:19,-1" +
":7,41,-1:4,65,41:8,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41:5,61,41:15,-1:7," +
"41,-1:4,41:9,-1:8,41:5,66,41:15,44,-1:6,41,-1:4,41:9,-1:8,41,62,41:19,-1:7," +
"41,-1:4,41:9,-1:8,41:11,67,41:9,44,-1:6,41,-1:4,41:5,69,41:3,-1:8,41:21,-1:" +
"7,41,-1:4,41:9,-1:8,41:8,71,41:12,44,-1:6,41,-1:4,41:6,73,41:2,-1:8,41:21,4" +
"4,-1:6,41,-1:4,41:9,-1:8,41:14,77,41:6,44,-1:6,41,-1:4,79,41:8,-1:8,41:21,-" +
"1:7,41,-1:4,41:5,80,41:3,-1:8,41:21,44,-1:6,41,-1:4,41:9,-1:8,41:13,81,41:7" +
",44,-1:6,41,-1:4,41:9,-1:8,41,83,41:19,44,-1:6,41,-1:4,41:9,-1:8,41:5,84,41" +
":15,44,-1:6,41,-1:4,41:9,-1:8,41:4,85,41:16,44,-1:6,41,-1:4,41:9,-1:8,41:10" +
",86,41:10,44,-1:6,41,-1:4,41:9,-1:8,41,87,41:19,-1:7,41,-1:2");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {
				return null;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{return new Symbol(sym.quotes,new Token(sym.quotes, new String(yytext()), yyline, yychar));}
					case -3:
						break;
					case 3:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -4:
						break;
					case 4:
						{}
					case -5:
						break;
					case 5:
						{return new Symbol(sym.dot,new Token(sym.dot, new String(yytext()), yyline, yychar));}
					case -6:
						break;
					case 6:
						{return new Symbol(sym.comma,new Token(sym.comma, new String(yytext()), yyline, yychar));}
					case -7:
						break;
					case 7:
						{return new Symbol(sym.semicolon,new Token(sym.semicolon, new String(yytext()), yyline, yychar));}
					case -8:
						break;
					case 8:
						{return new Symbol(sym.higher,new Token(sym.higher, new String(yytext()), yyline, yychar));}
					case -9:
						break;
					case 9:
						{return new Symbol(sym.less,new Token(sym.less, new String(yytext()), yyline, yychar));}
					case -10:
						break;
					case 10:
						{JOptionPane.showMessageDialog(null,"Lexical Error: " + yytext() + ". Line: " + yyline + ". Position: " + yychar);}
					case -11:
						break;
					case 11:
						{return new Symbol(sym.integer,new Token(sym.integer, new String(yytext()), yyline, yychar));}
					case -12:
						break;
					case 12:
						{return new Symbol(sym.erase,new Token(sym.erase, new String(yytext()), yyline, yychar));}
					case -13:
						break;
					case 13:
						{return new Symbol(sym.plus,new Token(sym.plus, new String(yytext()), yyline, yychar));}
					case -14:
						break;
					case 14:
						{return new Symbol(sym.per,new Token(sym.per, new String(yytext()), yyline, yychar));}
					case -15:
						break;
					case 15:
						{return new Symbol(sym.split,new Token(sym.split, new String(yytext()), yyline, yychar));}
					case -16:
						break;
					case 16:
						{return new Symbol(sym.bracket_open,new Token(sym.bracket_open, new String(yytext()), yyline, yychar));}
					case -17:
						break;
					case 17:
						{return new Symbol(sym.bracket_close,new Token(sym.bracket_close, new String(yytext()), yyline, yychar));}
					case -18:
						break;
					case 18:
						{}
					case -19:
						break;
					case 19:
						{return new Symbol(sym.i_f,new Token(sym.i_f, new String(yytext()), yyline, yychar));}
					case -20:
						break;
					case 20:
						{return new Symbol(sym.ehigher,new Token(sym.ehigher, new String(yytext()), yyline, yychar));}
					case -21:
						break;
					case 21:
						{return new Symbol(sym.distinct,new Token(sym.distinct, new String(yytext()), yyline, yychar));}
					case -22:
						break;
					case 22:
						{return new Symbol(sym.eless,new Token(sym.eless, new String(yytext()), yyline, yychar));}
					case -23:
						break;
					case 23:
						{return new Symbol(sym.equal,new Token(sym.equal, new String(yytext()), yyline, yychar));}
					case -24:
						break;
					case 24:
						{return new Symbol(sym.el_se,new Token(sym.el_se, new String(yytext()), yyline, yychar));}
					case -25:
						break;
					case 25:
						{return new Symbol(sym.then,new Token(sym.then, new String(yytext()), yyline, yychar));}
					case -26:
						break;
					case 26:
						{return new Symbol(sym.posx,new Token(sym.posx, new String(yytext()), yyline, yychar));}
					case -27:
						break;
					case 27:
						{return new Symbol(sym.posy,new Token(sym.posy, new String(yytext()), yyline, yychar));}
					case -28:
						break;
					case 28:
						{return new Symbol(sym.name,new Token(sym.name, new String(yytext()), yyline, yychar));}
					case -29:
						break;
					case 29:
						{return new Symbol(sym.move,new Token(sym.move, new String(yytext()), yyline, yychar));}
					case -30:
						break;
					case 30:
						{return new Symbol(sym.stats,new Token(sym.stats, new String(yytext()), yyline, yychar));}
					case -31:
						break;
					case 31:
						{return new Symbol(sym.end_if,new Token(sym.end_if, new String(yytext()), yyline, yychar));}
					case -32:
						break;
					case 32:
						{return new Symbol(sym.moveto,new Token(sym.moveto, new String(yytext()), yyline, yychar));}
					case -33:
						break;
					case 33:
						{return new Symbol(sym.giveup,new Token(sym.giveup, new String(yytext()), yyline, yychar));}
					case -34:
						break;
					case 34:
						{return new Symbol(sym.donothing,new Token(sym.donothing, new String(yytext()), yyline, yychar));}
					case -35:
						break;
					case 35:
						{return new Symbol(sym.movetoward,new Token(sym.movetoward, new String(yytext()), yyline, yychar));}
					case -36:
						break;
					case 36:
						{return new Symbol(sym.moveawayfrom,new Token(sym.moveawayfrom, new String(yytext()), yyline, yychar));}
					case -37:
						break;
					case 38:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -38:
						break;
					case 39:
						{JOptionPane.showMessageDialog(null,"Lexical Error: " + yytext() + ". Line: " + yyline + ". Position: " + yychar);}
					case -39:
						break;
					case 41:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -40:
						break;
					case 42:
						{JOptionPane.showMessageDialog(null,"Lexical Error: " + yytext() + ". Line: " + yyline + ". Position: " + yychar);}
					case -41:
						break;
					case 44:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -42:
						break;
					case 45:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -43:
						break;
					case 46:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -44:
						break;
					case 47:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -45:
						break;
					case 48:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -46:
						break;
					case 49:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -47:
						break;
					case 50:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -48:
						break;
					case 51:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -49:
						break;
					case 52:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -50:
						break;
					case 53:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -51:
						break;
					case 54:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -52:
						break;
					case 55:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -53:
						break;
					case 56:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -54:
						break;
					case 57:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -55:
						break;
					case 58:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -56:
						break;
					case 59:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -57:
						break;
					case 60:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -58:
						break;
					case 61:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -59:
						break;
					case 62:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -60:
						break;
					case 63:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -61:
						break;
					case 64:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -62:
						break;
					case 65:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -63:
						break;
					case 66:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -64:
						break;
					case 67:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -65:
						break;
					case 68:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -66:
						break;
					case 69:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -67:
						break;
					case 70:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -68:
						break;
					case 71:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -69:
						break;
					case 72:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -70:
						break;
					case 73:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -71:
						break;
					case 74:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -72:
						break;
					case 75:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -73:
						break;
					case 76:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -74:
						break;
					case 77:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -75:
						break;
					case 78:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -76:
						break;
					case 79:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -77:
						break;
					case 80:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -78:
						break;
					case 81:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -79:
						break;
					case 82:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -80:
						break;
					case 83:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -81:
						break;
					case 84:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -82:
						break;
					case 85:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -83:
						break;
					case 86:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -84:
						break;
					case 87:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -85:
						break;
					case 88:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -86:
						break;
					case 89:
						{return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}
					case -87:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
