package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.List;
import p130h6.C7927a;

@Deprecated
/* loaded from: classes7.dex */
public class UIImplementationProvider {
    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        C7927a.m21142c(0L, "UIImplementationProvider.createUIImplementation[1]");
        try {
            return new UIImplementation(reactApplicationContext, viewManagerResolver, eventDispatcher, i);
        } finally {
            C7927a.m21138g(0L);
        }
    }

    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i) {
        C7927a.m21142c(0L, "UIImplementationProvider.createUIImplementation[2]");
        try {
            return new UIImplementation(reactApplicationContext, list, eventDispatcher, i);
        } finally {
            C7927a.m21138g(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i) {
        C7927a.m21142c(0L, "UIImplementationProvider.createUIImplementation[3]");
        try {
            return new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcher, i);
        } finally {
            C7927a.m21138g(0L);
        }
    }
}
