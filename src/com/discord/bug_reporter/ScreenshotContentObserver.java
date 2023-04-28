package com.discord.bug_reporter;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import co.discord.media_engine.C4081a;
import com.discord.logging.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12718u;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0019\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver;", "Landroid/database/ContentObserver;", "contentResolver", "Landroid/content/ContentResolver;", "onScreenshot", "Lkotlin/Function0;", "", "(Landroid/content/ContentResolver;Lkotlin/jvm/functions/Function0;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "lastProcessedPath", "", "connect", "disconnect", "getProjection", "", "()[Ljava/lang/String;", "getScreenshotData", "Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "uri", "Landroid/net/Uri;", "onChange", "selfChange", "", "process", "isWithinCurrentTimeWindow", "", "window", "Companion", "ScreenshotData", "bug_reporter_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class ScreenshotContentObserver extends ContentObserver {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_DETECT_WINDOW_SECONDS = 10;
    public static final int IS_PENDING_TRUE = 1;
    private static final String SORT_ORDER = "date_added DESC";
    private final ContentResolver contentResolver;
    private String lastProcessedPath;
    private final Function0<Unit> onScreenshot;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00020\n*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$Companion;", "", "()V", "DEFAULT_DETECT_WINDOW_SECONDS", "", "IS_PENDING_TRUE", "", "SORT_ORDER", "", "isScreenshotPath", "", "bug_reporter_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isScreenshotPath(String str) {
            boolean M;
            Locale locale = Locale.getDefault();
            C9971q.m14634f(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            C9971q.m14634f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            M = C12719v.m5709M(lowerCase, "screenshots/", false, 2, null);
            return M;
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m15073d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "", "id", "", "fileName", "", "relativePath", "uri", "Landroid/net/Uri;", "dateAdded", "(JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V", "getDateAdded", "()J", "getFileName", "()Ljava/lang/String;", "getId", "path", "getPath", "getRelativePath", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "bug_reporter_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class ScreenshotData {
        private final long dateAdded;
        private final String fileName;

        /* renamed from: id */
        private final long f7184id;
        private final String path;
        private final String relativePath;
        private final Uri uri;

        public ScreenshotData(long j, String fileName, String relativePath, Uri uri, long j2) {
            C9971q.m14633g(fileName, "fileName");
            C9971q.m14633g(relativePath, "relativePath");
            C9971q.m14633g(uri, "uri");
            this.f7184id = j;
            this.fileName = fileName;
            this.relativePath = relativePath;
            this.uri = uri;
            this.dateAdded = j2;
            this.path = relativePath + "/" + fileName;
        }

        public final long component1() {
            return this.f7184id;
        }

        public final String component2() {
            return this.fileName;
        }

        public final String component3() {
            return this.relativePath;
        }

        public final Uri component4() {
            return this.uri;
        }

        public final long component5() {
            return this.dateAdded;
        }

        public final ScreenshotData copy(long j, String fileName, String relativePath, Uri uri, long j2) {
            C9971q.m14633g(fileName, "fileName");
            C9971q.m14633g(relativePath, "relativePath");
            C9971q.m14633g(uri, "uri");
            return new ScreenshotData(j, fileName, relativePath, uri, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenshotData)) {
                return false;
            }
            ScreenshotData screenshotData = (ScreenshotData) obj;
            return this.f7184id == screenshotData.f7184id && C9971q.m14638b(this.fileName, screenshotData.fileName) && C9971q.m14638b(this.relativePath, screenshotData.relativePath) && C9971q.m14638b(this.uri, screenshotData.uri) && this.dateAdded == screenshotData.dateAdded;
        }

        public final long getDateAdded() {
            return this.dateAdded;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final long getId() {
            return this.f7184id;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (((((((C4081a.m32873a(this.f7184id) * 31) + this.fileName.hashCode()) * 31) + this.relativePath.hashCode()) * 31) + this.uri.hashCode()) * 31) + C4081a.m32873a(this.dateAdded);
        }

        public String toString() {
            long j = this.f7184id;
            String str = this.fileName;
            String str2 = this.relativePath;
            Uri uri = this.uri;
            long j2 = this.dateAdded;
            return "ScreenshotData(id=" + j + ", fileName=" + str + ", relativePath=" + str2 + ", uri=" + uri + ", dateAdded=" + j2 + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotContentObserver(ContentResolver contentResolver, Function0<Unit> onScreenshot) {
        super(null);
        C9971q.m14633g(contentResolver, "contentResolver");
        C9971q.m14633g(onScreenshot, "onScreenshot");
        this.contentResolver = contentResolver;
        this.onScreenshot = onScreenshot;
    }

    private final String[] getProjection() {
        String[] strArr;
        String[] strArr2;
        Object[] p;
        Object[] p2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            strArr = new String[]{"is_pending", "relative_path"};
        } else {
            strArr = new String[0];
        }
        if (i >= 29) {
            strArr2 = new String[]{"relative_path"};
        } else {
            strArr2 = new String[]{"_data"};
        }
        p = C9897e.m14979p(new String[]{"_display_name", "date_added", "_id"}, strArr);
        p2 = C9897e.m14979p(p, strArr2);
        return (String[]) p2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, com.discord.bug_reporter.ScreenshotContentObserver$ScreenshotData, java.lang.Object, java.lang.String] */
    @SuppressLint({"Range"})
    private final ScreenshotData getScreenshotData(Uri uri) {
        Cursor cursor;
        String relativePath;
        Cursor query = this.contentResolver.query(uri, getProjection(), null, null, SORT_ORDER);
        th = 0;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    cursor = query;
                } else {
                    cursor = th;
                }
                if (cursor != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29) {
                        Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex("is_pending")));
                        boolean z = true;
                        if (valueOf.intValue() != 1) {
                            z = false;
                        }
                        if (!z) {
                            valueOf = th;
                        }
                        if (valueOf == null) {
                            return th;
                        }
                        valueOf.intValue();
                    }
                    if (i >= 29) {
                        relativePath = query.getString(query.getColumnIndex("relative_path"));
                    } else {
                        String string = query.getString(query.getColumnIndex("_data"));
                        C9971q.m14634f(string, "cursor.getString(cursor.…mages.ImageColumns.DATA))");
                        relativePath = C12719v.m5694T0(string, '/', th, 2, th);
                    }
                    long j = query.getLong(query.getColumnIndex("_id"));
                    String string2 = query.getString(query.getColumnIndex("_display_name"));
                    C9971q.m14634f(string2, "cursor.getString(cursor.…ages.Media.DISPLAY_NAME))");
                    C9971q.m14634f(relativePath, "relativePath");
                    return new ScreenshotData(j, string2, relativePath, uri, query.getLong(query.getColumnIndex("date_added")));
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return th;
    }

    private final boolean isWithinCurrentTimeWindow(long j, long j2) {
        if (Math.abs((System.currentTimeMillis() / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) - j) <= j2) {
            return true;
        }
        return false;
    }

    private final void process(Uri uri) {
        boolean u;
        ScreenshotData screenshotData = getScreenshotData(uri);
        if (screenshotData != null) {
            String str = this.lastProcessedPath;
            if (str != null) {
                u = C12718u.m5731u(str, screenshotData.getPath(), false, 2, null);
                if (u) {
                    return;
                }
            }
            if (Companion.isScreenshotPath(screenshotData.getPath()) && isWithinCurrentTimeWindow(screenshotData.getDateAdded(), DEFAULT_DETECT_WINDOW_SECONDS)) {
                this.lastProcessedPath = screenshotData.getPath();
                this.onScreenshot.invoke();
            }
        }
    }

    public final void connect() {
        this.contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this);
    }

    public final void disconnect() {
        this.contentResolver.unregisterContentObserver(this);
    }

    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        boolean H;
        super.onChange(z, uri);
        if (uri != null) {
            String uri2 = uri.toString();
            C9971q.m14634f(uri2, "uri.toString()");
            String uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
            C9971q.m14634f(uri3, "EXTERNAL_CONTENT_URI.toString()");
            H = C12718u.m5736H(uri2, uri3, false, 2, null);
            if (H) {
                try {
                    process(uri);
                } catch (Exception e) {
                    Log.INSTANCE.m32179e("ScreenshotObserver", "Screenshot error", e);
                }
            }
        }
    }
}
