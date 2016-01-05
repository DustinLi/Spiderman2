package net.kernal.spiderman.task;

import net.kernal.spiderman.downloader.Downloader;
import net.kernal.spiderman.downloader.Downloader.Request;
import net.kernal.spiderman.parser.Parser.ParsedResult;

public class ResultTask extends Task {

	private static final long serialVersionUID = -2038408835292733528L;
	
	private ParsedResult parsedResult;

	public ResultTask(Downloader.Request seed, ParsedResult parsedResult, Request request) {
		super(seed, request, 0);
		this.parsedResult = parsedResult;
	}
	
	public ParsedResult getParsedResult() {
		return this.parsedResult;
	}

	public String getType() {
		return "reporting";
	}

}