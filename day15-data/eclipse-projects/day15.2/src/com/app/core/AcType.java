package com.app.core;

public enum AcType {
	SAVING, CURRENT, FD, LOAN, DMAT,NRE;
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
