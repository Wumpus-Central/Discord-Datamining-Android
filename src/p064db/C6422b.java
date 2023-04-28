package p064db;

import com.google.android.gms.tasks.Task;

/* renamed from: db.b */
/* loaded from: classes3.dex */
public final class C6422b extends IllegalStateException {
    private C6422b(String str, Throwable th2) {
        super(str, th2);
    }

    /* renamed from: a */
    public static IllegalStateException m25578a(Task<?> task) {
        String str;
        String str2;
        if (!task.mo28859n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j = task.mo28863j();
        if (j != null) {
            str = "failure";
        } else if (task.mo28858o()) {
            str = "result ".concat(String.valueOf(task.mo28862k()));
        } else if (task.mo28860m()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        if (str.length() != 0) {
            str2 = "Complete with: ".concat(str);
        } else {
            str2 = new String("Complete with: ");
        }
        return new C6422b(str2, j);
    }
}
