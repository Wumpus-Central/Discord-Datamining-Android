package p426xf;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import nf.C11088q;
import p267of.AbstractC11265b;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\t\u000eBm\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR(\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m15073d2 = {"Lxf/h;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "", "iterator", "a", "Ljava/io/File;", ViewProps.START, "Lxf/i;", "b", "Lxf/i;", "direction", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "onEnter", "", "d", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "e", "Lkotlin/jvm/functions/Function2;", "onFail", "", "f", "I", "maxDepth", "<init>", "(Ljava/io/File;Lxf/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lxf/i;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: xf.h */
/* loaded from: classes8.dex */
public final class C14087h implements Sequence<File> {

    /* renamed from: a */
    private final File f31800a;

    /* renamed from: b */
    private final EnumC14094i f31801b;

    /* renamed from: c */
    private final Function1<File, Boolean> f31802c;

    /* renamed from: d */
    private final Function1<File, Unit> f31803d;

    /* renamed from: e */
    private final Function2<File, IOException, Unit> f31804e;

    /* renamed from: f */
    private final int f31805f;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lxf/h$a;", "Lxf/h$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: xf.h$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC14088a extends AbstractC14093c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC14088a(File rootDir) {
            super(rootDir);
            C9971q.m14633g(rootDir, "rootDir");
        }
    }

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\b\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082\u0010J\b\u0010\b\u001a\u00020\u0007H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m15073d2 = {"Lxf/h$b;", "Lof/b;", "Ljava/io/File;", "root", "Lxf/h$a;", "h", "i", "", "b", "Ljava/util/ArrayDeque;", "Lxf/h$c;", "m", "Ljava/util/ArrayDeque;", "state", "<init>", "(Lxf/h;)V", "a", "c", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: xf.h$b */
    /* loaded from: classes8.dex */
    private final class C14089b extends AbstractC11265b<File> {

        /* renamed from: m */
        private final ArrayDeque<AbstractC14093c> f31806m;

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0014"}, m15073d2 = {"Lxf/h$b$a;", "Lxf/h$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "rootDir", "<init>", "(Lxf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: xf.h$b$a */
        /* loaded from: classes8.dex */
        public final class C14090a extends AbstractC14088a {

            /* renamed from: b */
            private boolean f31808b;

            /* renamed from: c */
            private File[] f31809c;

            /* renamed from: d */
            private int f31810d;

            /* renamed from: e */
            private boolean f31811e;

            /* renamed from: f */
            final /* synthetic */ C14089b f31812f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14090a(C14089b bVar, File rootDir) {
                super(rootDir);
                C9971q.m14633g(rootDir, "rootDir");
                this.f31812f = bVar;
            }

            @Override // p426xf.C14087h.AbstractC14093c
            /* renamed from: b */
            public File mo1697b() {
                if (!this.f31811e && this.f31809c == null) {
                    Function1 function1 = C14087h.this.f31802c;
                    boolean z = false;
                    if (function1 != null && !((Boolean) function1.invoke(m1698a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = m1698a().listFiles();
                    this.f31809c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = C14087h.this.f31804e;
                        if (function2 != null) {
                            function2.invoke(m1698a(), new C14080a(m1698a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f31811e = true;
                    }
                }
                File[] fileArr = this.f31809c;
                if (fileArr != null) {
                    int i = this.f31810d;
                    C9971q.m14636d(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f31809c;
                        C9971q.m14636d(fileArr2);
                        int i2 = this.f31810d;
                        this.f31810d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f31808b) {
                    this.f31808b = true;
                    return m1698a();
                }
                Function1 function12 = C14087h.this.f31803d;
                if (function12 != null) {
                    function12.invoke(m1698a());
                }
                return null;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, m15073d2 = {"Lxf/h$b$b;", "Lxf/h$c;", "Ljava/io/File;", "b", "", "Z", "visited", "rootFile", "<init>", "(Lxf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: xf.h$b$b */
        /* loaded from: classes8.dex */
        private final class C0456b extends AbstractC14093c {

            /* renamed from: b */
            private boolean f31813b;

            /* renamed from: c */
            final /* synthetic */ C14089b f31814c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0456b(C14089b bVar, File rootFile) {
                super(rootFile);
                C9971q.m14633g(rootFile, "rootFile");
                this.f31814c = bVar;
            }

            @Override // p426xf.C14087h.AbstractC14093c
            /* renamed from: b */
            public File mo1697b() {
                if (this.f31813b) {
                    return null;
                }
                this.f31813b = true;
                return m1698a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m15073d2 = {"Lxf/h$b$c;", "Lxf/h$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "rootDir", "<init>", "(Lxf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: xf.h$b$c */
        /* loaded from: classes8.dex */
        public final class C14091c extends AbstractC14088a {

            /* renamed from: b */
            private boolean f31815b;

            /* renamed from: c */
            private File[] f31816c;

            /* renamed from: d */
            private int f31817d;

            /* renamed from: e */
            final /* synthetic */ C14089b f31818e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14091c(C14089b bVar, File rootDir) {
                super(rootDir);
                C9971q.m14633g(rootDir, "rootDir");
                this.f31818e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            @Override // p426xf.C14087h.AbstractC14093c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File mo1697b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f31815b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    xf.h$b r0 = r10.f31818e
                    xf.h r0 = p426xf.C14087h.this
                    kotlin.jvm.functions.Function1 r0 = p426xf.C14087h.m1705d(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.m1698a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = r3
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f31815b = r3
                    java.io.File r0 = r10.m1698a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f31816c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f31817d
                    kotlin.jvm.internal.C9971q.m14636d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    xf.h$b r0 = r10.f31818e
                    xf.h r0 = p426xf.C14087h.this
                    kotlin.jvm.functions.Function1 r0 = p426xf.C14087h.m1703f(r0)
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.m1698a()
                    r0.invoke(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f31816c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.m1698a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f31816c = r0
                    if (r0 != 0) goto L_0x007b
                    xf.h$b r0 = r10.f31818e
                    xf.h r0 = p426xf.C14087h.this
                    kotlin.jvm.functions.Function2 r0 = p426xf.C14087h.m1704e(r0)
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.m1698a()
                    xf.a r9 = new xf.a
                    java.io.File r4 = r10.m1698a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f31816c
                    if (r0 == 0) goto L_0x0085
                    kotlin.jvm.internal.C9971q.m14636d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    xf.h$b r0 = r10.f31818e
                    xf.h r0 = p426xf.C14087h.this
                    kotlin.jvm.functions.Function1 r0 = p426xf.C14087h.m1703f(r0)
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.m1698a()
                    r0.invoke(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f31816c
                    kotlin.jvm.internal.C9971q.m14636d(r0)
                    int r1 = r10.f31817d
                    int r2 = r1 + 1
                    r10.f31817d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p426xf.C14087h.C14089b.C14091c.mo1697b():java.io.File");
            }
        }

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: xf.h$b$d */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C14092d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f31819a;

            static {
                int[] iArr = new int[EnumC14094i.values().length];
                try {
                    iArr[EnumC14094i.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC14094i.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f31819a = iArr;
            }
        }

        public C14089b() {
            ArrayDeque<AbstractC14093c> arrayDeque = new ArrayDeque<>();
            this.f31806m = arrayDeque;
            if (C14087h.this.f31800a.isDirectory()) {
                arrayDeque.push(m1700h(C14087h.this.f31800a));
            } else if (C14087h.this.f31800a.isFile()) {
                arrayDeque.push(new C0456b(this, C14087h.this.f31800a));
            } else {
                m10308d();
            }
        }

        /* renamed from: h */
        private final AbstractC14088a m1700h(File file) {
            int i = C14092d.f31819a[C14087h.this.f31801b.ordinal()];
            if (i == 1) {
                return new C14091c(this, file);
            }
            if (i == 2) {
                return new C14090a(this, file);
            }
            throw new C11088q();
        }

        /* renamed from: i */
        private final File m1699i() {
            File b;
            while (true) {
                AbstractC14093c peek = this.f31806m.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.mo1697b();
                if (b == null) {
                    this.f31806m.pop();
                } else if (C9971q.m14638b(b, peek.m1698a()) || !b.isDirectory() || this.f31806m.size() >= C14087h.this.f31805f) {
                    break;
                } else {
                    this.f31806m.push(m1700h(b));
                }
            }
            return b;
        }

        @Override // p267of.AbstractC11265b
        /* renamed from: b */
        protected void mo1701b() {
            File i = m1699i();
            if (i != null) {
                m10307f(i);
            } else {
                m10308d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m15073d2 = {"Lxf/h$c;", "", "Ljava/io/File;", "b", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: xf.h$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC14093c {

        /* renamed from: a */
        private final File f31820a;

        public AbstractC14093c(File root) {
            C9971q.m14633g(root, "root");
            this.f31820a = root;
        }

        /* renamed from: a */
        public final File m1698a() {
            return this.f31820a;
        }

        /* renamed from: b */
        public abstract File mo1697b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C14087h(File file, EnumC14094i iVar, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.f31800a = file;
        this.f31801b = iVar;
        this.f31802c = function1;
        this.f31803d = function12;
        this.f31804e = function2;
        this.f31805f = i;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new C14089b();
    }

    /* synthetic */ C14087h(File file, EnumC14094i iVar, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? EnumC14094i.TOP_DOWN : iVar, function1, function12, function2, (i2 & 32) != 0 ? ViewDefaults.NUMBER_OF_LINES : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14087h(File start, EnumC14094i direction) {
        this(start, direction, null, null, null, 0, 32, null);
        C9971q.m14633g(start, "start");
        C9971q.m14633g(direction, "direction");
    }
}
