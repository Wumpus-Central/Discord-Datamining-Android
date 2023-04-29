package com.discord.crash_reporting.system_logs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import qi.o;
import rf.a;
import ri.d;
import ri.j;
import ri.u;
import ri.v;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001)B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J,\u0010\u0012\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0002J\u001c\u0010\u001a\u001a\u00020\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00150\u0018J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J-\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils;", "", "()V", "DEFAULT_TAG", "", "LIBDISCORD_VERSION_CATEGORY", "debugPrintables", "Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection;", "logcatPath", "maxLogSize", "", "regexExtractTombstone", "Lkotlin/text/Regex;", "getRegexExtractTombstone$crash_reporting_release$annotations", "getRegexExtractTombstone$crash_reporting_release", "()Lkotlin/text/Regex;", "systemLogCapture", "Lcom/discord/crash_reporting/system_logs/SystemLogCapture;", "fetch", "context", "Landroid/content/Context;", "", "filter", "cb", "Lkotlin/Function1;", "Ljava/util/LinkedList;", "fetchLastTombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "crashes", "", "hashString", "input", "initSystemLogCapture", "processLogs", "reader", "Ljava/io/BufferedReader;", "output", "processLogs$crash_reporting_release", "waitFor", "process", "Ljava/lang/Process;", "Tombstone", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SystemLogUtils {
    private static final String DEFAULT_TAG = "Discord";
    public static final String logcatPath = "/system/bin/logcat";
    private static final int maxLogSize = 2500000;
    public static final SystemLogUtils INSTANCE = new SystemLogUtils();
    private static final DebugPrintableCollection debugPrintables = new DebugPrintableCollection();
    private static final SystemLogCapture systemLogCapture = new SystemLogCapture();
    private static final String LIBDISCORD_VERSION_CATEGORY = "libdiscord_version";
    private static final Regex regexExtractTombstone = new Regex("(?:^(?:[^\\s]+\\s+){4}F\\s+DEBUG\\s+:\\s(.+))|(^.+(\\[" + Regex.f22112l.c(LIBDISCORD_VERSION_CATEGORY) + "\\].+))");

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "", "text", "", "cause", "groupBy", "origin", "groupHash", "textHash", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/String;", "getGroupBy", "getGroupHash", "getOrigin", "getText", "getTextHash", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Tombstone {
        private final String cause;
        private final String groupBy;
        private final String groupHash;
        private final String origin;
        private final String text;
        private final String textHash;

        public Tombstone(String text, String str, String groupBy, String origin, String groupHash, String textHash) {
            q.g(text, "text");
            q.g(groupBy, "groupBy");
            q.g(origin, "origin");
            q.g(groupHash, "groupHash");
            q.g(textHash, "textHash");
            this.text = text;
            this.cause = str;
            this.groupBy = groupBy;
            this.origin = origin;
            this.groupHash = groupHash;
            this.textHash = textHash;
        }

        public static /* synthetic */ Tombstone copy$default(Tombstone tombstone, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tombstone.text;
            }
            if ((i10 & 2) != 0) {
                str2 = tombstone.cause;
            }
            if ((i10 & 4) != 0) {
                str3 = tombstone.groupBy;
            }
            if ((i10 & 8) != 0) {
                str4 = tombstone.origin;
            }
            if ((i10 & 16) != 0) {
                str5 = tombstone.groupHash;
            }
            if ((i10 & 32) != 0) {
                str6 = tombstone.textHash;
            }
            return tombstone.copy(str, str2, str3, str4, str5, str6);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.cause;
        }

        public final String component3() {
            return this.groupBy;
        }

        public final String component4() {
            return this.origin;
        }

        public final String component5() {
            return this.groupHash;
        }

        public final String component6() {
            return this.textHash;
        }

        public final Tombstone copy(String text, String str, String groupBy, String origin, String groupHash, String textHash) {
            q.g(text, "text");
            q.g(groupBy, "groupBy");
            q.g(origin, "origin");
            q.g(groupHash, "groupHash");
            q.g(textHash, "textHash");
            return new Tombstone(text, str, groupBy, origin, groupHash, textHash);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tombstone)) {
                return false;
            }
            Tombstone tombstone = (Tombstone) obj;
            return q.b(this.text, tombstone.text) && q.b(this.cause, tombstone.cause) && q.b(this.groupBy, tombstone.groupBy) && q.b(this.origin, tombstone.origin) && q.b(this.groupHash, tombstone.groupHash) && q.b(this.textHash, tombstone.textHash);
        }

        public final String getCause() {
            return this.cause;
        }

        public final String getGroupBy() {
            return this.groupBy;
        }

        public final String getGroupHash() {
            return this.groupHash;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextHash() {
            return this.textHash;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.cause;
            return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groupBy.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.groupHash.hashCode()) * 31) + this.textHash.hashCode();
        }

        public String toString() {
            String str = this.text;
            String str2 = this.cause;
            String str3 = this.groupBy;
            String str4 = this.origin;
            String str5 = this.groupHash;
            String str6 = this.textHash;
            return "Tombstone(text=" + str + ", cause=" + str2 + ", groupBy=" + str3 + ", origin=" + str4 + ", groupHash=" + str5 + ", textHash=" + str6 + ")";
        }
    }

    private SystemLogUtils() {
    }

    public static /* synthetic */ void getRegexExtractTombstone$crash_reporting_release$annotations() {
    }

    private final String hashString(String str) {
        String Z;
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        byte[] bytes = str.getBytes(d.f28536b);
        q.f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = instance.digest(bytes);
        q.f(bytes2, "bytes");
        Z = f.Z(bytes2, "", null, null, 0, null, SystemLogUtils$hashString$1.INSTANCE, 30, null);
        return Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitFor(Process process) {
        long nanoTime = System.nanoTime() + TimeUnit.SECONDS.toNanos(15L);
        do {
            try {
                process.exitValue();
                return;
            } catch (IllegalThreadStateException unused) {
                Thread.sleep(100L);
                if (System.nanoTime() >= nanoTime) {
                }
            }
        } while (System.nanoTime() >= nanoTime);
    }

    public final String fetch(Context context) {
        q.g(context, "context");
        StringBuilder sb2 = new StringBuilder();
        debugPrintables.debugPrint(context, sb2);
        systemLogCapture.appendOutput(sb2);
        String sb3 = sb2.toString();
        q.f(sb3, "sb.toString()");
        return sb3;
    }

    public final void fetchLastTombstone(Function1<? super Tombstone, Unit> cb2) {
        q.g(cb2, "cb");
        fetch(regexExtractTombstone, new SystemLogUtils$fetchLastTombstone$1(cb2));
    }

    public final Regex getRegexExtractTombstone$crash_reporting_release() {
        return regexExtractTombstone;
    }

    @SuppressLint({"LogNotTimber"})
    public final void initSystemLogCapture(Context context) {
        q.g(context, "context");
        String libdiscordVersion = DebugPrintableCollection.Companion.libdiscordVersion(context);
        Log.v("Discord", "[" + LIBDISCORD_VERSION_CATEGORY + "]: " + libdiscordVersion);
        systemLogCapture.startThread();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        throw new java.util.NoSuchElementException("List contains no element matching the predicate.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void processLogs$crash_reporting_release(java.io.BufferedReader r10, java.util.LinkedList<java.lang.String> r11, kotlin.text.Regex r12) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.q.g(r10, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.q.g(r11, r0)
            r0 = 0
            r1 = r0
        L_0x000c:
            r2 = 2500000(0x2625a0, float:3.503246E-39)
            java.lang.String r3 = r10.readLine()     // Catch: Exception -> 0x0079
            if (r3 != 0) goto L_0x0017
            goto L_0x0090
        L_0x0017:
            r4 = 0
            r5 = 2
            r6 = 1
            if (r12 == 0) goto L_0x0053
            kotlin.text.MatchResult r3 = kotlin.text.Regex.c(r12, r3, r0, r5, r4)     // Catch: Exception -> 0x0079
            if (r3 != 0) goto L_0x0023
            goto L_0x000c
        L_0x0023:
            java.util.List r3 = r3.b()     // Catch: Exception -> 0x0079
            int r7 = r3.size()     // Catch: Exception -> 0x0079
            java.util.ListIterator r3 = r3.listIterator(r7)     // Catch: Exception -> 0x0079
        L_0x002f:
            boolean r7 = r3.hasPrevious()     // Catch: Exception -> 0x0079
            if (r7 == 0) goto L_0x004b
            java.lang.Object r7 = r3.previous()     // Catch: Exception -> 0x0079
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x0079
            int r8 = r8.length()     // Catch: Exception -> 0x0079
            if (r8 <= 0) goto L_0x0044
            r8 = r6
            goto L_0x0045
        L_0x0044:
            r8 = r0
        L_0x0045:
            if (r8 == 0) goto L_0x002f
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: Exception -> 0x0079
            goto L_0x0053
        L_0x004b:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException     // Catch: Exception -> 0x0079
            java.lang.String r0 = "List contains no element matching the predicate."
            r10.<init>(r0)     // Catch: Exception -> 0x0079
            throw r10     // Catch: Exception -> 0x0079
        L_0x0053:
            boolean r7 = ri.l.w(r3)     // Catch: Exception -> 0x0079
            if (r7 != 0) goto L_0x000c
            java.lang.String r7 = "Accessing hidden method"
            boolean r4 = ri.l.M(r3, r7, r0, r5, r4)     // Catch: Exception -> 0x0079
            if (r4 != 0) goto L_0x000c
            int r4 = r3.length()     // Catch: Exception -> 0x0079
            int r4 = r4 + r6
            int r1 = r1 + r4
            r11.add(r3)     // Catch: Exception -> 0x0079
            if (r1 <= r2) goto L_0x000c
            java.lang.Object r3 = r11.pop()     // Catch: Exception -> 0x0079
            java.lang.String r3 = (java.lang.String) r3     // Catch: Exception -> 0x0079
            int r2 = r3.length()     // Catch: Exception -> 0x0079
            int r2 = r2 - r6
            int r1 = r1 - r2
            goto L_0x000c
        L_0x0079:
            r10 = move-exception
            if (r12 != 0) goto L_0x0090
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "IOException: "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.add(r10)
        L_0x0090:
            if (r1 <= r2) goto L_0x009b
            java.lang.Object r10 = r11.pop()
            java.lang.String r10 = (java.lang.String) r10
            r10.length()
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.crash_reporting.system_logs.SystemLogUtils.processLogs$crash_reporting_release(java.io.BufferedReader, java.util.LinkedList, kotlin.text.Regex):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tombstone fetchLastTombstone(Collection<String> collection) {
        boolean w10;
        boolean w11;
        Sequence y10;
        HashSet e10;
        String str;
        String w12;
        List<String> b10;
        boolean M;
        boolean M2;
        String str2 = null;
        if (collection.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String str3 = null;
        String str4 = null;
        for (String str5 : collection) {
            M = v.M(str5, LIBDISCORD_VERSION_CATEGORY, false, 2, null);
            if (M) {
                str3 = str5;
            } else {
                M2 = v.M(str5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null);
                if (M2) {
                    ri.q.i(sb2);
                    str4 = str3;
                }
                sb2.append(str5);
                q.f(sb2, "append(value)");
                sb2.append('\n');
                q.f(sb2, "append('\\n')");
            }
        }
        w10 = u.w(sb2);
        if (!w10) {
            sb2.append('\n');
            q.f(sb2, "append('\\n')");
            sb2.append("Tombstone's libdiscord_version: ");
            if (str4 == null) {
                str4 = "Unknown libdiscord_version";
            }
            sb2.append(str4);
            q.f(sb2, "append(value)");
            sb2.append('\n');
            q.f(sb2, "append('\\n')");
        }
        String sb3 = sb2.toString();
        q.f(sb3, "StringBuilder().also { s…   }\n        }.toString()");
        w11 = u.w(sb3);
        if (w11) {
            return null;
        }
        j jVar = j.MULTILINE;
        Regex regex = new Regex("^Cause: (.+)$", jVar);
        y10 = o.y(Regex.e(new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", jVar), sb3, 0, 2, null), new SystemLogUtils$fetchLastTombstone$extractedGroups$1(new Regex("classes\\d+.dex")));
        e10 = w.e("libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage(");
        try {
        } catch (NoSuchElementException unused) {
            str = "Unknown";
        }
        for (Object obj : y10) {
            if (!e10.contains((String) obj)) {
                str = (String) obj;
                w12 = o.w(y10, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
                MatchResult c10 = Regex.c(regex, sb3, 0, 2, null);
                if (!(c10 == null || (b10 = c10.b()) == null)) {
                    str2 = b10.get(1);
                }
                return new Tombstone(sb3, str2, w12, str, hashString(w12), hashString(sb3));
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void fetch(Regex regex, Function1<? super LinkedList<String>, Unit> function1) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = regex == null;
        if (!new File(logcatPath).exists()) {
            if (z10) {
                linkedList.add("Unable to locate '/system/bin/logcat'");
            }
            function1.invoke(linkedList);
            return;
        }
        a.b(false, false, null, null, 0, new SystemLogUtils$fetch$1(linkedList, regex, z10, function1), 31, null);
    }
}