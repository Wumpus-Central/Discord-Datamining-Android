package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.v2 */
/* loaded from: classes.dex */
public class C2316v2 {

    /* renamed from: a */
    private static final Object f3228a = new Object();

    /* renamed from: b */
    private static final Object f3229b = new Object();

    /* renamed from: a */
    private static RemoteInput m38166a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    /* renamed from: b */
    private static RemoteInput[] m38165b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            remoteInputArr[i] = m38166a(bundleArr[i]);
        }
        return remoteInputArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static NotificationCompat.Action m38164c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("android.support.allowGeneratedReplies", false);
        }
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), m38165b(m38163d(bundle, "remoteInputs")), m38165b(m38163d(bundle, "dataOnlyRemoteInputs")), z, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    /* renamed from: d */
    private static Bundle[] m38163d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Bundle m38162e(NotificationCompat.Action action) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d = action.m38592d();
        if (d != null) {
            i = d.m37869n();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", action.m38588h());
        bundle2.putParcelable("actionIntent", action.m38595a());
        if (action.m38593c() != null) {
            bundle = new Bundle(action.m38593c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m38594b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m38160g(action.m38591e()));
        bundle2.putBoolean("showsUserInterface", action.m38589g());
        bundle2.putInt("semanticAction", action.m38590f());
        return bundle2;
    }

    /* renamed from: f */
    private static Bundle m38161f(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.m38374j());
        bundle.putCharSequence("label", remoteInput.m38375i());
        bundle.putCharSequenceArray("choices", remoteInput.m38378f());
        bundle.putBoolean("allowFreeFormInput", remoteInput.m38380d());
        bundle.putBundle("extras", remoteInput.m38376h());
        Set<String> e = remoteInput.m38379e();
        if (e != null && !e.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(e.size());
            for (String str : e) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: g */
    private static Bundle[] m38160g(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = m38161f(remoteInputArr[i]);
        }
        return bundleArr;
    }
}
