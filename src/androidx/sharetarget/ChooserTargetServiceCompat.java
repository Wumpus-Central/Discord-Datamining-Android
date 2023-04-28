package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.C3159a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p330s1.C12762a;

/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.sharetarget.ChooserTargetServiceCompat$a */
    /* loaded from: classes.dex */
    public static class C3158a implements Comparable<C3158a> {

        /* renamed from: k */
        private final ShortcutInfoCompat f4897k;

        /* renamed from: l */
        private final ComponentName f4898l;

        C3158a(ShortcutInfoCompat shortcutInfoCompat, ComponentName componentName) {
            this.f4897k = shortcutInfoCompat;
            this.f4898l = componentName;
        }

        /* renamed from: a */
        public int compareTo(C3158a aVar) {
            return m35045b().m38089i() - aVar.m35045b().m38089i();
        }

        /* renamed from: b */
        ShortcutInfoCompat m35045b() {
            return this.f4897k;
        }

        /* renamed from: c */
        ComponentName m35044c() {
            return this.f4898l;
        }
    }

    /* renamed from: a */
    static List<ChooserTarget> m35047a(C12762a aVar, List<C3158a> list) {
        IconCompat iconCompat;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int i = list.get(0).m35045b().m38089i();
        float f = 1.0f;
        for (C3158a aVar2 : list) {
            ShortcutInfoCompat b = aVar2.m35045b();
            Icon icon = null;
            try {
                iconCompat = aVar.m5537k(b.m38092f());
            } catch (Exception e) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                iconCompat = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.intent.extra.shortcut.ID", b.m38092f());
            if (i != b.m38089i()) {
                f -= 0.01f;
                i = b.m38089i();
            }
            CharSequence j = b.m38088j();
            if (iconCompat != null) {
                icon = iconCompat.m37859x();
            }
            arrayList.add(new ChooserTarget(j, icon, f, aVar2.m35044c(), bundle));
        }
        return arrayList;
    }

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        Context applicationContext = getApplicationContext();
        ArrayList<C3159a> b = C3160b.m35042b(applicationContext);
        ArrayList arrayList = new ArrayList();
        for (C3159a aVar : b) {
            if (aVar.f4900b.equals(componentName.getClassName())) {
                C3159a.C0065a[] aVarArr = aVar.f4899a;
                int length = aVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (intentFilter.hasDataType(aVarArr[i].f4908g)) {
                        arrayList.add(aVar);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        C12762a j = C12762a.m5538j(applicationContext);
        try {
            List<ShortcutInfoCompat> b2 = j.mo5546b();
            if (b2 == null || b2.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : b2) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3159a aVar2 = (C3159a) it.next();
                        if (shortcutInfoCompat.m38095c().containsAll(Arrays.asList(aVar2.f4901c))) {
                            arrayList2.add(new C3158a(shortcutInfoCompat, new ComponentName(applicationContext.getPackageName(), aVar2.f4900b)));
                            break;
                        }
                    }
                }
            }
            return m35047a(j, arrayList2);
        } catch (Exception e) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e);
            return Collections.emptyList();
        }
    }
}
