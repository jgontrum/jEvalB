package de.up.ling.irtg.eval;

import com.beust.jcommander.JCommander;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) throws IOException {
        CommandLineArguments arguments = new CommandLineArguments();
        JCommander cliParser = new JCommander(arguments, args);
        cliParser.setProgramName("jEvalB");
        
        Stream<String> evalStream = Files.lines(Paths.get(arguments.evalFile));
        Stream<String> goldStream = Files.lines(Paths.get(arguments.goldFile));
        
        List<String> evalRaw = new ArrayList<>();
        List<String> goldRaw = new ArrayList<>();
        
        evalStream.forEachOrdered(line -> evalRaw.add(line));
        goldStream.forEachOrdered(line -> goldRaw.add(line));

        assert(evalRaw.size() == goldRaw.size());
        
        

    }
}
