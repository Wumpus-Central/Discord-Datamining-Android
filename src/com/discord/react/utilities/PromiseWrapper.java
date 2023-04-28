package com.discord.react.utilities;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B?\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J0\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/react/utilities/PromiseWrapper;", "Lcom/facebook/react/bridge/Promise;", "", "value", "", "resolve", "", "code", "message", "reject", "", "throwable", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Lkotlin/Function1;", "resolveTransform", "Lkotlin/jvm/functions/Function1;", "Lcom/discord/react/utilities/PromiseWrapper$Rejection;", "rejectTransform", "<init>", "(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Rejection", "react_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PromiseWrapper implements Promise {
    private final Promise promise;
    private final Function1<Rejection, Rejection> rejectTransform;
    private final Function1<Object, Object> resolveTransform;

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "it", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.react.utilities.PromiseWrapper$1 */
    /* loaded from: classes3.dex */
    static final class C36001 extends AbstractC9679s implements Function1<Object, Object> {
        public static final C36001 INSTANCE = new C36001();

        C36001() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "Lcom/discord/react/utilities/PromiseWrapper$Rejection;", "it", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.react.utilities.PromiseWrapper$2 */
    /* loaded from: classes3.dex */
    static final class C36012 extends AbstractC9679s implements Function1<Rejection, Rejection> {
        public static final C36012 INSTANCE = new C36012();

        C36012() {
            super(1);
        }

        public final Rejection invoke(Rejection it) {
            C9677q.m14633g(it, "it");
            return it;
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/react/utilities/PromiseWrapper$Rejection;", "", "code", "", "message", "throwable", "", "userInfo", "Lcom/facebook/react/bridge/WritableMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getThrowable", "()Ljava/lang/Throwable;", "getUserInfo", "()Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "react_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes3.dex */
    public static final class Rejection {
        private final String code;
        private final String message;
        private final Throwable throwable;
        private final WritableMap userInfo;

        public Rejection(String str, String str2, Throwable th2, WritableMap writableMap) {
            this.code = str;
            this.message = str2;
            this.throwable = th2;
            this.userInfo = writableMap;
        }

        public static /* synthetic */ Rejection copy$default(Rejection rejection, String str, String str2, Throwable th2, WritableMap writableMap, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rejection.code;
            }
            if ((i & 2) != 0) {
                str2 = rejection.message;
            }
            if ((i & 4) != 0) {
                th2 = rejection.throwable;
            }
            if ((i & 8) != 0) {
                writableMap = rejection.userInfo;
            }
            return rejection.copy(str, str2, th2, writableMap);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final WritableMap component4() {
            return this.userInfo;
        }

        public final Rejection copy(String str, String str2, Throwable th2, WritableMap writableMap) {
            return new Rejection(str, str2, th2, writableMap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rejection)) {
                return false;
            }
            Rejection rejection = (Rejection) obj;
            return C9677q.m14638b(this.code, rejection.code) && C9677q.m14638b(this.message, rejection.message) && C9677q.m14638b(this.throwable, rejection.throwable) && C9677q.m14638b(this.userInfo, rejection.userInfo);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final WritableMap getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            String str = this.code;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Throwable th2 = this.throwable;
            int hashCode3 = (hashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31;
            WritableMap writableMap = this.userInfo;
            if (writableMap != null) {
                i = writableMap.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            String str = this.code;
            String str2 = this.message;
            Throwable th2 = this.throwable;
            WritableMap writableMap = this.userInfo;
            return "Rejection(code=" + str + ", message=" + str2 + ", throwable=" + th2 + ", userInfo=" + writableMap + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromiseWrapper(Promise promise, Function1<Object, ? extends Object> resolveTransform, Function1<? super Rejection, Rejection> rejectTransform) {
        C9677q.m14633g(promise, "promise");
        C9677q.m14633g(resolveTransform, "resolveTransform");
        C9677q.m14633g(rejectTransform, "rejectTransform");
        this.promise = promise;
        this.resolveTransform = resolveTransform;
        this.rejectTransform = rejectTransform;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, str2, null, null));
        this.promise.reject(invoke.getCode(), invoke.getMessage());
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        this.promise.resolve(this.resolveTransform.invoke(obj));
    }

    public /* synthetic */ PromiseWrapper(Promise promise, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(promise, (i & 2) != 0 ? C36001.INSTANCE : function1, (i & 4) != 0 ? C36012.INSTANCE : function12);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th2) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, null, th2, null));
        this.promise.reject(invoke.getCode(), invoke.getThrowable());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th2) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, str2, th2, null));
        this.promise.reject(invoke.getCode(), invoke.getMessage(), invoke.getThrowable());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th2) {
        this.promise.reject(this.rejectTransform.invoke(new Rejection(null, null, th2, null)).getThrowable());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th2, WritableMap writableMap) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(null, null, th2, writableMap));
        this.promise.reject(invoke.getThrowable(), invoke.getUserInfo());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, WritableMap userInfo) {
        C9677q.m14633g(userInfo, "userInfo");
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, null, null, userInfo));
        Promise promise = this.promise;
        String code = invoke.getCode();
        WritableMap userInfo2 = invoke.getUserInfo();
        C9677q.m14636d(userInfo2);
        promise.reject(code, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th2, WritableMap writableMap) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, null, th2, writableMap));
        this.promise.reject(invoke.getCode(), invoke.getThrowable(), invoke.getUserInfo());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, WritableMap userInfo) {
        C9677q.m14633g(userInfo, "userInfo");
        Rejection invoke = this.rejectTransform.invoke(new Rejection(null, str2, null, userInfo));
        Promise promise = this.promise;
        String code = invoke.getCode();
        String message = invoke.getMessage();
        WritableMap userInfo2 = invoke.getUserInfo();
        C9677q.m14636d(userInfo2);
        promise.reject(code, message, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str) {
        this.promise.reject(this.rejectTransform.invoke(new Rejection(null, str, null, null)).getMessage());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th2, WritableMap writableMap) {
        Rejection invoke = this.rejectTransform.invoke(new Rejection(str, str2, th2, writableMap));
        this.promise.reject(invoke.getCode(), invoke.getMessage(), invoke.getThrowable(), invoke.getUserInfo());
    }
}
