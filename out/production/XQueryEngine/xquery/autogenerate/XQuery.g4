grammar XQuery;
import Xpath;


xq
	: var													    # xq_var
	| StringConstant											# xq_StringConstant
	| ap														# xq_ap
	| '(' xq ')'												# xq_PxqP
	| xq ',' xq 											    # xq_xqCxq
	| xq '/' rp													# xq_xqSxq
	| xq '//' rp 												# xq_xqSSxq
	| '<' tagName '>' '{' xq '}' '<' '/' tagName '>'			# xq_IDxqID
	| forClause letClause? whereClause? 'return' returnClause    		# xq_ForLetWhereReturn
	| letClause xq 												# xq_LETxq
	| joinClause                                                # xq_Join
	;

joinClause
    : 'join' '(' xq ',' xq ',' idList ',' idList ')'
    ;

idList
    : '[' ID (',' ID)* ']'
    ;

var
	: '$' ID
	;

forClause
	: 'for' var 'in' xq (',' var 'in' xq)*
	;

letClause
	: 'let' var ':=' xq (',' var ':=' xq)*
	;

whereClause
	: 'where' cond
	;

returnClause
	: xq                                                #return_xq
	| returnClause ',' returnClause                     #return_Comma
    | '<' tagName '>' returnClause '<' '/' tagName '>'  #return_tag
	;

cond
	: xq VEQ xq 											     # cond_xqVEQxq
	| xq IEQ xq 											     # cond_xqIEQxq
	| 'empty' '(' xq ')' 		 							     # cond_EMPTYxq
	| 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond     # cond_Some
	| '(' cond ')' 											     # cond_PcondP
	| cond 'and' cond 										     # cond_condANDcond
	| cond 'or' cond 										     # cond_condORcond
	| 'not' cond 											     # cond_NOTcond

	;

StringConstant: '"'+[a-zA-Z0-9,.!?; "'-]+'"';