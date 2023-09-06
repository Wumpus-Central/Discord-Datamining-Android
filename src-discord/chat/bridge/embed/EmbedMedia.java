package com.discord.chat.bridge.embed;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia;", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "seen1", "", "url", "", "proxyURL", "width", "height", "embedUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;II)V", "getEmbedUrl", "()Ljava/lang/String;", "getHeight", "()I", "getProxyURL", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbedMedia implements EmbedUrlProvider {
    public static final Companion Companion = new Companion(null);
    private final String embedUrl;
    private final int height;
    private final String proxyURL;
    private final String url;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/embed/EmbedMedia$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedMedia> serializer() {
            return EmbedMedia$$serializer.INSTANCE;
        }
    }

    public  EmbedMedia(int i10, String str, String str2, int i11, int i12, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static  EmbedMedia copy$default(EmbedMedia embedMedia, String str, String str2, int i10, int i11, int i12, Object obj) {
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

    
    
    public static final void write$Self(com.discord.chat.bridge.embed.EmbedMedia r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        
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
        q.h(url, "url");
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
        return q.c(this.url, embedMedia.url) && q.c(this.proxyURL, embedMedia.proxyURL) && this.width == embedMedia.width && this.height == embedMedia.height;
    }

    @Override 
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
        q.h(url, "url");
        this.url = url;
        this.proxyURL = str;
        this.width = i10;
        this.height = i11;
        this.embedUrl = str != null ? str : url;
    }

    public  EmbedMedia(String str, String str2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, i10, i11);
    }
}
