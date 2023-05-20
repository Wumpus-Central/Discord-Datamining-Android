package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.n1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/chat/reactevents/TapCancelUploadItemData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "uploaderId", "", "itemId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getUploaderId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class TapCancelUploadItemData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String itemId;
    private final String uploaderId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapCancelUploadItemData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapCancelUploadItemData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapCancelUploadItemData> serializer() {
            return TapCancelUploadItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapCancelUploadItemData(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, TapCancelUploadItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.uploaderId = str;
        this.itemId = str2;
    }

    public static /* synthetic */ TapCancelUploadItemData copy$default(TapCancelUploadItemData tapCancelUploadItemData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapCancelUploadItemData.uploaderId;
        }
        if ((i10 & 2) != 0) {
            str2 = tapCancelUploadItemData.itemId;
        }
        return tapCancelUploadItemData.copy(str, str2);
    }

    public static final void write$Self(TapCancelUploadItemData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.uploaderId);
        output.y(serialDesc, 1, self.itemId);
    }

    public final String component1() {
        return this.uploaderId;
    }

    public final String component2() {
        return this.itemId;
    }

    public final TapCancelUploadItemData copy(String uploaderId, String itemId) {
        q.g(uploaderId, "uploaderId");
        q.g(itemId, "itemId");
        return new TapCancelUploadItemData(uploaderId, itemId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapCancelUploadItemData)) {
            return false;
        }
        TapCancelUploadItemData tapCancelUploadItemData = (TapCancelUploadItemData) obj;
        return q.b(this.uploaderId, tapCancelUploadItemData.uploaderId) && q.b(this.itemId, tapCancelUploadItemData.itemId);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public int hashCode() {
        return (this.uploaderId.hashCode() * 31) + this.itemId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.uploaderId;
        String str2 = this.itemId;
        return "TapCancelUploadItemData(uploaderId=" + str + ", itemId=" + str2 + ")";
    }

    public TapCancelUploadItemData(String uploaderId, String itemId) {
        q.g(uploaderId, "uploaderId");
        q.g(itemId, "itemId");
        this.uploaderId = uploaderId;
        this.itemId = itemId;
    }
}
