.class public Lcom/reactnativecommunity/netinfo/NetInfoModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lcom/reactnativecommunity/netinfo/a$b;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCNetInfo"
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "RNCNetInfo"


# instance fields
.field private final mAmazonConnectivityChecker:Lcom/reactnativecommunity/netinfo/a;

.field private final mConnectivityReceiver:Lxe/b;

.field private numberOfListeners:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->numberOfListeners:I

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lxe/g;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lxe/g;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lxe/a;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lxe/a;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 27
    .line 28
    :goto_0
    new-instance v0, Lcom/reactnativecommunity/netinfo/a;

    .line 29
    .line 30
    invoke-direct {v0, p1, p0}, Lcom/reactnativecommunity/netinfo/a;-><init>(Landroid/content/Context;Lcom/reactnativecommunity/netinfo/a$b;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mAmazonConnectivityChecker:Lcom/reactnativecommunity/netinfo/a;

    .line 34
    .line 35
    return-void
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
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget p1, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->numberOfListeners:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    add-int/2addr p1, v0

    .line 5
    iput p1, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->numberOfListeners:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 8
    .line 9
    iput-boolean v0, p1, Lxe/b;->e:Z

    .line 10
    .line 11
    return-void
    .line 12
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

.method public getCurrentState(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    invoke-virtual {v0, p1, p2}, Lxe/b;->d(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNCNetInfo"

    return-object v0
.end method

.method public initialize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxe/b;->g()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mAmazonConnectivityChecker:Lcom/reactnativecommunity/netinfo/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/reactnativecommunity/netinfo/a;->g()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
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
.end method

.method public onAmazonFireDeviceConnectivityChanged(Z)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    invoke-virtual {v0, p1}, Lxe/b;->i(Z)V

    return-void
.end method

.method public onCatalystInstanceDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mAmazonConnectivityChecker:Lcom/reactnativecommunity/netinfo/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/reactnativecommunity/netinfo/a;->k()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lxe/b;->j()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, v0, Lxe/b;->e:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public removeListeners(Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->numberOfListeners:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-int/2addr v0, p1

    .line 8
    iput v0, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->numberOfListeners:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/reactnativecommunity/netinfo/NetInfoModule;->mConnectivityReceiver:Lxe/b;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p1, Lxe/b;->e:Z

    .line 16
    .line 17
    :cond_0
    return-void
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
