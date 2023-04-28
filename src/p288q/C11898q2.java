package p288q;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C1915r1;
import androidx.camera.core.impl.utils.C1838b;
import androidx.camera.core.impl.utils.C1846g;
import androidx.core.util.C2517g;
import com.discord.media.utils.DiscordVideoMediaSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p163j$.util.Spliterator;
import p308r.C12267f0;
import p308r.C12275i;
import p308r.C12306v0;
import p355u.C13164d;
import p355u.C13165e;
import p355u.C13172l;
import p355u.C13174n;
import p390w.AbstractC13617k1;
import p390w.AbstractC13658q2;
import p390w.AbstractC13667r2;
import p390w.AbstractC13697x2;
import p390w.C13654p2;

/* renamed from: q.q2 */
/* loaded from: classes.dex */
final class C11898q2 {

    /* renamed from: q */
    private static final Size f26571q = new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT);

    /* renamed from: r */
    private static final Size f26572r = new Size(0, 0);

    /* renamed from: s */
    private static final Size f26573s = new Size(1920, 1080);

    /* renamed from: t */
    private static final Size f26574t = new Size(720, DiscordVideoMediaSource.DEFAULT_HEIGHT);

    /* renamed from: u */
    private static final Rational f26575u = new Rational(4, 3);

    /* renamed from: v */
    private static final Rational f26576v = new Rational(3, 4);

    /* renamed from: w */
    private static final Rational f26577w = new Rational(16, 9);

    /* renamed from: x */
    private static final Rational f26578x = new Rational(9, 16);

    /* renamed from: c */
    private final String f26581c;

    /* renamed from: d */
    private final AbstractC11808e f26582d;

    /* renamed from: e */
    private final C12267f0 f26583e;

    /* renamed from: f */
    private final C13164d f26584f;

    /* renamed from: h */
    private final int f26586h;

    /* renamed from: i */
    private final boolean f26587i;

    /* renamed from: m */
    private AbstractC13667r2 f26591m;

    /* renamed from: o */
    private final C11951y1 f26593o;

    /* renamed from: a */
    private final List<C13654p2> f26579a = new ArrayList();

    /* renamed from: b */
    private final Map<Integer, Size> f26580b = new HashMap();

    /* renamed from: j */
    private final Map<Integer, List<Size>> f26588j = new HashMap();

    /* renamed from: k */
    private boolean f26589k = false;

    /* renamed from: l */
    private boolean f26590l = false;

    /* renamed from: n */
    private Map<Integer, Size[]> f26592n = new HashMap();

    /* renamed from: p */
    private final C13172l f26594p = new C13172l();

    /* renamed from: g */
    private final C13165e f26585g = new C13165e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.q2$a */
    /* loaded from: classes.dex */
    public static final class C11899a implements Comparator<Rational> {

        /* renamed from: k */
        private Rational f26595k;

        C11899a(Rational rational) {
            this.f26595k = rational;
        }

        /* renamed from: b */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f26595k.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f26595k.floatValue())).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11898q2(Context context, String str, C12306v0 v0Var, AbstractC11808e eVar) {
        int i;
        String str2 = (String) C2517g.m37588g(str);
        this.f26581c = str2;
        this.f26582d = (AbstractC11808e) C2517g.m37588g(eVar);
        this.f26584f = new C13164d(str);
        this.f26593o = C11951y1.m8149b(context);
        try {
            C12267f0 c = v0Var.m7180c(str2);
            this.f26583e = c;
            Integer num = (Integer) c.m7252a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.f26586h = i;
            this.f26587i = m8375H();
            m8363h();
            m8362i();
            m8370a();
        } catch (C12275i e) {
            throw C11874m1.m8406a(e);
        }
    }

    /* renamed from: A */
    private Rational m8382A(AbstractC13617k1 k1Var) {
        Rational rational;
        int a = new C13174n().m4421a(this.f26581c, this.f26583e);
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    Size f = m8365f(Spliterator.NONNULL);
                    return new Rational(f.getWidth(), f.getHeight());
                } else if (a != 3) {
                    return null;
                } else {
                    Size B = m8381B(k1Var);
                    if (k1Var.mo2964q()) {
                        int s = k1Var.mo2962s();
                        if (s != 0) {
                            if (s != 1) {
                                C1915r1.m39525c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + s);
                                return null;
                            } else if (this.f26587i) {
                                rational = f26577w;
                            } else {
                                rational = f26578x;
                            }
                        } else if (this.f26587i) {
                            rational = f26575u;
                        } else {
                            rational = f26576v;
                        }
                    } else if (B != null) {
                        return new Rational(B.getWidth(), B.getHeight());
                    } else {
                        return null;
                    }
                }
            } else if (this.f26587i) {
                rational = f26577w;
            } else {
                rational = f26578x;
            }
        } else if (this.f26587i) {
            rational = f26575u;
        } else {
            rational = f26576v;
        }
        return rational;
    }

    /* renamed from: B */
    private Size m8381B(AbstractC13617k1 k1Var) {
        return m8364g(k1Var.mo2958y(null), k1Var.mo2961t(0));
    }

    /* renamed from: C */
    private List<Integer> m8380C(List<AbstractC13697x2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (AbstractC13697x2<?> x2Var : list) {
            int r = x2Var.mo2963r(0);
            if (!arrayList2.contains(Integer.valueOf(r))) {
                arrayList2.add(Integer.valueOf(r));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (AbstractC13697x2<?> x2Var2 : list) {
                if (intValue == x2Var2.mo2963r(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(x2Var2)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    private Map<Rational, List<Size>> m8379D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f26575u, new ArrayList());
        hashMap.put(f26577w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (m8378E(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    static boolean m8378E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (m8359l(size) >= m8359l(f26571q)) {
            return m8377F(size, rational);
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m8377F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (m8374I(Math.max(0, height - 16), width, rational) || m8374I(Math.max(0, width - 16), height, rational2)) {
                return true;
            }
            return false;
        } else if (i == 0) {
            return m8374I(height, width, rational);
        } else {
            if (height % 16 == 0) {
                return m8374I(width, height, rational2);
            }
            return false;
        }
    }

    /* renamed from: G */
    private boolean m8376G(int i) {
        boolean z;
        Integer num = (Integer) this.f26583e.m7252a(CameraCharacteristics.SENSOR_ORIENTATION);
        C2517g.m37587h(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b = C1838b.m39691b(i);
        Integer num2 = (Integer) this.f26583e.m7252a(CameraCharacteristics.LENS_FACING);
        C2517g.m37587h(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        if (1 == num2.intValue()) {
            z = true;
        } else {
            z = false;
        }
        int a = C1838b.m39692a(b, num.intValue(), z);
        if (a == 90 || a == 270) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private boolean m8375H() {
        Size size = (Size) this.f26583e.m7252a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        if (size == null || size.getWidth() >= size.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    private static boolean m8374I(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37594a(z);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        if (numerator <= Math.max(0, i2 - 16) || numerator >= i2 + 16) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private void m8373J() {
        this.f26593o.m8146e();
        if (this.f26591m == null) {
            m8362i();
            return;
        }
        this.f26591m = AbstractC13667r2.m3096a(this.f26591m.mo3095b(), this.f26593o.m8147d(), this.f26591m.mo3093d());
    }

    /* renamed from: K */
    private void m8372K(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            int i2 = 0;
            while (true) {
                i = i2;
                if (i >= list.size()) {
                    break;
                }
                Size size2 = list.get(i);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i >= 0) {
                    arrayList.add(list.get(i));
                }
                i2 = i + 1;
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    private void m8370a() {
    }

    /* renamed from: c */
    private Size[] m8368c(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f26583e.m7252a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
            if (outputSizes != null) {
                Size[] d = m8367d(outputSizes, i);
                Arrays.sort(d, new C1846g(true));
                return d;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: d */
    private Size[] m8367d(Size[] sizeArr, int i) {
        List<Size> e = m8366e(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: e */
    private List<Size> m8366e(int i) {
        List<Size> list = this.f26588j.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> a = this.f26584f.m4433a(i);
        this.f26588j.put(Integer.valueOf(i), a);
        return a;
    }

    /* renamed from: f */
    private Size m8365f(int i) {
        Size size = this.f26580b.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size t = m8351t(i);
        this.f26580b.put(Integer.valueOf(i), t);
        return t;
    }

    /* renamed from: g */
    private Size m8364g(Size size, int i) {
        if (size == null || !m8376G(i)) {
            return size;
        }
        return new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: h */
    private void m8363h() {
        this.f26579a.addAll(m8354q());
        int i = this.f26586h;
        if (i == 0 || i == 1 || i == 3) {
            this.f26579a.addAll(m8352s());
        }
        int i2 = this.f26586h;
        if (i2 == 1 || i2 == 3) {
            this.f26579a.addAll(m8355p());
        }
        int[] iArr = (int[]) this.f26583e.m7252a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.f26589k = true;
                } else if (i3 == 6) {
                    this.f26590l = true;
                }
            }
        }
        if (this.f26589k) {
            this.f26579a.addAll(m8350u());
        }
        if (this.f26590l && this.f26586h == 0) {
            this.f26579a.addAll(m8358m());
        }
        if (this.f26586h == 3) {
            this.f26579a.addAll(m8353r());
        }
        this.f26579a.addAll(this.f26585g.m4432a(this.f26581c, this.f26586h));
    }

    /* renamed from: i */
    private void m8362i() {
        this.f26591m = AbstractC13667r2.m3096a(new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT), this.f26593o.m8147d(), m8349v());
    }

    /* renamed from: j */
    private Size[] m8361j(int i) {
        Size[] sizeArr = this.f26592n.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] c = m8368c(i);
        this.f26592n.put(Integer.valueOf(i), c);
        return c;
    }

    /* renamed from: k */
    private List<List<Size>> m8360k(List<List<Size>> list) {
        int i = 1;
        for (List<Size> list2 : list) {
            i *= list2.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List<Size> list3 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add(list3.get((i5 % i3) / size));
                }
                if (i4 < list.size() - 1) {
                    i3 = size;
                    size /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: l */
    private static int m8359l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    /* renamed from: n */
    private AbstractC13658q2.EnumC13660b m8357n(int i) {
        if (i == 35) {
            return AbstractC13658q2.EnumC13660b.YUV;
        }
        if (i == 256) {
            return AbstractC13658q2.EnumC13660b.JPEG;
        }
        if (i == 32) {
            return AbstractC13658q2.EnumC13660b.RAW;
        }
        return AbstractC13658q2.EnumC13660b.PRIV;
    }

    /* renamed from: o */
    private Size[] m8356o(int i, AbstractC13617k1 k1Var) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> h = k1Var.mo2971h(null);
        if (h != null) {
            Iterator<Pair<Integer, Size[]>> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] d = m8367d(sizeArr, i);
        Arrays.sort(d, new C1846g(true));
        return d;
    }

    /* renamed from: v */
    private Size m8349v() {
        CamcorderProfile camcorderProfile;
        try {
            int parseInt = Integer.parseInt(this.f26581c);
            if (this.f26582d.mo8596b(parseInt, 1)) {
                camcorderProfile = this.f26582d.mo8597a(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return m8348w(parseInt);
        } catch (NumberFormatException unused) {
            return m8347x();
        }
    }

    /* renamed from: w */
    private Size m8348w(int i) {
        CamcorderProfile camcorderProfile;
        Size size = f26574t;
        if (this.f26582d.mo8596b(i, 10)) {
            camcorderProfile = this.f26582d.mo8597a(i, 10);
        } else if (this.f26582d.mo8596b(i, 8)) {
            camcorderProfile = this.f26582d.mo8597a(i, 8);
        } else if (this.f26582d.mo8596b(i, 12)) {
            camcorderProfile = this.f26582d.mo8597a(i, 12);
        } else if (this.f26582d.mo8596b(i, 6)) {
            camcorderProfile = this.f26582d.mo8597a(i, 6);
        } else if (this.f26582d.mo8596b(i, 5)) {
            camcorderProfile = this.f26582d.mo8597a(i, 5);
        } else if (this.f26582d.mo8596b(i, 4)) {
            camcorderProfile = this.f26582d.mo8597a(i, 4);
        } else {
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        return size;
    }

    /* renamed from: x */
    private Size m8347x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f26583e.m7252a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f26574t;
            }
            Arrays.sort(outputSizes, new C1846g(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f26573s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f26574t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public AbstractC13658q2 m8371L(int i, Size size) {
        AbstractC13658q2.EnumC13660b n = m8357n(i);
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.NOT_SUPPORT;
        Size f = m8365f(i);
        if (size.getWidth() * size.getHeight() <= this.f26591m.mo3095b().getWidth() * this.f26591m.mo3095b().getHeight()) {
            aVar = AbstractC13658q2.EnumC13659a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f26591m.mo3094c().getWidth() * this.f26591m.mo3094c().getHeight()) {
            aVar = AbstractC13658q2.EnumC13659a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f26591m.mo3093d().getWidth() * this.f26591m.mo3093d().getHeight()) {
            aVar = AbstractC13658q2.EnumC13659a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f.getWidth() * f.getHeight()) {
            aVar = AbstractC13658q2.EnumC13659a.MAXIMUM;
        }
        return AbstractC13658q2.m3107a(n, aVar);
    }

    /* renamed from: b */
    boolean m8369b(List<AbstractC13658q2> list) {
        Iterator<C13654p2> it = this.f26579a.iterator();
        boolean z = false;
        while (it.hasNext() && !(z = it.next().m3110d(list))) {
        }
        return z;
    }

    /* renamed from: m */
    List<C13654p2> m8358m() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.MAXIMUM;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.YUV;
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var2);
        C13654p2 p2Var3 = new C13654p2();
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var3);
        return arrayList;
    }

    /* renamed from: p */
    List<C13654p2> m8355p() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.MAXIMUM;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.YUV;
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var2);
        C13654p2 p2Var3 = new C13654p2();
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var3);
        C13654p2 p2Var4 = new C13654p2();
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var4.m3113a(AbstractC13658q2.m3107a(AbstractC13658q2.EnumC13660b.JPEG, aVar2));
        arrayList.add(p2Var4);
        C13654p2 p2Var5 = new C13654p2();
        AbstractC13658q2.EnumC13659a aVar3 = AbstractC13658q2.EnumC13659a.ANALYSIS;
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar2, aVar3));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var5);
        C13654p2 p2Var6 = new C13654p2();
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar2, aVar3));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var6);
        return arrayList;
    }

    /* renamed from: q */
    List<C13654p2> m8354q() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.MAXIMUM;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.JPEG;
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        arrayList.add(p2Var2);
        C13654p2 p2Var3 = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar3 = AbstractC13658q2.EnumC13660b.YUV;
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar3, aVar));
        arrayList.add(p2Var3);
        C13654p2 p2Var4 = new C13654p2();
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        arrayList.add(p2Var4);
        C13654p2 p2Var5 = new C13654p2();
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        arrayList.add(p2Var5);
        C13654p2 p2Var6 = new C13654p2();
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        arrayList.add(p2Var6);
        C13654p2 p2Var7 = new C13654p2();
        p2Var7.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        p2Var7.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        arrayList.add(p2Var7);
        C13654p2 p2Var8 = new C13654p2();
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        arrayList.add(p2Var8);
        return arrayList;
    }

    /* renamed from: r */
    List<C13654p2> m8353r() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.ANALYSIS;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.YUV;
        AbstractC13658q2.EnumC13659a aVar3 = AbstractC13658q2.EnumC13659a.MAXIMUM;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar2, aVar3));
        AbstractC13658q2.EnumC13660b bVar3 = AbstractC13658q2.EnumC13660b.RAW;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar3, aVar3));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        p2Var2.m3113a(AbstractC13658q2.m3107a(AbstractC13658q2.EnumC13660b.JPEG, aVar3));
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar3, aVar3));
        arrayList.add(p2Var2);
        return arrayList;
    }

    /* renamed from: s */
    List<C13654p2> m8352s() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.RECORD;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.YUV;
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var2);
        C13654p2 p2Var3 = new C13654p2();
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        arrayList.add(p2Var3);
        C13654p2 p2Var4 = new C13654p2();
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar2));
        AbstractC13658q2.EnumC13660b bVar3 = AbstractC13658q2.EnumC13660b.JPEG;
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        arrayList.add(p2Var4);
        C13654p2 p2Var5 = new C13654p2();
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        arrayList.add(p2Var5);
        C13654p2 p2Var6 = new C13654p2();
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar2, aVar));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar3, AbstractC13658q2.EnumC13659a.MAXIMUM));
        arrayList.add(p2Var6);
        return arrayList;
    }

    /* renamed from: t */
    Size m8351t(int i) {
        return (Size) Collections.max(Arrays.asList(m8361j(i)), new C1846g());
    }

    /* renamed from: u */
    List<C13654p2> m8350u() {
        ArrayList arrayList = new ArrayList();
        C13654p2 p2Var = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar = AbstractC13658q2.EnumC13660b.RAW;
        AbstractC13658q2.EnumC13659a aVar = AbstractC13658q2.EnumC13659a.MAXIMUM;
        p2Var.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var);
        C13654p2 p2Var2 = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar2 = AbstractC13658q2.EnumC13660b.PRIV;
        AbstractC13658q2.EnumC13659a aVar2 = AbstractC13658q2.EnumC13659a.PREVIEW;
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        p2Var2.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var2);
        C13654p2 p2Var3 = new C13654p2();
        AbstractC13658q2.EnumC13660b bVar3 = AbstractC13658q2.EnumC13660b.YUV;
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var3.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var3);
        C13654p2 p2Var4 = new C13654p2();
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        p2Var4.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var4);
        C13654p2 p2Var5 = new C13654p2();
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var5.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var5);
        C13654p2 p2Var6 = new C13654p2();
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var6.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var6);
        C13654p2 p2Var7 = new C13654p2();
        p2Var7.m3113a(AbstractC13658q2.m3107a(bVar2, aVar2));
        AbstractC13658q2.EnumC13660b bVar4 = AbstractC13658q2.EnumC13660b.JPEG;
        p2Var7.m3113a(AbstractC13658q2.m3107a(bVar4, aVar));
        p2Var7.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var7);
        C13654p2 p2Var8 = new C13654p2();
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar3, aVar2));
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar4, aVar));
        p2Var8.m3113a(AbstractC13658q2.m3107a(bVar, aVar));
        arrayList.add(p2Var8);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public Map<AbstractC13697x2<?>, Size> m8346y(List<AbstractC13658q2> list, List<AbstractC13697x2<?>> list2) {
        HashMap hashMap;
        m8373J();
        ArrayList arrayList = new ArrayList(list);
        for (AbstractC13697x2<?> x2Var : list2) {
            arrayList.add(m8371L(x2Var.mo2969j(), new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT)));
        }
        if (m8369b(arrayList)) {
            List<Integer> C = m8380C(list2);
            ArrayList arrayList2 = new ArrayList();
            for (Integer num : C) {
                arrayList2.add(m8345z(list2.get(num.intValue())));
            }
            Iterator<List<Size>> it = m8360k(arrayList2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashMap = null;
                    break;
                }
                List<Size> next = it.next();
                ArrayList arrayList3 = new ArrayList(list);
                for (int i = 0; i < next.size(); i++) {
                    arrayList3.add(m8371L(list2.get(C.get(i).intValue()).mo2969j(), next.get(i)));
                }
                if (m8369b(arrayList3)) {
                    hashMap = new HashMap();
                    for (AbstractC13697x2<?> x2Var2 : list2) {
                        hashMap.put(x2Var2, next.get(C.indexOf(Integer.valueOf(list2.indexOf(x2Var2)))));
                    }
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f26581c + " and Hardware level: " + this.f26586h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f26581c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
    }

    /* renamed from: z */
    List<Size> m8345z(AbstractC13697x2<?> x2Var) {
        int j = x2Var.mo2969j();
        AbstractC13617k1 k1Var = (AbstractC13617k1) x2Var;
        Size[] o = m8356o(j, k1Var);
        if (o == null) {
            o = m8361j(j);
        }
        ArrayList arrayList = new ArrayList();
        Size f = k1Var.mo2972f(null);
        Size t = m8351t(j);
        if (f == null || m8359l(t) < m8359l(f)) {
            f = t;
        }
        Arrays.sort(o, new C1846g(true));
        Size B = m8381B(k1Var);
        Size size = f26571q;
        int l = m8359l(size);
        if (m8359l(f) < l) {
            size = f26572r;
        } else if (B != null && m8359l(B) < l) {
            size = B;
        }
        for (Size size2 : o) {
            if (m8359l(size2) <= m8359l(f) && m8359l(size2) >= m8359l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational A = m8382A(k1Var);
            if (B == null) {
                B = k1Var.mo2960w(null);
            }
            List<Size> arrayList2 = new ArrayList<>();
            new HashMap();
            if (A == null) {
                arrayList2.addAll(arrayList);
                if (B != null) {
                    m8372K(arrayList2, B);
                }
            } else {
                Map<Rational, List<Size>> D = m8379D(arrayList);
                if (B != null) {
                    for (Rational rational : D.keySet()) {
                        m8372K(D.get(rational), B);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList(D.keySet());
                Collections.sort(arrayList3, new C11899a(A));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : D.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return this.f26594p.m4423a(m8357n(x2Var.mo2969j()), arrayList2);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + j);
    }
}
