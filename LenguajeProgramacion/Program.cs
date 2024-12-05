using Antlr4.Runtime; 
using LenguajeProgramacion;
using LenguajeProgramacion.Content;

// Define la ruta del archivo de ejemplo a leer.
var fileName = "Content\\Ejemplo.zsx";

// Lee todo el contenido del archivo en una cadena.
var fileContents = File.ReadAllText(fileName);

// Crea un flujo de entrada a partir del contenido del archivo.
var inputStream = new AntlrInputStream(fileContents);

// Inicializa el analizador léxico con el flujo de entrada.
var LenguajeLexer = new LenguajeLexer(inputStream);

// Crea un flujo de tokens comunes a partir del analizador léxico.
var commonTokenStream = new CommonTokenStream(LenguajeLexer);

// Inicializa el analizador sintáctico con el flujo de tokens.
var LenguajeParser = new LenguajeParser(commonTokenStream);

// Analiza el programa completo y obtiene el contexto del programa.
var LenguajeContext = LenguajeParser.program();

// Crea una instancia de tu visitante personalizado.
var visitor = new LenguajeVisitor();

// Visita el contexto del programa utilizando el visitante para evaluar o interpretar el programa.
visitor.Visit(LenguajeContext); 
