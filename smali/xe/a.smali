.class public Lxe/a;
.super Lxe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/a$b;
    }
.end annotation


# instance fields
.field private final j:Lxe/a$b;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lxe/b;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lxe/a$b;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, Lxe/a$b;-><init>(Lxe/a;Lxe/a$a;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lxe/a;->j:Lxe/a$b;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic l(Lxe/a;)V
    .locals 0

    invoke-direct {p0}, Lxe/a;->m()V

    return-void
.end method

.method private m()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    sget-object v0, Lye/b;->p:Lye/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lxe/b;->c()Landroid/net/ConnectivityManager;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_7

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_6

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    if-eq v4, v5, :cond_5

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    if-eq v4, v5, :cond_6

    .line 37
    .line 38
    const/16 v3, 0x9

    .line 39
    .line 40
    if-eq v4, v3, :cond_4

    .line 41
    .line 42
    const/16 v3, 0x11

    .line 43
    .line 44
    if-eq v4, v3, :cond_3

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    if-eq v4, v3, :cond_2

    .line 48
    .line 49
    const/4 v3, 0x7

    .line 50
    if-eq v4, v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    sget-object v0, Lye/b;->l:Lye/b;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sget-object v0, Lye/b;->r:Lye/b;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object v0, Lye/b;->s:Lye/b;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    sget-object v0, Lye/b;->n:Lye/b;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    sget-object v0, Lye/b;->q:Lye/b;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_6
    sget-object v0, Lye/b;->m:Lye/b;

    .line 69
    .line 70
    invoke-static {v3}, Lye/a;->a(Landroid/net/NetworkInfo;)Lye/a;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_1

    .line 75
    :cond_7
    :goto_0
    sget-object v0, Lye/b;->o:Lye/b;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_0
    sget-object v0, Lye/b;->p:Lye/b;

    .line 79
    .line 80
    :goto_1
    invoke-virtual {p0, v0, v1, v2}, Lxe/b;->k(Lye/b;Lye/a;Z)V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method


# virtual methods
.method public g()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lxe/b;->e()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lxe/a;->j:Lxe/a$b;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lxe/a;->j:Lxe/a$b;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Lxe/a$b;->b(Z)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lxe/a;->m()V

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxe/a;->j:Lxe/a$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxe/a$b;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lxe/b;->e()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lxe/a;->j:Lxe/a$b;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lxe/a;->j:Lxe/a$b;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Lxe/a$b;->b(Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
