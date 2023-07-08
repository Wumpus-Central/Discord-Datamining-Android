package com.discord.chat.bridge.embed;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia;", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "seen1", "", "url", "", "proxyURL", "width", "height", "embedUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;II)V", "getEmbedUrl", "()Ljava/lang/String;", "getHeight", "()I", "getProxyURL", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmbedMedia implements EmbedUrlProvider {
    public static final Companion Companion = new Companion(null);
    private final String embedUrl;
    private final int height;
    private final String proxyURL;
    private final String url;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedMedia> serializer() {
            return EmbedMedia$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmbedMedia(int i10, String str, String str2, int i11, int i12, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i10 & 13)) {
            n1.b(i10, 13, EmbedMedia$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.proxyURL = (i10 & 2) == 0 ? null : str2;
        this.width = i11;
        this.height = i12;
        if ((i10 & 16) == 0) {
            String str4 = this.proxyURL;
            this.embedUrl = str4 != null ? str4 : str;
            return;
        }
        this.embedUrl = str3;
    }

    public static /* synthetic */ EmbedMedia copy$default(EmbedMedia embedMedia, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = embedMedia.url;
        }
        if ((i12 & 2) != 0) {
            str2 = embedMedia.proxyURL;
        }
        if ((i12 & 4) != 0) {
            i10 = embedMedia.width;
        }
        if ((i12 & 8) != 0) {
            i11 = embedMedia.height;
        }
        return embedMedia.copy(str, str2, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (kotlin.jvm.internal.q.b(r3, r4) == false) goto L_0x0040;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.embed.EmbedMedia r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.q.g(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.q.g(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.q.g(r7, r0)
            java.lang.String r0 = r5.url
            r1 = 0
            r6.s(r7, r1, r0)
            r0 = 1
            boolean r2 = r6.w(r7, r0)
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
            si.a2 r2 = si.a2.f26230a
            java.lang.String r3 = r5.proxyURL
            r6.z(r7, r0, r2, r3)
        L_0x002d:
            r2 = 2
            int r3 = r5.width
            r6.q(r7, r2, r3)
            r2 = 3
            int r3 = r5.height
            r6.q(r7, r2, r3)
            r2 = 4
            boolean r3 = r6.w(r7, r2)
            if (r3 == 0) goto L_0x0042
        L_0x0040:
            r1 = r0
            goto L_0x0053
        L_0x0042:
            java.lang.String r3 = r5.getEmbedUrl()
            java.lang.String r4 = r5.proxyURL
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = r5.url
        L_0x004c:
            boolean r3 = kotlin.jvm.internal.q.b(r3, r4)
            if (r3 != 0) goto L_0x0053
            goto L_0x0040
        L_0x0053:
            if (r1 == 0) goto L_0x005c
            java.lang.String r5 = r5.getEmbedUrl()
            r6.s(r7, r2, r5)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.EmbedMedia.write$Self(com.discord.chat.bridge.embed.EmbedMedia, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.proxyURL;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final EmbedMedia copy(String url, String str, int i10, int i11) {
        q.g(url, "url");
        return new EmbedMedia(url, str, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedMedia)) {
            return false;
        }
        EmbedMedia embedMedia = (EmbedMedia) obj;
        return q.b(this.url, embedMedia.url) && q.b(this.proxyURL, embedMedia.proxyURL) && this.width == embedMedia.width && this.height == embedMedia.height;
    }

    @Override // com.discord.chat.bridge.embed.EmbedUrlProvider
    public String getEmbedUrl() {
        return this.embedUrl;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getProxyURL() {
        return this.proxyURL;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.proxyURL;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.proxyURL;
        int i10 = this.width;
        int i11 = this.height;
        return "EmbedMedia(url=" + str + ", proxyURL=" + str2 + ", width=" + i10 + ", height=" + i11 + ")";
    }

    public EmbedMedia(String url, String str, int i10, int i11) {
        q.g(url, "url");
        this.url = url;
        this.proxyURL = str;
        this.width = i10;
        this.height = i11;
        this.embedUrl = str != null ? str : url;
    }

    public /* synthetic */ EmbedMedia(String str, String str2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, i10, i11);
    }
}
