package com.discord.share.react.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.a2;
import wi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/share/react/events/ShareBroadcastReceiverAppClicked;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "app", "", "location", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getApp", "()Ljava/lang/String;", "getLocation", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ShareBroadcastReceiverAppClicked implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String app;
    private final String location;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/share/react/events/ShareBroadcastReceiverAppClicked$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/share/react/events/ShareBroadcastReceiverAppClicked;", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareBroadcastReceiverAppClicked> serializer() {
            return ShareBroadcastReceiverAppClicked$$serializer.INSTANCE;
        }
    }

    public  ShareBroadcastReceiverAppClicked(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, ShareBroadcastReceiverAppClicked$$serializer.INSTANCE.getDescriptor());
        }
        this.app = str;
        this.location = str2;
    }

    public static  ShareBroadcastReceiverAppClicked copy$default(ShareBroadcastReceiverAppClicked shareBroadcastReceiverAppClicked, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareBroadcastReceiverAppClicked.app;
        }
        if ((i10 & 2) != 0) {
            str2 = shareBroadcastReceiverAppClicked.location;
        }
        return shareBroadcastReceiverAppClicked.copy(str, str2);
    }

    public static final void write$Self(ShareBroadcastReceiverAppClicked self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.app);
        output.B(serialDesc, 1, a2.f29764a, self.location);
    }

    public final String component1() {
        return this.app;
    }

    public final String component2() {
        return this.location;
    }

    public final ShareBroadcastReceiverAppClicked copy(String app, String str) {
        q.h(app, "app");
        return new ShareBroadcastReceiverAppClicked(app, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareBroadcastReceiverAppClicked)) {
            return false;
        }
        ShareBroadcastReceiverAppClicked shareBroadcastReceiverAppClicked = (ShareBroadcastReceiverAppClicked) obj;
        return q.c(this.app, shareBroadcastReceiverAppClicked.app) && q.c(this.location, shareBroadcastReceiverAppClicked.location);
    }

    public final String getApp() {
        return this.app;
    }

    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        int hashCode = this.app.hashCode() * 31;
        String str = this.location;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override 
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.app;
        String str2 = this.location;
        return "ShareBroadcastReceiverAppClicked(app=" + str + ", location=" + str2 + ")";
    }

    public ShareBroadcastReceiverAppClicked(String app, String str) {
        q.h(app, "app");
        this.app = app;
        this.location = str;
    }
}
