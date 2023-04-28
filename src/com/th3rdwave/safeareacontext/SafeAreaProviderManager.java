package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import java.util.Map;

/* loaded from: classes8.dex */
public class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> {
    private final ReactApplicationContext mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$a */
    /* loaded from: classes8.dex */
    public class C6348a implements SafeAreaProvider.AbstractC6347a {

        /* renamed from: a */
        final /* synthetic */ EventDispatcher f12950a;

        C6348a(EventDispatcher eventDispatcher) {
            this.f12950a = eventDispatcher;
        }

        @Override // com.th3rdwave.safeareacontext.SafeAreaProvider.AbstractC6347a
        public void onInsetsChange(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
            this.f12950a.dispatchEvent(new C6349a(safeAreaProvider.getId(), edgeInsets, rect));
        }
    }

    public SafeAreaProviderManager(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private Map<String, Object> getInitialWindowMetrics() {
        ViewGroup viewGroup;
        View findViewById;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView()) == null || (findViewById = viewGroup.findViewById(16908290)) == null) {
            return null;
        }
        EdgeInsets c = C6351c.m25779c(viewGroup);
        Rect a = C6351c.m25781a(viewGroup, findViewById);
        if (c == null || a == null) {
            return null;
        }
        return MapBuilder.m30830of("insets", C6358i.m25768a(c), "frame", C6358i.m25766c(a));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("topInsetsChange", MapBuilder.m30831of("registrationName", "onInsetsChange")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.m30831of("initialWindowMetrics", getInitialWindowMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, SafeAreaProvider safeAreaProvider) {
        safeAreaProvider.setOnInsetsChangeListener(new C6348a(((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaProvider createViewInstance(ThemedReactContext themedReactContext) {
        return new SafeAreaProvider(themedReactContext);
    }
}
