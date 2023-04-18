.class Lgj/w$j;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
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
.field private final b:Z


# direct methods
.method private constructor <init>(IZ)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lgj/w$b;-><init>(I)V

    .line 5
    iput-boolean p2, p0, Lgj/w$j;->b:Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lgj/w$b;-><init>(I)V

    .line 3
    iput-boolean p1, p0, Lgj/w$j;->b:Z

    return-void
.end method

.method synthetic constructor <init>(ZLgj/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lgj/w$j;-><init>(Z)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget-boolean v0, p0, Lgj/w$j;->b:Z

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

    new-instance v0, Lgj/w$j;

    iget-boolean v1, p0, Lgj/w$j;->b:Z

    invoke-direct {v0, p1, v1}, Lgj/w$j;-><init>(IZ)V

    return-object v0
.end method
