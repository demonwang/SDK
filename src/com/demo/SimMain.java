package com.demo;

import com.hf.ctrlCenter.HelperFactory;
import com.hf.helper.ISystemManager;
import com.hf.notify.SystemEvent;
import com.hf.util.MyLogger;

public class SimMain implements SystemEvent{
	public static void main(String[] args) {
		SimMain s = new SimMain();
		ISystemManager manager = HelperFactory.getSystemanager();
		manager.registSysEvent(s.getClass().getName(),s);
		manager.initCouldModule();
		manager.initLocalModule();
//		manager.removeSysEvent(s.getClass().getName());
		manager.startSystem();		
	}

	@Override
	public void onEvent(String msg) {
		// TODO Auto-generated method stub
		MyLogger.e("event", msg);
	}
}
