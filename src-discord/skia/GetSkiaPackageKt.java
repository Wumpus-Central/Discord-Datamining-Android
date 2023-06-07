package com.discord.skia;

import android.view.View;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.shopify.reactnative.skia.RNSkiaPackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0005\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0002\u001a\r\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"getSkiaPackage", "Lcom/facebook/react/ReactPackage;", "getSkiaPackageClass", "Ljava/lang/Class;", "getSkiaPackageDummy", "com/discord/skia/GetSkiaPackageKt$getSkiaPackageDummy$1", "()Lcom/discord/skia/GetSkiaPackageKt$getSkiaPackageDummy$1;", "skia_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetSkiaPackageKt {
    public static final ReactPackage getSkiaPackage() {
        Class<?> skiaPackageClass = getSkiaPackageClass();
        if (skiaPackageClass == null) {
            return getSkiaPackageDummy();
        }
        Object newInstance = skiaPackageClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        q.e(newInstance, "null cannot be cast to non-null type com.facebook.react.ReactPackage");
        return (ReactPackage) newInstance;
    }

    private static final Class<?> getSkiaPackageClass() {
        return RNSkiaPackage.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.discord.skia.GetSkiaPackageKt$getSkiaPackageDummy$1] */
    private static final GetSkiaPackageKt$getSkiaPackageDummy$1 getSkiaPackageDummy() {
        return new ReactPackage() { // from class: com.discord.skia.GetSkiaPackageKt$getSkiaPackageDummy$1
            @Override // com.facebook.react.ReactPackage
            public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
                List<NativeModule> d10;
                q.g(reactContext, "reactContext");
                d10 = i.d(new RNSkiaModuleDummy());
                return d10;
            }

            @Override // com.facebook.react.ReactPackage
            public List<ViewManager<View, ReactShadowNode<?>>> createViewManagers(ReactApplicationContext reactContext) {
                q.g(reactContext, "reactContext");
                return new ArrayList();
            }
        };
    }
}
