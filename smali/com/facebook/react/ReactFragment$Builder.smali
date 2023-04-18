.class public Lcom/facebook/react/ReactFragment$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field mComponentName:Ljava/lang/String;

.field mLaunchOptions:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
.end method


# virtual methods
.method public build()Lcom/facebook/react/ReactFragment;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lcom/facebook/react/ReactFragment;->access$000(Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/ReactFragment;

    move-result-object v0

    return-object v0
.end method

.method public setComponentName(Ljava/lang/String;)Lcom/facebook/react/ReactFragment$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactFragment$Builder;->mComponentName:Ljava/lang/String;

    return-object p0
.end method

.method public setLaunchOptions(Landroid/os/Bundle;)Lcom/facebook/react/ReactFragment$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactFragment$Builder;->mLaunchOptions:Landroid/os/Bundle;

    return-object p0
.end method
