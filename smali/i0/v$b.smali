.class abstract Li0/v$b;
.super Li0/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li0/v;-><init>(Li0/v$a;)V

    return-void
.end method

.method static e(ILjava/lang/String;)Li0/v$b;
    .locals 1

    new-instance v0, Li0/i;

    invoke-direct {v0, p0, p1}, Li0/i;-><init>(ILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method abstract c()Ljava/lang/String;
.end method

.method abstract d()I
.end method
