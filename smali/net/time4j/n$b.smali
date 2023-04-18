.class Lnet/time4j/n$b;
.super Lfj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Lnet/time4j/w;",
        ">",
        "Lfj/b<",
        "TU;",
        "Lnet/time4j/n<",
        "TU;>;>;"
    }
.end annotation


# direct methods
.method private varargs constructor <init>([Lnet/time4j/w;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TU;)V"
        }
    .end annotation

    .line 2
    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, v1, p1}, Lfj/b;-><init>(Z[Lfj/w;)V

    return-void
.end method

.method synthetic constructor <init>([Lnet/time4j/w;Lnet/time4j/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/n$b;-><init>([Lnet/time4j/w;)V

    return-void
.end method
