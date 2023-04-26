.class public Lcom/facebook/react/uimanager/ReactYogaConfigProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static YOGA_CONFIG:Lcom/facebook/yoga/YogaConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/facebook/yoga/YogaConfig;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactYogaConfigProvider;->YOGA_CONFIG:Lcom/facebook/yoga/YogaConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/yoga/a;->a()Lcom/facebook/yoga/YogaConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/facebook/react/uimanager/ReactYogaConfigProvider;->YOGA_CONFIG:Lcom/facebook/yoga/YogaConfig;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/facebook/yoga/YogaConfig;->a(F)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcom/facebook/react/uimanager/ReactYogaConfigProvider;->YOGA_CONFIG:Lcom/facebook/yoga/YogaConfig;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lcom/facebook/yoga/YogaConfig;->b(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/ReactYogaConfigProvider;->YOGA_CONFIG:Lcom/facebook/yoga/YogaConfig;

    .line 22
    .line 23
    return-object v0
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
.end method
