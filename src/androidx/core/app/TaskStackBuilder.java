package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C2337a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: k */
    private final ArrayList<Intent> f3189k = new ArrayList<>();

    /* renamed from: l */
    private final Context f3190l;

    /* renamed from: androidx.core.app.TaskStackBuilder$a */
    /* loaded from: classes.dex */
    public interface AbstractC2192a {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.f3190l = context;
    }

    /* renamed from: f */
    public static TaskStackBuilder m38343f(Context context) {
        return new TaskStackBuilder(context);
    }

    /* renamed from: a */
    public TaskStackBuilder m38346a(Intent intent) {
        this.f3189k.add(intent);
        return this;
    }

    /* renamed from: b */
    public TaskStackBuilder m38345b(Activity activity) {
        Intent intent;
        if (activity instanceof AbstractC2192a) {
            intent = ((AbstractC2192a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C2261l.m38238a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f3190l.getPackageManager());
            }
            m38344e(component);
            m38346a(intent);
        }
        return this;
    }

    /* renamed from: e */
    public TaskStackBuilder m38344e(ComponentName componentName) {
        int size = this.f3189k.size();
        try {
            Intent b = C2261l.m38237b(this.f3190l, componentName);
            while (b != null) {
                this.f3189k.add(size, b);
                b = C2261l.m38237b(this.f3190l, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: g */
    public void m38342g() {
        m38341i(null);
    }

    /* renamed from: i */
    public void m38341i(Bundle bundle) {
        if (!this.f3189k.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3189k.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C2337a.m38127k(this.f3190l, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3190l.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3189k.iterator();
    }
}
