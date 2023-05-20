package com.discord.nearby;

import ab.a;
import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import db.b;
import db.d;
import db.h;
import db.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001\u0015\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBC\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/discord/nearby/NearbyManager;", "Ldb/b;", "", "message", "", "setOutboundMessage", "Landroid/content/Context;", "context", "disableNearby", "enableNearby", "Lcom/google/android/gms/nearby/messages/Message;", "onFound", "onLost", "Lkotlin/Function1;", "onFoundUser", "Lkotlin/jvm/functions/Function1;", "onLostUser", "onError", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "subscribeOptions", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "com/discord/nearby/NearbyManager$statusCallback$1", "statusCallback", "Lcom/discord/nearby/NearbyManager$statusCallback$1;", "outboundMessage", "Lcom/google/android/gms/nearby/messages/Message;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "nearby_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class NearbyManager extends b {
    public static final Companion Companion = new Companion(null);
    public static final String PERMISSION_DENIED = "1";
    private final Function1<String, Unit> onError;
    private final Function1<String, Unit> onFoundUser;
    private final Function1<String, Unit> onLostUser;
    private Message outboundMessage;
    private final NearbyManager$statusCallback$1 statusCallback = new h() { // from class: com.discord.nearby.NearbyManager$statusCallback$1
        @Override // db.h
        public void onPermissionChanged(boolean z10) {
            Function1 function1;
            super.onPermissionChanged(z10);
            if (!z10) {
                function1 = NearbyManager.this.onError;
                function1.invoke(NearbyManager.PERMISSION_DENIED);
            }
        }
    };
    private final SubscribeOptions subscribeOptions;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/nearby/NearbyManager$Companion;", "", "()V", "PERMISSION_DENIED", "", "nearby_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.discord.nearby.NearbyManager$statusCallback$1] */
    public NearbyManager(Function1<? super String, Unit> onFoundUser, Function1<? super String, Unit> onLostUser, Function1<? super String, Unit> onError) {
        q.g(onFoundUser, "onFoundUser");
        q.g(onLostUser, "onLostUser");
        q.g(onError, "onError");
        this.onFoundUser = onFoundUser;
        this.onLostUser = onLostUser;
        this.onError = onError;
        SubscribeOptions a10 = new SubscribeOptions.a().b(i.f14114s).a();
        q.f(a10, "Builder()\n        .setSt…DEFAULT)\n        .build()");
        this.subscribeOptions = a10;
    }

    public final void disableNearby(Context context) {
        q.g(context, "context");
        d a10 = a.a(context);
        a10.g(this.statusCallback);
        Message message = this.outboundMessage;
        if (message == null) {
            q.y("outboundMessage");
            message = null;
        }
        a10.d(message);
        a10.e(this);
    }

    public final void enableNearby(Context context) {
        q.g(context, "context");
        Message message = this.outboundMessage;
        if (message == null) {
            q.y("outboundMessage");
            message = null;
        }
        d a10 = a.a(context);
        a10.a(this.statusCallback);
        a10.b(message);
        a10.f(this, this.subscribeOptions);
    }

    @Override // db.b
    public void onFound(Message message) {
        q.g(message, "message");
        super.onFound(message);
        Function1<String, Unit> function1 = this.onFoundUser;
        byte[] k10 = message.k();
        q.f(k10, "message.content");
        function1.invoke(new String(k10, nj.d.f25901b));
    }

    @Override // db.b
    public void onLost(Message message) {
        q.g(message, "message");
        super.onLost(message);
        Function1<String, Unit> function1 = this.onLostUser;
        byte[] k10 = message.k();
        q.f(k10, "message.content");
        function1.invoke(new String(k10, nj.d.f25901b));
    }

    public final void setOutboundMessage(String message) {
        q.g(message, "message");
        byte[] bytes = message.getBytes(nj.d.f25901b);
        q.f(bytes, "this as java.lang.String).getBytes(charset)");
        this.outboundMessage = new Message(bytes);
    }
}
