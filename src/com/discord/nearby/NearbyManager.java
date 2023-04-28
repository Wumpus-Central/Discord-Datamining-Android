package com.discord.nearby;

import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12694d;
import p442ya.AbstractC14327b;
import p442ya.AbstractC14329d;
import p442ya.AbstractC14334h;
import p442ya.C14335i;
import va.C13484a;

@Metadata(m15074d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001\u0015\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBC\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/nearby/NearbyManager;", "Lya/b;", "", "message", "", "setOutboundMessage", "Landroid/content/Context;", "context", "disableNearby", "enableNearby", "Lcom/google/android/gms/nearby/messages/Message;", "onFound", "onLost", "Lkotlin/Function1;", "onFoundUser", "Lkotlin/jvm/functions/Function1;", "onLostUser", "onError", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "subscribeOptions", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "com/discord/nearby/NearbyManager$statusCallback$1", "statusCallback", "Lcom/discord/nearby/NearbyManager$statusCallback$1;", "outboundMessage", "Lcom/google/android/gms/nearby/messages/Message;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "nearby_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class NearbyManager extends AbstractC14327b {
    public static final Companion Companion = new Companion(null);
    public static final String PERMISSION_DENIED = "1";
    private final Function1<String, Unit> onError;
    private final Function1<String, Unit> onFoundUser;
    private final Function1<String, Unit> onLostUser;
    private Message outboundMessage;
    private final NearbyManager$statusCallback$1 statusCallback = new AbstractC14334h() { // from class: com.discord.nearby.NearbyManager$statusCallback$1
        @Override // p442ya.AbstractC14334h
        public void onPermissionChanged(boolean z) {
            Function1 function1;
            super.onPermissionChanged(z);
            if (!z) {
                function1 = NearbyManager.this.onError;
                function1.invoke(NearbyManager.PERMISSION_DENIED);
            }
        }
    };
    private final SubscribeOptions subscribeOptions;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/nearby/NearbyManager$Companion;", "", "()V", "PERMISSION_DENIED", "", "nearby_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
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
        C9971q.m14633g(onFoundUser, "onFoundUser");
        C9971q.m14633g(onLostUser, "onLostUser");
        C9971q.m14633g(onError, "onError");
        this.onFoundUser = onFoundUser;
        this.onLostUser = onLostUser;
        this.onError = onError;
        SubscribeOptions a = new SubscribeOptions.C5431a().m28930b(C14335i.f32454s).m28931a();
        C9971q.m14634f(a, "Builder()\n        .setSt…DEFAULT)\n        .build()");
        this.subscribeOptions = a;
    }

    public final void disableNearby(Context context) {
        C9971q.m14633g(context, "context");
        AbstractC14329d a = C13484a.m3605a(context);
        a.mo825g(this.statusCallback);
        Message message = this.outboundMessage;
        if (message == null) {
            C9971q.m14615y("outboundMessage");
            message = null;
        }
        a.mo827d(message);
        a.mo826e(this);
    }

    public final void enableNearby(Context context) {
        C9971q.m14633g(context, "context");
        Message message = this.outboundMessage;
        if (message == null) {
            C9971q.m14615y("outboundMessage");
            message = null;
        }
        AbstractC14329d a = C13484a.m3605a(context);
        a.mo830a(this.statusCallback);
        a.mo828c(message);
        a.mo829b(this, this.subscribeOptions);
    }

    @Override // p442ya.AbstractC14327b
    public void onFound(Message message) {
        C9971q.m14633g(message, "message");
        super.onFound(message);
        Function1<String, Unit> function1 = this.onFoundUser;
        byte[] p = message.m28937p();
        C9971q.m14634f(p, "message.content");
        function1.invoke(new String(p, C12694d.f28536b));
    }

    @Override // p442ya.AbstractC14327b
    public void onLost(Message message) {
        C9971q.m14633g(message, "message");
        super.onLost(message);
        Function1<String, Unit> function1 = this.onLostUser;
        byte[] p = message.m28937p();
        C9971q.m14634f(p, "message.content");
        function1.invoke(new String(p, C12694d.f28536b));
    }

    public final void setOutboundMessage(String message) {
        C9971q.m14633g(message, "message");
        byte[] bytes = message.getBytes(C12694d.f28536b);
        C9971q.m14634f(bytes, "this as java.lang.String).getBytes(charset)");
        this.outboundMessage = new Message(bytes);
    }
}
