package com.hf.ctrlCenter;

import java.util.Hashtable;
import java.util.Iterator;

import com.hf.config.CouldServerConfig;
import com.hf.config.LocalRunnerConfig;
import com.hf.ctrlCenter.CouldHelper.OnGetModuleEvent;
import com.hf.ctrlCenter.CouldHelper.OnLoginEvent;
import com.hf.ctrlCenter.CouldHelper.getKeyvalueEvent;
import com.hf.helper.ISystemManager;
import com.hf.notify.SystemEvent;
import com.hf.util.MyLogger;
import com.hf.util.SystemTool;

public class ModuleManager implements ISystemManager {
	final String TAG = "TEST";
	
	private boolean isSystemRunning = false;
	private Hashtable<String, SystemEvent> eventors = new Hashtable<>();
	
	
	@Override
	public void initCouldModule() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "initCouldModule");
		HelperFactory.getCouldHelper().login(new OnLoginEvent() {
			
			@Override
			public void onLogin() {
				// TODO Auto-generated method stub
				
			}
		});
		
		HelperFactory.getCouldHelper().getKeyvalue(new getKeyvalueEvent() {
			
			@Override
			public void OnGet() {
				// TODO Auto-generated method stub
				
			}
		}, CouldServerConfig.kevalue_key);
		
		HelperFactory.getCouldHelper().getModuleList(new OnGetModuleEvent() {
			
			@Override
			public void ongetModuleList() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void initLocalModule() {
		// TODO Auto-generated method stub
		//Build Local sicket
		MyLogger.e(TAG, "initLocalModule");
		
	}

	@Override
	public void startSystem() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "startSystem");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				startBeat();
			}
		}).start();	
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				startReceive();
			}
		}).start();	
	}

	@Override
	public void stopSystem() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "stopSystem");
	}

	@Override
	public void registSysEvent(String classname,SystemEvent notify) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "registSysEvent");
		this.eventors.put(classname, notify);
	}

	@Override
	public void removeSysEvent(String className) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "removeSysEvent");
		this.eventors.remove(className);
	}
	
	private void notifyEvent(String msg){
		Iterator<String> it = eventors.keySet().iterator();
		while(it.hasNext()){
			eventors.get(it.next()).onEvent(msg);
		}
	}
	
	private void startBeat(){
		isSystemRunning = true;
		while(isSystemRunning){
			MyLogger.i(TAG, "sendBeat");
			notifyEvent("EVENT");
			SystemTool.sleep(LocalRunnerConfig.intervalTime);
		}
	}
	private void startReceive(){
		while(isSystemRunning){
			MyLogger.i(TAG, "Receive");
			notifyEvent("ReceiveEvent");
			SystemTool.sleep(LocalRunnerConfig.intervalTime);
		}
	}
}
