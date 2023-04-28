package com.discord.media.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import co.discord.media_engine.C2968a;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.C6322j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9609i;
import kotlin.collections.C9610j;
import kotlin.collections.C9611k;
import kotlin.collections.C9618r;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import nf.C10843q;
import org.webrtc.MediaStreamTrack;
import p268of.AbstractC11047p;
import p427xf.C14001c;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 /2\u00020\u0001:\u0005./012BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00063"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia;", "", "id", "", "uri", "Landroid/net/Uri;", "mediaType", "Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "mimeType", "", "name", "duration", "", "dateAdded", "width", "height", "(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V", "getDateAdded", "()I", "getDuration", "getHeight", "getId", "()J", "getMediaType", "()Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "getMimeType", "()Ljava/lang/String;", "getName", "getUri", "()Landroid/net/Uri;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Column", "Companion", "MediaType", "QueryColumns", "QueryType", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ContentResolverMedia {
    public static final Companion Companion = new Companion(null);
    private final int dateAdded;
    private final int duration;
    private final int height;

    /* renamed from: id */
    private final long f8960id;
    private final MediaType mediaType;
    private final String mimeType;
    private final String name;
    private final Uri uri;
    private final int width;

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Column;", "", "field", "", "(Ljava/lang/String;)V", "columnIndex", "", "getField", "()Ljava/lang/String;", "getColumnIndex", "", "cursor", "Landroid/database/Cursor;", "getInt", "getLong", "", "getString", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Column {
        private Number columnIndex;
        private final String field;

        public Column(String field) {
            C9677q.m14633g(field, "field");
            this.field = field;
        }

        private final int getColumnIndex(Cursor cursor) {
            if (this.columnIndex == null) {
                this.columnIndex = Integer.valueOf(cursor.getColumnIndexOrThrow(this.field));
            }
            Number number = this.columnIndex;
            if (number == null) {
                C9677q.m14615y("columnIndex");
                number = null;
            }
            return number.intValue();
        }

        public final String getField() {
            return this.field;
        }

        public final int getInt(Cursor cursor) {
            C9677q.m14633g(cursor, "cursor");
            return cursor.getInt(getColumnIndex(cursor));
        }

        public final long getLong(Cursor cursor) {
            C9677q.m14633g(cursor, "cursor");
            return cursor.getLong(getColumnIndex(cursor));
        }

        public final String getString(Cursor cursor) {
            C9677q.m14633g(cursor, "cursor");
            return cursor.getString(getColumnIndex(cursor));
        }
    }

    @Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0003J=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Companion;", "", "()V", "getMedia", "", "Lcom/discord/media/utils/ContentResolverMedia;", "context", "Landroid/content/Context;", "queryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "queryLimit", "", "queryOffset", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILjava/lang/Integer;)Ljava/util/List;", "isAtLeastQ", "", "queryMedia", "queryUri", "Landroid/net/Uri;", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILandroid/net/Uri;Ljava/lang/Integer;)Ljava/util/List;", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAtLeastQ() {
            return Build.VERSION.SDK_INT >= 29;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Throwable] */
        public final List<ContentResolverMedia> queryMedia(Context context, QueryType queryType, int i, Uri uri, Integer num) {
            QueryColumns queryColumns;
            String str;
            IntRange q;
            int t;
            List<ContentResolverMedia> i2;
            if (isAtLeastQ() && !queryType.shouldIncludeVideo()) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 127, null);
            } else if (!isAtLeastQ() && !uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 63, null);
            } else if (isAtLeastQ() || !uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 255, null);
            } else {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 191, null);
            }
            ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
            ContentResolver contentResolver = context.getContentResolver();
            C9677q.m14634f(contentResolver, "context.contentResolver");
            String[] projection = queryColumns.getProjection();
            th = 0;
            if (isAtLeastQ()) {
                str = queryType.getSelection();
            } else {
                str = th;
            }
            Cursor queryCompat = contentResolverUtils.queryCompat(contentResolver, uri, projection, i, "date_added DESC", str, num);
            if (queryCompat != null) {
                try {
                    q = C6322j.m23947q(0, queryCompat.getCount());
                    t = C9611k.m14809t(q, 10);
                    ArrayList arrayList = new ArrayList(t);
                    Iterator<Integer> it = q.iterator();
                    while (it.hasNext()) {
                        queryCompat.moveToPosition(((AbstractC11047p) it).nextInt());
                        arrayList.add(queryColumns.getContentResolverMedia(uri, queryCompat));
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        C14001c.m1713a(queryCompat, th2);
                    }
                }
            } else {
                i2 = C9610j.m14820i();
                return i2;
            }
        }

        public final List<ContentResolverMedia> getMedia(Context context, QueryType queryType, int i, Integer num) {
            List<? extends ContentResolverMedia> list;
            List<? extends ContentResolverMedia> list2;
            List c;
            List<ContentResolverMedia> a;
            C9677q.m14633g(context, "context");
            C9677q.m14633g(queryType, "queryType");
            ContentResolverMedia$Companion$getMedia$performQuery$1 contentResolverMedia$Companion$getMedia$performQuery$1 = new ContentResolverMedia$Companion$getMedia$performQuery$1(context, queryType, i, num);
            if (isAtLeastQ()) {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                C9677q.m14634f(contentUri, "getContentUri(MediaStore.VOLUME_EXTERNAL)");
                return (List) contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) contentUri);
            }
            if (queryType.shouldIncludeImages()) {
                Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                C9677q.m14634f(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                list = contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) EXTERNAL_CONTENT_URI);
            } else {
                list = C9610j.m14820i();
            }
            if (queryType.shouldIncludeVideo()) {
                Uri EXTERNAL_CONTENT_URI2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                C9677q.m14634f(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
                list2 = contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) EXTERNAL_CONTENT_URI2);
            } else {
                list2 = C9610j.m14820i();
            }
            c = C9609i.m14826c();
            c.addAll(list);
            c.addAll(list2);
            a = C9609i.m14828a(c);
            return a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "", "(Ljava/lang/String;I)V", "toString", "", "IMAGE", "VIDEO", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public enum MediaType {
        IMAGE,
        VIDEO;

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "ALAssetTypePhoto";
            }
            if (i == 2) {
                return "ALAssetTypeVideo";
            }
            throw new C10843q();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "", "(Ljava/lang/String;I)V", "getSelection", "", "shouldIncludeImages", "", "shouldIncludeVideo", "ALL", "IMAGE", "VIDEO", "Companion", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public enum QueryType {
        ALL,
        IMAGE,
        VIDEO;
        
        public static final Companion Companion = new Companion(null);
        private static final List<String> UNSUPPORTED_IMAGE_MIME_TYPES;

        @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;", "", "()V", "UNSUPPORTED_IMAGE_MIME_TYPES", "", "", "getUnsupportedImageMimeTypes", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getUnsupportedImageMimeTypes() {
                String e0;
                e0 = C9618r.m14760e0(QueryType.UNSUPPORTED_IMAGE_MIME_TYPES, ",", null, null, 0, null, C3493x69014d2f.INSTANCE, 30, null);
                return e0;
            }
        }

        static {
            List<String> d;
            d = C9609i.m14825d("image/x-adobe-dng");
            UNSUPPORTED_IMAGE_MIME_TYPES = d;
        }

        public final String getSelection() {
            String str;
            List n;
            String e0;
            String str2 = null;
            if (shouldIncludeImages()) {
                str = "media_type=1 AND mime_type NOT IN (" + Companion.getUnsupportedImageMimeTypes() + ")";
            } else {
                str = null;
            }
            if (shouldIncludeVideo()) {
                str2 = "media_type = 3";
            }
            n = C9610j.m14815n(str, str2);
            e0 = C9618r.m14760e0(n, " OR ", null, null, 0, null, null, 62, null);
            return e0;
        }

        public final boolean shouldIncludeImages() {
            return this == ALL || this == IMAGE;
        }

        public final boolean shouldIncludeVideo() {
            return this == ALL || this == VIDEO;
        }
    }

    public ContentResolverMedia(long j, Uri uri, MediaType mediaType, String str, String str2, int i, int i2, int i3, int i4) {
        C9677q.m14633g(uri, "uri");
        C9677q.m14633g(mediaType, "mediaType");
        this.f8960id = j;
        this.uri = uri;
        this.mediaType = mediaType;
        this.mimeType = str;
        this.name = str2;
        this.duration = i;
        this.dateAdded = i2;
        this.width = i3;
        this.height = i4;
    }

    public final long component1() {
        return this.f8960id;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final MediaType component3() {
        return this.mediaType;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final String component5() {
        return this.name;
    }

    public final int component6() {
        return this.duration;
    }

    public final int component7() {
        return this.dateAdded;
    }

    public final int component8() {
        return this.width;
    }

    public final int component9() {
        return this.height;
    }

    public final ContentResolverMedia copy(long j, Uri uri, MediaType mediaType, String str, String str2, int i, int i2, int i3, int i4) {
        C9677q.m14633g(uri, "uri");
        C9677q.m14633g(mediaType, "mediaType");
        return new ContentResolverMedia(j, uri, mediaType, str, str2, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentResolverMedia)) {
            return false;
        }
        ContentResolverMedia contentResolverMedia = (ContentResolverMedia) obj;
        return this.f8960id == contentResolverMedia.f8960id && C9677q.m14638b(this.uri, contentResolverMedia.uri) && this.mediaType == contentResolverMedia.mediaType && C9677q.m14638b(this.mimeType, contentResolverMedia.mimeType) && C9677q.m14638b(this.name, contentResolverMedia.name) && this.duration == contentResolverMedia.duration && this.dateAdded == contentResolverMedia.dateAdded && this.width == contentResolverMedia.width && this.height == contentResolverMedia.height;
    }

    public final int getDateAdded() {
        return this.dateAdded;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f8960id;
    }

    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a = ((((C2968a.m32873a(this.f8960id) * 31) + this.uri.hashCode()) * 31) + this.mediaType.hashCode()) * 31;
        String str = this.mimeType;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode + i) * 31) + this.duration) * 31) + this.dateAdded) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        long j = this.f8960id;
        Uri uri = this.uri;
        MediaType mediaType = this.mediaType;
        String str = this.mimeType;
        String str2 = this.name;
        int i = this.duration;
        int i2 = this.dateAdded;
        int i3 = this.width;
        int i4 = this.height;
        return "ContentResolverMedia(id=" + j + ", uri=" + uri + ", mediaType=" + mediaType + ", mimeType=" + str + ", name=" + str2 + ", duration=" + i + ", dateAdded=" + i2 + ", width=" + i3 + ", height=" + i4 + ")";
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;", "", "queryColumnId", "Lcom/discord/media/utils/ContentResolverMedia$Column;", "queryColumnDisplayName", "queryColumnMimeType", "queryColumnWidth", "queryColumnHeight", "queryColumnDateAdded", "queryMediaType", "queryColumnDuration", "(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V", "getContentResolverMedia", "Lcom/discord/media/utils/ContentResolverMedia;", "queryUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "getProjection", "", "", "()[Ljava/lang/String;", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class QueryColumns {
        private final Column queryColumnDateAdded;
        private final Column queryColumnDisplayName;
        private final Column queryColumnDuration;
        private final Column queryColumnHeight;
        private final Column queryColumnId;
        private final Column queryColumnMimeType;
        private final Column queryColumnWidth;
        private final Column queryMediaType;

        public QueryColumns() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public QueryColumns(Column queryColumnId, Column queryColumnDisplayName, Column queryColumnMimeType, Column queryColumnWidth, Column queryColumnHeight, Column queryColumnDateAdded, Column column, Column column2) {
            C9677q.m14633g(queryColumnId, "queryColumnId");
            C9677q.m14633g(queryColumnDisplayName, "queryColumnDisplayName");
            C9677q.m14633g(queryColumnMimeType, "queryColumnMimeType");
            C9677q.m14633g(queryColumnWidth, "queryColumnWidth");
            C9677q.m14633g(queryColumnHeight, "queryColumnHeight");
            C9677q.m14633g(queryColumnDateAdded, "queryColumnDateAdded");
            this.queryColumnId = queryColumnId;
            this.queryColumnDisplayName = queryColumnDisplayName;
            this.queryColumnMimeType = queryColumnMimeType;
            this.queryColumnWidth = queryColumnWidth;
            this.queryColumnHeight = queryColumnHeight;
            this.queryColumnDateAdded = queryColumnDateAdded;
            this.queryMediaType = column;
            this.queryColumnDuration = column2;
        }

        public final ContentResolverMedia getContentResolverMedia(Uri queryUri, Cursor cursor) {
            boolean z;
            MediaType mediaType;
            boolean z2;
            C9677q.m14633g(queryUri, "queryUri");
            C9677q.m14633g(cursor, "cursor");
            Column column = this.queryMediaType;
            boolean z3 = true;
            int i = 0;
            if (column == null || column.getInt(cursor) != 3) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                List<String> pathSegments = queryUri.getPathSegments();
                if (pathSegments == null || !pathSegments.contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            long j = this.queryColumnId.getLong(cursor);
            Uri withAppendedId = ContentUris.withAppendedId(queryUri, this.queryColumnId.getLong(cursor));
            C9677q.m14634f(withAppendedId, "withAppendedId(queryUri,…ColumnId.getLong(cursor))");
            if (z3) {
                mediaType = MediaType.VIDEO;
            } else {
                mediaType = MediaType.IMAGE;
            }
            String string = this.queryColumnMimeType.getString(cursor);
            String string2 = this.queryColumnDisplayName.getString(cursor);
            Column column2 = this.queryColumnDuration;
            if (column2 != null) {
                i = column2.getInt(cursor);
            }
            return new ContentResolverMedia(j, withAppendedId, mediaType, string, string2, i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.queryColumnDateAdded.getInt(cursor), this.queryColumnWidth.getInt(cursor), this.queryColumnHeight.getInt(cursor));
        }

        public final String[] getProjection() {
            String str;
            List n;
            String[] strArr = new String[8];
            strArr[0] = this.queryColumnId.getField();
            strArr[1] = this.queryColumnDisplayName.getField();
            strArr[2] = this.queryColumnMimeType.getField();
            strArr[3] = this.queryColumnWidth.getField();
            strArr[4] = this.queryColumnHeight.getField();
            strArr[5] = this.queryColumnDateAdded.getField();
            Column column = this.queryMediaType;
            String str2 = null;
            if (column != null) {
                str = column.getField();
            } else {
                str = null;
            }
            strArr[6] = str;
            Column column2 = this.queryColumnDuration;
            if (column2 != null) {
                str2 = column2.getField();
            }
            strArr[7] = str2;
            n = C9610j.m14815n(strArr);
            return (String[]) n.toArray(new String[0]);
        }

        public /* synthetic */ QueryColumns(Column column, Column column2, Column column3, Column column4, Column column5, Column column6, Column column7, Column column8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Column("_id") : column, (i & 2) != 0 ? new Column("_display_name") : column2, (i & 4) != 0 ? new Column("mime_type") : column3, (i & 8) != 0 ? new Column("width") : column4, (i & 16) != 0 ? new Column("height") : column5, (i & 32) != 0 ? new Column("date_added") : column6, (i & 64) != 0 ? new Column("media_type") : column7, (i & 128) != 0 ? new Column("duration") : column8);
        }
    }
}
