package com.discord.media.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import org.webrtc.MediaStreamTrack;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u0010\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007JO\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/media/utils/ContentResolverUtils;", "", "()V", "createTempFile", "Ljava/io/File;", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "prefix", "", "extension", "isHeif", "", "isImage", "isJpeg", "isPng", "isVideo", "queryCompat", "Landroid/database/Cursor;", "queryUri", "queryProjection", "", "queryLimit", "", "querySort", "querySelection", "queryOffset", "(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Landroid/database/Cursor;", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class ContentResolverUtils {
    public static final ContentResolverUtils INSTANCE = new ContentResolverUtils();

    private ContentResolverUtils() {
    }

    public static /* synthetic */ File createTempFile$default(ContentResolverUtils contentResolverUtils, ContentResolver contentResolver, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "temp_";
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return contentResolverUtils.createTempFile(contentResolver, uri, str, str2);
    }

    public final File createTempFile(ContentResolver contentResolver, Uri uri, String prefix, String str) {
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        C9971q.m14633g(prefix, "prefix");
        if (str == null) {
            str = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
        }
        File createTempFile = File.createTempFile(prefix, "." + str);
        createTempFile.deleteOnExit();
        C9971q.m14634f(createTempFile, "createTempFile(prefix, \"….deleteOnExit()\n        }");
        return createTempFile;
    }

    public final boolean isHeif(ContentResolver contentResolver, Uri uri) {
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        if (C9971q.m14638b(contentResolver.getType(uri), "image/heif") || C9971q.m14638b(contentResolver.getType(uri), "image/heic")) {
            return true;
        }
        return false;
    }

    public final boolean isImage(ContentResolver contentResolver, Uri uri) {
        boolean H;
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            return false;
        }
        H = C12718u.m5736H(type, "image", false, 2, null);
        if (H) {
            return true;
        }
        return false;
    }

    public final boolean isJpeg(ContentResolver contentResolver, Uri uri) {
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        if (C9971q.m14638b(contentResolver.getType(uri), "image/jpeg") || C9971q.m14638b(contentResolver.getType(uri), "image/jpg")) {
            return true;
        }
        return false;
    }

    public final boolean isPng(ContentResolver contentResolver, Uri uri) {
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        return C9971q.m14638b(contentResolver.getType(uri), "image/png");
    }

    public final boolean isVideo(ContentResolver contentResolver, Uri uri) {
        boolean H;
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            return false;
        }
        H = C12718u.m5736H(type, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null);
        if (H) {
            return true;
        }
        return false;
    }

    public final Cursor queryCompat(ContentResolver contentResolver, Uri queryUri, String[] queryProjection, int i, String querySort, String str, Integer num) {
        Cursor query;
        C9971q.m14633g(contentResolver, "<this>");
        C9971q.m14633g(queryUri, "queryUri");
        C9971q.m14633g(queryProjection, "queryProjection");
        C9971q.m14633g(querySort, "querySort");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 29) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", i);
            bundle.putString("android:query-arg-sql-sort-order", querySort);
            if (str != null) {
                bundle.putString("android:query-arg-sql-selection", str);
            }
            if (num != null) {
                bundle.putInt("android:query-arg-offset", num.intValue());
            }
            Unit unit = Unit.f22042a;
            query = contentResolver.query(queryUri, queryProjection, bundle, null);
            return query;
        } else if (i2 >= 26) {
            int intValue = num != null ? num.intValue() : 0;
            return contentResolver.query(queryUri, queryProjection, str, null, querySort + " LIMIT " + i + " OFFSET " + intValue, null);
        } else {
            Uri.Builder buildUpon = queryUri.buildUpon();
            Uri.Builder encodedQuery = buildUpon.encodedQuery("limit=" + i);
            if (num != null) {
                encodedQuery.appendQueryParameter("offset", String.valueOf(num.intValue()));
            }
            return contentResolver.query(encodedQuery.build(), queryProjection, str, null, querySort);
        }
    }
}
