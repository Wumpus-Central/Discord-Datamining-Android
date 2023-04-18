.class abstract Lw/o2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static b(Ljava/lang/Throwable;)Lw/o2$a;
    .locals 1

    new-instance v0, Lw/f;

    invoke-direct {v0, p0}, Lw/f;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Throwable;
.end method
