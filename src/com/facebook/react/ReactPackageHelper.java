package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import java.util.Iterator;
import java.util.List;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class ReactPackageHelper {
    public static Iterable<ModuleHolder> getNativeModuleIterator(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        final List<NativeModule> list;
        C13925a.m2296b(ReactConstants.TAG, reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (reactPackage instanceof ReactInstancePackage) {
            list = ((ReactInstancePackage) reactPackage).createNativeModules(reactApplicationContext, reactInstanceManager);
        } else {
            list = reactPackage.createNativeModules(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() { // from class: com.facebook.react.ReactPackageHelper.1

            /* renamed from: com.facebook.react.ReactPackageHelper$1$1 */
            /* loaded from: classes7.dex */
            class C01271 implements Iterator<ModuleHolder>, p163j$.util.Iterator {
                int position = 0;

                C01271() {
                }

                @Override // p163j$.util.Iterator
                public /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Iterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // java.util.Iterator
                public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super ModuleHolder> consumer) {
                    forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                }

                @Override // java.util.Iterator, p163j$.util.Iterator
                public boolean hasNext() {
                    return this.position < list.size();
                }

                @Override // java.util.Iterator, p163j$.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Cannot remove methods ");
                }

                @Override // java.util.Iterator, p163j$.util.Iterator
                public ModuleHolder next() {
                    List list = list;
                    int i = this.position;
                    this.position = i + 1;
                    return new ModuleHolder((NativeModule) list.get(i));
                }
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<ModuleHolder> iterator() {
                return new C01271();
            }
        };
    }
}
