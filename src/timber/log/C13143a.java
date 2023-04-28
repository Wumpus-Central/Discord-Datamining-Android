package timber.log;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163j$.util.Spliterator;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m15073d2 = {"Ltimber/log/a;", "", "<init>", "()V", "a", "b", "c", "timber_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: timber.log.a */
/* loaded from: classes8.dex */
public final class C13143a {

    /* renamed from: a */
    public static final C13144b f29446a = new C13144b(null);

    /* renamed from: b */
    private static final ArrayList<AbstractC13145c> f29447b = new ArrayList<>();

    /* renamed from: c */
    private static volatile AbstractC13145c[] f29448c = new AbstractC13145c[0];

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Ltimber/log/a$a;", "Ltimber/log/a$c;", "Ljava/lang/StackTraceElement;", "element", "", "a", "", "priority", "tag", "message", "", "t", "", "log", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "fqcnIgnore", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "b", "timber_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: timber.log.a$a */
    /* loaded from: classes8.dex */
    public static class C0422a extends AbstractC13145c {

        /* renamed from: b */
        public static final C0423a f29449b = new C0423a(null);

        /* renamed from: c */
        private static final Pattern f29450c = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: a */
        private final List<String> f29451a;

        @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, m15073d2 = {"Ltimber/log/a$a$a;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "", "MAX_LOG_LENGTH", "I", "MAX_TAG_LENGTH", "<init>", "()V", "timber_release"}, m15072k = 1, m15071mv = {1, 5, 1})
        /* renamed from: timber.log.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C0423a {
            private C0423a() {
            }

            public /* synthetic */ C0423a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0422a() {
            List<String> l;
            l = C9906j.m14817l(C13143a.class.getName(), C13144b.class.getName(), AbstractC13145c.class.getName(), C0422a.class.getName());
            this.f29451a = l;
        }

        /* renamed from: a */
        protected String m4532a(StackTraceElement element) {
            String M0;
            C9971q.m14633g(element, "element");
            String className = element.getClassName();
            C9971q.m14634f(className, "element.className");
            M0 = C12719v.m5708M0(className, '.', null, 2, null);
            Matcher matcher = f29450c.matcher(M0);
            if (matcher.find()) {
                M0 = matcher.replaceAll("");
                C9971q.m14634f(M0, "m.replaceAll(\"\")");
            }
            if (M0.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return M0;
            }
            String substring = M0.substring(0, 23);
            C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            C9971q.m14634f(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f29451a.contains(stackTraceElement.getClassName())) {
                    return m4532a(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // timber.log.C13143a.AbstractC13145c
        protected void log(int i, String str, String message, Throwable th2) {
            int Y;
            int min;
            C9971q.m14633g(message, "message");
            if (message.length() >= 4000) {
                int length = message.length();
                int i2 = 0;
                while (i2 < length) {
                    Y = C12719v.m5687Y(message, '\n', i2, false, 4, null);
                    if (Y == -1) {
                        Y = length;
                    }
                    while (true) {
                        min = Math.min(Y, i2 + 4000);
                        String substring = message.substring(i2, min);
                        C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (i == 7) {
                            Log.wtf(str, substring);
                        } else {
                            Log.println(i, str, substring);
                        }
                        if (min >= Y) {
                            break;
                        }
                        i2 = min;
                    }
                    i2 = min + 1;
                }
            } else if (i == 7) {
                Log.wtf(str, message);
            } else {
                Log.println(i, str, message);
            }
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ;\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ;\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ;\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0015\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ;\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J9\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H$R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8@X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m15073d2 = {"Ltimber/log/a$c;", "", "", "priority", "", "t", "", "message", "", "args", "", "prepareLog", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "getStackTraceString", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "", "isLoggable", "tag", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "explicitTag", "Ljava/lang/ThreadLocal;", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "timber_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: timber.log.a$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC13145c {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th2) {
            StringWriter stringWriter = new StringWriter(Spliterator.NONNULL);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            C9971q.m14634f(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void prepareLog(int i, Throwable th2, String str, Object... objArr) {
            boolean z;
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i)) {
                boolean z2 = false;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (objArr.length == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        str = formatMessage(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th2);
                    }
                } else if (th2 != null) {
                    str = getStackTraceString(th2);
                } else {
                    return;
                }
                log(i, tag$timber_release, str, th2);
            }
        }

        /* renamed from: d */
        public void mo4529d(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: e */
        public void mo4526e(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        protected String formatMessage(String message, Object[] args) {
            C9971q.m14633g(message, "message");
            C9971q.m14633g(args, "args");
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format = String.format(message, Arrays.copyOf(copyOf, copyOf.length));
            C9971q.m14634f(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        /* renamed from: i */
        public void mo4523i(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        protected boolean isLoggable(int i) {
            return true;
        }

        protected boolean isLoggable(String str, int i) {
            return isLoggable(i);
        }

        protected abstract void log(int i, String str, String str2, Throwable th2);

        public void log(int i, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(i, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: v */
        public void mo4520v(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(2, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: w */
        public void mo4517w(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(7, null, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: d */
        public void mo4527d(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(3, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: e */
        public void mo4524e(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(6, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: i */
        public void mo4521i(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(4, th2, str, Arrays.copyOf(args, args.length));
        }

        public void log(int i, Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(i, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: v */
        public void mo4518v(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(2, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: w */
        public void mo4515w(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(5, th2, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            prepareLog(7, th2, str, Arrays.copyOf(args, args.length));
        }

        /* renamed from: d */
        public void mo4528d(Throwable th2) {
            prepareLog(3, th2, null, new Object[0]);
        }

        /* renamed from: e */
        public void mo4525e(Throwable th2) {
            prepareLog(6, th2, null, new Object[0]);
        }

        /* renamed from: i */
        public void mo4522i(Throwable th2) {
            prepareLog(4, th2, null, new Object[0]);
        }

        public void log(int i, Throwable th2) {
            prepareLog(i, th2, null, new Object[0]);
        }

        /* renamed from: v */
        public void mo4519v(Throwable th2) {
            prepareLog(2, th2, null, new Object[0]);
        }

        /* renamed from: w */
        public void mo4516w(Throwable th2) {
            prepareLog(5, th2, null, new Object[0]);
        }

        public void wtf(Throwable th2) {
            prepareLog(7, th2, null, new Object[0]);
        }
    }

    private C13143a() {
        throw new AssertionError();
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J3\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ=\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ=\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\tJ=\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0010\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\tJ=\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0011\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\tJ=\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J;\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J,\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0007R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m15073d2 = {"Ltimber/log/a$b;", "Ltimber/log/a$c;", "", "message", "", "", "args", "", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", "", "priority", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "b", "tree", "a", "treeArray", "[Ltimber/log/a$c;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "<init>", "()V", "timber_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: timber.log.a$b */
    /* loaded from: classes8.dex */
    public static final class C13144b extends AbstractC13145c {
        private C13144b() {
        }

        public /* synthetic */ C13144b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m4531a(AbstractC13145c tree) {
            boolean z;
            C9971q.m14633g(tree, "tree");
            if (tree != this) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                synchronized (C13143a.f29447b) {
                    C13143a.f29447b.add(tree);
                    Object[] array = C13143a.f29447b.toArray(new AbstractC13145c[0]);
                    if (array != null) {
                        C13143a.f29448c = (AbstractC13145c[]) array;
                        Unit unit = Unit.f22042a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        /* renamed from: b */
        public final AbstractC13145c m4530b(String tag) {
            C9971q.m14633g(tag, "tag");
            AbstractC13145c[] cVarArr = C13143a.f29448c;
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                AbstractC13145c cVar = cVarArr[i];
                i++;
                cVar.getExplicitTag$timber_release().set(tag);
            }
            return this;
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: d */
        public void mo4529d(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4529d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: e */
        public void mo4526e(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4526e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: i */
        public void mo4523i(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4523i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void log(int i, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.log(i, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: v */
        public void mo4520v(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4520v(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: w */
        public void mo4517w(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4517w(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void wtf(String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.wtf(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: d */
        public void mo4527d(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4527d(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: e */
        public void mo4524e(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4524e(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: i */
        public void mo4521i(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4521i(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void log(int i, Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.log(i, th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: v */
        public void mo4518v(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4518v(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: w */
        public void mo4515w(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4515w(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void wtf(Throwable th2, String str, Object... args) {
            C9971q.m14633g(args, "args");
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.wtf(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: d */
        public void mo4528d(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4528d(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: e */
        public void mo4525e(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4525e(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: i */
        public void mo4522i(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4522i(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void log(int i, Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.log(i, th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: v */
        public void mo4519v(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4519v(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        /* renamed from: w */
        public void mo4516w(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.mo4516w(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        public void wtf(Throwable th2) {
            for (AbstractC13145c cVar : C13143a.f29448c) {
                cVar.wtf(th2);
            }
        }

        @Override // timber.log.C13143a.AbstractC13145c
        protected void log(int i, String str, String message, Throwable th2) {
            C9971q.m14633g(message, "message");
            throw new AssertionError();
        }
    }
}
