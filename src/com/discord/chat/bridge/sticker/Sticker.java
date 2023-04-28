package com.discord.chat.bridge.sticker;

import bj.C2555m0;
import bj.C2560n1;
import co.discord.media_engine.C2968a;
import com.discord.chat.bridge.sticker.StickerFormatType;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bg\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u0003HÆ\u0003Jb\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001J!\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208HÇ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001a¨\u0006;"}, m15073d2 = {"Lcom/discord/chat/bridge/sticker/Sticker;", "", "seen1", "", "id", "", "formatType", "Lcom/discord/chat/bridge/sticker/StickerFormatType;", "name", "", "asset", "url", "width", "height", "renderMode", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLcom/discord/chat/bridge/sticker/StickerFormatType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLcom/discord/chat/bridge/sticker/StickerFormatType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getAsset", "()Ljava/lang/String;", "getFormatType$annotations", "()V", "getFormatType", "()Lcom/discord/chat/bridge/sticker/StickerFormatType;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()J", "getName", "getRenderMode", "()I", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLcom/discord/chat/bridge/sticker/StickerFormatType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/discord/chat/bridge/sticker/Sticker;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class Sticker {
    public static final Companion Companion = new Companion(null);
    private final String asset;
    private final StickerFormatType formatType;
    private final Integer height;

    /* renamed from: id */
    private final long f8435id;
    private final String name;
    private final int renderMode;
    private final String url;
    private final Integer width;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/sticker/Sticker$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/sticker/Sticker;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Sticker> serializer() {
            return Sticker$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Sticker(int i, long j, StickerFormatType stickerFormatType, String str, String str2, String str3, Integer num, Integer num2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (159 != (i & 159)) {
            C2560n1.m33818b(i, 159, Sticker$$serializer.INSTANCE.getDescriptor());
        }
        this.f8435id = j;
        this.formatType = stickerFormatType;
        this.name = str;
        this.asset = str2;
        this.url = str3;
        if ((i & 32) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 64) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        this.renderMode = i2;
    }

    public static /* synthetic */ void getFormatType$annotations() {
    }

    public static final void write$Self(Sticker self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo13889E(serialDesc, 0, self.f8435id);
        output.mo13870t(serialDesc, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, self.formatType);
        output.mo13864z(serialDesc, 2, self.name);
        output.mo13864z(serialDesc, 3, self.asset);
        output.mo13864z(serialDesc, 4, self.url);
        if (!output.mo13893A(serialDesc, 5) && self.width == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 5, C2555m0.f6794a, self.width);
        }
        if (output.mo13893A(serialDesc, 6) || self.height != null) {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 6, C2555m0.f6794a, self.height);
        }
        output.mo13866x(serialDesc, 7, self.renderMode);
    }

    public final long component1() {
        return this.f8435id;
    }

    public final StickerFormatType component2() {
        return this.formatType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.asset;
    }

    public final String component5() {
        return this.url;
    }

    public final Integer component6() {
        return this.width;
    }

    public final Integer component7() {
        return this.height;
    }

    public final int component8() {
        return this.renderMode;
    }

    public final Sticker copy(long j, StickerFormatType formatType, String name, String asset, String url, Integer num, Integer num2, int i) {
        C9677q.m14633g(formatType, "formatType");
        C9677q.m14633g(name, "name");
        C9677q.m14633g(asset, "asset");
        C9677q.m14633g(url, "url");
        return new Sticker(j, formatType, name, asset, url, num, num2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return this.f8435id == sticker.f8435id && this.formatType == sticker.formatType && C9677q.m14638b(this.name, sticker.name) && C9677q.m14638b(this.asset, sticker.asset) && C9677q.m14638b(this.url, sticker.url) && C9677q.m14638b(this.width, sticker.width) && C9677q.m14638b(this.height, sticker.height) && this.renderMode == sticker.renderMode;
    }

    public final String getAsset() {
        return this.asset;
    }

    public final StickerFormatType getFormatType() {
        return this.formatType;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f8435id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRenderMode() {
        return this.renderMode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a = ((((((((C2968a.m32873a(this.f8435id) * 31) + this.formatType.hashCode()) * 31) + this.name.hashCode()) * 31) + this.asset.hashCode()) * 31) + this.url.hashCode()) * 31;
        Integer num = this.width;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode + i) * 31) + this.renderMode;
    }

    public String toString() {
        long j = this.f8435id;
        StickerFormatType stickerFormatType = this.formatType;
        String str = this.name;
        String str2 = this.asset;
        String str3 = this.url;
        Integer num = this.width;
        Integer num2 = this.height;
        int i = this.renderMode;
        return "Sticker(id=" + j + ", formatType=" + stickerFormatType + ", name=" + str + ", asset=" + str2 + ", url=" + str3 + ", width=" + num + ", height=" + num2 + ", renderMode=" + i + ")";
    }

    public Sticker(long j, StickerFormatType formatType, String name, String asset, String url, Integer num, Integer num2, int i) {
        C9677q.m14633g(formatType, "formatType");
        C9677q.m14633g(name, "name");
        C9677q.m14633g(asset, "asset");
        C9677q.m14633g(url, "url");
        this.f8435id = j;
        this.formatType = formatType;
        this.name = name;
        this.asset = asset;
        this.url = url;
        this.width = num;
        this.height = num2;
        this.renderMode = i;
    }

    public /* synthetic */ Sticker(long j, StickerFormatType stickerFormatType, String str, String str2, String str3, Integer num, Integer num2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, stickerFormatType, str, str2, str3, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, i);
    }
}
