package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* loaded from: classes6.dex */
class SVGLength {

    /* renamed from: a */
    final double f11767a;

    /* renamed from: b */
    final UnitType f11768b;

    /* loaded from: classes6.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.SVGLength$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5914a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11769a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f11769a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11769a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11769a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f11767a = 0.0d;
        this.f11768b = UnitType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ArrayList<SVGLength> m26891a(Dynamic dynamic) {
        int i = C5914a.f11769a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        } else if (i == 2) {
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new SVGLength(dynamic.asString()));
            return arrayList2;
        } else if (i != 3) {
            return null;
        } else {
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add(m26889c(asArray.getDynamic(i2)));
            }
            return arrayList3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ArrayList<SVGLength> m26890b(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList<SVGLength> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(m26889c(readableArray.getDynamic(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static SVGLength m26889c(Dynamic dynamic) {
        int i = C5914a.f11769a[dynamic.getType().ordinal()];
        if (i == 1) {
            return new SVGLength(dynamic.asDouble());
        }
        if (i != 2) {
            return new SVGLength();
        }
        return new SVGLength(dynamic.asString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static SVGLength m26888d(Double d) {
        return d != null ? new SVGLength(d.doubleValue()) : new SVGLength();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static SVGLength m26887e(String str) {
        return str != null ? new SVGLength(str) : new SVGLength();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m26886f(Dynamic dynamic) {
        int i = C5914a.f11769a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength(double d) {
        this.f11767a = d;
        this.f11768b = UnitType.NUMBER;
    }

    private SVGLength(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            this.f11768b = UnitType.UNKNOWN;
            this.f11767a = 0.0d;
        } else if (trim.codePointAt(i) == 37) {
            this.f11768b = UnitType.PERCENTAGE;
            this.f11767a = Double.valueOf(trim.substring(0, i)).doubleValue();
        } else {
            int i2 = length - 2;
            if (i2 > 0) {
                String substring = trim.substring(i2);
                substring.hashCode();
                char c = 65535;
                switch (substring.hashCode()) {
                    case 3178:
                        if (substring.equals("cm")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3240:
                        if (substring.equals("em")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3251:
                        if (substring.equals("ex")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3365:
                        if (substring.equals("in")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3488:
                        if (substring.equals("mm")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3571:
                        if (substring.equals("pc")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3588:
                        if (substring.equals("pt")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3592:
                        if (substring.equals("px")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f11768b = UnitType.CM;
                        length = i2;
                        break;
                    case 1:
                        this.f11768b = UnitType.EMS;
                        length = i2;
                        break;
                    case 2:
                        this.f11768b = UnitType.EXS;
                        length = i2;
                        break;
                    case 3:
                        this.f11768b = UnitType.IN;
                        length = i2;
                        break;
                    case 4:
                        this.f11768b = UnitType.MM;
                        length = i2;
                        break;
                    case 5:
                        this.f11768b = UnitType.PC;
                        length = i2;
                        break;
                    case 6:
                        this.f11768b = UnitType.PT;
                        length = i2;
                        break;
                    case 7:
                        this.f11768b = UnitType.NUMBER;
                        length = i2;
                        break;
                    default:
                        this.f11768b = UnitType.NUMBER;
                        break;
                }
                this.f11767a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.f11768b = UnitType.NUMBER;
            this.f11767a = Double.valueOf(trim).doubleValue();
        }
    }
}
