package com.discord.react_resource_cache;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;
import java.lang.Enum;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/discord/react_resource_cache/ReactResourceModule;", "T", "", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cache", "Lcom/discord/react_resource_cache/ReactResourceCache;", "keys", "", "()[Ljava/lang/Enum;", "keysArray", "Lcom/facebook/react/bridge/WritableNativeArray;", "reactResources", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "values", "Lcom/facebook/react/bridge/ReadableArray;", "react_resource_cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class ReactResourceModule<T extends Enum<?>> extends ReactContextBaseJavaModule {
    
    public ReactResourceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
    }

    public abstract ReactResourceCache<T> cache();

    public abstract T[] keys();

    public final WritableNativeArray keysArray() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t10 : keys()) {
            writableNativeArray.pushString(t10.name());
        }
        return writableNativeArray;
    }

    public final HashMap<String, String> reactResources(ReadableArray values) {
        q.h(values, "values");
        HashMap<String, String> hashMap = new HashMap<>(values.size());
        T[] keys = keys();
        int length = keys.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            String name = keys[i10].name();
            String string = values.getString(i11);
            q.g(string, "values.getString(index)");
            hashMap.put(name, string);
            i10++;
            i11 = i12;
        }
        return hashMap;
    }
}
