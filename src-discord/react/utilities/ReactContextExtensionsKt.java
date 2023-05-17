package com.discord.react.utilities;

import android.view.View;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a:\u0010\u0004\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007*\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"jsiId", "", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "Lcom/facebook/react/bridge/ReactContext;", "uiManagerResolveView", "", "T", "Landroid/view/View;", "tag", "", "onView", "Lkotlin/Function1;", "react_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactContextExtensionsKt {
    public static final long jsiId(ReactContext reactContext) {
        q.g(reactContext, "<this>");
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        q.f(javaScriptContextHolder, "javaScriptContextHolder");
        return jsiId(javaScriptContextHolder);
    }

    public static final /* synthetic */ <T extends View> void uiManagerResolveView(ReactContext reactContext, final int i10, final Function1<? super T, Unit> onView) {
        q.g(reactContext, "<this>");
        q.g(onView, "onView");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        q.d(nativeModule);
        q.l();
        ((UIManagerModule) nativeModule).addUIBlock(new UIBlock() { // from class: com.discord.react.utilities.ReactContextExtensionsKt$uiManagerResolveView$1
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Function1<T, Unit> function1 = onView;
                View resolveView = nativeViewHierarchyManager.resolveView(i10);
                q.m(1, "T");
                function1.invoke(resolveView);
            }
        });
    }

    public static final long jsiId(JavaScriptContextHolder javaScriptContextHolder) {
        q.g(javaScriptContextHolder, "<this>");
        long j10 = javaScriptContextHolder.get();
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("JSI Runtime is not available.".toString());
    }
}
