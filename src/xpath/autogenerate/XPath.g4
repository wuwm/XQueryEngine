grammar XPath;



ap:  'doc("' filename '")'  '/'  rp      #single_ap
  |  'doc("' filename '")'  '//' rp      #double_ap
  ;


rp : tagName                   #tagname_rp
   | '*'                       #child_rp
   | '.'                       #self_rp
   | '..'                      #parent_rp
   | 'text()'                  #value_rp
   | '@' attName               #attname_rp
   |  rp ',' rp                #comma_rps
   | '(' rp ')'                #brace_rp
   | rp '/' rp                 #single_prs
   | rp '//' rp                #double_prs
   | rp '[' f ']'              #filter_rp
   ;


f : rp                         #rp_f
  | rp VEQ rp                  #rps_veq_f
  | rp IEQ rp                  #rps_ieq_f
  | '(' f ')'                  #brace_f
  | f 'and' f                  #and_fs
  | f 'or' f                   #or_fs
  | 'not' f                    #not_f
  ;

tagName:  ID;
attName:  ID;

VEQ: '=';
IEQ: '==';
ID: [a-zA-Z0-9]+ ;

filename: FILENAME;
FILENAME: [a-zA-Z0-9._]+;

WHITESPACE:[ \t\n\r]+ -> skip;