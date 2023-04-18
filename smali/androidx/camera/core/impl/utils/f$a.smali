.class final Landroidx/camera/core/impl/utils/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/utils/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/util/CloseGuard;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/CloseGuard;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/core/impl/utils/f$a;->a:Landroid/util/CloseGuard;

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
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f$a;->a:Landroid/util/CloseGuard;

    invoke-static {v0}, Landroidx/camera/core/impl/utils/e;->a(Landroid/util/CloseGuard;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f$a;->a:Landroid/util/CloseGuard;

    invoke-static {v0, p1}, Landroidx/camera/core/impl/utils/c;->a(Landroid/util/CloseGuard;Ljava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/utils/f$a;->a:Landroid/util/CloseGuard;

    invoke-static {v0}, Landroidx/camera/core/impl/utils/d;->a(Landroid/util/CloseGuard;)V

    return-void
.end method
