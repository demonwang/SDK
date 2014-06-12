package com.hf.helper;

import java.util.ArrayList;

import com.hf.ctrlCenter.CouldHelper.*;
import com.hf.info.CapchaImageInfo;
import com.hf.info.KeyValue;
import com.hf.info.ModuleInfo;
import com.hf.info.UserInfo;

public interface ICouldHelper {	
	
	void login(OnLoginEvent ol);
	void synLogin();
	
	void logout(OnLogoutEvent olo);
	void synLogout();
	
	void getUser(OnGetUser gu);
	UserInfo synGetUser();
	
	void getModuleList(OnGetModuleEvent gm);
	ArrayList<ModuleInfo> syngetModuleList();
	
	void setModule(SetModuleCallBack cb,ModuleInfo mi);
	ModuleInfo synsetModule(ModuleInfo mi);
	
	void deleteModule(OnDeleteModuleCallBack cb,String mac);
	void synDeleteModule(String mac);
	
	
	void getModule(GetModuleEvent ev ,String mac);
	ModuleInfo syngetModule(String mac);
	
	
	void getCapchaImage(getCapchaImageEvent ev);
	CapchaImageInfo syngetcapchaImage();
	
	void registerUser(registEvent re,UserInfo ui,String capcha);
	void synregisterUser(UserInfo ui,String capcha);
	
	void setUser(setUserEvent ue,UserInfo ui);
	void synsetUser(UserInfo ui);
	
	void changePswd(changePswdEvent pe,String oldpswd,String newpswd);
	void synchangePswd(String oldpswd,String newpswd);
	//RECEIVER_TYPE_EMAIL 
	void retrievePassword(retrievePasswordEvent re,String receiverAddress, int receiverType);
	
	void setKeyValueInfo(setKeyvalueEvent ke,KeyValue kv);
	void synSetKeyValueInfo(KeyValue kv);
	
	
	void getKeyvalue(getKeyvalueEvent ke,String key);
	KeyValue syngetKeyvalue(String key);
	
	
	void deleteKeyValueInfo(deleteKeyvalueEvent de,String key);
	void syndeleteKeyValueInfo(String key);
	
	 void sendLocalBeatNow();
}
