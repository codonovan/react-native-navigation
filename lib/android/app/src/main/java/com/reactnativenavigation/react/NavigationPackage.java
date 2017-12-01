package com.reactnativenavigation.react;

import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativenavigation.react.coordinator.CoordinatorLayoutManager;
import com.reactnativenavigation.react.coordinator.FloatingActionButtonManager;
import com.reactnativenavigation.react.coordinator.NestedScrollViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NavigationPackage implements ReactPackage {

	private ReactNativeHost reactNativeHost;

	public NavigationPackage(final ReactNativeHost reactNativeHost) {
		this.reactNativeHost = reactNativeHost;
	}

	@Override
	public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
		return Arrays.<NativeModule>asList(
				new NavigationModule(reactContext, reactNativeHost.getReactInstanceManager())
		);
	}

	public List<Class<? extends JavaScriptModule>> createJSModules() {
		return Collections.emptyList();
	}

	@Override
	public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
		return Arrays.<ViewManager>asList(
				new CoordinatorLayoutManager(),
				new FloatingActionButtonManager(),
				new NestedScrollViewManager()
		);
	}
}
