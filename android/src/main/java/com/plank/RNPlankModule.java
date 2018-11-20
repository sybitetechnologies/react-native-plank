
package com.plank;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNPlankModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNPlankModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNPlank";
  }

  /**
   * PUBLIC REACT API
   *
   * isAvailable() Returns true if the fingerprint reader can be used
   */
  @ReactMethod
  public void isAvailable(final Promise promise) {
    try {
      promise.resolve(Build.VERSION.SDK_INT);
    } catch (Exception ex) {
      promise.reject("ERR_UNEXPECTED_EXCEPTION", ex);
    }
  }

}