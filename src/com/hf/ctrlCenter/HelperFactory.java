package com.hf.ctrlCenter;

import com.hf.helper.ICouldHelper;
import com.hf.helper.IGPIOHelper;
import com.hf.helper.IModuleHelper;
import com.hf.helper.ISystemManager;
import com.hf.helper.IPWMHelper;
import com.hf.helper.ITimerHelper;
import com.hf.helper.IZigbeeHelper;
import com.hf.module.GPIO.GPIOHelper;
import com.hf.module.pwm.PWMHelper;
import com.hf.module.zigbee.ZigbeeHelper;
import com.hf.timer.TimerHelper;

public class HelperFactory {
	private static ICouldHelper couldHelper = null;
	private static IModuleHelper moduleHelper = null;
	private static IPWMHelper pwmHelper = null;
	private static IZigbeeHelper zigbeeHelper = null;
	private static IGPIOHelper gpioHelper = null;
	private static ISystemManager moduleManager = null;
	private static ITimerHelper timerHelper = null;
	/**
	 * 
	 * @return
	 */
	public static ISystemManager getSystemanager() {
		if (moduleManager == null) {
			moduleManager = new ModuleManager();
		}
		return moduleManager;
	}

	/**
	 * 
	 * @return
	 */

	public static IModuleHelper getModuleHelper() {
		if (moduleHelper == null) {
			moduleHelper = new ModuleHelper();
		}
		return moduleHelper;
	}

	/**
	 * 
	 * @return
	 */
	public static ICouldHelper getCouldHelper() {
		if (couldHelper == null) {
			couldHelper = new CouldHelper();
		}
		return couldHelper;
	}

	/**
	 * 
	 * @return
	 */
	public static IGPIOHelper getGPIOHelper() {
		if (gpioHelper == null) {
			gpioHelper = new GPIOHelper();
		}
		return gpioHelper;
	}

	/**
	 * 
	 * @return
	 */
	public static ITimerHelper getTimerHelper() {
		if (timerHelper == null) {
			timerHelper = new TimerHelper();
		}
		return timerHelper;
	}

	/**
	 * 
	 * @return
	 */
	public static IPWMHelper getPWMHelper() {
		if (pwmHelper == null) {
			pwmHelper = new PWMHelper();
		}
		return pwmHelper;
	}

	/**
	 * 
	 * @return
	 */
	public static IZigbeeHelper getZIgbeeHelper() {
		if (zigbeeHelper == null) {
			zigbeeHelper = new ZigbeeHelper();
		}
		return zigbeeHelper;
	}
}
