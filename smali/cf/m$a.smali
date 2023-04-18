.class public final Lcf/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/m$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcf/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "cf/m$a",
        "Lcf/m$d;",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-static {p0}, Lcf/m$d$a;->d(Lcf/m$d;)Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    invoke-static {p0}, Lcf/m$d$a;->b(Lcf/m$d;)Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    invoke-static {p0}, Lcf/m$d$a;->f(Lcf/m$d;)Z

    move-result v0

    return v0
.end method

.method public d(Lcf/d;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/d<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lcf/m$d$a;->e(Lcf/m$d;Lcf/d;)Z

    move-result p1

    return p1
.end method

.method public e(Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcf/m$d$a;->c(Lcf/m$d;Landroid/view/MotionEvent;)V

    return-void
.end method

.method public f(Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcf/m$d$a;->a(Lcf/m$d;Landroid/view/MotionEvent;)V

    return-void
.end method
