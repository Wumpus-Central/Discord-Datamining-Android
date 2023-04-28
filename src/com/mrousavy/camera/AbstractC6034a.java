package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, m15073d2 = {"Lcom/mrousavy/camera/a;", "", "", "k", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "domain", "l", "b", "id", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.a */
/* loaded from: classes6.dex */
public abstract class AbstractC6034a extends Throwable {

    /* renamed from: k */
    private final String f12300k;

    /* renamed from: l */
    private final String f12301l;

    public /* synthetic */ AbstractC6034a(String str, String str2, String str3, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : th2);
    }

    /* renamed from: a */
    public final String m26398a() {
        return this.f12300k;
    }

    /* renamed from: b */
    public final String m26397b() {
        return this.f12301l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6034a(String domain, String id2, String message, Throwable th2) {
        super('[' + domain + '/' + id2 + "] " + message, th2);
        C9971q.m14633g(domain, "domain");
        C9971q.m14633g(id2, "id");
        C9971q.m14633g(message, "message");
        this.f12300k = domain;
        this.f12301l = id2;
    }
}
