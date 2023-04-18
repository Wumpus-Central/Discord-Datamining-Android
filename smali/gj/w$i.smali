.class Lgj/w$i;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
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
.field private final b:C

.field private final c:C


# direct methods
.method private constructor <init>(CC)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lgj/w$i;-><init>(ICC)V

    return-void
.end method

.method synthetic constructor <init>(CCLgj/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgj/w$i;-><init>(CC)V

    return-void
.end method

.method private constructor <init>(ICC)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lgj/w$b;-><init>(I)V

    .line 4
    iput-char p2, p0, Lgj/w$i;->b:C

    .line 5
    iput-char p3, p0, Lgj/w$i;->c:C

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    const/4 v0, 0x1

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

    new-instance v0, Lgj/w$i;

    iget-char v1, p0, Lgj/w$i;->b:C

    iget-char v2, p0, Lgj/w$i;->c:C

    invoke-direct {v0, p1, v1, v2}, Lgj/w$i;-><init>(ICC)V

    return-object v0
.end method
