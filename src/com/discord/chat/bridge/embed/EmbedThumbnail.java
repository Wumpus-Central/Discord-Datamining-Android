package com.discord.chat.bridge.embed;

import bj.C2560n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234Be\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202HÇ\u0001R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u00065"}, m15073d2 = {"Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "seen1", "", "url", "", "proxyURL", "videoUrl", "height", "width", "gifv", "", "showPlayButton", "embedUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)V", "getEmbedUrl", "()Ljava/lang/String;", "getGifv", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeight", "()I", "getProxyURL", "getShowPlayButton", "getUrl", "getVideoUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmbedThumbnail implements EmbedUrlProvider {
    public static final Companion Companion = new Companion(null);
    private final String embedUrl;
    private final Boolean gifv;
    private final int height;
    private final String proxyURL;
    private final Boolean showPlayButton;
    private final String url;
    private final String videoUrl;
    private final int width;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/embed/EmbedThumbnail$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedThumbnail> serializer() {
            return EmbedThumbnail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmbedThumbnail(int i, String str, String str2, String str3, int i2, int i3, Boolean bool, Boolean bool2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i & 25)) {
            C2560n1.m33818b(i, 25, EmbedThumbnail$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.proxyURL = null;
        } else {
            this.proxyURL = str2;
        }
        if ((i & 4) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str3;
        }
        this.height = i2;
        this.width = i3;
        if ((i & 32) == 0) {
            this.gifv = null;
        } else {
            this.gifv = bool;
        }
        if ((i & 64) == 0) {
            this.showPlayButton = null;
        } else {
            this.showPlayButton = bool2;
        }
        if ((i & 128) == 0) {
            String str5 = this.proxyURL;
            this.embedUrl = str5 != null ? str5 : str;
            return;
        }
        this.embedUrl = str4;
    }

    public static /* synthetic */ EmbedThumbnail copy$default(EmbedThumbnail embedThumbnail, String str, String str2, String str3, int i, int i2, Boolean bool, Boolean bool2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = embedThumbnail.url;
        }
        if ((i3 & 2) != 0) {
            str2 = embedThumbnail.proxyURL;
        }
        if ((i3 & 4) != 0) {
            str3 = embedThumbnail.videoUrl;
        }
        if ((i3 & 8) != 0) {
            i = embedThumbnail.height;
        }
        if ((i3 & 16) != 0) {
            i2 = embedThumbnail.width;
        }
        if ((i3 & 32) != 0) {
            bool = embedThumbnail.gifv;
        }
        if ((i3 & 64) != 0) {
            bool2 = embedThumbnail.showPlayButton;
        }
        return embedThumbnail.copy(str, str2, str3, i, i2, bool, bool2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (kotlin.jvm.internal.C9677q.m14638b(r3, r4) == false) goto L_0x0088;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.embed.EmbedThumbnail r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.C9677q.m14633g(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9677q.m14633g(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.C9677q.m14633g(r7, r0)
            java.lang.String r0 = r5.url
            r1 = 0
            r6.mo13864z(r7, r1, r0)
            r0 = 1
            boolean r2 = r6.mo13893A(r7, r0)
            if (r2 == 0) goto L_0x001e
        L_0x001c:
            r2 = r0
            goto L_0x0024
        L_0x001e:
            java.lang.String r2 = r5.proxyURL
            if (r2 == 0) goto L_0x0023
            goto L_0x001c
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x002d
            bj.a2 r2 = bj.C2500a2.f6719a
            java.lang.String r3 = r5.proxyURL
            r6.mo13874p(r7, r0, r2, r3)
        L_0x002d:
            r2 = 2
            boolean r3 = r6.mo13893A(r7, r2)
            if (r3 == 0) goto L_0x0036
        L_0x0034:
            r3 = r0
            goto L_0x003c
        L_0x0036:
            java.lang.String r3 = r5.videoUrl
            if (r3 == 0) goto L_0x003b
            goto L_0x0034
        L_0x003b:
            r3 = r1
        L_0x003c:
            if (r3 == 0) goto L_0x0045
            bj.a2 r3 = bj.C2500a2.f6719a
            java.lang.String r4 = r5.videoUrl
            r6.mo13874p(r7, r2, r3, r4)
        L_0x0045:
            r2 = 3
            int r3 = r5.height
            r6.mo13866x(r7, r2, r3)
            r2 = 4
            int r3 = r5.width
            r6.mo13866x(r7, r2, r3)
            r2 = 5
            boolean r3 = r6.mo13893A(r7, r2)
            if (r3 == 0) goto L_0x005a
        L_0x0058:
            r3 = r0
            goto L_0x0060
        L_0x005a:
            java.lang.Boolean r3 = r5.gifv
            if (r3 == 0) goto L_0x005f
            goto L_0x0058
        L_0x005f:
            r3 = r1
        L_0x0060:
            if (r3 == 0) goto L_0x0069
            bj.h r3 = bj.C2530h.f6761a
            java.lang.Boolean r4 = r5.gifv
            r6.mo13874p(r7, r2, r3, r4)
        L_0x0069:
            r2 = 6
            boolean r3 = r6.mo13893A(r7, r2)
            if (r3 == 0) goto L_0x0072
        L_0x0070:
            r3 = r0
            goto L_0x0078
        L_0x0072:
            java.lang.Boolean r3 = r5.showPlayButton
            if (r3 == 0) goto L_0x0077
            goto L_0x0070
        L_0x0077:
            r3 = r1
        L_0x0078:
            if (r3 == 0) goto L_0x0081
            bj.h r3 = bj.C2530h.f6761a
            java.lang.Boolean r4 = r5.showPlayButton
            r6.mo13874p(r7, r2, r3, r4)
        L_0x0081:
            r2 = 7
            boolean r3 = r6.mo13893A(r7, r2)
            if (r3 == 0) goto L_0x008a
        L_0x0088:
            r1 = r0
            goto L_0x009b
        L_0x008a:
            java.lang.String r3 = r5.getEmbedUrl()
            java.lang.String r4 = r5.proxyURL
            if (r4 != 0) goto L_0x0094
            java.lang.String r4 = r5.url
        L_0x0094:
            boolean r3 = kotlin.jvm.internal.C9677q.m14638b(r3, r4)
            if (r3 != 0) goto L_0x009b
            goto L_0x0088
        L_0x009b:
            if (r1 == 0) goto L_0x00a4
            java.lang.String r5 = r5.getEmbedUrl()
            r6.mo13864z(r7, r2, r5)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.EmbedThumbnail.write$Self(com.discord.chat.bridge.embed.EmbedThumbnail, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.proxyURL;
    }

    public final String component3() {
        return this.videoUrl;
    }

    public final int component4() {
        return this.height;
    }

    public final int component5() {
        return this.width;
    }

    public final Boolean component6() {
        return this.gifv;
    }

    public final Boolean component7() {
        return this.showPlayButton;
    }

    public final EmbedThumbnail copy(String url, String str, String str2, int i, int i2, Boolean bool, Boolean bool2) {
        C9677q.m14633g(url, "url");
        return new EmbedThumbnail(url, str, str2, i, i2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedThumbnail)) {
            return false;
        }
        EmbedThumbnail embedThumbnail = (EmbedThumbnail) obj;
        return C9677q.m14638b(this.url, embedThumbnail.url) && C9677q.m14638b(this.proxyURL, embedThumbnail.proxyURL) && C9677q.m14638b(this.videoUrl, embedThumbnail.videoUrl) && this.height == embedThumbnail.height && this.width == embedThumbnail.width && C9677q.m14638b(this.gifv, embedThumbnail.gifv) && C9677q.m14638b(this.showPlayButton, embedThumbnail.showPlayButton);
    }

    @Override // com.discord.chat.bridge.embed.EmbedUrlProvider
    public String getEmbedUrl() {
        return this.embedUrl;
    }

    public final Boolean getGifv() {
        return this.gifv;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getProxyURL() {
        return this.proxyURL;
    }

    public final Boolean getShowPlayButton() {
        return this.showPlayButton;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.proxyURL;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoUrl;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.height) * 31) + this.width) * 31;
        Boolean bool = this.gifv;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPlayButton;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.proxyURL;
        String str3 = this.videoUrl;
        int i = this.height;
        int i2 = this.width;
        Boolean bool = this.gifv;
        Boolean bool2 = this.showPlayButton;
        return "EmbedThumbnail(url=" + str + ", proxyURL=" + str2 + ", videoUrl=" + str3 + ", height=" + i + ", width=" + i2 + ", gifv=" + bool + ", showPlayButton=" + bool2 + ")";
    }

    public EmbedThumbnail(String url, String str, String str2, int i, int i2, Boolean bool, Boolean bool2) {
        C9677q.m14633g(url, "url");
        this.url = url;
        this.proxyURL = str;
        this.videoUrl = str2;
        this.height = i;
        this.width = i2;
        this.gifv = bool;
        this.showPlayButton = bool2;
        this.embedUrl = str != null ? str : url;
    }

    public /* synthetic */ EmbedThumbnail(String str, String str2, String str3, int i, int i2, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, i, i2, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : bool2);
    }
}
