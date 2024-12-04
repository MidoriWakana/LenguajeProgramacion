using Antlr4.Runtime;
using LenguajeProgramacion;
using LenguajeProgramacion.Content;

var fileName = "Content\\Prueba.ss"; // args[0] ?

var fileContents = File.ReadAllText(fileName);

var inputStream = new AntlrInputStream(fileContents);

var LenguajeLexer = new LenguajeLexer(inputStream);

var commonTokenStream = new CommonTokenStream(LenguajeLexer);

var LenguajeParser = new LenguajeParser(commonTokenStream);

var LenguajeContext = LenguajeParser.program();

var visitor = new LenguajeVisitor();

visitor.Visit(LenguajeContext);