package com.facebook.imageutils;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import p394w3.C13740j;

/* renamed from: com.facebook.imageutils.c */
/* loaded from: classes7.dex */
public class C5066c {
    /* renamed from: a */
    public static int m30856a(int i) {
        return C5068e.m30850a(i);
    }

    /* renamed from: b */
    public static int m30855b(InputStream inputStream) {
        try {
            int d = m30853d(inputStream);
            if (d == 0) {
                return 0;
            }
            return C5068e.m30847d(inputStream, d);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static boolean m30854c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
            case 204:
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static int m30853d(InputStream inputStream) {
        int a;
        if (m30852e(inputStream, 225) && (a = C5067d.m30851a(inputStream, 2, false) - 2) > 6) {
            int a2 = C5067d.m30851a(inputStream, 4, false);
            int a3 = C5067d.m30851a(inputStream, 2, false);
            int i = (a - 4) - 2;
            if (a2 == 1165519206 && a3 == 0) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m30852e(InputStream inputStream, int i) {
        C13740j.m2834g(inputStream);
        while (C5067d.m30851a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C5067d.m30851a(inputStream, 1, false);
            }
            if ((i != 192 || !m30854c(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip(C5067d.m30851a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
