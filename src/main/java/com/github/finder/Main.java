package com.github.finder;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.CmdLineException;


public class Main {
	public Main(String[] arguments) {
		Args args = parseArguments(arguments);
	}
	
	private Args parseArguments(String[] arguments){
		Args args = new Args();
		try {
			CmdLineParser parser = new CmdLineParser(args);
			parser.parseArgument(arguments);
		} catch (CmdLineException e) {
		}
		return args;
	}
	
	public static void main(String[] args) {
		new Main(args);
	}
}
