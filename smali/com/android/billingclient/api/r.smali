.class final Lcom/android/billingclient/api/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/android/billingclient/api/q;


# direct methods
.method constructor <init>(Landroid/content/Context;Lv2/f;Lv2/b0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/r;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/q;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, p3, v0}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/r;Lv2/f;Lv2/b0;Lv2/c0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lv2/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/r;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/q;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2, p2}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/r;Lv2/s;Lv2/c0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    return-void
.end method

.method static bridge synthetic a(Lcom/android/billingclient/api/r;)Lcom/android/billingclient/api/q;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    return-object p0
.end method


# virtual methods
.method final b()Lv2/s;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    invoke-static {v0}, Lcom/android/billingclient/api/q;->a(Lcom/android/billingclient/api/q;)Lv2/s;

    const/4 v0, 0x0

    return-object v0
.end method

.method final c()Lv2/f;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    invoke-static {v0}, Lcom/android/billingclient/api/q;->b(Lcom/android/billingclient/api/q;)Lv2/f;

    move-result-object v0

    return-object v0
.end method

.method final d()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    iget-object v1, p0, Lcom/android/billingclient/api/r;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/q;->d(Landroid/content/Context;)V

    return-void
.end method

.method final e()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/billingclient/api/r;->b:Lcom/android/billingclient/api/q;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/android/billingclient/api/r;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v0}, Lcom/android/billingclient/api/q;->c(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
