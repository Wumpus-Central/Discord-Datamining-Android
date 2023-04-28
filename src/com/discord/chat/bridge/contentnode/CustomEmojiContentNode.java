package com.discord.chat.bridge.contentnode;

import bj.C2560n1;
import co.discord.media_engine.C2968a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006,"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "seen1", "", "id", "", "alt", "", "src", "frozenSrc", "jumboable", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAlt", "()Ljava/lang/String;", "getFrozenSrc", "getId", "()J", "getJumboable", "()Z", "getSrc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CustomEmojiContentNode extends EmojiContentNode {
    public static final Companion Companion = new Companion(null);
    private final String alt;
    private final String frozenSrc;

    /* renamed from: id */
    private final long f8428id;
    private final boolean jumboable;
    private final String src;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomEmojiContentNode> serializer() {
            return CustomEmojiContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomEmojiContentNode(int i, long j, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (15 != (i & 15)) {
            C2560n1.m33818b(i, 15, CustomEmojiContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.f8428id = j;
        this.alt = str;
        this.src = str2;
        this.frozenSrc = str3;
        if ((i & 16) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z;
        }
    }

    public static /* synthetic */ CustomEmojiContentNode copy$default(CustomEmojiContentNode customEmojiContentNode, long j, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = customEmojiContentNode.f8428id;
        }
        if ((i & 2) != 0) {
            str = customEmojiContentNode.alt;
        }
        if ((i & 4) != 0) {
            str2 = customEmojiContentNode.src;
        }
        if ((i & 8) != 0) {
            str3 = customEmojiContentNode.frozenSrc;
        }
        if ((i & 16) != 0) {
            z = customEmojiContentNode.getJumboable();
        }
        return customEmojiContentNode.copy(j, str, str2, str3, z);
    }

    public static final void write$Self(CustomEmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        EmojiContentNode.write$Self(self, output, serialDesc);
        boolean z = false;
        output.mo13889E(serialDesc, 0, self.f8428id);
        output.mo13864z(serialDesc, 1, self.alt);
        output.mo13864z(serialDesc, 2, self.src);
        output.mo13864z(serialDesc, 3, self.frozenSrc);
        if (output.mo13893A(serialDesc, 4) || self.getJumboable()) {
            z = true;
        }
        if (z) {
            output.mo13865y(serialDesc, 4, self.getJumboable());
        }
    }

    public final long component1() {
        return this.f8428id;
    }

    public final String component2() {
        return this.alt;
    }

    public final String component3() {
        return this.src;
    }

    public final String component4() {
        return this.frozenSrc;
    }

    public final boolean component5() {
        return getJumboable();
    }

    public final CustomEmojiContentNode copy(long j, String alt, String src, String frozenSrc, boolean z) {
        C9677q.m14633g(alt, "alt");
        C9677q.m14633g(src, "src");
        C9677q.m14633g(frozenSrc, "frozenSrc");
        return new CustomEmojiContentNode(j, alt, src, frozenSrc, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEmojiContentNode)) {
            return false;
        }
        CustomEmojiContentNode customEmojiContentNode = (CustomEmojiContentNode) obj;
        return this.f8428id == customEmojiContentNode.f8428id && C9677q.m14638b(this.alt, customEmojiContentNode.alt) && C9677q.m14638b(this.src, customEmojiContentNode.src) && C9677q.m14638b(this.frozenSrc, customEmojiContentNode.frozenSrc) && getJumboable() == customEmojiContentNode.getJumboable();
    }

    public final String getAlt() {
        return this.alt;
    }

    public final String getFrozenSrc() {
        return this.frozenSrc;
    }

    public final long getId() {
        return this.f8428id;
    }

    @Override // com.discord.chat.presentation.textutils.Jumboable
    public boolean getJumboable() {
        return this.jumboable;
    }

    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        int a = ((((((C2968a.m32873a(this.f8428id) * 31) + this.alt.hashCode()) * 31) + this.src.hashCode()) * 31) + this.frozenSrc.hashCode()) * 31;
        boolean jumboable = getJumboable();
        if (jumboable) {
            jumboable = true;
        }
        int i = jumboable ? 1 : 0;
        int i2 = jumboable ? 1 : 0;
        int i3 = jumboable ? 1 : 0;
        return a + i;
    }

    public String toString() {
        long j = this.f8428id;
        String str = this.alt;
        String str2 = this.src;
        String str3 = this.frozenSrc;
        boolean jumboable = getJumboable();
        return "CustomEmojiContentNode(id=" + j + ", alt=" + str + ", src=" + str2 + ", frozenSrc=" + str3 + ", jumboable=" + jumboable + ")";
    }

    public /* synthetic */ CustomEmojiContentNode(long j, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEmojiContentNode(long j, String alt, String src, String frozenSrc, boolean z) {
        super(null);
        C9677q.m14633g(alt, "alt");
        C9677q.m14633g(src, "src");
        C9677q.m14633g(frozenSrc, "frozenSrc");
        this.f8428id = j;
        this.alt = alt;
        this.src = src;
        this.frozenSrc = frozenSrc;
        this.jumboable = z;
    }
}
