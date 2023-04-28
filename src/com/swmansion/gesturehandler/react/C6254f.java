package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.AbstractC6836e;
import p085ef.C6832d;
import p085ef.C6847m;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000e\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0012\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0013\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0014\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\u0006\u0010\u0015\u001a\u00020\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/f;", "Lef/e;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "key", "", "f", "", "handlerTag", "", "g", "Lef/d;", "handler", "e", "otherHandler", "", "c", "d", "b", "a", "h", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "waitForRelations", "simultaneousRelations", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.f */
/* loaded from: classes8.dex */
public final class C6254f implements AbstractC6836e {

    /* renamed from: c */
    public static final C6255a f12703c = new C6255a(null);

    /* renamed from: a */
    private final SparseArray<int[]> f12704a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<int[]> f12705b = new SparseArray<>();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/f$a;", "", "", "KEY_SIMULTANEOUS_HANDLERS", "Ljava/lang/String;", "KEY_WAIT_FOR", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.f$a */
    /* loaded from: classes8.dex */
    public static final class C6255a {
        private C6255a() {
        }

        public /* synthetic */ C6255a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    private final int[] m26005f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        C9971q.m14636d(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    @Override // p085ef.AbstractC6836e
    /* renamed from: a */
    public boolean mo24159a(C6832d<?> handler, C6832d<?> otherHandler) {
        boolean z;
        C9971q.m14633g(handler, "handler");
        C9971q.m14633g(otherHandler, "otherHandler");
        int[] iArr = this.f12705b.get(handler.m24225P());
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == otherHandler.m24225P()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p085ef.AbstractC6836e
    /* renamed from: b */
    public boolean mo24158b(C6832d<?> handler, C6832d<?> otherHandler) {
        C9971q.m14633g(handler, "handler");
        C9971q.m14633g(otherHandler, "otherHandler");
        if (otherHandler instanceof C6847m) {
            return ((C6847m) otherHandler).m24100K0();
        }
        return false;
    }

    @Override // p085ef.AbstractC6836e
    /* renamed from: c */
    public boolean mo24157c(C6832d<?> handler, C6832d<?> otherHandler) {
        boolean z;
        C9971q.m14633g(handler, "handler");
        C9971q.m14633g(otherHandler, "otherHandler");
        int[] iArr = this.f12704a.get(handler.m24225P());
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == otherHandler.m24225P()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p085ef.AbstractC6836e
    /* renamed from: d */
    public boolean mo24156d(C6832d<?> handler, C6832d<?> otherHandler) {
        C9971q.m14633g(handler, "handler");
        C9971q.m14633g(otherHandler, "otherHandler");
        return false;
    }

    /* renamed from: e */
    public final void m26006e(C6832d<?> handler, ReadableMap config) {
        C9971q.m14633g(handler, "handler");
        C9971q.m14633g(config, "config");
        handler.m24182u0(this);
        if (config.hasKey("waitFor")) {
            this.f12704a.put(handler.m24225P(), m26005f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f12705b.put(handler.m24225P(), m26005f(config, "simultaneousHandlers"));
        }
    }

    /* renamed from: g */
    public final void m26004g(int i) {
        this.f12704a.remove(i);
        this.f12705b.remove(i);
    }

    /* renamed from: h */
    public final void m26003h() {
        this.f12704a.clear();
        this.f12705b.clear();
    }
}
