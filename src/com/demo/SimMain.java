package com.demo;

import com.hf.ctrlCenter.HelperFactory;
import com.hf.helper.IModuleManager;

public class SimMain {
	public static void main(String[] args) {
		IModuleManager manager = HelperFactory.getModulemanager();
		manager.initCouldModule();
		manager.initLocalModule();
		manager.start();
	}
}
