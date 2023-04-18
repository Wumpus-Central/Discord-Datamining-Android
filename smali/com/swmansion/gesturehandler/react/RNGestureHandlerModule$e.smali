.class final Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;
.super Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c<",
        "Lcf/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;",
        "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;",
        "Lcf/l;",
        "Landroid/content/Context;",
        "context",
        "f",
        "Ljava/lang/Class;",
        "a",
        "Ljava/lang/Class;",
        "e",
        "()Ljava/lang/Class;",
        "type",
        "",
        "b",
        "Ljava/lang/String;",
        "d",
        "()Ljava/lang/String;",
        "name",
        "<init>",
        "()V",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcf/l;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcf/l;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;->a:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "ManualGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;->b:Ljava/lang/String;

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
.end method


# virtual methods
.method public bridge synthetic c(Landroid/content/Context;)Lcf/d;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;->f(Landroid/content/Context;)Lcf/l;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcf/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public f(Landroid/content/Context;)Lcf/l;
    .locals 0

    new-instance p1, Lcf/l;

    invoke-direct {p1}, Lcf/l;-><init>()V

    return-object p1
.end method
