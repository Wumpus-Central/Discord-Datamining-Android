package p141hh;

import gh.AbstractC7637r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mh.C10606a;
import mh.C10612e;
import p141hh.C8019a;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p427xg.C14108b0;
import th.C13103f;

/* renamed from: hh.b */
/* loaded from: classes8.dex */
public class C8020b implements AbstractC7637r.AbstractC7640c {

    /* renamed from: j */
    private static final boolean f17305j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    private static final Map<C11136b, C8019a.EnumC0249a> f17306k;

    /* renamed from: a */
    private int[] f17307a = null;

    /* renamed from: b */
    private String f17308b = null;

    /* renamed from: c */
    private int f17309c = 0;

    /* renamed from: d */
    private String f17310d = null;

    /* renamed from: e */
    private String[] f17311e = null;

    /* renamed from: f */
    private String[] f17312f = null;

    /* renamed from: g */
    private String[] f17313g = null;

    /* renamed from: h */
    private C8019a.EnumC0249a f17314h = null;

    /* renamed from: i */
    private String[] f17315i = null;

    /* renamed from: hh.b$b */
    /* loaded from: classes8.dex */
    private static abstract class AbstractC0251b implements AbstractC7637r.AbstractC7639b {

        /* renamed from: a */
        private final List<String> f17316a = new ArrayList();

        /* renamed from: f */
        private static /* synthetic */ void m20813f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // gh.AbstractC7637r.AbstractC7639b
        /* renamed from: a */
        public void mo20818a() {
            mo20793g((String[]) this.f17316a.toArray(new String[0]));
        }

        @Override // gh.AbstractC7637r.AbstractC7639b
        /* renamed from: b */
        public void mo20817b(C13103f fVar) {
            if (fVar == null) {
                m20813f(2);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7639b
        /* renamed from: c */
        public AbstractC7637r.AbstractC7638a mo20816c(C11136b bVar) {
            if (bVar != null) {
                return null;
            }
            m20813f(3);
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7639b
        /* renamed from: d */
        public void mo20815d(C11136b bVar, C11142f fVar) {
            if (bVar == null) {
                m20813f(0);
            }
            if (fVar == null) {
                m20813f(1);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7639b
        /* renamed from: e */
        public void mo20814e(Object obj) {
            if (obj instanceof String) {
                this.f17316a.add((String) obj);
            }
        }

        /* renamed from: g */
        protected abstract void mo20793g(String[] strArr);
    }

    /* renamed from: hh.b$c */
    /* loaded from: classes8.dex */
    private class C8022c implements AbstractC7637r.AbstractC7638a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hh.b$c$a */
        /* loaded from: classes8.dex */
        public class C8023a extends AbstractC0251b {
            C8023a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m20809f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // p141hh.C8020b.AbstractC0251b
            /* renamed from: g */
            protected void mo20793g(String[] strArr) {
                if (strArr == null) {
                    m20809f(0);
                }
                C8020b.this.f17311e = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hh.b$c$b */
        /* loaded from: classes8.dex */
        public class C0252b extends AbstractC0251b {
            C0252b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m20808f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // p141hh.C8020b.AbstractC0251b
            /* renamed from: g */
            protected void mo20793g(String[] strArr) {
                if (strArr == null) {
                    m20808f(0);
                }
                C8020b.this.f17312f = strArr;
            }
        }

        private C8022c() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m20812g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private AbstractC7637r.AbstractC7639b m20811h() {
            return new C8023a();
        }

        /* renamed from: i */
        private AbstractC7637r.AbstractC7639b m20810i() {
            return new C0252b();
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: a */
        public void mo20804a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: b */
        public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.m10771b();
            } else {
                str = null;
            }
            if ("d1".equals(str)) {
                return m20811h();
            }
            if ("d2".equals(str)) {
                return m20810i();
            }
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: c */
        public void mo20802c(C11142f fVar, C11136b bVar, C11142f fVar2) {
            if (bVar == null) {
                m20812g(1);
            }
            if (fVar2 == null) {
                m20812g(2);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: d */
        public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b bVar) {
            if (bVar != null) {
                return null;
            }
            m20812g(3);
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: e */
        public void mo20800e(C11142f fVar, C13103f fVar2) {
            if (fVar2 == null) {
                m20812g(0);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: f */
        public void mo20799f(C11142f fVar, Object obj) {
            if (fVar != null) {
                String b = fVar.m10771b();
                if ("k".equals(b)) {
                    if (obj instanceof Integer) {
                        C8020b.this.f17314h = C8019a.EnumC0249a.m20831c(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(b)) {
                    if (obj instanceof int[]) {
                        C8020b.this.f17307a = (int[]) obj;
                    }
                } else if ("xs".equals(b)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.isEmpty()) {
                            C8020b.this.f17308b = str;
                        }
                    }
                } else if ("xi".equals(b)) {
                    if (obj instanceof Integer) {
                        C8020b.this.f17309c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(b) && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (!str2.isEmpty()) {
                        C8020b.this.f17310d = str2;
                    }
                }
            }
        }
    }

    /* renamed from: hh.b$d */
    /* loaded from: classes8.dex */
    private class C8024d implements AbstractC7637r.AbstractC7638a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hh.b$d$a */
        /* loaded from: classes8.dex */
        public class C8025a extends AbstractC0251b {
            C8025a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m20805f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // p141hh.C8020b.AbstractC0251b
            /* renamed from: g */
            protected void mo20793g(String[] strArr) {
                if (strArr == null) {
                    m20805f(0);
                }
                C8020b.this.f17315i = strArr;
            }
        }

        private C8024d() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m20807g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private AbstractC7637r.AbstractC7639b m20806h() {
            return new C8025a();
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: a */
        public void mo20804a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: b */
        public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.m10771b();
            } else {
                str = null;
            }
            if ("b".equals(str)) {
                return m20806h();
            }
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: c */
        public void mo20802c(C11142f fVar, C11136b bVar, C11142f fVar2) {
            if (bVar == null) {
                m20807g(1);
            }
            if (fVar2 == null) {
                m20807g(2);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: d */
        public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b bVar) {
            if (bVar != null) {
                return null;
            }
            m20807g(3);
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: e */
        public void mo20800e(C11142f fVar, C13103f fVar2) {
            if (fVar2 == null) {
                m20807g(0);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: f */
        public void mo20799f(C11142f fVar, Object obj) {
        }
    }

    /* renamed from: hh.b$e */
    /* loaded from: classes8.dex */
    private class C8026e implements AbstractC7637r.AbstractC7638a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hh.b$e$a */
        /* loaded from: classes8.dex */
        public class C8027a extends AbstractC0251b {
            C8027a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m20795f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // p141hh.C8020b.AbstractC0251b
            /* renamed from: g */
            protected void mo20793g(String[] strArr) {
                if (strArr == null) {
                    m20795f(0);
                }
                C8020b.this.f17311e = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hh.b$e$b */
        /* loaded from: classes8.dex */
        public class C0253b extends AbstractC0251b {
            C0253b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m20794f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // p141hh.C8020b.AbstractC0251b
            /* renamed from: g */
            protected void mo20793g(String[] strArr) {
                if (strArr == null) {
                    m20794f(0);
                }
                C8020b.this.f17312f = strArr;
            }
        }

        private C8026e() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m20798g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private AbstractC7637r.AbstractC7639b m20797h() {
            return new C8027a();
        }

        /* renamed from: i */
        private AbstractC7637r.AbstractC7639b m20796i() {
            return new C0253b();
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: a */
        public void mo20804a() {
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: b */
        public AbstractC7637r.AbstractC7639b mo20803b(C11142f fVar) {
            String str;
            if (fVar != null) {
                str = fVar.m10771b();
            } else {
                str = null;
            }
            if ("data".equals(str) || "filePartClassNames".equals(str)) {
                return m20797h();
            }
            if ("strings".equals(str)) {
                return m20796i();
            }
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: c */
        public void mo20802c(C11142f fVar, C11136b bVar, C11142f fVar2) {
            if (bVar == null) {
                m20798g(1);
            }
            if (fVar2 == null) {
                m20798g(2);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: d */
        public AbstractC7637r.AbstractC7638a mo20801d(C11142f fVar, C11136b bVar) {
            if (bVar != null) {
                return null;
            }
            m20798g(3);
            return null;
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: e */
        public void mo20800e(C11142f fVar, C13103f fVar2) {
            if (fVar2 == null) {
                m20798g(0);
            }
        }

        @Override // gh.AbstractC7637r.AbstractC7638a
        /* renamed from: f */
        public void mo20799f(C11142f fVar, Object obj) {
            String str;
            if (fVar != null) {
                String b = fVar.m10771b();
                if ("version".equals(b)) {
                    if (obj instanceof int[]) {
                        C8020b.this.f17307a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(b)) {
                    C8020b bVar = C8020b.this;
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    bVar.f17308b = str;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17306k = hashMap;
        hashMap.put(C11136b.m10805m(new C11137c("kotlin.jvm.internal.KotlinClass")), C8019a.EnumC0249a.CLASS);
        hashMap.put(C11136b.m10805m(new C11137c("kotlin.jvm.internal.KotlinFileFacade")), C8019a.EnumC0249a.FILE_FACADE);
        hashMap.put(C11136b.m10805m(new C11137c("kotlin.jvm.internal.KotlinMultifileClass")), C8019a.EnumC0249a.MULTIFILE_CLASS);
        hashMap.put(C11136b.m10805m(new C11137c("kotlin.jvm.internal.KotlinMultifileClassPart")), C8019a.EnumC0249a.MULTIFILE_CLASS_PART);
        hashMap.put(C11136b.m10805m(new C11137c("kotlin.jvm.internal.KotlinSyntheticClass")), C8019a.EnumC0249a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    private static /* synthetic */ void m20829d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: n */
    private boolean m20819n() {
        C8019a.EnumC0249a aVar = this.f17314h;
        return aVar == C8019a.EnumC0249a.CLASS || aVar == C8019a.EnumC0249a.FILE_FACADE || aVar == C8019a.EnumC0249a.MULTIFILE_CLASS_PART;
    }

    @Override // gh.AbstractC7637r.AbstractC7640c
    /* renamed from: a */
    public void mo15156a() {
    }

    @Override // gh.AbstractC7637r.AbstractC7640c
    /* renamed from: b */
    public AbstractC7637r.AbstractC7638a mo15155b(C11136b bVar, AbstractC11299a1 a1Var) {
        C8019a.EnumC0249a aVar;
        if (bVar == null) {
            m20829d(0);
        }
        if (a1Var == null) {
            m20829d(1);
        }
        C11137c b = bVar.m10816b();
        if (b.equals(C14108b0.f31846a)) {
            return new C8022c();
        }
        if (b.equals(C14108b0.f31864s)) {
            return new C8024d();
        }
        if (f17305j || this.f17314h != null || (aVar = f17306k.get(bVar)) == null) {
            return null;
        }
        this.f17314h = aVar;
        return new C8026e();
    }

    /* renamed from: m */
    public C8019a m20820m() {
        boolean z;
        byte[] bArr = null;
        if (this.f17314h == null || this.f17307a == null) {
            return null;
        }
        int[] iArr = this.f17307a;
        if ((this.f17309c & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        C10612e eVar = new C10612e(iArr, z);
        if (!eVar.m12732h()) {
            this.f17313g = this.f17311e;
            this.f17311e = null;
        } else if (m20819n() && this.f17311e == null) {
            return null;
        }
        String[] strArr = this.f17315i;
        if (strArr != null) {
            bArr = C10606a.m12742e(strArr);
        }
        return new C8019a(this.f17314h, eVar, this.f17311e, this.f17313g, this.f17312f, this.f17308b, this.f17309c, this.f17310d, bArr);
    }
}
