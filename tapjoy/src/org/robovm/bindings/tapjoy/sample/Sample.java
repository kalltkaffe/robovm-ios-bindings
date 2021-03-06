
package org.robovm.bindings.tapjoy.sample;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;

/** Basic usage of the Tapjoy SDK. */
public class Sample extends UIApplicationDelegateAdapter {
	@Override
	public void didFinishLaunching (UIApplication application) {

	}

	public static void main (String[] argv) {
		try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
			UIApplication.main(argv, null, Sample.class);
		}
	}
}
