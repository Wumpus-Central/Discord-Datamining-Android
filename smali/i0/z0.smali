.class public abstract Li0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/z0$a;
    }
.end annotation


# static fields
.field static final a:Ljava/lang/Integer;

.field static final b:Li0/z0;

.field static final c:Lw/a2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/a2<",
            "Li0/z0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Li0/z0;->a:Ljava/lang/Integer;

    .line 7
    .line 8
    sget-object v1, Li0/z0$a;->l:Li0/z0$a;

    .line 9
    .line 10
    invoke-static {v0, v1}, Li0/z0;->c(Ljava/lang/Integer;Li0/z0$a;)Li0/z0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Li0/z0;->b:Li0/z0;

    .line 15
    .line 16
    sget-object v1, Li0/z0$a;->k:Li0/z0$a;

    .line 17
    .line 18
    invoke-static {v0, v1}, Li0/z0;->c(Ljava/lang/Integer;Li0/z0$a;)Li0/z0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lw/t0;->g(Ljava/lang/Object;)Lw/a2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Li0/z0;->c:Lw/a2;

    .line 27
    .line 28
    return-void
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

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Ljava/lang/Integer;Li0/z0$a;)Li0/z0;
    .locals 1

    new-instance v0, Li0/l;

    invoke-direct {v0, p0, p1}, Li0/l;-><init>(Ljava/lang/Integer;Li0/z0$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Li0/z0$a;
.end method
