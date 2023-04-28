package p470zj;

import com.facebook.react.util.JSStackTrace;
import fk.C7366m;
import fk.C7367n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Sink;
import okio.Source;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u0000 \f2\u00020\u0001:\u0001\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014"}, m15073d2 = {"Lzj/a;", "", "Ljava/io/File;", JSStackTrace.FILE_KEY, "Lokio/Source;", "e", "Lokio/Sink;", "f", "c", "", "h", "", "b", "", "d", "from", "to", "g", "directory", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: zj.a */
/* loaded from: classes8.dex */
public interface AbstractC14668a {

    /* renamed from: b */
    public static final C0476a f33144b = new C0476a(null);

    /* renamed from: a */
    public static final AbstractC14668a f33143a = new C0476a.C0477a();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m15073d2 = {"Lzj/a$a;", "", "Lzj/a;", "SYSTEM", "Lzj/a;", "<init>", "()V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: zj.a$a */
    /* loaded from: classes8.dex */
    public static final class C0476a {

        @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, m15073d2 = {"Lzj/a$a$a;", "Lzj/a;", "Ljava/io/File;", JSStackTrace.FILE_KEY, "Lokio/Source;", "e", "Lokio/Sink;", "f", "c", "", "h", "", "b", "", "d", "from", "to", "g", "directory", "a", "", "toString", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: zj.a$a$a */
        /* loaded from: classes8.dex */
        private static final class C0477a implements AbstractC14668a {
            @Override // p470zj.AbstractC14668a
            /* renamed from: a */
            public void mo7a(File directory) {
                C9971q.m14633g(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        C9971q.m14634f(file, "file");
                        if (file.isDirectory()) {
                            mo7a(file);
                        }
                        if (!file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + directory);
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: b */
            public boolean mo6b(File file) {
                C9971q.m14633g(file, "file");
                return file.exists();
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: c */
            public Sink mo5c(File file) {
                C9971q.m14633g(file, "file");
                try {
                    return C7366m.m22822a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C7366m.m22822a(file);
                }
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: d */
            public long mo4d(File file) {
                C9971q.m14633g(file, "file");
                return file.length();
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: e */
            public Source mo3e(File file) {
                C9971q.m14633g(file, "file");
                return C7366m.m22812k(file);
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: f */
            public Sink mo2f(File file) {
                C9971q.m14633g(file, "file");
                try {
                    return C7367n.m22803g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C7367n.m22803g(file, false, 1, null);
                }
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: g */
            public void mo1g(File from, File to) {
                C9971q.m14633g(from, "from");
                C9971q.m14633g(to, "to");
                mo0h(to);
                if (!from.renameTo(to)) {
                    throw new IOException("failed to rename " + from + " to " + to);
                }
            }

            @Override // p470zj.AbstractC14668a
            /* renamed from: h */
            public void mo0h(File file) {
                C9971q.m14633g(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0476a() {
        }

        public /* synthetic */ C0476a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    void mo7a(File file);

    /* renamed from: b */
    boolean mo6b(File file);

    /* renamed from: c */
    Sink mo5c(File file);

    /* renamed from: d */
    long mo4d(File file);

    /* renamed from: e */
    Source mo3e(File file);

    /* renamed from: f */
    Sink mo2f(File file);

    /* renamed from: g */
    void mo1g(File file, File file2);

    /* renamed from: h */
    void mo0h(File file);
}
