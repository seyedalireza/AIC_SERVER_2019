package ir.sharif.aichallenge.server.hamid.model;

import ir.sharif.aichallenge.server.hamid.model.enums.Direction;

import java.util.ArrayList;

public class Path {
	private Cell begin;
	private Cell end;
	private Direction direction;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
