package com.hf.ctrlCenter;

import java.util.ArrayList;

import com.hf.helper.ICouldHelper;
import com.hf.info.CapchaImageInfo;
import com.hf.info.KeyValue;
import com.hf.info.ModuleInfo;
import com.hf.info.UserInfo;
import com.hf.util.MyLogger;

public class CouldHelper implements ICouldHelper {
	final String TAG = "CouldHelper";
	@Override
	public void login(final OnLoginEvent ol) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synLogin();
				ol.onLogin();
			}
		}).start();
	}

	@Override
	public void synLogin() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synLogin");
	}

	@Override
	public void logout(final OnLogoutEvent olo) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synLogout();
				olo.OnLogout();
			}
		}).start();
	}

	@Override
	public void synLogout() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synLogout");
	}

	@Override
	public void getUser(final OnGetUser gu) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synGetUser();
				gu.getUser();
			}
		}).start();
	}

	@Override
	public UserInfo synGetUser() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synGetUser");
		return null;
	}

	@Override
	public void getModuleList(final OnGetModuleEvent gm) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				syngetModuleList();
				gm.ongetModuleList();
			}
		}).start();
	}

	@Override
	public ArrayList<ModuleInfo> syngetModuleList() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "syngetModuleList");
		return null;
	}

	@Override
	public void setModule(final SetModuleCallBack cb, final ModuleInfo mi) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synsetModule(mi);
				cb.onSetModule();
			}
		}).start();
	}

	@Override
	public ModuleInfo synsetModule(ModuleInfo mi) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synsetModule");
		return null;
	}

	@Override
	public void deleteModule(final OnDeleteModuleCallBack cb,final String mac) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synDeleteModule(mac);
				cb.onDelete();
			}
		}).start();
	}

	@Override
	public void synDeleteModule( String mac) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synDeleteModule");
	}

	@Override
	public void getModule(final GetModuleEvent ev, final String mac) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synDeleteModule(mac);
				ev.onget();
			}
		}).start();
	}

	@Override
	public ModuleInfo syngetModule(String mac) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "syngetModule");
		return null;
	}

	@Override
	public void getCapchaImage(final getCapchaImageEvent ev) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				syngetcapchaImage();
				ev.onGet();
			}
		}).start();
	}

	@Override
	public CapchaImageInfo syngetcapchaImage() {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "syngetcapchaImage");
		return null;
	}

	@Override
	public void registerUser(final registEvent re, final UserInfo ui, final String capcha) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synregisterUser( ui,  capcha);
				re.onregist();
			}
		}).start();
	}

	@Override
	public void synregisterUser(UserInfo ui, String capcha) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synregisterUser");
	}

	@Override
	public void setUser(final setUserEvent ue, final UserInfo ui) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synsetUser(ui);
				ue.onSet();
			}
		}).start();
	}

	@Override
	public void synsetUser(UserInfo ui) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synsetUser");
	}

	@Override
	public void changePswd(final changePswdEvent pe, final String oldpswd, final String newpswd) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchangePswd( oldpswd,  newpswd);
				pe.onchange();
			}
		}).start();
	}

	@Override
	public void synchangePswd(String oldpswd, String newpswd) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synchangePswd");
	}

	@Override
	public void retrievePassword(final retrievePasswordEvent re,
			final String receiverAddress, final int receiverType) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synretrievePassword(receiverAddress, receiverType);
				re.retrieve();
			}
		}).start();
	}
	
	private void synretrievePassword(String receiverAddress,  int receiverType){
		MyLogger.e(TAG, "synretrievePassword");
	}
	@Override
	public void setKeyValueInfo(final setKeyvalueEvent ke, final KeyValue kv) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synSetKeyValueInfo(kv);
				ke.onSet();
			}
		}).start();
	}

	@Override
	public void synSetKeyValueInfo(KeyValue kv) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "synSetKeyValueInfo");
	}

	@Override
	public void getKeyvalue(final getKeyvalueEvent ke, final String key) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				syngetKeyvalue(key);
				ke.OnGet();
			}
		}).start();
	}

	@Override
	public KeyValue syngetKeyvalue(String key) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "syngetKeyvalue");
		return null;
	}

	@Override
	public void deleteKeyValueInfo(final deleteKeyvalueEvent de, final String key) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				syngetKeyvalue(key);
				de.onDelete();
			}
		}).start();
	}

	@Override
	public void syndeleteKeyValueInfo(String key) {
		// TODO Auto-generated method stub
		MyLogger.e(TAG, "syndeleteKeyValueInfo");
	}

	@Override
	public void sendLocalBeatNow() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MyLogger.i(TAG ,"sendLocalBeatNow");
			}
		}).start();
	}
	
	
	
	
	private void CommetSetGet(){
		
	}
	
	
	public interface OnLoginEvent{
		void onLogin();
	}

	public interface OnLogoutEvent{
		void OnLogout();
	}

	public interface OnGetUser{
		void getUser();
	}

	public interface OnGetModuleEvent{
		void ongetModuleList();
	}

	public interface SetModuleCallBack{
		void onSetModule();
	}

	public interface OnDeleteModuleCallBack{
		void onDelete();
	}

	public interface GetModuleEvent{
		void onget();
	}
	public interface getCapchaImageEvent{
		void onGet();
	}

	public interface registEvent{
		void onregist();
	}

	public interface setUserEvent{
		void onSet();
	}

	public interface changePswdEvent{
		void onchange();
	}

	public interface retrievePasswordEvent{
		void retrieve();
	}

	public interface setKeyvalueEvent{
		void onSet();
	}

	public interface getKeyvalueEvent{
		void OnGet();
	}

	public interface deleteKeyvalueEvent{
		void onDelete();
	}

}
