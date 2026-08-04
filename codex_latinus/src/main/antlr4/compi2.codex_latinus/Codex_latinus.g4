grammar Codex_latinus;

// GRAMÁTICA
init: codex_latinus;

codex_latinus: variables* munera* maior;

variables: VARIABILES MAYOR_QUE declaracion+;

declaracion: ESTO VARIABLE DOS_PUNTOS NUMERUS NUMERO_ENTERO PUNTO_COMA
           | ESTO VARIABLE DOS_PUNTOS TEXTUM CADENA_TEXTO PUNTO_COMA
           | ESTO VARIABLE DOS_PUNTOS DECIMALIS NUMERO_DECIMAL PUNTO_COMA
           | ESTO VARIABLE DOS_PUNTOS LITTERA CARACTER PUNTO_COMA
           | ESTO VARIABLE DOS_PUNTOS (VERUM | FALSUS) PUNTO_COMA;

munera: MUNERA MAYOR_QUE funcion+;

funcion: RATIO tipo_dato VARIABLE PARENTESIS_IZQ parametros? PARENTESIS_DER LLAVE_IZQ
        variables_locales?
        reddere_sentencia
        LLAVE_DER FINIS PUNTO_COMA;

tipo_dato: NUMERUS | TEXTUM | DECIMALIS | LITTERA;

parametros: parametro (COMA parametro)*;

parametro: ESTO VARIABLE DOS_PUNTOS tipo_dato;

variables_locales: VARIABILES CORCHETE_IZQ declaracion_local+ CORCHETE_DER;

declaracion_local: ESTO VARIABLE DOS_PUNTOS tipo_dato expresion PUNTO_COMA;

expresion: termino (operacion_aritmetica termino)*;

termino: VARIABLE | NUMERO_ENTERO | NUMERO_DECIMAL | VERUM | FALSUS;

operacion_aritmetica: MAS | MENOS | MULTIPLICACION | DIVISION;

reddere_sentencia: REDDERE VARIABLE PUNTO_COMA;

maior: MAIOR MAYOR_QUE sentencia* FINIS PUNTO_COMA;

sentencia: imprimir_sentencia
         | leer_sentencia
         | asignacion_sentencia
         | si_sentencia;

imprimir_sentencia: IMPRIMIR (CADENA_TEXTO | VARIABLE | llamada_funcion) (IMPRIMIR (CADENA_TEXTO | VARIABLE | llamada_funcion))* PUNTO_COMA;

leer_sentencia: LEER PUNTO_COMA?
              | LEER VARIABLE PUNTO_COMA;

asignacion_sentencia: VARIABLE ASIGNACION expresion PUNTO_COMA;

si_sentencia: SI PARENTESIS_IZQ condicion PARENTESIS_DER LLAVE_IZQ sentencia* LLAVE_DER FINIS PUNTO_COMA;

condicion: expresion operador_relacional expresion;

operador_relacional: MAYOR_IGUAL | MENOR_IGUAL | IGUAL | NO_IGUAL | MENOR_QUE | MAYOR_QUE;

llamada_funcion: VARIABLE PARENTESIS_IZQ argumentos? PARENTESIS_DER;

argumentos: expresion (COMA expresion)*;

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
CADENA_TEXTO: '"' (~["\r\n])* '"';
CARACTER: '\'' . '\'';

// Espacios en blanco y comentarios
WS : [ \t\r\n]+ -> skip;
COMENTARIO_LINEA : '//' ~[\r\n]* -> skip;
COMENTARIO_BLOQUE: '##' .*? '##' -> channel(HIDDEN);