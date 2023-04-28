package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.Person;
import androidx.core.content.C2348g;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C2485a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p002a1.C1236b;
import p002a1.C1237c;
import p002a1.C1238d;
import p002a1.C1239e;
import p002a1.C1241g;
import p163j$.util.Spliterator;

/* loaded from: classes.dex */
public class NotificationCompat {

    /* loaded from: classes.dex */
    public static class Action {

        /* renamed from: a */
        final Bundle f3049a;

        /* renamed from: b */
        private IconCompat f3050b;

        /* renamed from: c */
        private final RemoteInput[] f3051c;

        /* renamed from: d */
        private final RemoteInput[] f3052d;

        /* renamed from: e */
        private boolean f3053e;

        /* renamed from: f */
        boolean f3054f;

        /* renamed from: g */
        private final int f3055g;

        /* renamed from: h */
        private final boolean f3056h;
        @Deprecated

        /* renamed from: i */
        public int f3057i;

        /* renamed from: j */
        public CharSequence f3058j;

        /* renamed from: k */
        public PendingIntent f3059k;

        /* renamed from: l */
        private boolean f3060l;

        /* renamed from: androidx.core.app.NotificationCompat$Action$a */
        /* loaded from: classes.dex */
        public static final class C2165a {

            /* renamed from: a */
            private final IconCompat f3061a;

            /* renamed from: b */
            private final CharSequence f3062b;

            /* renamed from: c */
            private final PendingIntent f3063c;

            /* renamed from: d */
            private boolean f3064d;

            /* renamed from: e */
            private final Bundle f3065e;

            /* renamed from: f */
            private ArrayList<RemoteInput> f3066f;

            /* renamed from: g */
            private int f3067g;

            /* renamed from: h */
            private boolean f3068h;

            /* renamed from: i */
            private boolean f3069i;

            /* renamed from: j */
            private boolean f3070j;

            public C2165a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: c */
            private void m38583c() {
                if (this.f3069i && this.f3063c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* renamed from: d */
            public static C2165a m38582d(Notification.Action action) {
                C2165a aVar;
                boolean isAuthenticationRequired;
                boolean isContextual;
                int semanticAction;
                boolean allowGeneratedReplies;
                if (action.getIcon() != null) {
                    aVar = new C2165a(IconCompat.m37880c(action.getIcon()), action.title, action.actionIntent);
                } else {
                    aVar = new C2165a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        aVar.m38585a(RemoteInput.m38381c(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    allowGeneratedReplies = action.getAllowGeneratedReplies();
                    aVar.f3064d = allowGeneratedReplies;
                }
                if (i >= 28) {
                    semanticAction = action.getSemanticAction();
                    aVar.m38578h(semanticAction);
                }
                if (i >= 29) {
                    isContextual = action.isContextual();
                    aVar.m38579g(isContextual);
                }
                if (i >= 31) {
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    aVar.m38580f(isAuthenticationRequired);
                }
                return aVar;
            }

            /* renamed from: a */
            public C2165a m38585a(RemoteInput remoteInput) {
                if (this.f3066f == null) {
                    this.f3066f = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.f3066f.add(remoteInput);
                }
                return this;
            }

            /* renamed from: b */
            public Action m38584b() {
                RemoteInput[] remoteInputArr;
                m38583c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.f3066f;
                if (arrayList3 != null) {
                    Iterator<RemoteInput> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput next = it.next();
                        if (next.m38372l()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                RemoteInput[] remoteInputArr2 = null;
                if (arrayList.isEmpty()) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    remoteInputArr2 = (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]);
                }
                return new Action(this.f3061a, this.f3062b, this.f3063c, this.f3065e, remoteInputArr2, remoteInputArr, this.f3064d, this.f3067g, this.f3068h, this.f3069i, this.f3070j);
            }

            /* renamed from: e */
            public C2165a m38581e(boolean z) {
                this.f3064d = z;
                return this;
            }

            /* renamed from: f */
            public C2165a m38580f(boolean z) {
                this.f3070j = z;
                return this;
            }

            /* renamed from: g */
            public C2165a m38579g(boolean z) {
                this.f3069i = z;
                return this;
            }

            /* renamed from: h */
            public C2165a m38578h(int i) {
                this.f3067g = i;
                return this;
            }

            /* renamed from: i */
            public C2165a m38577i(boolean z) {
                this.f3068h = z;
                return this;
            }

            public C2165a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m37871l(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C2165a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f3064d = true;
                this.f3068h = true;
                this.f3061a = iconCompat;
                this.f3062b = Builder.m38522q(charSequence);
                this.f3063c = pendingIntent;
                this.f3065e = bundle;
                this.f3066f = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.f3064d = z;
                this.f3067g = i;
                this.f3068h = z2;
                this.f3069i = z3;
                this.f3070j = z4;
            }
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m37871l(null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m38595a() {
            return this.f3059k;
        }

        /* renamed from: b */
        public boolean m38594b() {
            return this.f3053e;
        }

        /* renamed from: c */
        public Bundle m38593c() {
            return this.f3049a;
        }

        /* renamed from: d */
        public IconCompat m38592d() {
            int i;
            if (this.f3050b == null && (i = this.f3057i) != 0) {
                this.f3050b = IconCompat.m37871l(null, "", i);
            }
            return this.f3050b;
        }

        /* renamed from: e */
        public RemoteInput[] m38591e() {
            return this.f3051c;
        }

        /* renamed from: f */
        public int m38590f() {
            return this.f3055g;
        }

        /* renamed from: g */
        public boolean m38589g() {
            return this.f3054f;
        }

        /* renamed from: h */
        public CharSequence m38588h() {
            return this.f3058j;
        }

        /* renamed from: i */
        public boolean m38587i() {
            return this.f3060l;
        }

        /* renamed from: j */
        public boolean m38586j() {
            return this.f3056h;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m37871l(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f3054f = true;
            this.f3050b = iconCompat;
            if (iconCompat != null && iconCompat.m37866q() == 2) {
                this.f3057i = iconCompat.m37869n();
            }
            this.f3058j = Builder.m38522q(charSequence);
            this.f3059k = pendingIntent;
            this.f3049a = bundle == null ? new Bundle() : bundle;
            this.f3051c = remoteInputArr;
            this.f3052d = remoteInputArr2;
            this.f3053e = z;
            this.f3055g = i;
            this.f3054f = z2;
            this.f3056h = z3;
            this.f3060l = z4;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$b */
    /* loaded from: classes.dex */
    public static class C2168b extends AbstractC2178g {

        /* renamed from: e */
        private Bitmap f3108e;

        /* renamed from: f */
        private IconCompat f3109f;

        /* renamed from: g */
        private boolean f3110g;

        /* renamed from: h */
        private CharSequence f3111h;

        /* renamed from: i */
        private boolean f3112i;

        /* renamed from: androidx.core.app.NotificationCompat$b$a */
        /* loaded from: classes.dex */
        private static class C2169a {
            /* renamed from: a */
            static void m38486a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m38485b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$b$b */
        /* loaded from: classes.dex */
        private static class C0033b {
            /* renamed from: a */
            static void m38484a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$b$c */
        /* loaded from: classes.dex */
        private static class C2170c {
            /* renamed from: a */
            static void m38483a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: b */
            static void m38482b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* renamed from: x */
        private static IconCompat m38489x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.m37880c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m37875h((Bitmap) parcelable);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: b */
        public void mo38454b(AbstractC2267m mVar) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(mVar.mo38178a()).setBigContentTitle(this.f3130b).bigPicture(this.f3108e);
            if (this.f3110g) {
                Context context = null;
                if (this.f3109f == null) {
                    C2169a.m38486a(bigPicture, null);
                } else {
                    if (mVar instanceof C2311u2) {
                        context = ((C2311u2) mVar).m38173f();
                    }
                    C0033b.m38484a(bigPicture, this.f3109f.m37858y(context));
                }
            }
            if (this.f3132d) {
                C2169a.m38485b(bigPicture, this.f3131c);
            }
            if (i >= 31) {
                C2170c.m38482b(bigPicture, this.f3112i);
                C2170c.m38483a(bigPicture, this.f3111h);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: f */
        protected void mo38450f(Bundle bundle) {
            super.mo38450f(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: q */
        protected String mo38439q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: v */
        protected void mo38434v(Bundle bundle) {
            super.mo38434v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f3109f = m38489x(bundle.getParcelable("android.largeIcon.big"));
                this.f3110g = true;
            }
            this.f3108e = (Bitmap) bundle.getParcelable("android.picture");
            this.f3112i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        /* renamed from: y */
        public C2168b m38488y(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.m37875h(bitmap);
            }
            this.f3109f = iconCompat;
            this.f3110g = true;
            return this;
        }

        /* renamed from: z */
        public C2168b m38487z(Bitmap bitmap) {
            this.f3108e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$c */
    /* loaded from: classes.dex */
    public static class C2171c extends AbstractC2178g {

        /* renamed from: e */
        private CharSequence f3113e;

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: a */
        public void mo38455a(Bundle bundle) {
            super.mo38455a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: b */
        public void mo38454b(AbstractC2267m mVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(mVar.mo38178a()).setBigContentTitle(this.f3130b).bigText(this.f3113e);
            if (this.f3132d) {
                bigText.setSummaryText(this.f3131c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: f */
        protected void mo38450f(Bundle bundle) {
            super.mo38450f(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: q */
        protected String mo38439q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: v */
        protected void mo38434v(Bundle bundle) {
            super.mo38434v(bundle);
            this.f3113e = bundle.getCharSequence("android.bigText");
        }

        /* renamed from: x */
        public C2171c m38481x(CharSequence charSequence) {
            this.f3113e = Builder.m38522q(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$d */
    /* loaded from: classes.dex */
    public static final class C2172d {

        /* renamed from: a */
        private PendingIntent f3114a;

        /* renamed from: b */
        private PendingIntent f3115b;

        /* renamed from: c */
        private IconCompat f3116c;

        /* renamed from: d */
        private int f3117d;

        /* renamed from: e */
        private int f3118e;

        /* renamed from: f */
        private int f3119f;

        /* renamed from: g */
        private String f3120g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationCompat$d$a */
        /* loaded from: classes.dex */
        public static class C2173a {
            /* renamed from: a */
            static C2172d m38469a(Notification.BubbleMetadata bubbleMetadata) {
                PendingIntent intent;
                PendingIntent intent2;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                if (bubbleMetadata == null) {
                    return null;
                }
                intent = bubbleMetadata.getIntent();
                if (intent == null) {
                    return null;
                }
                intent2 = bubbleMetadata.getIntent();
                icon = bubbleMetadata.getIcon();
                C2175c cVar = new C2175c(intent2, IconCompat.m37880c(icon));
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                C2175c b = cVar.m38464b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                C2175c c = b.m38463c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                C2175c g = c.m38459g(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    g.m38462d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    g.m38461e(desiredHeightResId2);
                }
                return g.m38465a();
            }

            /* renamed from: b */
            static Notification.BubbleMetadata m38468b(C2172d dVar) {
                Notification.BubbleMetadata.Builder icon;
                Notification.BubbleMetadata.Builder intent;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata.Builder suppressNotification;
                Notification.BubbleMetadata build;
                if (dVar == null || dVar.m38474g() == null) {
                    return null;
                }
                icon = new Notification.BubbleMetadata.Builder().setIcon(dVar.m38475f().m37859x());
                intent = icon.setIntent(dVar.m38474g());
                deleteIntent = intent.setDeleteIntent(dVar.m38478c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(dVar.m38479b());
                suppressNotification = autoExpandBubble.setSuppressNotification(dVar.m38472i());
                if (dVar.m38477d() != 0) {
                    suppressNotification.setDesiredHeight(dVar.m38477d());
                }
                if (dVar.m38476e() != 0) {
                    suppressNotification.setDesiredHeightResId(dVar.m38476e());
                }
                build = suppressNotification.build();
                return build;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationCompat$d$b */
        /* loaded from: classes.dex */
        public static class C2174b {
            /* renamed from: a */
            static C2172d m38467a(Notification.BubbleMetadata bubbleMetadata) {
                String shortcutId;
                C2175c cVar;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                PendingIntent intent;
                Icon icon;
                String shortcutId2;
                if (bubbleMetadata == null) {
                    return null;
                }
                shortcutId = bubbleMetadata.getShortcutId();
                if (shortcutId != null) {
                    shortcutId2 = bubbleMetadata.getShortcutId();
                    cVar = new C2175c(shortcutId2);
                } else {
                    intent = bubbleMetadata.getIntent();
                    icon = bubbleMetadata.getIcon();
                    cVar = new C2175c(intent, IconCompat.m37880c(icon));
                }
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                C2175c b = cVar.m38464b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                C2175c c = b.m38463c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                c.m38459g(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    cVar.m38462d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    cVar.m38461e(desiredHeightResId2);
                }
                return cVar.m38465a();
            }

            /* renamed from: b */
            static Notification.BubbleMetadata m38466b(C2172d dVar) {
                Notification.BubbleMetadata.Builder builder;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata build;
                if (dVar == null) {
                    return null;
                }
                if (dVar.m38473h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(dVar.m38473h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(dVar.m38474g(), dVar.m38475f().m37859x());
                }
                deleteIntent = builder.setDeleteIntent(dVar.m38478c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(dVar.m38479b());
                autoExpandBubble.setSuppressNotification(dVar.m38472i());
                if (dVar.m38477d() != 0) {
                    builder.setDesiredHeight(dVar.m38477d());
                }
                if (dVar.m38476e() != 0) {
                    builder.setDesiredHeightResId(dVar.m38476e());
                }
                build = builder.build();
                return build;
            }
        }

        /* renamed from: a */
        public static C2172d m38480a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C2174b.m38467a(bubbleMetadata);
            }
            if (i == 29) {
                return C2173a.m38469a(bubbleMetadata);
            }
            return null;
        }

        /* renamed from: k */
        public static Notification.BubbleMetadata m38470k(C2172d dVar) {
            if (dVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C2174b.m38466b(dVar);
            }
            if (i == 29) {
                return C2173a.m38468b(dVar);
            }
            return null;
        }

        /* renamed from: b */
        public boolean m38479b() {
            return (this.f3119f & 1) != 0;
        }

        /* renamed from: c */
        public PendingIntent m38478c() {
            return this.f3115b;
        }

        /* renamed from: d */
        public int m38477d() {
            return this.f3117d;
        }

        /* renamed from: e */
        public int m38476e() {
            return this.f3118e;
        }

        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: f */
        public IconCompat m38475f() {
            return this.f3116c;
        }

        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: g */
        public PendingIntent m38474g() {
            return this.f3114a;
        }

        /* renamed from: h */
        public String m38473h() {
            return this.f3120g;
        }

        /* renamed from: i */
        public boolean m38472i() {
            return (this.f3119f & 2) != 0;
        }

        /* renamed from: j */
        public void m38471j(int i) {
            this.f3119f = i;
        }

        private C2172d(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.f3114a = pendingIntent;
            this.f3116c = iconCompat;
            this.f3117d = i;
            this.f3118e = i2;
            this.f3115b = pendingIntent2;
            this.f3119f = i3;
            this.f3120g = str;
        }

        /* renamed from: androidx.core.app.NotificationCompat$d$c */
        /* loaded from: classes.dex */
        public static final class C2175c {

            /* renamed from: a */
            private PendingIntent f3121a;

            /* renamed from: b */
            private IconCompat f3122b;

            /* renamed from: c */
            private int f3123c;

            /* renamed from: d */
            private int f3124d;

            /* renamed from: e */
            private int f3125e;

            /* renamed from: f */
            private PendingIntent f3126f;

            /* renamed from: g */
            private String f3127g;

            public C2175c(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f3127g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            /* renamed from: f */
            private C2175c m38460f(int i, boolean z) {
                if (z) {
                    this.f3125e = i | this.f3125e;
                } else {
                    this.f3125e = (~i) & this.f3125e;
                }
                return this;
            }

            @SuppressLint({"SyntheticAccessor"})
            /* renamed from: a */
            public C2172d m38465a() {
                String str = this.f3127g;
                if (str == null && this.f3121a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.f3122b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    C2172d dVar = new C2172d(this.f3121a, this.f3126f, this.f3122b, this.f3123c, this.f3124d, this.f3125e, str);
                    dVar.m38471j(this.f3125e);
                    return dVar;
                }
            }

            /* renamed from: b */
            public C2175c m38464b(boolean z) {
                m38460f(1, z);
                return this;
            }

            /* renamed from: c */
            public C2175c m38463c(PendingIntent pendingIntent) {
                this.f3126f = pendingIntent;
                return this;
            }

            /* renamed from: d */
            public C2175c m38462d(int i) {
                this.f3123c = Math.max(i, 0);
                this.f3124d = 0;
                return this;
            }

            /* renamed from: e */
            public C2175c m38461e(int i) {
                this.f3124d = i;
                this.f3123c = 0;
                return this;
            }

            /* renamed from: g */
            public C2175c m38459g(boolean z) {
                m38460f(2, z);
                return this;
            }

            public C2175c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.f3121a = pendingIntent;
                    this.f3122b = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$e */
    /* loaded from: classes.dex */
    public static class C2176e extends AbstractC2178g {
        /* renamed from: x */
        private RemoteViews m38458x(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews c = m38453c(true, C1241g.f60c, false);
            c.removeAllViews(C1239e.f35034L);
            List<Action> z3 = m38456z(this.f3129a.f3072b);
            if (!z || z3 == null || (min = Math.min(z3.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(C1239e.f35034L, m38457y(z3.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            c.setViewVisibility(C1239e.f35034L, i);
            c.setViewVisibility(C1239e.f35031I, i);
            m38452d(c, remoteViews);
            return c;
        }

        /* renamed from: y */
        private RemoteViews m38457y(Action action) {
            boolean z;
            int i;
            if (action.f3059k == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.f3129a.f3071a.getPackageName();
            if (z) {
                i = C1241g.f59b;
            } else {
                i = C1241g.f58a;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat d = action.m38592d();
            if (d != null) {
                remoteViews.setImageViewBitmap(C1239e.f35032J, m38443m(d, this.f3129a.f3071a.getResources().getColor(C1236b.f8a)));
            }
            remoteViews.setTextViewText(C1239e.f35033K, action.f3058j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C1239e.f35030H, action.f3059k);
            }
            remoteViews.setContentDescription(C1239e.f35030H, action.f3058j);
            return remoteViews;
        }

        /* renamed from: z */
        private static List<Action> m38456z(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.m38586j()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: b */
        public void mo38454b(AbstractC2267m mVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                mVar.mo38178a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: q */
        protected String mo38439q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: s */
        public RemoteViews mo38437s(AbstractC2267m mVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews i = this.f3129a.m38534i();
            if (i == null) {
                i = this.f3129a.m38530k();
            }
            if (i == null) {
                return null;
            }
            return m38458x(i, true);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: t */
        public RemoteViews mo38436t(AbstractC2267m mVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f3129a.m38530k() != null) {
                return m38458x(this.f3129a.m38530k(), false);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: u */
        public RemoteViews mo38435u(AbstractC2267m mVar) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews n = this.f3129a.m38525n();
            if (n != null) {
                remoteViews = n;
            } else {
                remoteViews = this.f3129a.m38530k();
            }
            if (n == null) {
                return null;
            }
            return m38458x(remoteViews, true);
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$f */
    /* loaded from: classes.dex */
    public static class C2177f extends AbstractC2178g {

        /* renamed from: e */
        private ArrayList<CharSequence> f3128e = new ArrayList<>();

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: b */
        public void mo38454b(AbstractC2267m mVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(mVar.mo38178a()).setBigContentTitle(this.f3130b);
            if (this.f3132d) {
                bigContentTitle.setSummaryText(this.f3131c);
            }
            Iterator<CharSequence> it = this.f3128e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: f */
        protected void mo38450f(Bundle bundle) {
            super.mo38450f(bundle);
            bundle.remove("android.textLines");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: q */
        protected String mo38439q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: v */
        protected void mo38434v(Bundle bundle) {
            super.mo38434v(bundle);
            this.f3128e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f3128e, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2178g {

        /* renamed from: a */
        protected Builder f3129a;

        /* renamed from: b */
        CharSequence f3130b;

        /* renamed from: c */
        CharSequence f3131c;

        /* renamed from: d */
        boolean f3132d = false;

        /* renamed from: e */
        private int m38451e() {
            Resources resources = this.f3129a.f3071a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1237c.f17i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C1237c.f18j);
            float g = (m38449g(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - g) * dimensionPixelSize) + (g * dimensionPixelSize2));
        }

        /* renamed from: g */
        private static float m38449g(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: h */
        static AbstractC2178g m38448h(String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C2176e();
                case 1:
                    return new C2168b();
                case 2:
                    return new C2177f();
                case 3:
                    return new C2171c();
                case 4:
                    return new MessagingStyle();
                default:
                    return null;
            }
        }

        /* renamed from: i */
        private static AbstractC2178g m38447i(String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C2168b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C2171c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new C2177f();
            }
            if (i >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new MessagingStyle();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new C2176e();
                }
            }
            return null;
        }

        /* renamed from: j */
        static AbstractC2178g m38446j(Bundle bundle) {
            AbstractC2178g h = m38448h(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (h != null) {
                return h;
            }
            if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                return new MessagingStyle();
            }
            if (bundle.containsKey("android.picture")) {
                return new C2168b();
            }
            if (bundle.containsKey("android.bigText")) {
                return new C2171c();
            }
            if (bundle.containsKey("android.textLines")) {
                return new C2177f();
            }
            return m38447i(bundle.getString("android.template"));
        }

        /* renamed from: k */
        static AbstractC2178g m38445k(Bundle bundle) {
            AbstractC2178g j = m38446j(bundle);
            if (j == null) {
                return null;
            }
            try {
                j.mo38434v(bundle);
                return j;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: l */
        private Bitmap m38444l(int i, int i2, int i3) {
            return m38442n(IconCompat.m37872k(this.f3129a.f3071a, i), i2, i3);
        }

        /* renamed from: n */
        private Bitmap m38442n(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable t = iconCompat.m37863t(this.f3129a.f3071a);
            if (i2 == 0) {
                i3 = t.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = t.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            t.setBounds(0, 0, i3, i2);
            if (i != 0) {
                t.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            t.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: o */
        private Bitmap m38441o(int i, int i2, int i3, int i4) {
            int i5 = C1238d.f19a;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap l = m38444l(i5, i4, i2);
            Canvas canvas = new Canvas(l);
            Drawable mutate = this.f3129a.f3071a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l;
        }

        /* renamed from: p */
        public static AbstractC2178g m38440p(Notification notification) {
            Bundle k = NotificationCompat.m38611k(notification);
            if (k == null) {
                return null;
            }
            return m38445k(k);
        }

        /* renamed from: r */
        private void m38438r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C1239e.f41k0, 8);
            remoteViews.setViewVisibility(C1239e.f37i0, 8);
            remoteViews.setViewVisibility(C1239e.f35h0, 8);
        }

        /* renamed from: a */
        public void mo38455a(Bundle bundle) {
            if (this.f3132d) {
                bundle.putCharSequence("android.summaryText", this.f3131c);
            }
            CharSequence charSequence = this.f3130b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q = mo38439q();
            if (q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q);
            }
        }

        /* renamed from: b */
        public abstract void mo38454b(AbstractC2267m mVar);

        /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews m38453c(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.AbstractC2178g.m38453c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public void m38452d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m38438r(remoteViews);
            int i = C1239e.f35040R;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(C1239e.f35041S, 0, m38451e(), 0, 0);
        }

        /* renamed from: f */
        protected void mo38450f(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        /* renamed from: m */
        Bitmap m38443m(IconCompat iconCompat, int i) {
            return m38442n(iconCompat, i, 0);
        }

        /* renamed from: q */
        protected abstract String mo38439q();

        /* renamed from: s */
        public RemoteViews mo38437s(AbstractC2267m mVar) {
            return null;
        }

        /* renamed from: t */
        public RemoteViews mo38436t(AbstractC2267m mVar) {
            return null;
        }

        /* renamed from: u */
        public RemoteViews mo38435u(AbstractC2267m mVar) {
            return null;
        }

        /* renamed from: v */
        protected void mo38434v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f3131c = bundle.getCharSequence("android.summaryText");
                this.f3132d = true;
            }
            this.f3130b = bundle.getCharSequence("android.title.big");
        }

        /* renamed from: w */
        public void m38433w(Builder builder) {
            if (this.f3129a != builder) {
                this.f3129a = builder;
                if (builder != null) {
                    builder.m38541e0(this);
                }
            }
        }
    }

    /* renamed from: A */
    public static int m38623A(Notification notification) {
        return notification.visibility;
    }

    /* renamed from: B */
    public static boolean m38622B(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* renamed from: a */
    public static boolean m38621a(Notification notification) {
        boolean allowSystemGeneratedContextualActions;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
        return allowSystemGeneratedContextualActions;
    }

    /* renamed from: b */
    public static boolean m38620b(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    /* renamed from: c */
    public static int m38619c(Notification notification) {
        int badgeIconType;
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        badgeIconType = notification.getBadgeIconType();
        return badgeIconType;
    }

    /* renamed from: d */
    public static C2172d m38618d(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        bubbleMetadata = notification.getBubbleMetadata();
        return C2172d.m38480a(bubbleMetadata);
    }

    /* renamed from: e */
    public static String m38617e(Notification notification) {
        return notification.category;
    }

    /* renamed from: f */
    public static String m38616f(Notification notification) {
        String channelId;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        channelId = notification.getChannelId();
        return channelId;
    }

    /* renamed from: g */
    public static int m38615g(Notification notification) {
        return notification.color;
    }

    /* renamed from: h */
    public static CharSequence m38614h(Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    /* renamed from: i */
    public static CharSequence m38613i(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    /* renamed from: j */
    public static CharSequence m38612j(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    /* renamed from: k */
    public static Bundle m38611k(Notification notification) {
        return notification.extras;
    }

    /* renamed from: l */
    public static String m38610l(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: m */
    static boolean m38609m(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    /* renamed from: n */
    public static List<Action> m38608n(Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(C2316v2.m38164c(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static boolean m38607o(Notification notification) {
        return (notification.flags & Spliterator.NONNULL) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = r3.getLocusId();
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.C2348g m38606p(android.app.Notification r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L_0x0012
            android.content.LocusId r3 = androidx.core.app.C2294r0.m38195a(r3)
            if (r3 != 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            androidx.core.content.g r2 = androidx.core.content.C2348g.m38102d(r3)
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.m38606p(android.app.Notification):androidx.core.content.g");
    }

    /* renamed from: q */
    public static boolean m38605q(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    /* renamed from: r */
    public static boolean m38604r(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    /* renamed from: s */
    public static Notification m38603s(Notification notification) {
        return notification.publicVersion;
    }

    /* renamed from: t */
    public static CharSequence m38602t(Notification notification) {
        CharSequence settingsText;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        settingsText = notification.getSettingsText();
        return settingsText;
    }

    /* renamed from: u */
    public static String m38601u(Notification notification) {
        String shortcutId;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        shortcutId = notification.getShortcutId();
        return shortcutId;
    }

    /* renamed from: v */
    public static boolean m38600v(Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    /* renamed from: w */
    public static String m38599w(Notification notification) {
        return notification.getSortKey();
    }

    /* renamed from: x */
    public static CharSequence m38598x(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    /* renamed from: y */
    public static long m38597y(Notification notification) {
        long timeoutAfter;
        if (Build.VERSION.SDK_INT < 26) {
            return 0L;
        }
        timeoutAfter = notification.getTimeoutAfter();
        return timeoutAfter;
    }

    /* renamed from: z */
    public static boolean m38596z(Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    /* loaded from: classes.dex */
    public static class MessagingStyle extends AbstractC2178g {

        /* renamed from: e */
        private final List<C2166a> f3097e = new ArrayList();

        /* renamed from: f */
        private final List<C2166a> f3098f = new ArrayList();

        /* renamed from: g */
        private Person f3099g;

        /* renamed from: h */
        private CharSequence f3100h;

        /* renamed from: i */
        private Boolean f3101i;

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$a */
        /* loaded from: classes.dex */
        public static final class C2166a {

            /* renamed from: a */
            private final CharSequence f3102a;

            /* renamed from: b */
            private final long f3103b;

            /* renamed from: c */
            private final Person f3104c;

            /* renamed from: d */
            private Bundle f3105d = new Bundle();

            /* renamed from: e */
            private String f3106e;

            /* renamed from: f */
            private Uri f3107f;

            public C2166a(CharSequence charSequence, long j, Person person) {
                this.f3102a = charSequence;
                this.f3103b = j;
                this.f3104c = person;
            }

            /* renamed from: a */
            static Bundle[] m38501a(List<C2166a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m38490l();
                }
                return bundleArr;
            }

            /* renamed from: e */
            static C2166a m38497e(Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            person = Person.m38405b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            person = Person.m38406a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            person = new Person.C2186c().m38385f(bundle.getCharSequence("sender")).m38390a();
                        } else {
                            person = null;
                        }
                        C2166a aVar = new C2166a(bundle.getCharSequence("text"), bundle.getLong("time"), person);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            aVar.m38492j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            aVar.m38498d().putAll(bundle.getBundle("extras"));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: f */
            static List<C2166a> m38496f(Parcelable[] parcelableArr) {
                C2166a e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e = m38497e((Bundle) parcelable)) != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }

            /* renamed from: l */
            private Bundle m38490l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3102a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f3103b);
                Person person = this.f3104c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.m38402e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f3104c.m38397j());
                    } else {
                        bundle.putBundle("person", this.f3104c.m38396k());
                    }
                }
                String str = this.f3106e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3107f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3105d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: b */
            public String m38500b() {
                return this.f3106e;
            }

            /* renamed from: c */
            public Uri m38499c() {
                return this.f3107f;
            }

            /* renamed from: d */
            public Bundle m38498d() {
                return this.f3105d;
            }

            /* renamed from: g */
            public Person m38495g() {
                return this.f3104c;
            }

            /* renamed from: h */
            public CharSequence m38494h() {
                return this.f3102a;
            }

            /* renamed from: i */
            public long m38493i() {
                return this.f3103b;
            }

            /* renamed from: j */
            public C2166a m38492j(String str, Uri uri) {
                this.f3106e = str;
                this.f3107f = uri;
                return this;
            }

            /* renamed from: k */
            Notification.MessagingStyle.Message m38491k() {
                Notification.MessagingStyle.Message message;
                Person g = m38495g();
                CharSequence charSequence = null;
                android.app.Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence h = m38494h();
                    long i = m38493i();
                    if (g != null) {
                        person = g.m38397j();
                    }
                    message = new Notification.MessagingStyle.Message(h, i, person);
                } else {
                    CharSequence h2 = m38494h();
                    long i2 = m38493i();
                    if (g != null) {
                        charSequence = g.m38402e();
                    }
                    message = new Notification.MessagingStyle.Message(h2, i2, charSequence);
                }
                if (m38500b() != null) {
                    message.setData(m38500b(), m38499c());
                }
                return message;
            }
        }

        MessagingStyle() {
        }

        /* renamed from: A */
        private C2166a m38512A() {
            List<C2166a> list;
            for (int size = this.f3097e.size() - 1; size >= 0; size--) {
                C2166a aVar = this.f3097e.get(size);
                if (!(aVar.m38495g() == null || TextUtils.isEmpty(aVar.m38495g().m38402e()))) {
                    return aVar;
                }
            }
            if (this.f3097e.isEmpty()) {
                return null;
            }
            return this.f3097e.get(list.size() - 1);
        }

        /* renamed from: C */
        private boolean m38510C() {
            for (int size = this.f3097e.size() - 1; size >= 0; size--) {
                C2166a aVar = this.f3097e.get(size);
                if (aVar.m38495g() != null && aVar.m38495g().m38402e() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: E */
        private TextAppearanceSpan m38508E(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        /* renamed from: F */
        private CharSequence m38507F(C2166a aVar) {
            CharSequence charSequence;
            C2485a c = C2485a.m37650c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence2 = "";
            if (aVar.m38495g() == null) {
                charSequence = charSequence2;
            } else {
                charSequence = aVar.m38495g().m38402e();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f3099g.m38402e();
                if (this.f3129a.m38532j() != 0) {
                    i = this.f3129a.m38532j();
                }
            }
            CharSequence h = c.m37645h(charSequence);
            spannableStringBuilder.append(h);
            spannableStringBuilder.setSpan(m38508E(i), spannableStringBuilder.length() - h.length(), spannableStringBuilder.length(), 33);
            if (aVar.m38494h() != null) {
                charSequence2 = aVar.m38494h();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c.m37645h(charSequence2));
            return spannableStringBuilder;
        }

        /* renamed from: z */
        public static MessagingStyle m38502z(Notification notification) {
            AbstractC2178g p = AbstractC2178g.m38440p(notification);
            if (p instanceof MessagingStyle) {
                return (MessagingStyle) p;
            }
            return null;
        }

        /* renamed from: B */
        public List<C2166a> m38511B() {
            return this.f3097e;
        }

        /* renamed from: D */
        public boolean m38509D() {
            Builder builder = this.f3129a;
            if (builder == null || builder.f3071a.getApplicationInfo().targetSdkVersion >= 28 || this.f3101i != null) {
                Boolean bool = this.f3101i;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.f3100h != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: G */
        public MessagingStyle m38506G(CharSequence charSequence) {
            this.f3100h = charSequence;
            return this;
        }

        /* renamed from: H */
        public MessagingStyle m38505H(boolean z) {
            this.f3101i = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: a */
        public void mo38455a(Bundle bundle) {
            super.mo38455a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f3099g.m38402e());
            bundle.putBundle("android.messagingStyleUser", this.f3099g.m38396k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f3100h);
            if (this.f3100h != null && this.f3101i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f3100h);
            }
            if (!this.f3097e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C2166a.m38501a(this.f3097e));
            }
            if (!this.f3098f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C2166a.m38501a(this.f3098f));
            }
            Boolean bool = this.f3101i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: b */
        public void mo38454b(AbstractC2267m mVar) {
            boolean z;
            CharSequence charSequence;
            CharSequence charSequence2;
            Notification.MessagingStyle messagingStyle;
            m38505H(m38509D());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f3099g.m38397j());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f3099g.m38402e());
                }
                for (C2166a aVar : this.f3097e) {
                    messagingStyle.addMessage(aVar.m38491k());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (C2166a aVar2 : this.f3098f) {
                        messagingStyle.addHistoricMessage(aVar2.m38491k());
                    }
                }
                if (this.f3101i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f3100h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f3101i.booleanValue());
                }
                messagingStyle.setBuilder(mVar.mo38178a());
                return;
            }
            C2166a A = m38512A();
            if (this.f3100h != null && this.f3101i.booleanValue()) {
                mVar.mo38178a().setContentTitle(this.f3100h);
            } else if (A != null) {
                mVar.mo38178a().setContentTitle("");
                if (A.m38495g() != null) {
                    mVar.mo38178a().setContentTitle(A.m38495g().m38402e());
                }
            }
            if (A != null) {
                Notification.Builder a = mVar.mo38178a();
                if (this.f3100h != null) {
                    charSequence2 = m38507F(A);
                } else {
                    charSequence2 = A.m38494h();
                }
                a.setContentText(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f3100h != null || m38510C()) {
                z = true;
            } else {
                z = false;
            }
            for (int size = this.f3097e.size() - 1; size >= 0; size--) {
                C2166a aVar3 = this.f3097e.get(size);
                if (z) {
                    charSequence = m38507F(aVar3);
                } else {
                    charSequence = aVar3.m38494h();
                }
                if (size != this.f3097e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                spannableStringBuilder.insert(0, charSequence);
            }
            new Notification.BigTextStyle(mVar.mo38178a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: f */
        protected void mo38450f(Bundle bundle) {
            super.mo38450f(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: q */
        protected String mo38439q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC2178g
        /* renamed from: v */
        protected void mo38434v(Bundle bundle) {
            super.mo38434v(bundle);
            this.f3097e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f3099g = Person.m38405b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f3099g = new Person.C2186c().m38385f(bundle.getString("android.selfDisplayName")).m38390a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f3100h = charSequence;
            if (charSequence == null) {
                this.f3100h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f3097e.addAll(C2166a.m38496f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f3098f.addAll(C2166a.m38496f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f3101i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        /* renamed from: x */
        public MessagingStyle m38504x(C2166a aVar) {
            if (aVar != null) {
                this.f3097e.add(aVar);
                if (this.f3097e.size() > 25) {
                    this.f3097e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: y */
        public MessagingStyle m38503y(CharSequence charSequence, long j, Person person) {
            m38504x(new C2166a(charSequence, j, person));
            return this;
        }

        public MessagingStyle(Person person) {
            if (!TextUtils.isEmpty(person.m38402e())) {
                this.f3099g = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: A */
        boolean f35618A;

        /* renamed from: B */
        boolean f35619B;

        /* renamed from: C */
        boolean f35620C;

        /* renamed from: D */
        String f35621D;

        /* renamed from: E */
        Bundle f35622E;

        /* renamed from: F */
        int f35623F;

        /* renamed from: G */
        int f35624G;

        /* renamed from: H */
        Notification f35625H;

        /* renamed from: I */
        RemoteViews f35626I;

        /* renamed from: J */
        RemoteViews f35627J;

        /* renamed from: K */
        RemoteViews f35628K;

        /* renamed from: L */
        String f35629L;

        /* renamed from: M */
        int f35630M;

        /* renamed from: N */
        String f35631N;

        /* renamed from: O */
        C2348g f35632O;

        /* renamed from: P */
        long f35633P;

        /* renamed from: Q */
        int f35634Q;

        /* renamed from: R */
        int f35635R;

        /* renamed from: S */
        boolean f35636S;

        /* renamed from: T */
        C2172d f35637T;

        /* renamed from: U */
        Notification f35638U;

        /* renamed from: V */
        boolean f35639V;

        /* renamed from: W */
        Icon f35640W;
        @Deprecated

        /* renamed from: X */
        public ArrayList<String> f35641X;

        /* renamed from: a */
        public Context f3071a;

        /* renamed from: b */
        public ArrayList<Action> f3072b;

        /* renamed from: c */
        public ArrayList<Person> f3073c;

        /* renamed from: d */
        ArrayList<Action> f3074d;

        /* renamed from: e */
        CharSequence f3075e;

        /* renamed from: f */
        CharSequence f3076f;

        /* renamed from: g */
        PendingIntent f3077g;

        /* renamed from: h */
        PendingIntent f3078h;

        /* renamed from: i */
        RemoteViews f3079i;

        /* renamed from: j */
        Bitmap f3080j;

        /* renamed from: k */
        CharSequence f3081k;

        /* renamed from: l */
        int f3082l;

        /* renamed from: m */
        int f3083m;

        /* renamed from: n */
        boolean f3084n;

        /* renamed from: o */
        boolean f3085o;

        /* renamed from: p */
        boolean f3086p;

        /* renamed from: q */
        AbstractC2178g f3087q;

        /* renamed from: r */
        CharSequence f3088r;

        /* renamed from: s */
        CharSequence f3089s;

        /* renamed from: t */
        CharSequence[] f3090t;

        /* renamed from: u */
        int f3091u;

        /* renamed from: v */
        int f3092v;

        /* renamed from: w */
        boolean f3093w;

        /* renamed from: x */
        String f3094x;

        /* renamed from: y */
        boolean f3095y;

        /* renamed from: z */
        String f3096z;

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.m38616f(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            AbstractC2178g p = AbstractC2178g.m38440p(notification);
            m38572E(NotificationCompat.m38612j(notification)).m38573D(NotificationCompat.m38613i(notification)).m38575B(NotificationCompat.m38614h(notification)).m38539f0(NotificationCompat.m38598x(notification)).m38555V(NotificationCompat.m38602t(notification)).m38541e0(p).m38574C(notification.contentIntent).m38567J(NotificationCompat.m38610l(notification)).m38566K(NotificationCompat.m38622B(notification)).m38562O(NotificationCompat.m38606p(notification)).m38527l0(notification.when).m38553X(NotificationCompat.m38600v(notification)).m38533i0(NotificationCompat.m38596z(notification)).m38519t(NotificationCompat.m38620b(notification)).m38559R(NotificationCompat.m38604r(notification)).m38560Q(NotificationCompat.m38605q(notification)).m38563N(NotificationCompat.m38607o(notification)).m38565L(notification.largeIcon).m38518u(NotificationCompat.m38619c(notification)).m38516w(NotificationCompat.m38617e(notification)).m38517v(NotificationCompat.m38618d(notification)).m38561P(notification.number).m38537g0(notification.tickerText).m38574C(notification.contentIntent).m38570G(notification.deleteIntent).m38568I(notification.fullScreenIntent, NotificationCompat.m38609m(notification)).m38543d0(notification.sound, notification.audioStreamType).m38531j0(notification.vibrate).m38564M(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).m38571F(notification.defaults).m38558S(notification.priority).m38513z(NotificationCompat.m38615g(notification)).m38529k0(NotificationCompat.m38623A(notification)).m38556U(NotificationCompat.m38603s(notification)).m38547b0(NotificationCompat.m38599w(notification)).m38535h0(NotificationCompat.m38597y(notification)).m38554W(NotificationCompat.m38601u(notification)).m38557T(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).m38520s(NotificationCompat.m38621a(notification)).m38549a0(notification.icon, notification.iconLevel).m38546c(m38526m(notification, p));
            this.f35640W = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action action : actionArr) {
                    m38548b(Action.C2165a.m38582d(action).m38584b());
                }
            }
            List<Action> n = NotificationCompat.m38608n(notification);
            if (!n.isEmpty()) {
                for (Action action2 : n) {
                    m38544d(action2);
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String str : stringArray) {
                    m38540f(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list")) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    m38542e(Person.m38406a((android.app.Person) it.next()));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey("android.chronometerCountDown")) {
                m38514y(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (i >= 26 && bundle.containsKey("android.colorized")) {
                m38576A(bundle.getBoolean("android.colorized"));
            }
        }

        /* renamed from: H */
        private void m38569H(int i, boolean z) {
            if (z) {
                Notification notification = this.f35638U;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f35638U;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: m */
        private static Bundle m38526m(Notification notification, AbstractC2178g gVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (gVar != null) {
                gVar.mo38450f(bundle);
            }
            return bundle;
        }

        /* renamed from: q */
        protected static CharSequence m38522q(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: r */
        private Bitmap m38521r(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3071a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1237c.f10b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C1237c.f9a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        /* renamed from: A */
        public Builder m38576A(boolean z) {
            this.f35619B = z;
            this.f35620C = true;
            return this;
        }

        /* renamed from: B */
        public Builder m38575B(CharSequence charSequence) {
            this.f3081k = m38522q(charSequence);
            return this;
        }

        /* renamed from: C */
        public Builder m38574C(PendingIntent pendingIntent) {
            this.f3077g = pendingIntent;
            return this;
        }

        /* renamed from: D */
        public Builder m38573D(CharSequence charSequence) {
            this.f3076f = m38522q(charSequence);
            return this;
        }

        /* renamed from: E */
        public Builder m38572E(CharSequence charSequence) {
            this.f3075e = m38522q(charSequence);
            return this;
        }

        /* renamed from: F */
        public Builder m38571F(int i) {
            Notification notification = this.f35638U;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: G */
        public Builder m38570G(PendingIntent pendingIntent) {
            this.f35638U.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: I */
        public Builder m38568I(PendingIntent pendingIntent, boolean z) {
            this.f3078h = pendingIntent;
            m38569H(128, z);
            return this;
        }

        /* renamed from: J */
        public Builder m38567J(String str) {
            this.f3094x = str;
            return this;
        }

        /* renamed from: K */
        public Builder m38566K(boolean z) {
            this.f3095y = z;
            return this;
        }

        /* renamed from: L */
        public Builder m38565L(Bitmap bitmap) {
            this.f3080j = m38521r(bitmap);
            return this;
        }

        /* renamed from: M */
        public Builder m38564M(int i, int i2, int i3) {
            int i4;
            Notification notification = this.f35638U;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        /* renamed from: N */
        public Builder m38563N(boolean z) {
            this.f35618A = z;
            return this;
        }

        /* renamed from: O */
        public Builder m38562O(C2348g gVar) {
            this.f35632O = gVar;
            return this;
        }

        /* renamed from: P */
        public Builder m38561P(int i) {
            this.f3082l = i;
            return this;
        }

        /* renamed from: Q */
        public Builder m38560Q(boolean z) {
            m38569H(2, z);
            return this;
        }

        /* renamed from: R */
        public Builder m38559R(boolean z) {
            m38569H(8, z);
            return this;
        }

        /* renamed from: S */
        public Builder m38558S(int i) {
            this.f3083m = i;
            return this;
        }

        /* renamed from: T */
        public Builder m38557T(int i, int i2, boolean z) {
            this.f3091u = i;
            this.f3092v = i2;
            this.f3093w = z;
            return this;
        }

        /* renamed from: U */
        public Builder m38556U(Notification notification) {
            this.f35625H = notification;
            return this;
        }

        /* renamed from: V */
        public Builder m38555V(CharSequence charSequence) {
            this.f3089s = m38522q(charSequence);
            return this;
        }

        /* renamed from: W */
        public Builder m38554W(String str) {
            this.f35631N = str;
            return this;
        }

        /* renamed from: X */
        public Builder m38553X(boolean z) {
            this.f3084n = z;
            return this;
        }

        /* renamed from: Y */
        public Builder m38552Y(boolean z) {
            this.f35639V = z;
            return this;
        }

        /* renamed from: Z */
        public Builder m38551Z(int i) {
            this.f35638U.icon = i;
            return this;
        }

        /* renamed from: a */
        public Builder m38550a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3072b.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a0 */
        public Builder m38549a0(int i, int i2) {
            Notification notification = this.f35638U;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        /* renamed from: b */
        public Builder m38548b(Action action) {
            if (action != null) {
                this.f3072b.add(action);
            }
            return this;
        }

        /* renamed from: b0 */
        public Builder m38547b0(String str) {
            this.f3096z = str;
            return this;
        }

        /* renamed from: c */
        public Builder m38546c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f35622E;
                if (bundle2 == null) {
                    this.f35622E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: c0 */
        public Builder m38545c0(Uri uri) {
            Notification notification = this.f35638U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: d */
        public Builder m38544d(Action action) {
            if (action != null) {
                this.f3074d.add(action);
            }
            return this;
        }

        /* renamed from: d0 */
        public Builder m38543d0(Uri uri, int i) {
            Notification notification = this.f35638U;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        /* renamed from: e */
        public Builder m38542e(Person person) {
            if (person != null) {
                this.f3073c.add(person);
            }
            return this;
        }

        /* renamed from: e0 */
        public Builder m38541e0(AbstractC2178g gVar) {
            if (this.f3087q != gVar) {
                this.f3087q = gVar;
                if (gVar != null) {
                    gVar.m38433w(this);
                }
            }
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public Builder m38540f(String str) {
            if (str != null && !str.isEmpty()) {
                this.f35641X.add(str);
            }
            return this;
        }

        /* renamed from: f0 */
        public Builder m38539f0(CharSequence charSequence) {
            this.f3088r = m38522q(charSequence);
            return this;
        }

        /* renamed from: g */
        public Notification m38538g() {
            return new C2311u2(this).m38176c();
        }

        /* renamed from: g0 */
        public Builder m38537g0(CharSequence charSequence) {
            this.f35638U.tickerText = m38522q(charSequence);
            return this;
        }

        /* renamed from: h */
        public Builder m38536h() {
            this.f3072b.clear();
            return this;
        }

        /* renamed from: h0 */
        public Builder m38535h0(long j) {
            this.f35633P = j;
            return this;
        }

        /* renamed from: i */
        public RemoteViews m38534i() {
            return this.f35627J;
        }

        /* renamed from: i0 */
        public Builder m38533i0(boolean z) {
            this.f3085o = z;
            return this;
        }

        /* renamed from: j */
        public int m38532j() {
            return this.f35623F;
        }

        /* renamed from: j0 */
        public Builder m38531j0(long[] jArr) {
            this.f35638U.vibrate = jArr;
            return this;
        }

        /* renamed from: k */
        public RemoteViews m38530k() {
            return this.f35626I;
        }

        /* renamed from: k0 */
        public Builder m38529k0(int i) {
            this.f35624G = i;
            return this;
        }

        /* renamed from: l */
        public Bundle m38528l() {
            if (this.f35622E == null) {
                this.f35622E = new Bundle();
            }
            return this.f35622E;
        }

        /* renamed from: l0 */
        public Builder m38527l0(long j) {
            this.f35638U.when = j;
            return this;
        }

        /* renamed from: n */
        public RemoteViews m38525n() {
            return this.f35628K;
        }

        /* renamed from: o */
        public int m38524o() {
            return this.f3083m;
        }

        /* renamed from: p */
        public long m38523p() {
            if (this.f3084n) {
                return this.f35638U.when;
            }
            return 0L;
        }

        /* renamed from: s */
        public Builder m38520s(boolean z) {
            this.f35636S = z;
            return this;
        }

        /* renamed from: t */
        public Builder m38519t(boolean z) {
            m38569H(16, z);
            return this;
        }

        /* renamed from: u */
        public Builder m38518u(int i) {
            this.f35630M = i;
            return this;
        }

        /* renamed from: v */
        public Builder m38517v(C2172d dVar) {
            this.f35637T = dVar;
            return this;
        }

        /* renamed from: w */
        public Builder m38516w(String str) {
            this.f35621D = str;
            return this;
        }

        /* renamed from: x */
        public Builder m38515x(String str) {
            this.f35629L = str;
            return this;
        }

        /* renamed from: y */
        public Builder m38514y(boolean z) {
            this.f3086p = z;
            m38528l().putBoolean("android.chronometerCountDown", z);
            return this;
        }

        /* renamed from: z */
        public Builder m38513z(int i) {
            this.f35623F = i;
            return this;
        }

        public Builder(Context context, String str) {
            this.f3072b = new ArrayList<>();
            this.f3073c = new ArrayList<>();
            this.f3074d = new ArrayList<>();
            this.f3084n = true;
            this.f35618A = false;
            this.f35623F = 0;
            this.f35624G = 0;
            this.f35630M = 0;
            this.f35634Q = 0;
            this.f35635R = 0;
            Notification notification = new Notification();
            this.f35638U = notification;
            this.f3071a = context;
            this.f35629L = str;
            notification.when = System.currentTimeMillis();
            this.f35638U.audioStreamType = -1;
            this.f3083m = 0;
            this.f35641X = new ArrayList<>();
            this.f35636S = true;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, (String) null);
        }
    }
}
