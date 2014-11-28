/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.up.ling.irtg.eval;
import com.beust.jcommander.Parameter;

/**
 * Define the arguments for the command line.
 * @author Johannes Gontrum <gontrum@uni-potsdam.de>
 */
public class CommandLineArguments {
    @Parameter(names = {"--evaluate", "-e"}, description = "Contains one tree in Lisp format  per line to evalute.", required = true)
    public String evalFile;

    @Parameter(names = {"--gold", "-g"}, description = "Contains one tree in Lisp format per line as gold standard.", required = true)
    public String goldFile;
    
    @Parameter(names = {"--help", "--usage", "--info", "help"}, description = "Displays this information.", help = true)
    public boolean help;
}
