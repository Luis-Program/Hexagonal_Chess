
package Lexical;
import Syntactic.sym;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import main.java.Class.Token;

%%

quotes = "\""
text = [A-Za-z]+
i_f = "if"
el_se = "else"
then = "then"
end_if = "end if"
dot = "."
comma = ","
semicolon = ";"
higher = ">"
less = "<"
ehigher = ">="
eless = "<="
equal= "=="
distinct = "!="|"<>"
posx = "PosY"
posy = "PosX"
name = "Name"
move = "Move"
moveto = "MoveTo"
movetoward = "MoveToward"
moveawayfrom = "MoveAwayFrom"
stats = "Stats"
donothing = "DoNothing"
giveup = "GiveUp"
integer=[0-9]+
erase="-"
plus="+"
per="*"
split="/"
bracket_open="("
bracket_close=")"
piecename = {text}({text}{integer})*

%cup
%line
%char
%class Scanner
%%

{quotes} {return new Symbol(sym.quotes,new Token(sym.quotes, new String(yytext()), yyline, yychar));}
{i_f} {return new Symbol(sym.i_f,new Token(sym.i_f, new String(yytext()), yyline, yychar));}
{el_se} {return new Symbol(sym.el_se,new Token(sym.el_se, new String(yytext()), yyline, yychar));}
{then} {return new Symbol(sym.then,new Token(sym.then, new String(yytext()), yyline, yychar));}
{end_if} {return new Symbol(sym.end_if,new Token(sym.end_if, new String(yytext()), yyline, yychar));}
{dot} {return new Symbol(sym.dot,new Token(sym.dot, new String(yytext()), yyline, yychar));}
{comma} {return new Symbol(sym.comma,new Token(sym.comma, new String(yytext()), yyline, yychar));}
{semicolon} {return new Symbol(sym.semicolon,new Token(sym.semicolon, new String(yytext()), yyline, yychar));}
{higher} {return new Symbol(sym.higher,new Token(sym.higher, new String(yytext()), yyline, yychar));}
{less} {return new Symbol(sym.less,new Token(sym.less, new String(yytext()), yyline, yychar));}
{ehigher} {return new Symbol(sym.ehigher,new Token(sym.ehigher, new String(yytext()), yyline, yychar));}
{eless} {return new Symbol(sym.eless,new Token(sym.eless, new String(yytext()), yyline, yychar));}
{equal} {return new Symbol(sym.equal,new Token(sym.equal, new String(yytext()), yyline, yychar));}
{distinct} {return new Symbol(sym.distinct,new Token(sym.distinct, new String(yytext()), yyline, yychar));}
{posx} {return new Symbol(sym.posx,new Token(sym.posx, new String(yytext()), yyline, yychar));}
{posy} {return new Symbol(sym.posy,new Token(sym.posy, new String(yytext()), yyline, yychar));}
{name} {return new Symbol(sym.name,new Token(sym.name, new String(yytext()), yyline, yychar));}
{move} {return new Symbol(sym.move,new Token(sym.move, new String(yytext()), yyline, yychar));}
{moveto} {return new Symbol(sym.moveto,new Token(sym.moveto, new String(yytext()), yyline, yychar));}
{movetoward} {return new Symbol(sym.movetoward,new Token(sym.movetoward, new String(yytext()), yyline, yychar));}
{moveawayfrom} {return new Symbol(sym.moveawayfrom,new Token(sym.moveawayfrom, new String(yytext()), yyline, yychar));}
{stats} {return new Symbol(sym.stats,new Token(sym.stats, new String(yytext()), yyline, yychar));}
{donothing} {return new Symbol(sym.donothing,new Token(sym.donothing, new String(yytext()), yyline, yychar));}
{giveup} {return new Symbol(sym.giveup,new Token(sym.giveup, new String(yytext()), yyline, yychar));}
{integer} {return new Symbol(sym.integer,new Token(sym.integer, new String(yytext()), yyline, yychar));}
{erase} {return new Symbol(sym.erase,new Token(sym.erase, new String(yytext()), yyline, yychar));}
{plus} {return new Symbol(sym.plus,new Token(sym.plus, new String(yytext()), yyline, yychar));}
{per} {return new Symbol(sym.per,new Token(sym.per, new String(yytext()), yyline, yychar));}
{split} {return new Symbol(sym.split,new Token(sym.split, new String(yytext()), yyline, yychar));}
{bracket_open} {return new Symbol(sym.bracket_open,new Token(sym.bracket_open, new String(yytext()), yyline, yychar));}
{bracket_close} {return new Symbol(sym.bracket_close,new Token(sym.bracket_close, new String(yytext()), yyline, yychar));}
{piecename} {return new Symbol(sym.piecename,new Token(sym.piecename, new String(yytext()), yyline, yychar));}



[\b\t\r\f\n]+ {}
" "+ {}
. {JOptionPane.showMessageDialog(null,"Lexical Error: " + yytext() + ". Line: " + yyline + ". Position: " + yychar);}
