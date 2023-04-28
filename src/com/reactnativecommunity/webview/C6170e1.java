package com.reactnativecommunity.webview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9905i;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m15073d2 = {"Lcom/reactnativecommunity/webview/e1;", "Lcom/facebook/react/ReactPackage;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/reactnativecommunity/webview/RNCWebViewModule;", "createNativeModules", "Lcom/reactnativecommunity/webview/RNCWebViewManager;", "createViewManagers", "<init>", "()V", "react-native-webview_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.reactnativecommunity.webview.e1 */
/* loaded from: classes6.dex */
public final class C6170e1 implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<RNCWebViewModule> createNativeModules(ReactApplicationContext reactContext) {
        List<RNCWebViewModule> d;
        C9971q.m14633g(reactContext, "reactContext");
        d = C9905i.m14825d(new RNCWebViewModule(reactContext));
        return d;
    }

    @Override // com.facebook.react.ReactPackage
    public List<RNCWebViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<RNCWebViewManager> d;
        C9971q.m14633g(reactContext, "reactContext");
        d = C9905i.m14825d(new RNCWebViewManager());
        return d;
    }
}
