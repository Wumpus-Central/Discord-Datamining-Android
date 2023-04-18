.class Lgj/w$d;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
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
.field private final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lgj/w$b;-><init>(I)V

    .line 9
    iput-object p2, p0, Lgj/w$d;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lgj/w$d;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lgj/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lgj/w$d;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lgj/w$b;-><init>(I)V

    if-nez p2, :cond_1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Literal is empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    :goto_0
    iput-object p1, p0, Lgj/w$d;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLgj/w$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lgj/w$d;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget-object v0, p0, Lgj/w$d;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method b(I)Lgj/w$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lgj/w$d;

    iget-object v1, p0, Lgj/w$d;->b:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lgj/w$d;-><init>(ILjava/lang/String;)V

    return-object v0
.end method
