.class Lgj/w$g;
.super Lgj/w$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
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


# static fields
.field static final b:Lgj/w$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgj/w$g;

    invoke-direct {v0}, Lgj/w$g;-><init>()V

    sput-object v0, Lgj/w$g;->b:Lgj/w$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgj/w$b;-><init>(I)V

    return-void
.end method

.method static c()Lgj/w$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">()",
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation

    sget-object v0, Lgj/w$g;->b:Lgj/w$g;

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method b(I)Lgj/w$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lgj/w$b<",
            "TU;>;"
        }
    .end annotation

    return-object p0
.end method
