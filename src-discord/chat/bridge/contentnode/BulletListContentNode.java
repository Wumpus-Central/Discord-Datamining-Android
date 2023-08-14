package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;
import wi.w0;

@f
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", ViewProps.START, "", "ordered", "", "items", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Long;ZLjava/util/List;)V", "getItems", "()Ljava/util/List;", "getOrdered", "()Z", "getStart", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;ZLjava/util/List;)Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BulletListContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<List<ContentNode>> items;
    private final boolean ordered;
    private final Long start;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BulletListContentNode> serializer() {
            return BulletListContentNode$$serializer.INSTANCE;
        }
    }

    
    public  BulletListContentNode(int i10, Long l10, boolean z10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (4 != (i10 & 4)) {
            n1.b(i10, 4, BulletListContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.start = null;
        } else {
            this.start = l10;
        }
        if ((i10 & 2) == 0) {
            this.ordered = false;
        } else {
            this.ordered = z10;
        }
        this.items = list;
    }

    
    public static  BulletListContentNode copy$default(BulletListContentNode bulletListContentNode, Long l10, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = bulletListContentNode.start;
        }
        if ((i10 & 2) != 0) {
            z10 = bulletListContentNode.ordered;
        }
        if ((i10 & 4) != 0) {
            list = bulletListContentNode.items;
        }
        return bulletListContentNode.copy(l10, z10, list);
    }

    public static final void write$Self(BulletListContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z11 = false;
        if (!output.w(serialDesc, 0) && self.start == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 0, w0.f29666a, self.start);
        }
        if (output.w(serialDesc, 1) || self.ordered) {
            z11 = true;
        }
        if (z11) {
            output.r(serialDesc, 1, self.ordered);
        }
        output.h(serialDesc, 2, new wi.f(new wi.f(ContentNodeSerializer.INSTANCE)), self.items);
    }

    public final Long component1() {
        return this.start;
    }

    public final boolean component2() {
        return this.ordered;
    }

    public final List<List<ContentNode>> component3() {
        return this.items;
    }

    public final BulletListContentNode copy(Long l10, boolean z10, List<? extends List<? extends ContentNode>> items) {
        q.h(items, "items");
        return new BulletListContentNode(l10, z10, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletListContentNode)) {
            return false;
        }
        BulletListContentNode bulletListContentNode = (BulletListContentNode) obj;
        return q.c(this.start, bulletListContentNode.start) && this.ordered == bulletListContentNode.ordered && q.c(this.items, bulletListContentNode.items);
    }

    public final List<List<ContentNode>> getItems() {
        return this.items;
    }

    public final boolean getOrdered() {
        return this.ordered;
    }

    public final Long getStart() {
        return this.start;
    }

    public int hashCode() {
        Long l10 = this.start;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        boolean z10 = this.ordered;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return ((hashCode + i10) * 31) + this.items.hashCode();
    }

    public String toString() {
        Long l10 = this.start;
        boolean z10 = this.ordered;
        List<List<ContentNode>> list = this.items;
        return "BulletListContentNode(start=" + l10 + ", ordered=" + z10 + ", items=" + list + ")";
    }

    public  BulletListContentNode(Long l10, boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? false : z10, list);
    }

    
    
    public BulletListContentNode(Long l10, boolean z10, List<? extends List<? extends ContentNode>> items) {
        super(null);
        q.h(items, "items");
        this.start = l10;
        this.ordered = z10;
        this.items = items;
    }
}
