package com.discord.chat.bridge.contentnode;

import bj.C2521f;
import bj.C2555m0;
import bj.C2560n1;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\bHÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", ViewProps.START, "ordered", "", "items", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;ZLjava/util/List;)V", "getItems", "()Ljava/util/List;", "getOrdered", "()Z", "getStart", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;ZLjava/util/List;)Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class BulletListContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<List<ContentNode>> items;
    private final boolean ordered;
    private final Integer start;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BulletListContentNode> serializer() {
            return BulletListContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BulletListContentNode(int i, Integer num, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (4 != (i & 4)) {
            C2560n1.m33818b(i, 4, BulletListContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.start = null;
        } else {
            this.start = num;
        }
        if ((i & 2) == 0) {
            this.ordered = false;
        } else {
            this.ordered = z;
        }
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulletListContentNode copy$default(BulletListContentNode bulletListContentNode, Integer num, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bulletListContentNode.start;
        }
        if ((i & 2) != 0) {
            z = bulletListContentNode.ordered;
        }
        if ((i & 4) != 0) {
            list = bulletListContentNode.items;
        }
        return bulletListContentNode.copy(num, z, list);
    }

    public static final void write$Self(BulletListContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z2 = false;
        if (!output.mo13893A(serialDesc, 0) && self.start == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 0, C2555m0.f6794a, self.start);
        }
        if (output.mo13893A(serialDesc, 1) || self.ordered) {
            z2 = true;
        }
        if (z2) {
            output.mo13865y(serialDesc, 1, self.ordered);
        }
        output.mo13870t(serialDesc, 2, new C2521f(new C2521f(ContentNodeSerializer.INSTANCE)), self.items);
    }

    public final Integer component1() {
        return this.start;
    }

    public final boolean component2() {
        return this.ordered;
    }

    public final List<List<ContentNode>> component3() {
        return this.items;
    }

    public final BulletListContentNode copy(Integer num, boolean z, List<? extends List<? extends ContentNode>> items) {
        C9677q.m14633g(items, "items");
        return new BulletListContentNode(num, z, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletListContentNode)) {
            return false;
        }
        BulletListContentNode bulletListContentNode = (BulletListContentNode) obj;
        return C9677q.m14638b(this.start, bulletListContentNode.start) && this.ordered == bulletListContentNode.ordered && C9677q.m14638b(this.items, bulletListContentNode.items);
    }

    public final List<List<ContentNode>> getItems() {
        return this.items;
    }

    public final boolean getOrdered() {
        return this.ordered;
    }

    public final Integer getStart() {
        return this.start;
    }

    public int hashCode() {
        Integer num = this.start;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        boolean z = this.ordered;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.items.hashCode();
    }

    public String toString() {
        Integer num = this.start;
        boolean z = this.ordered;
        List<List<ContentNode>> list = this.items;
        return "BulletListContentNode(start=" + num + ", ordered=" + z + ", items=" + list + ")";
    }

    public /* synthetic */ BulletListContentNode(Integer num, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? false : z, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BulletListContentNode(Integer num, boolean z, List<? extends List<? extends ContentNode>> items) {
        super(null);
        C9677q.m14633g(items, "items");
        this.start = num;
        this.ordered = z;
        this.items = items;
    }
}
