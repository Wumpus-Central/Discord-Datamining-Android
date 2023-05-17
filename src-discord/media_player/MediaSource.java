package com.discord.media_player;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0014JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/discord/media_player/MediaSource;", "", "sourceUrl", "", "previewUrl", "featureTag", "type", "Lcom/discord/media_player/MediaType;", "shouldAutoPlay", "", "portal", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)V", "getFeatureTag", "()Ljava/lang/String;", "isGifv", "()Z", "isValid", "isVideo", "getPortal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPreviewUrl", "getShouldAutoPlay", "getSourceUrl", "getType", "()Lcom/discord/media_player/MediaType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/media_player/MediaType;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;", "equals", "other", "hashCode", "", "toString", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MediaSource {
    private final String featureTag;
    private final boolean isGifv;
    private final boolean isValid;
    private final boolean isVideo;
    private final Double portal;
    private final String previewUrl;
    private final boolean shouldAutoPlay;
    private final String sourceUrl;
    private final MediaType type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.GIFV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r2 != false) goto L_0x0065;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r2 != false) goto L_0x0065;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        r1.isValid = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaSource(java.lang.String r2, java.lang.String r3, java.lang.String r4, com.discord.media_player.MediaType r5, boolean r6, java.lang.Double r7) {
        /*
            r1 = this;
            java.lang.String r0 = "featureTag"
            kotlin.jvm.internal.q.g(r4, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.q.g(r5, r0)
            r1.<init>()
            r1.sourceUrl = r2
            r1.previewUrl = r3
            r1.featureTag = r4
            r1.type = r5
            r1.shouldAutoPlay = r6
            r1.portal = r7
            com.discord.media_player.MediaType r4 = com.discord.media_player.MediaType.GIFV
            r6 = 0
            r7 = 1
            if (r5 != r4) goto L_0x0021
            r4 = r7
            goto L_0x0022
        L_0x0021:
            r4 = r6
        L_0x0022:
            r1.isGifv = r4
            com.discord.media_player.MediaType r4 = com.discord.media_player.MediaType.VIDEO
            if (r5 != r4) goto L_0x002a
            r4 = r7
            goto L_0x002b
        L_0x002a:
            r4 = r6
        L_0x002b:
            r1.isVideo = r4
            int[] r4 = com.discord.media_player.MediaSource.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r7) goto L_0x0056
            r3 = 2
            if (r4 == r3) goto L_0x0047
            r3 = 3
            if (r4 == r3) goto L_0x0047
            r3 = 4
            if (r4 != r3) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            nf.q r2 = new nf.q
            r2.<init>()
            throw r2
        L_0x0047:
            if (r2 == 0) goto L_0x0052
            boolean r2 = ri.l.w(r2)
            if (r2 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = r6
            goto L_0x0053
        L_0x0052:
            r2 = r7
        L_0x0053:
            if (r2 != 0) goto L_0x0065
            goto L_0x0064
        L_0x0056:
            if (r3 == 0) goto L_0x0061
            boolean r2 = ri.l.w(r3)
            if (r2 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r6
            goto L_0x0062
        L_0x0061:
            r2 = r7
        L_0x0062:
            if (r2 != 0) goto L_0x0065
        L_0x0064:
            r6 = r7
        L_0x0065:
            r1.isValid = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media_player.MediaSource.<init>(java.lang.String, java.lang.String, java.lang.String, com.discord.media_player.MediaType, boolean, java.lang.Double):void");
    }

    public static /* synthetic */ MediaSource copy$default(MediaSource mediaSource, String str, String str2, String str3, MediaType mediaType, boolean z10, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mediaSource.sourceUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = mediaSource.previewUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = mediaSource.featureTag;
        }
        if ((i10 & 8) != 0) {
            mediaType = mediaSource.type;
        }
        if ((i10 & 16) != 0) {
            z10 = mediaSource.shouldAutoPlay;
        }
        if ((i10 & 32) != 0) {
            d10 = mediaSource.portal;
        }
        return mediaSource.copy(str, str2, str3, mediaType, z10, d10);
    }

    public final String component1() {
        return this.sourceUrl;
    }

    public final String component2() {
        return this.previewUrl;
    }

    public final String component3() {
        return this.featureTag;
    }

    public final MediaType component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.shouldAutoPlay;
    }

    public final Double component6() {
        return this.portal;
    }

    public final MediaSource copy(String str, String str2, String featureTag, MediaType type, boolean z10, Double d10) {
        q.g(featureTag, "featureTag");
        q.g(type, "type");
        return new MediaSource(str, str2, featureTag, type, z10, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSource)) {
            return false;
        }
        MediaSource mediaSource = (MediaSource) obj;
        return q.b(this.sourceUrl, mediaSource.sourceUrl) && q.b(this.previewUrl, mediaSource.previewUrl) && q.b(this.featureTag, mediaSource.featureTag) && this.type == mediaSource.type && this.shouldAutoPlay == mediaSource.shouldAutoPlay && q.b(this.portal, mediaSource.portal);
    }

    public final String getFeatureTag() {
        return this.featureTag;
    }

    public final Double getPortal() {
        return this.portal;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final boolean getShouldAutoPlay() {
        return this.shouldAutoPlay;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.sourceUrl;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previewUrl;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.featureTag.hashCode()) * 31) + this.type.hashCode()) * 31;
        boolean z10 = this.shouldAutoPlay;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (hashCode2 + i11) * 31;
        Double d10 = this.portal;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return i14 + i10;
    }

    public final boolean isGifv() {
        return this.isGifv;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        String str = this.sourceUrl;
        String str2 = this.previewUrl;
        String str3 = this.featureTag;
        MediaType mediaType = this.type;
        boolean z10 = this.shouldAutoPlay;
        Double d10 = this.portal;
        return "MediaSource(sourceUrl=" + str + ", previewUrl=" + str2 + ", featureTag=" + str3 + ", type=" + mediaType + ", shouldAutoPlay=" + z10 + ", portal=" + d10 + ")";
    }

    public /* synthetic */ MediaSource(String str, String str2, String str3, MediaType mediaType, boolean z10, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3, mediaType, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : d10);
    }
}
