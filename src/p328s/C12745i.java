package p328s;

import android.annotation.SuppressLint;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p328s.C12735b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.i */
/* loaded from: classes.dex */
public class C12745i implements C12735b.AbstractC12736a {

    /* renamed from: a */
    final Object f28602a;

    /* renamed from: s.i$a */
    /* loaded from: classes.dex */
    private static final class C12746a {

        /* renamed from: a */
        final List<Surface> f28603a;

        /* renamed from: b */
        final Size f28604b;

        /* renamed from: c */
        final int f28605c;

        /* renamed from: d */
        final int f28606d;

        /* renamed from: e */
        String f28607e;

        /* renamed from: f */
        boolean f28608f = false;

        C12746a(Surface surface) {
            C2517g.m37587h(surface, "Surface must not be null");
            this.f28603a = Collections.singletonList(surface);
            this.f28604b = m5571c(surface);
            this.f28605c = m5573a(surface);
            this.f28606d = m5572b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: a */
        private static int m5573a(Surface surface) {
            try {
                return ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1915r1.m39524d("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        /* renamed from: b */
        private static int m5572b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1915r1.m39524d("OutputConfigCompat", "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: c */
        private static Size m5571c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1915r1.m39524d("OutputConfigCompat", "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12746a)) {
                return false;
            }
            C12746a aVar = (C12746a) obj;
            if (!(this.f28604b.equals(aVar.f28604b) && this.f28605c == aVar.f28605c && this.f28606d == aVar.f28606d && this.f28608f == aVar.f28608f && Objects.equals(this.f28607e, aVar.f28607e))) {
                return false;
            }
            int min = Math.min(this.f28603a.size(), aVar.f28603a.size());
            for (int i = 0; i < min; i++) {
                if (this.f28603a.get(i) != aVar.f28603a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f28603a.hashCode() ^ 31;
            int i2 = this.f28606d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f28604b.hashCode() ^ ((i2 << 5) - i2);
            int i3 = this.f28605c ^ ((hashCode2 << 5) - hashCode2);
            int i4 = (this.f28608f ? 1 : 0) ^ ((i3 << 5) - i3);
            int i5 = (i4 << 5) - i4;
            String str = this.f28607e;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12745i(Surface surface) {
        this.f28602a = new C12746a(surface);
    }

    @Override // p328s.C12735b.AbstractC12736a
    /* renamed from: a */
    public void mo5576a(String str) {
        ((C12746a) this.f28602a).f28607e = str;
    }

    @Override // p328s.C12735b.AbstractC12736a
    /* renamed from: b */
    public String mo5575b() {
        return ((C12746a) this.f28602a).f28607e;
    }

    @Override // p328s.C12735b.AbstractC12736a
    /* renamed from: c */
    public Object mo5574c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12745i)) {
            return false;
        }
        return Objects.equals(this.f28602a, ((C12745i) obj).f28602a);
    }

    @Override // p328s.C12735b.AbstractC12736a
    public Surface getSurface() {
        List<Surface> list = ((C12746a) this.f28602a).f28603a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public int hashCode() {
        return this.f28602a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12745i(Object obj) {
        this.f28602a = obj;
    }
}
