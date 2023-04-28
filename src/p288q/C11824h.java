package p288q;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.C1915r1;
import androidx.camera.core.impl.utils.C1858m;
import p390w.AbstractC13672t;
import p390w.C13668s;
import p390w.C13671s2;
import p390w.EnumC13638n;
import p390w.EnumC13644o;
import p390w.EnumC13650p;
import p390w.EnumC13655q;
import p390w.EnumC13661r;

/* renamed from: q.h */
/* loaded from: classes.dex */
public class C11824h implements AbstractC13672t {

    /* renamed from: a */
    private final C13671s2 f26378a;

    /* renamed from: b */
    private final CaptureResult f26379b;

    public C11824h(C13671s2 s2Var, CaptureResult captureResult) {
        this.f26378a = s2Var;
        this.f26379b = captureResult;
    }

    @Override // p390w.AbstractC13672t
    /* renamed from: a */
    public long mo3087a() {
        Long l = (Long) this.f26379b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // p390w.AbstractC13672t
    /* renamed from: b */
    public void mo3086b(C1858m.C1860b bVar) {
        CaptureResult.Key key;
        C13668s.m3092a(this, bVar);
        Rect rect = (Rect) this.f26379b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.m39628j(rect.width()).m39629i(rect.height());
        }
        Integer num = (Integer) this.f26379b.get(CaptureResult.JPEG_ORIENTATION);
        if (num != null) {
            bVar.m39625m(num.intValue());
        }
        Long l = (Long) this.f26379b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.m39632f(l.longValue());
        }
        Float f = (Float) this.f26379b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.m39626l(f.floatValue());
        }
        Integer num2 = (Integer) this.f26379b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                CaptureResult captureResult = this.f26379b;
                key = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
                Integer num3 = (Integer) captureResult.get(key);
                if (num3 != null) {
                    num2 = Integer.valueOf(num2.intValue() * ((int) (num3.intValue() / 100.0f)));
                }
            }
            bVar.m39627k(num2.intValue());
        }
        Float f2 = (Float) this.f26379b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.m39630h(f2.floatValue());
        }
        Integer num4 = (Integer) this.f26379b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C1858m.EnumC1863c cVar = C1858m.EnumC1863c.AUTO;
            if (num4.intValue() == 0) {
                cVar = C1858m.EnumC1863c.MANUAL;
            }
            bVar.m39624n(cVar);
        }
    }

    @Override // p390w.AbstractC13672t
    /* renamed from: c */
    public C13671s2 mo3085c() {
        return this.f26378a;
    }

    @Override // p390w.AbstractC13672t
    /* renamed from: d */
    public EnumC13661r mo3084d() {
        Integer num = (Integer) this.f26379b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC13661r.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC13661r.NONE;
        }
        if (intValue == 2) {
            return EnumC13661r.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC13661r.FIRED;
        }
        C1915r1.m39525c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC13661r.UNKNOWN;
    }

    /* renamed from: e */
    public EnumC13638n m8592e() {
        Integer num = (Integer) this.f26379b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC13638n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC13638n.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC13638n.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC13638n.LOCKED;
            }
            if (intValue == 4) {
                return EnumC13638n.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C1915r1.m39525c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC13638n.UNKNOWN;
            }
        }
        return EnumC13638n.SEARCHING;
    }

    /* renamed from: f */
    public EnumC13644o m8591f() {
        Integer num = (Integer) this.f26379b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC13644o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC13644o.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC13644o.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C1915r1.m39525c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC13644o.UNKNOWN;
            }
        }
        return EnumC13644o.OFF;
    }

    /* renamed from: g */
    public EnumC13650p m8590g() {
        Integer num = (Integer) this.f26379b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC13650p.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC13650p.INACTIVE;
            case 1:
            case 3:
                return EnumC13650p.SCANNING;
            case 2:
                return EnumC13650p.PASSIVE_FOCUSED;
            case 4:
                return EnumC13650p.LOCKED_FOCUSED;
            case 5:
                return EnumC13650p.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC13650p.PASSIVE_NOT_FOCUSED;
            default:
                C1915r1.m39525c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC13650p.UNKNOWN;
        }
    }

    /* renamed from: h */
    public EnumC13655q m8589h() {
        Integer num = (Integer) this.f26379b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC13655q.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC13655q.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC13655q.METERING;
        }
        if (intValue == 2) {
            return EnumC13655q.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC13655q.LOCKED;
        }
        C1915r1.m39525c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC13655q.UNKNOWN;
    }

    /* renamed from: i */
    public CaptureResult m8588i() {
        return this.f26379b;
    }

    public C11824h(CaptureResult captureResult) {
        this(C13671s2.m3091a(), captureResult);
    }
}
