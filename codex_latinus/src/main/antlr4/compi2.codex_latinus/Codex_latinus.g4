grammar Codex_latinus;

// GRAMÁTICA
init: '{';

// LEXER
// Palabras clave
ESTO: 'esto';
SERIES: 'series';
STRUCTURA: 'structura';
FINIS: 'finis' | 'FINIS';
SI: 'si';
ALITER: 'aliter';
DUM: 'dum';
FACERE: 'facere';
PER: 'per';
PERGE: 'perge';
INTERRUMPE: 'interrumpe';
ACTIO: 'actio';
RATIO: 'ratio';
REDDERE: 'reddere';
VARIABILES: 'VARIABILES';
MUNERA: 'MUNERA';
MAIOR: 'MAIOR';

// Palabras clave para tipos de datos
NUMERUS: 'numerus';
TEXTUM: 'textum';
DECIMALIS: 'decimalis';
LITTERA: 'littera';

// Booleanos
VERUM: 'verum';
FALSUS: 'falsus';

// Símbolos
DOS_PUNTOS: ':';
PUNTO_COMA: ';';
COMA: ',';
ASIGNACION: '=';
PUNTO: '.';
LEER: '<<';
IMPRIMIR: '>>';

// Delimitadores de arreglos y  bloques
PARENTESIS_IZQ: '(';
PARENTESIS_DER: ')';
CORCHETE_IZQ: '[';
CORCHETE_DER: ']';
LLAVE_IZQ: '{';
LLAVE_DER: '}';

// Aritmeticos
MAS: '+';
MENOS: '-';
MULTIPLICACION: '*';
DIVISION: '/';

// Relacionales
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
IGUAL: '==';
NO_IGUAL: '!=';
MENOR_QUE: '<';
MAYOR_QUE: '>';

// Logicos
AND: '&&';
OR: '||';
NEGACION: 'non';
SUMA_ABREVIADA: '++';
RESTA_ABREVIADA: '--';

// Variables
VARIABLE: [a-zA-Z_] [a-zA-Z0-9_]*;
NUMERO_ENTERO: [0-9]+;
NUMERO_DECIMAL: [0-9]+ '.' [0-9]+;
CADENA_TEXTO: '"' (~[ "\r\n])* '"';
CARACTER: '\'' . '\'';

// Espacios en blanco y comentarios
WS : [ \t\r\n]+ -> skip;
COMENTARIO_LINEA : '//' ~[\r\n]* -> skip;