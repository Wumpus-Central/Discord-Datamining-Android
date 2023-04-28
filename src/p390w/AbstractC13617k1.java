package p390w;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C1802e;
import java.util.List;
import p390w.AbstractC13662r0;

/* renamed from: w.k1 */
/* loaded from: classes.dex */
public interface AbstractC13617k1 extends AbstractC13608i2 {

    /* renamed from: f */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30420f = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.targetAspectRatio", C1802e.class);

    /* renamed from: g */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30421g = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.targetRotation", Integer.TYPE);

    /* renamed from: h */
    public static final AbstractC13662r0.AbstractC13663a<Size> f30422h = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.targetResolution", Size.class);

    /* renamed from: i */
    public static final AbstractC13662r0.AbstractC13663a<Size> f30423i = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.defaultResolution", Size.class);

    /* renamed from: j */
    public static final AbstractC13662r0.AbstractC13663a<Size> f30424j = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.maxResolution", Size.class);

    /* renamed from: k */
    public static final AbstractC13662r0.AbstractC13663a<List<Pair<Integer, Size[]>>> f30425k = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.imageOutput.supportedResolutions", List.class);

    /* renamed from: w.k1$a */
    /* loaded from: classes.dex */
    public interface AbstractC13618a<B> {
        /* renamed from: b */
        B mo3209b(int i);

        /* renamed from: c */
        B mo3208c(Size size);
    }

    /* renamed from: f */
    Size mo2972f(Size size);

    /* renamed from: h */
    List<Pair<Integer, Size[]>> mo2971h(List<Pair<Integer, Size[]>> list);

    /* renamed from: q */
    boolean mo2964q();

    /* renamed from: s */
    int mo2962s();

    /* renamed from: t */
    int mo2961t(int i);

    /* renamed from: w */
    Size mo2960w(Size size);

    /* renamed from: y */
    Size mo2958y(Size size);
}
