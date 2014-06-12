package com.hf.cmd;

import com.hf.info.ModuleInfo;

public class T1Manager {
	private ModuleInfo mi;
	public T1Manager(ModuleInfo mi){
		this.mi = mi;
	}
	public static byte[] getBeat(){
		return "~@@Hello,Thing!**#".getBytes();
	}
	
	// syn
	public byte[] setModulePswd(){
		return null;
	}
	
	public byte[] setServaddr(){
		return null;
		
	}
	
	public byte[] setModuleType(short factoryId,short Type){
		return null;
		
	}
	
	public byte[] resetModule(){
		return null;
		
	}
	
	public byte[] ctrlModule(byte[] t2){
		return t2;	
	}
} 
