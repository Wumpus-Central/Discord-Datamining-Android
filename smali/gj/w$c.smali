.class Lgj/w$c;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lgj/w$b<",
        "TU;>;"
    }
.end annotation


# instance fields
.field private final b:I

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(IILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IITU;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lgj/w$b;-><init>(I)V

    const/4 p1, 0x1

    if-lt p2, p1, :cond_0

    const/16 p1, 0x9

    if-gt p2, p1, :cond_0

    .line 3
    iput p2, p0, Lgj/w$c;->b:I

    .line 4
    iput-object p3, p0, Lgj/w$c;->c:Ljava/lang/Object;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Fraction width out of bounds: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(IILjava/lang/Object;Lgj/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lgj/w$c;-><init>(IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lgj/w$c;->b:I

    return v0
.end method

.method b(I)Lgj/w$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lgj/w$c;

    iget v1, p0, Lgj/w$c;->b:I

    iget-object v2, p0, Lgj/w$c;->c:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lgj/w$c;-><init>(IILjava/lang/Object;)V

    return-object v0
.end method
