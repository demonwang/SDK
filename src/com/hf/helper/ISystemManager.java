package com.hf.helper;

import com.hf.notify.SystemEvent;

public interface ISystemManager {
	/**
	 * init com.hf.could
	 */
	void initCouldModule();
	/**
	 * init con.hf.local
	 */
	void initLocalModule();
	/**
	 * start working
	 */
	void startSystem();
	/**
	 * stop working
	 */
	void stopSystem();
	
	/*
	 * set notify 
	 */
	void registSysEvent(String className,SystemEvent notify);
	
	void removeSysEvent(String className);
}