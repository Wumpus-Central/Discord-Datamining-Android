.class public final Lcom/swmansion/rnscreens/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ReactPackage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0008\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/i;",
        "Lcom/facebook/react/ReactPackage;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "",
        "Lcom/facebook/react/bridge/NativeModule;",
        "createNativeModules",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "createViewManagers",
        "<init>",
        "()V",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x6

    .line 7
    new-array p1, p1, [Lcom/facebook/react/uimanager/ViewManager;

    .line 8
    .line 9
    new-instance v0, Lcom/swmansion/rnscreens/ScreenContainerViewManager;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object v0, p1, v1

    .line 16
    .line 17
    new-instance v0, Lcom/swmansion/rnscreens/ScreenViewManager;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenViewManager;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    aput-object v0, p1, v1

    .line 24
    .line 25
    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackViewManager;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenStackViewManager;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aput-object v0, p1, v1

    .line 32
    .line 33
    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;

    .line 34
    .line 35
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    aput-object v0, p1, v1

    .line 40
    .line 41
    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    aput-object v0, p1, v1

    .line 48
    .line 49
    new-instance v0, Lcom/swmansion/rnscreens/SearchBarManager;

    .line 50
    .line 51
    invoke-direct {v0}, Lcom/swmansion/rnscreens/SearchBarManager;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    aput-object v0, p1, v1

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
.end method
