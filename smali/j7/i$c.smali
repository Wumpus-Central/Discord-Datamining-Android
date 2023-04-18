.class Lj7/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/c0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lj7/i;


# direct methods
.method private constructor <init>(Lj7/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj7/i$c;->a:Lj7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lj7/i;Lj7/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lj7/i$c;-><init>(Lj7/i;)V

    return-void
.end method


# virtual methods
.method public a(Lj7/c0;[BII[B)V
    .locals 0

    iget-object p1, p0, Lj7/i$c;->a:Lj7/i;

    iget-object p1, p1, Lj7/i;->y:Lj7/i$d;

    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj7/i$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
