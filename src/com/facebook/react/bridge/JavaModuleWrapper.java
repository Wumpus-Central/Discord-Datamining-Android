package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.config.ReactFeatureFlags;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p078e6.AbstractC6709a;
import p130h6.C7927a;
import p130h6.C7928b;

@AbstractC6709a
/* loaded from: classes7.dex */
public class JavaModuleWrapper {
    private static final String TAG = "JavaModuleWrapper";
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @AbstractC6709a
    /* loaded from: classes7.dex */
    public class MethodDescriptor {
        @AbstractC6709a
        Method method;
        @AbstractC6709a
        String name;
        @AbstractC6709a
        String signature;
        @AbstractC6709a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @AbstractC6709a
    private void findMethods() {
        Method[] declaredMethods;
        C7927a.m21142c(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    String type = javaMethodWrapper.getType();
                    methodDescriptor.type = type;
                    if (type == BaseJavaModule.METHOD_TYPE_SYNC) {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        C7927a.m21138g(0L);
    }

    @AbstractC6709a
    public NativeMap getConstants() {
        if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling getConstants() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C7928b.m21131a(0L, "JavaModuleWrapper.getConstants").mo21128b("moduleName", name).mo21127c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C7927a.m21142c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        C7927a.m21138g(0L);
        C7927a.m21142c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C7927a.m21138g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C7928b.m21130b(0L).mo21127c();
        }
    }

    @AbstractC6709a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @AbstractC6709a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @AbstractC6709a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @AbstractC6709a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling method on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
                String str2 = TAG;
                ReactSoftExceptionLogger.logSoftException(str2, new ReactNoCrashSoftException("Calling " + this.mDescs.get(i).name + "() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
            }
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
