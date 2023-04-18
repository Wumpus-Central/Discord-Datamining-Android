.class Lnet/time4j/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/j0<",
        "Ljava/util/concurrent/TimeUnit;",
        "Lnet/time4j/y<",
        "TU;>;>;"
    }
.end annotation


# instance fields
.field private final k:Lmj/f;


# direct methods
.method private constructor <init>(Lmj/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/y$b;->k:Lmj/f;

    return-void
.end method

.method synthetic constructor <init>(Lmj/f;Lnet/time4j/y$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/y$b;-><init>(Lmj/f;)V

    return-void
.end method
