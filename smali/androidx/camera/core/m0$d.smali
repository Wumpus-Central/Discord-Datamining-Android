.class public final Landroidx/camera/core/m0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final a:Landroid/util/Size;

.field private static final b:Lw/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x280

    .line 4
    .line 5
    const/16 v2, 0x1e0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/camera/core/m0$d;->a:Landroid/util/Size;

    .line 11
    .line 12
    new-instance v1, Landroidx/camera/core/m0$c;

    .line 13
    .line 14
    invoke-direct {v1}, Landroidx/camera/core/m0$c;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroidx/camera/core/m0$c;->j(Landroid/util/Size;)Landroidx/camera/core/m0$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Landroidx/camera/core/m0$c;->k(I)Landroidx/camera/core/m0$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroidx/camera/core/m0$c;->l(I)Landroidx/camera/core/m0$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroidx/camera/core/m0$c;->g()Lw/e1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Landroidx/camera/core/m0$d;->b:Lw/e1;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw/e1;
    .locals 1

    sget-object v0, Landroidx/camera/core/m0$d;->b:Lw/e1;

    return-object v0
.end method
