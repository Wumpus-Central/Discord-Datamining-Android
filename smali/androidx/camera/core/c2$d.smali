.class final Landroidx/camera/core/c2$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field protected final a:Landroidx/camera/core/u1;

.field protected final b:Lw/m0;

.field protected final c:Lw/o0;

.field protected d:I

.field protected e:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(IIIILw/m0;Lw/o0;)V
    .locals 1

    .line 7
    new-instance v0, Landroidx/camera/core/u1;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/camera/core/u1;-><init>(IIII)V

    invoke-direct {p0, v0, p5, p6}, Landroidx/camera/core/c2$d;-><init>(Landroidx/camera/core/u1;Lw/m0;Lw/o0;)V

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/u1;Lw/m0;Lw/o0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/c2$d;->e:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/c2$d;->a:Landroidx/camera/core/u1;

    .line 4
    iput-object p2, p0, Landroidx/camera/core/c2$d;->b:Lw/m0;

    .line 5
    iput-object p3, p0, Landroidx/camera/core/c2$d;->c:Lw/o0;

    .line 6
    invoke-virtual {p1}, Landroidx/camera/core/u1;->a()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/c2$d;->d:I

    return-void
.end method


# virtual methods
.method a()Landroidx/camera/core/c2;
    .locals 1

    new-instance v0, Landroidx/camera/core/c2;

    invoke-direct {v0, p0}, Landroidx/camera/core/c2;-><init>(Landroidx/camera/core/c2$d;)V

    return-object v0
.end method

.method b(I)Landroidx/camera/core/c2$d;
    .locals 0

    iput p1, p0, Landroidx/camera/core/c2$d;->d:I

    return-object p0
.end method

.method c(Ljava/util/concurrent/Executor;)Landroidx/camera/core/c2$d;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/c2$d;->e:Ljava/util/concurrent/Executor;

    return-object p0
.end method
